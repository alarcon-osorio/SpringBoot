package com.server.backend.Controller;

import com.server.backend.Entity.Estudiante;
import com.server.backend.Service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("api/estudiante")
    public List<Estudiante> obtenerEstudiantes() {

        List<Estudiante> listaEstudiantes = new ArrayList<>();

        Estudiante e = new Estudiante();
        e.setId(1);
        e.setNombres("Jeison");
        e.setApellidos("Alarcon");
        e.setEmail("alarcon_osorio@hotmail.com");
        e.setNota(5D);

        Estudiante e1 = new Estudiante();
        e1.setId(1);
        e1.setNombres("Juan");
        e1.setApellidos("Perez");
        e1.setEmail("juan_erezo@hotmail.com");
        e1.setNota(4D);

        listaEstudiantes.add(e);
        listaEstudiantes.add(e1);

        return listaEstudiantes;
    }

    @PostMapping("api/estudiante")
    public Estudiante guardarEstudiante(@RequestBody Estudiante estudiante) {
        System.out.println(estudiante);
        estudianteService.guardar(estudiante);
        return estudiante;
    }

    @GetMapping("api/estudiantes")
    public List<Estudiante> obtener() {
       return estudianteService.obtenerTodos();
    }

    @GetMapping("api/estudiante/{id}")
    public Estudiante obtenerEstudiante(@PathVariable("id") Integer id) {
        return estudianteService.obtenerPorId(id);
    }
}
