package com.cempresariales.servicio.evaluaciones.model.service;

import java.util.List;

import com.cempresariales.servicio.commons.model.entity.EstadoEvaluacion;

public interface IEstadoEvaluacionService {

	public List<EstadoEvaluacion> findAll();
	public EstadoEvaluacion findById(Long id);
	public EstadoEvaluacion save(EstadoEvaluacion evaluacion);
	public void delete(Long id);
}
