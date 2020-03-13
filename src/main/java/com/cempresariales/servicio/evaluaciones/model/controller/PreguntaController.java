package com.cempresariales.servicio.evaluaciones.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cempresariales.servicio.commons.model.entity.Pregunta;
import com.cempresariales.servicio.evaluaciones.model.service.PreguntaServiceImpl;



@RestController
public class PreguntaController {

	
	@Autowired
	private PreguntaServiceImpl preguntaService;
	
	@GetMapping("/listarPreguntas")
	public List<Pregunta> listarPreguntas(){
		return preguntaService.findAll();
	}
	
	@GetMapping("/pregunta/{id}")
	public Pregunta verItem(@PathVariable Long id){
		return preguntaService.findById(id);
	}
	
	@PostMapping("/crearPregunta/{pregunta}")
	public Pregunta crear(@PathVariable Pregunta pregunta){
		return preguntaService.save(pregunta);
	}
	
	@DeleteMapping("/eliminarPregunta/{id}")
	public void eliminar(@PathVariable Long id){
		preguntaService.delete(id);
	}
}
