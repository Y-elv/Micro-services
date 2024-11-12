package com.example.microservice.user_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/access")
    public String accessThroughGateway() {
        return "I am accessing the User Service through the API Gateway.";
    }
}
