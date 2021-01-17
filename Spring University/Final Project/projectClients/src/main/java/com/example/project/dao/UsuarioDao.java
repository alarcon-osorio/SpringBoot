package com.example.project.dao;

import com.example.project.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuarios, Long> {
    Usuarios findByUsername(String username);
}
