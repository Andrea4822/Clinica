package com.example.clinica.servicios;

import com.example.clinica.modelos.Paciente;
import com.example.clinica.modelos.repositorios.IPacienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service

public class ServicioPaciente {

@Autowired
    private IPacienteRepositorio repositorio;


}
