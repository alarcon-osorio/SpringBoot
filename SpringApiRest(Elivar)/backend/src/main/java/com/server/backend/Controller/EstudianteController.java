package com.server.backend.Controller;

import com.server.backend.Entity.Estudiante;
import com.server.backend.Service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

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

    @PutMapping("api/estudiante/{id}")
    public void actualizarEstudiante(@RequestBody Estudiante estudiante) {
        estudianteService.actualizar(estudiante);
    }

    @DeleteMapping("api/estudiante/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        estudianteService.eliminar(id);
    }
}
