package com.mi.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roles")
public class RolesController {

    @GetMapping("/porID")
    public String getRoles() {
        return "ID: 101" +
                " Rol: Informatico";
    }
}