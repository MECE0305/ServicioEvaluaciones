package com.cempresariales.servicio.evaluaciones.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cempresariales.servicio.commons.model.entity.Evaluacion;
import com.cempresariales.servicio.evaluaciones.model.dao.EvaluacionDao;

@Service
public class EvaluacionServiceImpl implements EvaluacionService{

	@Autowired
	private EvaluacionDao evaluacionDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Evaluacion> findAll() {
		return (List<Evaluacion>) evaluacionDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Evaluacion findById(Long id) {
		return evaluacionDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Evaluacion save(Evaluacion evaluacion) {
		return evaluacionDao.save(evaluacion);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		evaluacionDao.deleteById(id);
	}

}
