package com.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/seguridad")
public class SeguridadController {

    @GetMapping("/pruebas")
    public String pruebas() {
        return "seguridad/pruebas";
    }

    @GetMapping("/sesion")
    public String sesion() {
        return "seguridad/sesion";
    }
}
