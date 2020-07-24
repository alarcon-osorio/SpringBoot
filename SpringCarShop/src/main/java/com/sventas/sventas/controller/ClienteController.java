package com.sventas.sventas.controller;


import com.sventas.sventas.exception.ModelNotFoundException;
import com.sventas.sventas.model.Cliente;
import com.sventas.sventas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = {"http://"})
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>> findAll() {
        return new ResponseEntity<>(clienteService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Cliente> create(@RequestBody Cliente cliente) {
        return new ResponseEntity<>(clienteService.create(cliente), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Object> update(@RequestBody Cliente cliente) {
        clienteService.update(cliente);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable("id") Integer id) {
        Cliente cliente = clienteService.findById(id);
        if(cliente == null) {
            return new ResponseEntity(new ModelNotFoundException("El cliente no encontrado"), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Integer id)  {
        Cliente cliente = clienteService.findById(id);
        if(cliente == null) {
            return new ResponseEntity(new ModelNotFoundException ("El cliente no existe"), HttpStatus.NOT_FOUND);
        }
        clienteService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
