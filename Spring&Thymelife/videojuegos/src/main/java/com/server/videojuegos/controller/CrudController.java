package com.server.videojuegos.controller;

import com.server.videojuegos.entity.VideoJuego;
import com.server.videojuegos.service.DistribuidorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class CrudController {

    private final DistribuidorService distribuidorService;

    public CrudController(DistribuidorService distribuidorService) {
        this.distribuidorService = distribuidorService;
    }

    @RequestMapping("/videojuegos/crear")
    public String mostrarFormAlta(Model model) {
        model.addAttribute("distribuidores", distribuidorService.buscarTodos());
        model.addAttribute("videojuego", new VideoJuego());
        return "formVideoJuego";
    }

    @PostMapping("/videojuegos/guardar")
    public String guardar(@Valid VideoJuego videoJuego, BindingResult bindingResult, Model model) {
    //public String guardar(VideoJuego videoJuego) {
        System.out.println(videoJuego);
        return "redirect:/";
    }

}
