package com.univale.lojatech.repositories;

import com.univale.lojatech.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
