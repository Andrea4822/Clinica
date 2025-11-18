package com.example.clinica.modelos.repositorios;

import com.example.clinica.modelos.HistoriaClinica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHistoriaClinica extends JpaRepository<HistoriaClinica, Integer> {
}
