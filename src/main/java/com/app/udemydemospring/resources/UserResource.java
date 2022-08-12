package com.app.udemydemospring.resources;

import com.app.udemydemospring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){

        User user = new User(1L, "Mauri", "mauri@gmail.com", "+5511973722818", "123456");

        return ResponseEntity.ok().body(user);
    }
}
