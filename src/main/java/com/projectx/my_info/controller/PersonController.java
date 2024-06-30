package com.projectx.my_info.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class PersonController {

    @GetMapping(value = "/message")
    public String getMessage() {
        return "This is my first docker compose application!";
    }
}
