package com.server.videojuegos.controller;

import com.server.videojuegos.entity.VideoJuego;
import com.server.videojuegos.service.VideoJuegoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ListadoController {

    private final VideoJuegoService videoJuegoService;

    public ListadoController(VideoJuegoService videoJuegoService) {
        this.videoJuegoService = videoJuegoService;
    }

    @RequestMapping("/")
    public String litarVideoJuegos(Model model) {
        List<VideoJuego> destacados = videoJuegoService.buscarDestacados();
        model.addAttribute("videojuegos", destacados);
        return "listado";
    }

    @RequestMapping("/videoJuegosPorDistribuidor")
    public String listarVideoJuegosPorDistribuidor(int distribuidorId, Model model) {
        List<VideoJuego> juegos = videoJuegoService.buscarPorDistribuidor(distribuidorId);
        model.addAttribute("videojuegos", juegos);
        return "listado";
    }
}
