package com.cempresariales.servicio.evaluaciones.model.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cempresariales.servicio.commons.model.entity.Evaluacion;

public interface EvaluacionDao extends JpaRepository<Evaluacion, Long> {

	@Query("select eva from Evaluacion eva where eva.idEmpleado in "
			+ "(select e.idEmpleado from Empleado e where e.agenciaIdAgencia.idAgencia in :expresion)")
	public List<Evaluacion> findEvaByAgencias(@Param("expresion") Collection<Long> expresion);
}
