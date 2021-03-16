package com.vish.springboot.project.springboot_project.service;



import com.vish.springboot.project.springboot_project.model.Role;
import com.vish.springboot.project.springboot_project.model.User;

import java.util.List;

public interface UserService {

    User getUserByName(String username);

    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(long id);

    void deleteUser(long id);

    List<Role> getAllRoles();

    Role getRoleById(long id);
}
