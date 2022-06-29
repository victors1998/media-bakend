package com.victor.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victor.model.Paciente;
import com.victor.repo.IPacienteRepo;
import com.victor.service.IPacienteService;

@Service  //para que spring lo pueda gestionar
public class PacienteServiceImpl implements IPacienteService{

	@Autowired
	private IPacienteRepo repo;  //INSTANCIANDO IPacienteRepo
	
	@Override
	public void registrar(Paciente pac) {
		repo.save(pac);
		
	}

	@Override
	public void modificar(Paciente pac) {
		repo.save(pac);
		
	}

	@Override
	public List<Paciente> listar() {
		return repo.findAll();
	}

	

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);	
	}

	@Override
	public Optional<Paciente> leerPorId(Integer id) {	
		return repo.findById(id);
	}

}
