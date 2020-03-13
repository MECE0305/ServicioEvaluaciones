package com.cempresariales.servicio.evaluaciones.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cempresariales.servicio.evaluaciones.model.dao.EstadoEvaluacionDao;
import com.cempresariales.servicio.commons.model.entity.EstadoEvaluacion;

@Service
public class EstadoEvaluacionServiceImp implements IEstadoEvaluacionService {

	@Autowired
	private EstadoEvaluacionDao estadoDao;
	@Override
	public List<EstadoEvaluacion> findAll() {		
		return (List<EstadoEvaluacion>)  estadoDao.findAll();
	}

	@Override
	public EstadoEvaluacion findById(Long id) {
		return estadoDao.findById(id).orElse(null);
	}

	@Override
	public EstadoEvaluacion save(EstadoEvaluacion evaluacion) {
		return estadoDao.save(evaluacion);
	}

	@Override
	public void delete(Long id) {
		estadoDao.deleteById(id);
	}

}
