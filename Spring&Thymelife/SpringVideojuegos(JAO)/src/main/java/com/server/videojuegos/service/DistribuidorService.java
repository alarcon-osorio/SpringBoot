package com.server.videojuegos.service;

import com.server.videojuegos.entity.Distribuidor;
import com.server.videojuegos.entity.VideoJuego;
import com.server.videojuegos.repository.DistribuidorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistribuidorService {

    @Autowired
    private DistribuidorRepository distribuidorRepository;

    public List<Distribuidor> buscarTodos() {
        return distribuidorRepository.findAll();
    }
}
