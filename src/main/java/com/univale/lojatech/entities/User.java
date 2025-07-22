package com.univale.lojatech.entities;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private String email;
    private String phone;
    private  String password;

    //Por regra e convenção é criado um construtor vazio para projetos SPRING
    public User(){
        /*
        O Spring e o Hibernate (JPA) precisam de um construtor vazio para instanciar os objetos de forma reflexiva (sem usar new diretamente).
        Quando o JPA busca dados do banco e mapeia para a classe User, ele instancia o objeto primeiro com o construtor vazio, e depois injeta os valores nos campos via reflection ou setters.
        Sem esse construtor, o erro típico seria: -- No default constructor for entity --
        */
    }

    //Por convenção e velocidade de utilização, crias-se um construtor com os atributos bases
    public User(Long id, String name, String email, String phone, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false; //Se não for igual ou nulo retorna false.
        User user = (User) o; //Isso aqui é um Cast, estou dizendo para o Java compreender 'o' como uma entidade User
        return Objects.equals(id, user.id); //Valida o conteudo do elemento e entrega TRUE ou FALSE
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
