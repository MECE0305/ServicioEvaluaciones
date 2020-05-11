package com.cempresariales.servicio.evaluaciones.model.service;

import java.util.List;

import com.cempresariales.servicio.commons.model.entity.Encabezado;

public interface EncabezadoService {

	public List<Encabezado> findAll();
	public Encabezado findById(Long id);
	public Encabezado save(Encabezado entidad);
	public void delete(Long id);
}
