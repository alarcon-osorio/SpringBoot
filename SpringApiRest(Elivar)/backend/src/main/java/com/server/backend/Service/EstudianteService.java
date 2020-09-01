package com.server.backend.Service;

import com.server.backend.Entity.Estudiante;
import com.server.backend.Repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    public void guardar(Estudiante estudiante){
        estudianteRepository.save(estudiante);
    }
}
