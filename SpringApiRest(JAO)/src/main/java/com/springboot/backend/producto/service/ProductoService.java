package com.springboot.backend.producto.service;

import com.springboot.backend.producto.model.Producto;

import java.util.List;

public interface ProductoService {
    //add interfaces
    public Producto  save(Producto producto);
    public void delete(Integer id);
    public Producto findById(Integer id);
    public List<Producto> findAll();

}
