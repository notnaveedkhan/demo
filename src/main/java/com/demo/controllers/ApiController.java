package com.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/")
    public ResponseEntity<String> hi(@RequestParam(required = false) String name) {
        if (name != null && !name.isEmpty()) {
            return ResponseEntity.ok(String.format("Hi, %s Welcome to localhost.", name));
        }
        return ResponseEntity.ok(String.format("Hi, Welcome to localhost.", name));
    }

    @GetMapping("/exit")
    public ResponseEntity exit() {
        System.exit(0);
        return ResponseEntity.ok().build();
    }

}
