package com.cempresariales.servicio.evaluaciones.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cempresariales.servicio.commons.model.entity.ChecklistHasEvaluacion;
import com.cempresariales.servicio.commons.model.entity.ChecklistHasEvaluacionPK;

public interface ChecklistHasEvaluacionDao extends JpaRepository<ChecklistHasEvaluacion, ChecklistHasEvaluacionPK> {

}
