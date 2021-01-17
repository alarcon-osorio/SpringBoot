package com.springboot.backend.producto.dao;

import com.springboot.backend.producto.model.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository<Producto, Integer> {
}
