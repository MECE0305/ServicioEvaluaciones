package com.cempresariales.servicio.evaluaciones.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cempresariales.servicio.commons.model.entity.ChecklistHasEvaluacion;
import com.cempresariales.servicio.commons.model.entity.ChecklistHasEvaluacionPK;
import com.cempresariales.servicio.evaluaciones.model.dao.ChecklistHasEvaluacionDao;

@Service
public class ChecklistHasEvaluacionServiceImp implements ChecklistHasEvaluacionService {

	@Autowired
	private ChecklistHasEvaluacionDao repo;

	@Override
	public List<ChecklistHasEvaluacion> findAll() {
		return (List<ChecklistHasEvaluacion>) repo.findAll();
	}

	@Override
	public ChecklistHasEvaluacion findById(ChecklistHasEvaluacionPK id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public ChecklistHasEvaluacion save(ChecklistHasEvaluacion entidad) {
		return repo.save(entidad);
	}

	@Override
	public void delete(ChecklistHasEvaluacionPK id) {
		repo.deleteById(id);
	}

}
