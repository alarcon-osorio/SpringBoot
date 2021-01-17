package com.springboot.backend.producto.controller;

import com.springboot.backend.producto.model.Producto;
import com.springboot.backend.producto.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping(value = "/api")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping("/productos")
    public Producto save(@RequestBody Producto producto) {
        return productoService.save(producto);
    }

    @RequestMapping(value = "/productos", produces = "application/json")
    public List<Producto> findAll(){
        return productoService.findAll();
    }

    @GetMapping("/productos/{id}")
    public Producto findById(@PathVariable Integer id){
        return productoService.findById(id);
    }

    @PutMapping("/productos/{id}")
    public Producto update(@RequestBody Producto producto, @PathVariable Integer id){
        Producto productoActual = productoService.findById(id);
        productoActual.setNombre(producto.getNombre());
        productoActual.setDescripcion(producto.getDescripcion());
        productoActual.setPrecio(producto.getPrecio());
        productoActual.setStock(producto.getStock());

        return productoService.save(productoActual);
    }

    @DeleteMapping("/productos/{id}")
    public void delete(@PathVariable Integer id){
        productoService.delete(id);
    }
}
