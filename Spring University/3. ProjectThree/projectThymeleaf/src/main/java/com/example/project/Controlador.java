package com.example.project;



import com.example.project.domain.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller //Controlador MVC
@Slf4j
public class Controlador {  //No se puede llamar igual que la anotacion ya que serian dos clases con el mismo nombre

    @Value("${index.saludo}")
    private String saludo;

    @GetMapping("/")
    public String init(Model model){
        var mensaje = "Hello Thymeleaf";

        var persona = new Persona();
        persona.setNombre("Jeison");
        persona.setApellido("Alarcon");
        persona.setEmail("alarcon_osorio@hotmail.com");
        persona.setTelefono("3118514962");

        var persona2 = new Persona();
        persona2.setNombre("Juan");
        persona2.setApellido("Perez");
        persona2.setEmail("jperez@hotmail.com");
        persona2.setTelefono("31222524458");

        //var persona = new ArrayList<>();
        //persona.add(persona);

        //var personas = Arrays.asList(persona, persona2);
        var personas = Arrays.asList(); //Lista de personas vacia

        log.info("Execute MVC");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        //model.addAttribute("persona", persona);
        model.addAttribute("personas", personas);
        return "index";  //Retorna el nombre de la pagina Thymeleaf
    }

}
