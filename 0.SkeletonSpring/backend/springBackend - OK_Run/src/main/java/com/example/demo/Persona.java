package com.example.demo;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "datos")
public class Persona implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellido;

    
    public int getId() {
        return id;
    }

    
    public void setId(Integer id) {
        this.id = id;
    }

   
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getApellido() {
        return apellido;
    }

    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }  
    
}
