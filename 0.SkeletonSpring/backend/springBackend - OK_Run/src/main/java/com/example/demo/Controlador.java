//Refrerencia a front
package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://192.168.0.100:4200"}, maxAge = 3600)
@RequestMapping({"/api"})
public class Controlador {
    
    @Autowired
    PersonaService service;
    
    @GetMapping("/personas") //Trae data
    public List<Persona> personas(){
        return service.listar();
    }
    
}
