package com.cempresariales.servicio.evaluaciones.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cempresariales.servicio.commons.model.entity.Categoria;
import com.cempresariales.servicio.evaluaciones.model.dao.CategoriaDao;

@Service
public class CategoriaServiceImpl implements ICategoriaService{

	
	@Autowired
	private CategoriaDao categoriaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Categoria> findAll() {
		return (List<Categoria>)  categoriaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Categoria findById(Long id) {
		return categoriaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Categoria save(Categoria categoria) {
		return categoriaDao.save(categoria);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		categoriaDao.deleteById(id);
	}

}
