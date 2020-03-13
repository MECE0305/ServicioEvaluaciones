package com.cempresariales.servicio.evaluaciones.model.service;

import java.util.List;

import com.cempresariales.servicio.commons.model.entity.Pregunta;


public interface IPreguntaServie {

	public List<Pregunta> findAll();
	public Pregunta findById(Long id);
	public Pregunta save(Pregunta respuesta);
	public void delete(Long id);
}
