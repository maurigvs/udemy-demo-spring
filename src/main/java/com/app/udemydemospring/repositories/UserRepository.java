package com.app.udemydemospring.repositories;

import com.app.udemydemospring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
