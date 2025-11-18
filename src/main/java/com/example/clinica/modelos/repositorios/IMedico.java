package com.example.clinica.modelos.repositorios;

import com.example.clinica.modelos.Medico;
import org.hibernate.engine.spi.Managed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMedico extends JpaRepository <Medico,Integer> {

}

