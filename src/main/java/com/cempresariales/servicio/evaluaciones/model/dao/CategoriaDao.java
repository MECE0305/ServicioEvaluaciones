package com.cempresariales.servicio.evaluaciones.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cempresariales.servicio.commons.model.entity.Categoria;


public interface CategoriaDao extends JpaRepository<Categoria, Long>{

}
