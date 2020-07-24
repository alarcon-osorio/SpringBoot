package com.server.videojuegos.service;


import com.server.videojuegos.entity.VideoJuego;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideoJuegoService {

    public List<VideoJuego> buscarDestacados() {
        List<VideoJuego> destacados = new ArrayList<>();

        VideoJuego juego = new VideoJuego();

        juego.setNombre("Bioshark Resident Evil I");
        juego.setDescripcion("Parte I Juego de terror");
        juego.setImageUrl("http://images.pushsquare.com/f2a00d5de3822/borderlands-3-ps4-playstation-4-box-art-1.original.jpg");
        destacados.add(juego);

        juego = new VideoJuego();
        juego.setNombre("Bioshark Resident Evil II");
        juego.setDescripcion("Parte II Juego de terror");
        juego.setImageUrl("http://images.pushsquare.com/f2a00d5de3822/borderlands-3-ps4-playstation-4-box-art-1.original.jpg");
        destacados.add(juego);

        juego = new VideoJuego();
        juego.setNombre("Bioshark Resident Evil III");
        juego.setDescripcion("Parte III Juego de terror");
        juego.setImageUrl("http://images.pushsquare.com/f2a00d5de3822/borderlands-3-ps4-playstation-4-box-art-1.original.jpg");
        destacados.add(juego);

        juego = new VideoJuego();
        juego.setNombre("Bioshark Resident Evil IV");
        juego.setDescripcion("Parte IV Juego de terror");
        juego.setImageUrl("http://images.pushsquare.com/f2a00d5de3822/borderlands-3-ps4-playstation-4-box-art-1.original.jpg");
        destacados.add(juego);

        return destacados;

    }
}
