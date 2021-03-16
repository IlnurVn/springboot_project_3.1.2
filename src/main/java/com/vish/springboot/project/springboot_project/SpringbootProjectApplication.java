package com.vish.springboot.project.springboot_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.vish.springboot.project.springboot_project")
public class SpringbootProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootProjectApplication.class, args);
    }

}
