package com.server.backend.Controller;

import com.server.backend.Entity.Estudiante;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EstudianteController {

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
        e.setId(2);
        e.setNombres("Juan");
        e.setApellidos("Perez");
        e.setEmail("juan_erezo@hotmail.com");
        e.setNota(4D);

        listaEstudiantes.add(e);
        listaEstudiantes.add(e1);

        return listaEstudiantes;
    }

}
