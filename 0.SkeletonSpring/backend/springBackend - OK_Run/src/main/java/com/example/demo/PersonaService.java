package com.example.demo;

import java.util.List;
import com.example.demo.Persona;

public interface PersonaService {
   
    public List<Persona>listar();    
    public Persona listarId(int id);    
    public Persona add(Persona p);    
    public Persona edit(Persona p);    
    public Persona delete(int id); 	
    
}
