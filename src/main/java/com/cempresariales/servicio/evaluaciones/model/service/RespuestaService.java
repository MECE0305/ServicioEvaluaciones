package com.cempresariales.servicio.evaluaciones.model.service;

import java.util.List;

import com.cempresariales.servicio.commons.model.entity.Respuesta;


public interface RespuestaService {

	public List<Respuesta> findAll();
	public Respuesta findById(Long id);
	public Respuesta save(Respuesta respuesta);
	public void delete(Long id);
}
