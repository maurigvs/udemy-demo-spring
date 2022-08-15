package com.app.udemydemospring.services;

import com.app.udemydemospring.entities.User;
import com.app.udemydemospring.repositories.UserRepository;
import com.app.udemydemospring.services.exceptions.DatabaseException;
import com.app.udemydemospring.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> user = repository.findById(id);
        return user.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User user){
        return repository.save(user);
    }

    public void delete(Long id){
        try{
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException exception) {
            throw new ResourceNotFoundException(id);

        } catch (DataIntegrityViolationException de){
            throw new DatabaseException(de.getMessage());

        } catch (RuntimeException re){
            re.printStackTrace();
        }
    }

    public User update(Long id, User user){
        User userToUpdate = repository.getReferenceById(id);
        updateData(userToUpdate, user);
        return repository.save(userToUpdate);
    }

    private void updateData(User userToUpdate, User user) {
        // Previne que o Id e a Senha sejam atualizados
        userToUpdate.setName(user.getName());
        userToUpdate.setEmail(user.getEmail());
        userToUpdate.setPhone(user.getPhone());
    }
}
