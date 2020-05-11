package com.cempresariales.servicio.evaluaciones.model.service;

import java.util.List;

import com.cempresariales.servicio.commons.model.entity.Evaluacion;


public interface EvaluacionService {

	public List<Evaluacion> findAll();
	public Evaluacion findById(Long id);
	public Evaluacion save(Evaluacion evaluacion);
	public void delete(Long id);
}
