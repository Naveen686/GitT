package com.example.intellij.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(value = "")
    public String get(){
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }
        return "hey there...";
    }
}
