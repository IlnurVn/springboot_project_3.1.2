package com.vish.springboot.project.springboot_project.controller;


import com.vish.springboot.project.springboot_project.model.User;
import com.vish.springboot.project.springboot_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("userInfo")
    public String showAllUsers(Model model, Principal principal) {
        User user = userService.getUserByName(principal.getName());
        model.addAttribute("message", "You are logged in as " + principal.getName());
        model.addAttribute("userInfo", user);
        return "user-data";
    }



}

