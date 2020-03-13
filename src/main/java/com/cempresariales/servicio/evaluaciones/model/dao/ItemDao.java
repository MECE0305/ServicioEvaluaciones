package com.cempresariales.servicio.evaluaciones.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cempresariales.servicio.commons.model.entity.Item;


public interface ItemDao extends JpaRepository<Item, Long>{

}
