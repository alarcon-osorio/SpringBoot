package com.server.videojuegos.service;

import com.server.videojuegos.entity.VideoJuego;
import com.server.videojuegos.repository.VideoJuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoJuegoService {

    @Autowired
    private VideoJuegoRepository videoJuegoRepository;

    public List<VideoJuego> buscarDestacados() {
        return videoJuegoRepository.buscarTodos();
    }

    public List<VideoJuego> buscarPorDistribuidor(int distribuidorId) {
        return videoJuegoRepository.buscarPorDistribuidor(distribuidorId);
    }

    public List<VideoJuego> buscar(String consulta) {
        return videoJuegoRepository.findByNombreContaining(consulta);
    }

    public VideoJuego guardar(VideoJuego videoJuego){
        return videoJuegoRepository.save(videoJuego);
    }

    public List<VideoJuego> detalle(int juegoId){
        return videoJuegoRepository.mostrarDetalle(juegoId);
    }

    public List<VideoJuego> editar(int juegoId){
        return videoJuegoRepository.editar(juegoId);
    }

    public VideoJuego actualizar(VideoJuego videoJuego){
        VideoJuego videoJuego1 = new VideoJuego();
        videoJuego1.setId(videoJuego1.getId());
        videoJuego1.setNombre(videoJuego1.getNombre());
        videoJuego1.setDescripcion(videoJuego1.getDescripcion());
        videoJuego1.setImagenUrl(videoJuego1.getImagenUrl());
        videoJuego1.setDistribuidor(videoJuego1.getDistribuidor());
        return videoJuegoRepository.save(videoJuego1);
    }

}
