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

import com.cempresariales.servicio.commons.model.entity.Encabezado;
import com.cempresariales.servicio.evaluaciones.model.service.EncabezadoServiceImp;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS })
@RequestMapping(value = "encabezado")
public class EncabezadoController {

	@Autowired
	private EncabezadoServiceImp repo;

	@GetMapping("/listar")
	public List<Encabezado> listar() {
		return repo.findAll();
	}

	@GetMapping("/ver/{id}")
	public Encabezado ver(@PathVariable Long id) {
		return repo.findById(id);
	}

	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public Encabezado crear(@RequestBody Encabezado entidad) {
		return repo.save(entidad);
	}

	@DeleteMapping("/eliminar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Long id) {
		repo.delete(id);
	}
}
