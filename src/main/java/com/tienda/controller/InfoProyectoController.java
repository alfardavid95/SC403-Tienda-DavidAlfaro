package com.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/consultas")
public class InfoProyectoController {

    @GetMapping("/acerca")
    public String acerca() {
        return "consultas/acerca";
    }

    @GetMapping("/roles")
    public String roles() {
        return "consultas/roles";
    }
}
