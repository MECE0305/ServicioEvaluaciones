package com.cempresariales.servicio.evaluaciones.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cempresariales.servicio.commons.model.entity.Evaluacion;
import com.cempresariales.servicio.evaluaciones.model.service.EvaluacionServiceImpl;

@RestController
public class EvaluacionController {

	@Autowired
	private EvaluacionServiceImpl repo;

	@GetMapping("/listar")
	public List<Evaluacion> listar() {
		return repo.findAll();
	}

	@GetMapping("/ver/{id}")
	public Evaluacion ver(@PathVariable Long id) {
		return repo.findById(id);
	}

	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public Evaluacion crear(@RequestBody Evaluacion entidad) {
		return repo.save(entidad);
	}

	@DeleteMapping("/eliminar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Long id) {
		repo.delete(id);
	}
}
