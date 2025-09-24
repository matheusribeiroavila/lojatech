package com.univale.lojatech.serivces;

import com.univale.lojatech.entities.User;
import com.univale.lojatech.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //Component Registration
public class UserService {

    @Autowired //Criando dependência do userRepository para utilizar metodos que interagem com o paradigma relacional
    private UserRepository userRepository;

    //Criando um metodo lógico para procurar por todos os Users que possuem no banco de dados
    public List<User> findAll() {
        return userRepository.findAll(); // Metodos do nosso UserRepository
    }

    public User findById(Long id) {
        Optional<User> objeto = userRepository.findById(id);
        return objeto.get();
    }
}
