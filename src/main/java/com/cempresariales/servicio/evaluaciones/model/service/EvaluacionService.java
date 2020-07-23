package com.cempresariales.servicio.evaluaciones.model.service;

import java.util.List;

import com.cempresariales.servicio.commons.model.entity.Evaluacion;
import com.cempresariales.servicio.evaluaciones.model.dao.BuscadorDTO;


public interface EvaluacionService {

	public List<Evaluacion> findAll();
	public Evaluacion findById(Long id);
	public Evaluacion save(Evaluacion evaluacion);
	public void delete(Long id);
	
	public List<Evaluacion> findByParams(BuscadorDTO buscador);
	public List<Evaluacion> findBySegmentacion(Long idRegion, Long idZona, Long idProvincia, Long idCiudad, Long idZonaEstructural);
}
