package com.cempresariales.servicio.evaluaciones.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cempresariales.servicio.commons.model.entity.Respuesta;
import com.cempresariales.servicio.evaluaciones.model.service.RespuestaServiceImpl;

@RestController
public class RespuestaController {

	@Autowired
	private RespuestaServiceImpl respuestaService;
	
	@GetMapping("/listarRespuestas")
	public List<Respuesta> listarRespuestas(){
		return respuestaService.findAll();
	}
	
	@GetMapping("/respuesta/{id}")
	public Respuesta verRespuesta(@PathVariable Long id){
		return respuestaService.findById(id);
	}
	
	@PostMapping("/crear/{respuesta}")
	public Respuesta crear(@PathVariable Respuesta respuesta){
		return respuestaService.save(respuesta);
	}
	
	/*@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable Long id){
		respuestaService.delete(id);
	}*/
}
