package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for handling requests.
 */
@RestController
public class HelloController {

    /**
     * Handles GET requests for the root path ("/").
     *
     * @return Greeting message from Spring Boot.
     */
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!!!!!!";
    }
}
