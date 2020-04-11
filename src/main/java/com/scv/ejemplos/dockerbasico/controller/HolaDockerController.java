package com.scv.ejemplos.dockerbasico.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaDockerController {

    @GetMapping("/hola")
    public ResponseEntity<String> getHelloDocker(){
        return ResponseEntity.ok("Hola docker");
    }
}
