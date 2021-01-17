package com.example.project.controller;

import com.example.project.model.Persona;
import com.example.project.service.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;


@Controller //Controlador MVC
@Slf4j
public class Controlador {  //No se puede llamar igual que la anotacion ya que serian dos clases con el mismo nombre

    @Autowired
    private PersonaService personaService;

     @GetMapping("/")
    public String init(Model model, @AuthenticationPrincipal User user){
         log.info("Funciona !!! Server UP");
         log.info("Usuario que hizo login" + user);

         var personas = personaService.listarPersonas();
         model.addAttribute("personas", personas);
         var totalClientes = 0;
         for(var p: personas){
             totalClientes += 1;
         }
         model.addAttribute("totalClientes", personas.size());
         return "index";  //Retorna el nombre de la pagina Thymeleaf
    }

    @GetMapping("/agregar")
    public String agregar(Persona persona){
         return "modificar";
    }
    
    @PostMapping("/guardar")
    public  String guardar(@Valid Persona persona, Errors erors){
         if (erors.hasErrors()){
             return "modificar";
         }
        personaService.guardar(persona);
        return "redirect:/";
    }

    @GetMapping("/editar/{idPersona}")
    public  String editar(Persona persona, Model model){
        persona = personaService.encontrarPersona(persona);
        model.addAttribute("persona", persona);
        return "modificar";
    }

    @GetMapping("/eliminar")
    public  String eliminar(Persona persona){
        personaService.eliminar(persona);
        return "redirect:/";
    }

}
