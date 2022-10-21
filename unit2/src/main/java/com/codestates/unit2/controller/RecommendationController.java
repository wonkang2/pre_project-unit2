package com.codestates.unit2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendationController {

    @GetMapping
    public String helloTodo() {
        return "To-do Application!";
    }
}
