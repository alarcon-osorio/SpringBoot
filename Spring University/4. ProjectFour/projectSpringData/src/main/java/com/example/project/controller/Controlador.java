package com.example.project.controller;

import com.example.project.dao.PersonaDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Controlador MVC
@Slf4j
public class Controlador {  //No se puede llamar igual que la anotacion ya que serian dos clases con el mismo nombre

    @Autowired
    private PersonaDao personaDao;

     @GetMapping("/")
    public String init(Model model){
         log.info("Funciona !!! Server UP");

         var personas =personaDao.findAll();
         model.addAttribute("personas", personas);
         return "index";  //Retorna el nombre de la pagina Thymeleaf
    }

}
