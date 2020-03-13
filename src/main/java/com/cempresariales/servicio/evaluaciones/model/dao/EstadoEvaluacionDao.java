package com.cempresariales.servicio.evaluaciones.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cempresariales.servicio.commons.model.entity.EstadoEvaluacion;


public interface EstadoEvaluacionDao extends JpaRepository<EstadoEvaluacion, Long>{

}
