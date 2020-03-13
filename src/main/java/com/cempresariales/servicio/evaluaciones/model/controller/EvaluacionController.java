package com.cempresariales.servicio.evaluaciones.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cempresariales.servicio.commons.model.entity.Evaluacion;
import com.cempresariales.servicio.evaluaciones.model.service.EvaluacionServiceImpl;


@RestController
public class EvaluacionController {

	
	@Autowired
	private EvaluacionServiceImpl evaluacionService;
	
	@GetMapping("/listarEvaluaciones")
	public List<Evaluacion> listarEvaluaciones(){
		return evaluacionService.findAll();
	}
	
	@GetMapping("/evaluacion/{id}")
	public Evaluacion verEvaluacion(@PathVariable Long id){
		return evaluacionService.findById(id);
	}
	
	@PostMapping("/crearEvaluacion/{evaluacion}")
	public Evaluacion crear(@PathVariable Evaluacion evaluacion){
		return evaluacionService.save(evaluacion);
	}
	
	@DeleteMapping("/eliminarEvaluacion/{id}")
	public void eliminar(@PathVariable Long id){
		evaluacionService.delete(id);
	}
}
