package com.cempresariales.servicio.evaluaciones.model.service;

import java.util.List;

import com.cempresariales.servicio.commons.model.entity.ChecklistHasEvaluacion;
import com.cempresariales.servicio.commons.model.entity.ChecklistHasEvaluacionPK;

public interface ChecklistHasEvaluacionService {

	public List<ChecklistHasEvaluacion> findAll();

	public ChecklistHasEvaluacion findById(ChecklistHasEvaluacionPK id);

	public ChecklistHasEvaluacion save(ChecklistHasEvaluacion entidad);

	public void delete(ChecklistHasEvaluacionPK id);
}
