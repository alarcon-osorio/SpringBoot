package com.example.demo;

import java.util.List;
//import org.springframework.stereotype.Repository;
import org.springframework.data.repository.Repository; //NO ponerlo en el POM 

public interface PersonaRepositorio extends Repository<Persona, Integer> {
    List<Persona>findAll();
    Persona findOne(int id);
    Persona save(Persona p);
    void delete(Persona p);
}
