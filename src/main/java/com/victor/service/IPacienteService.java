package com.victor.service;

import java.util.List;
import java.util.Optional;

import com.victor.model.Paciente;

public interface IPacienteService {
	
	void registrar(Paciente pac);
	void modificar(Paciente pac);
	List<Paciente> listar();
	Optional<Paciente> leerPorId(Integer id);
	void eliminar(Integer id);
	

}
