package com.example.clinica.modelos.repositorios;

import com.example.clinica.modelos.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPacienteRepositorio extends JpaRepository <Paciente,Integer> {

}
