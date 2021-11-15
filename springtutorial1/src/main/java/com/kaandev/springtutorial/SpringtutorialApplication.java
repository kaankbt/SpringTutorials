package com.kaandev.springtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SpringtutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringtutorialApplication.class, args);
    }

}
