package com.server.videojuegos.controller;

import com.server.videojuegos.entity.VideoJuego;
import com.server.videojuegos.service.DistribuidorService;
import com.server.videojuegos.service.VideoJuegoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/videojuegos")
public class CrudController {

    @Autowired
    private DistribuidorService distribuidorService;
    private VideoJuegoService videoJuegoService;

    @RequestMapping("/crear")
    public String mostrarFormAlta(Model model) {
        model.addAttribute("distribuidores", distribuidorService.buscarTodos());
        model.addAttribute("videojuego", new VideoJuego());
        return "formVideoJuego";
    }

    @PostMapping("/guardar")
    public String guardar(@Valid VideoJuego videoJuego, BindingResult bindingResult, Model model) {
        videoJuegoService.guardar(videoJuego);
        System.out.println(videoJuego);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String actualizarjuego(@RequestParam("id") VideoJuego videoJuego) {
        videoJuegoService.actualizar(videoJuego);
        return "redirect:/";
    }

}