package com.server.videojuegos.repository;

import com.server.videojuegos.entity.VideoJuego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VideoJuegoRepository extends JpaRepository<VideoJuego, Integer> {

    @Query("from VideoJuego order by v.nombre") //Personaliza consultas JPQL - El asume el Selec
    // Se puede usar SQL NATIVE
    //@Query(value = "select * from videojuego order by nombre, nativeQuery = true")
    List<VideoJuego> buscarTodos();

}
