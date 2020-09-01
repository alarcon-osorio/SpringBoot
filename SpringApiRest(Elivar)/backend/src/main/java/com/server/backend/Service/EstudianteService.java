package com.server.backend.Service;

import com.server.backend.Entity.Estudiante;
import com.server.backend.Repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    public void guardar(Estudiante estudiante){
        estudianteRepository.save(estudiante);
    }

    public List<Estudiante> obtenerTodos(){
        return estudianteRepository.findAll();
    }

    public Estudiante obtenerPorId(Integer id){
        return estudianteRepository.getOne(id); //No usamos el findById por qu tendriamos que hacer get para obtenerlo
    }

    public Estudiante actualizar(Estudiante estudiante){ //Hacerlo por medio de objeto, cuando la encentra actualiza y cuando no la crea
        return estudianteRepository.save(estudiante);
    }
}
