package com.example.clinica.servicios;

import com.example.clinica.modelos.repositorios.IMedico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioMedico {
    @Autowired
    private IMedico repositorio;
}
