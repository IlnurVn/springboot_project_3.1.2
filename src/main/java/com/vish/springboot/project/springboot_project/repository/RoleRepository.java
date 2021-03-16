package com.vish.springboot.project.springboot_project.repository;


import com.vish.springboot.project.springboot_project.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role,Long> {

    Role getRoleById(long id);
    List<Role> getRolesById(long id);
}
