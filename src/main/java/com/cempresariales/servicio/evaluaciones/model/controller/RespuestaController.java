package com.cempresariales.servicio.evaluaciones.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cempresariales.servicio.commons.model.entity.Respuesta;
import com.cempresariales.servicio.evaluaciones.model.service.RespuestaServiceImpl;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS })
@RequestMapping(value = "respuesta")
public class RespuestaController {

	@Autowired
	private RespuestaServiceImpl repo;

	@GetMapping("/listar")
	public List<Respuesta> listar() {
		return repo.findAll();
	}

	@GetMapping("/ver/{id}")
	public Respuesta ver(@PathVariable Long id) {
		return repo.findById(id);
	}

	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public Respuesta crear(@RequestBody Respuesta entidad) {
		return repo.save(entidad);
	}

	@DeleteMapping("/eliminar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Long id) {
		repo.delete(id);
	}
}
