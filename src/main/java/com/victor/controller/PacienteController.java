package com.victor.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.victor.model.Paciente;
import com.victor.service.IPacienteService;

@RestController     //indicarle que es un servicio rest
@RequestMapping("/pacientes")
public class PacienteController {

	@Autowired
	private IPacienteService service;
	
	@GetMapping               //GET PARA OPTENER DATOS
	public List<Paciente> listar() {
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Optional<Paciente> leerPorId(@PathVariable ("id") Integer id) {
		return service.leerPorId(id);
	}
	
	@PostMapping
	public void registrar(@RequestBody Paciente pac) {
		service.registrar(pac);
	}
	
	@PutMapping
    public void modificar(@RequestBody Paciente pac) {
		service.modificar(pac);
	}
	
	
}
