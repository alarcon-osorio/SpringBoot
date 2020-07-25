package com.server.videojuegos.controller;

import com.server.videojuegos.entity.VideoJuego;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CrudController {

    @RequestMapping("/videojuegos/crear")
    public String mostrarFormAlta() {
        return "formVideoJuego";
    }

    /*
    @RequestMapping("/actualizar")
    public String buscar(@RequestParam("q") String consulta, Model model) {
        List<VideoJuego> juegos = videoJuegoService.buscar(consulta);
        model.addAttribute("videojuegos", juegos);
        return "listado";
    }
     */

}
