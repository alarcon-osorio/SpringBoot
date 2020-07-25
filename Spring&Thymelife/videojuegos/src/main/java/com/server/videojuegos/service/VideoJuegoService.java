package com.server.videojuegos.service;

import com.server.videojuegos.entity.VideoJuego;
import com.server.videojuegos.repository.VideoJuegoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoJuegoService {

    private final VideoJuegoRepository videoJuegoRepository;

    public VideoJuegoService(VideoJuegoRepository videoJuegoRepository) {
        this.videoJuegoRepository = videoJuegoRepository;
    }

    public List<VideoJuego> buscarDestacados() {
        return videoJuegoRepository.buscarTodos();
    }

    public List<VideoJuego> porDistribuidor(int distribuidorId) {
        return videoJuegoRepository.buscarPorDistribuidor(distribuidorId);

    }
}
