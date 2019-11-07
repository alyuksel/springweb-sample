package com.alpi.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping(value = "/welcome", produces = MediaType.TEXT_PLAIN_VALUE)
    public String home() {

        return "This is home page";
    }
}
