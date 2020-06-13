package com.cempresariales.servicio.evaluaciones.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cempresariales.servicio.commons.model.entity.ChecklistHasEvaluacion;
import com.cempresariales.servicio.commons.model.entity.ChecklistHasEvaluacionPK;
import com.cempresariales.servicio.commons.model.entity.Encabezado;
import com.cempresariales.servicio.evaluaciones.model.service.ChecklistHasEvaluacionServiceImp;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.OPTIONS })
@RequestMapping(value = "checklistevaluacion")
public class ChecklistHasEvaluacionController {

	@Autowired
	private ChecklistHasEvaluacionServiceImp repo;

	@GetMapping("/listar")
	public List<ChecklistHasEvaluacion> listar() {
		return repo.findAll();
	}

	@GetMapping("/ver/{id}")
	public ChecklistHasEvaluacion ver(@PathVariable ChecklistHasEvaluacionPK id) {
		return repo.findById(id);
	}

	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public ChecklistHasEvaluacion crear(@RequestBody ChecklistHasEvaluacion entidad) {
		return repo.save(entidad);
	}
	
	@PutMapping("/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public ChecklistHasEvaluacion editar(@RequestBody ChecklistHasEvaluacion entidad, @PathVariable ChecklistHasEvaluacionPK id) {
		ChecklistHasEvaluacion entidadDb = repo.findById(id);
		entidadDb = entidad;

		return repo.save(entidadDb);
	}

	@DeleteMapping("/eliminar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable ChecklistHasEvaluacionPK id) {
		repo.delete(id);
	}
}
