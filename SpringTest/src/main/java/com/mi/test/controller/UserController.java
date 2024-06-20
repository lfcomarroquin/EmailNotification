package com.mi.test.controller;

import com.mi.test.dto.UserDto;
import org.springframework.web.bind.annotation.*;
//De esta forma se mappean las rutas

@RestController
@RequestMapping("/usuarios")
public class UserController {

    @GetMapping("/")
    public String getAll() {
        return "User";
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable String id) {
        return "El ID del usuario es: " + id;
    }

    @GetMapping("/prueba")
    public String getTextoPrueba() {
        return "Este es un texto de prueba";
    }

    @PostMapping
    public UserDto createUser(@RequestBody UserDto userDto) {
        System.out.println(userDto.getId());
        System.out.println(userDto.getName());
        System.out.println(userDto.getEmail());
        return userDto;
    }

    @PutMapping
    public String updateUser() {
        return "Usuario actualizado";
    }

    @DeleteMapping
    public String deleteUser() {
        return "Usuario eliminado";
    }
}
