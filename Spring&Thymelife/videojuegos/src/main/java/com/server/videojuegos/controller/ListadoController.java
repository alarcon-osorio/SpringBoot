package com.server.videojuegos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListadoController {

    @RequestMapping("/")
    public String litarVideoJuegos() {
        return "listado";
    }

}
