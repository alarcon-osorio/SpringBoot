package com.server.videojuegos.controller;

import com.server.videojuegos.entity.VideoJuego;
import com.server.videojuegos.service.VideoJuegoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("/buscar")
    public String buscar(@RequestParam("q") String consulta, Model model) {
        List<VideoJuego> juegos = videoJuegoService.buscar(consulta);
        model.addAttribute("videojuegos", juegos);
        return "listado";
    }

    @RequestMapping("/detalleVideoJuego")
    public String listarDetalleVideoJuego(int juegoId, Model model) {
        List<VideoJuego> juegos = videoJuegoService.detalle(juegoId);
        model.addAttribute("videojuegos", juegos);
        return "detalleVideoJuego";
    }

    @RequestMapping("/editarVideoJuego")
    public String editarVideoJuego(int juegoId, Model model) {
        List<VideoJuego> juegos = videoJuegoService.editar(juegoId);
        model.addAttribute("videojuegos", juegos);
        return "editarVideoJuego";
    }

}