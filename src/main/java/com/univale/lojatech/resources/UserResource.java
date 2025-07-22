package com.univale.lojatech.resources;

import com.univale.lojatech.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.UserDataHandler;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    //tipo de retorno do method
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L,"Matheus", "ribeiroavilamatheus@gmail.com", "043996089567", "123456");
        return ResponseEntity.ok().body(u);
    }
}
