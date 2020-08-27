package com.server.videojuegos.controller;

import com.server.videojuegos.entity.VideoJuego;
import com.server.videojuegos.service.DistribuidorService;
import com.server.videojuegos.service.VideoJuegoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class CrudController {

    private final DistribuidorService distribuidorService;
    private final VideoJuegoService videoJuegoService;

    public CrudController(DistribuidorService distribuidorService, VideoJuegoService videoJuegoService) {
        this.distribuidorService = distribuidorService;
        this.videoJuegoService = videoJuegoService;
    }

    @RequestMapping("/videojuegos/crear")
    public String mostrarFormAlta(Model model) {
        model.addAttribute("distribuidores", distribuidorService.buscarTodos());
        model.addAttribute("videojuego", new VideoJuego());
        return "formVideoJuego";
    }

    @PostMapping("/videojuegos/guardar")
    public String guardar(@Valid VideoJuego videoJuego, BindingResult bindingResult, Model model) {
        videoJuegoService.guardar(videoJuego);
        System.out.println(videoJuego);
        return "redirect:/";
    }

}
