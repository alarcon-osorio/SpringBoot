package com.server.videojuegos.service;

import com.server.videojuegos.entity.Distribuidor;
import com.server.videojuegos.repository.DistribuidorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistribuidorService {

    private final DistribuidorRepository distribuidorRepository;

    public DistribuidorService(DistribuidorRepository distribuidorRepository) {
        this.distribuidorRepository = distribuidorRepository;
    }

    public List<Distribuidor> buscarTodos() {
        return distribuidorRepository.findAll();
    }
}
