package com.cempresariales.servicio.evaluaciones.model.service;

import java.util.Collection;
import java.util.List;

import com.cempresariales.servicio.commons.model.entity.EstadoEvaluacion;
import com.cempresariales.servicio.commons.model.entity.Evaluacion;

public interface EstadoEvaluacionService {

	public List<EstadoEvaluacion> findAll();
	public EstadoEvaluacion findById(Long id);
	public EstadoEvaluacion save(EstadoEvaluacion entidad);
	public void delete(Long id);
	
	
	
}
