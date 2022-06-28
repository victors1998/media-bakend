package com.victor.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victor.model.Paciente;

// CUANDO PONEMOS EXTEND EN ESTA INTERFAS ESTAMOS DISPONIENDO LAS FUNCIONES DE LA BD UN CRUD
public interface IPacienteRepo extends JpaRepository<Paciente, Integer> {

}
