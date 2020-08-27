package com.server.videojuegos.repository;

import com.server.videojuegos.entity.VideoJuego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VideoJuegoRepository extends JpaRepository<VideoJuego, Integer> {

    @Query("from VideoJuego v order by v.nombre") //Personaliza consultas JPQL - El asume el Selec
    // Se puede usar SQL NATIVE
    //@Query(value = "select * from videojuego order by nombre, nativeQuery = true")
    List<VideoJuego> buscarTodos();

    @Query("from VideoJuego v where v.distribuidor.id =?1 order by v.nombre") //Consulta con parametro ?1 -> Primer parametro
    List<VideoJuego> buscarPorDistribuidor(int distribuidorId);

    //@Query("from VideoJuego v where v.nombre like %?1%")  -> findByNombreContaining es lo mismo
    List<VideoJuego> findByNombreContaining(String consulta);

    @Query("from VideoJuego v where v.id =?1")
    List<VideoJuego> mostrarDetalle(int juegoId);

}
