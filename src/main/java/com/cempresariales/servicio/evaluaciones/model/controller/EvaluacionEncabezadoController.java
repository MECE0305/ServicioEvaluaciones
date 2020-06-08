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

import com.cempresariales.servicio.commons.model.entity.EvaluacionHasEncabezado;
import com.cempresariales.servicio.commons.model.entity.EvaluacionHasEncabezadoPK;
import com.cempresariales.servicio.evaluaciones.model.service.EvaluacionEncabezadoServiceImpl;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS })
@RequestMapping(value = "evaluacion-encabezado")
public class EvaluacionEncabezadoController {

	@Autowired
	private EvaluacionEncabezadoServiceImpl repo;

	@GetMapping("/listar")
	public List<EvaluacionHasEncabezado> listar() {
		return repo.findAll();
	}
	
	
	@GetMapping("/findByEncabezado/{id}")
	public List<EvaluacionHasEncabezado> findByEncabezado(@PathVariable Long id) {
		return repo.findByEncabezado(id);
	}
	
	@GetMapping("/findByEvaluacion/{id}")
	public List<EvaluacionHasEncabezado> findByEvaluacion(@PathVariable Long id) {
		return repo.findByEvaluacion(id);
	}

	@GetMapping("/ver/{id}")
	public EvaluacionHasEncabezado ver(@PathVariable EvaluacionHasEncabezadoPK id) {
		return repo.findById(id);
	}

	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public EvaluacionHasEncabezado crear(@RequestBody EvaluacionHasEncabezado entidad) {
		return repo.save(entidad);
	}

	@DeleteMapping("/eliminar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable EvaluacionHasEncabezadoPK id) {
		repo.delete(id);
	}
}
