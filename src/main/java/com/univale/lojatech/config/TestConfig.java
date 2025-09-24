package com.univale.lojatech.config;

import com.univale.lojatech.entities.User;
import com.univale.lojatech.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;
import java.util.Scanner;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Matheus Avila", "matheusavila@gmail.com", "043996089567", "123456");
        User user2 = new User(null, "Maria Clara", "mariaclara@gmail.com", "0439954432001", "123456");

        userRepository.saveAll(Arrays.asList(user1, user2));
    }
}
