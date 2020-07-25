package com.server.videojuegos.controller;

import com.server.videojuegos.service.DistribuidorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CrudController {

    private final DistribuidorService distribuidorService;

    public CrudController(DistribuidorService distribuidorService) {
        this.distribuidorService = distribuidorService;
    }

    @RequestMapping("/videojuegos/crear")
    public String mostrarFormAlta(Model model) {
        model.addAttribute("distribuidores", distribuidorService.buscartodos());
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
