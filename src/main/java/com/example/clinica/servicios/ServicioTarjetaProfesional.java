package com.example.clinica.servicios;

import com.example.clinica.modelos.repositorios.ITarjetaProfesional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioTarjetaProfesional {
    @Autowired
    private ITarjetaProfesional repositorio;
}
