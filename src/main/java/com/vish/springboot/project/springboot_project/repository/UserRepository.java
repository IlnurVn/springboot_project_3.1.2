package com.vish.springboot.project.springboot_project.repository;


import com.vish.springboot.project.springboot_project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User getUserByUsername(String name);
    User getUserByEmail(String email);

}
