package com.example.clinica.servicios;

import com.example.clinica.modelos.repositorios.IHistoriaClinica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioHistoriaClinica {
    @Autowired
    private IHistoriaClinica repositorio;
}
