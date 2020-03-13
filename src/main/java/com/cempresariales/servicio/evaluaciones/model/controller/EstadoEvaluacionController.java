package com.cempresariales.servicio.evaluaciones.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cempresariales.servicio.commons.model.entity.EstadoEvaluacion;
import com.cempresariales.servicio.evaluaciones.model.service.EstadoEvaluacionServiceImp;


@RestController
public class EstadoEvaluacionController {

	
	@Autowired
	private EstadoEvaluacionServiceImp evaluacionService;
	
	@GetMapping("/listarEstado")
	public List<EstadoEvaluacion> listarEvaluaciones(){
		return evaluacionService.findAll();
	}
	
	@GetMapping("/estado/{id}")
	public EstadoEvaluacion verEvaluacion(@PathVariable Long id){
		return evaluacionService.findById(id);
	}
	
	@PostMapping("/crearEstado/{evaluacion}")
	public EstadoEvaluacion crear(@PathVariable EstadoEvaluacion evaluacion){
		return evaluacionService.save(evaluacion);
	}
	
	@DeleteMapping("/eliminarEstado/{id}")
	public void eliminar(@PathVariable Long id){
		evaluacionService.delete(id);
	}
}
