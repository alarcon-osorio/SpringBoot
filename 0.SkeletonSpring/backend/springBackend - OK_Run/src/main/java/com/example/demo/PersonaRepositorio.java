package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Persona;

public interface PersonaRepositorio extends CrudRepository<Persona, Integer>  {
    
}
