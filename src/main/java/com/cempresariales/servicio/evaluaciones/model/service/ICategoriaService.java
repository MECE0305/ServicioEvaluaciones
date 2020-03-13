package com.cempresariales.servicio.evaluaciones.model.service;

import java.util.List;

import com.cempresariales.servicio.commons.model.entity.Categoria;

public interface ICategoriaService {

	public List<Categoria> findAll();
	public Categoria findById(Long id);
	public Categoria save(Categoria categoria);
	public void delete(Long id);
}
