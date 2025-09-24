package com.univale.lojatech.resources;

import com.univale.lojatech.entities.User;
import com.univale.lojatech.repositories.UserRepository;
import com.univale.lojatech.serivces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired // Criando uma dependência para utilizar os métodos do serviço de usuário.
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    //tipo de retorno do method
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        /*
         Agora com o service cuidando deste serviço de procurar informações no banco de dados para nós,
         podemos utilizar essa nossa controller (UserResource) para apenas encapsular, receber e enviar informações.
         Tirando um grande peso de responsábilidade desta classe.
        */
        List<User> userList = userService.findAll();
        return ResponseEntity.ok().body(userList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User user = userService.findById(id);
        return ResponseEntity.ok().body(user);
    }


}
