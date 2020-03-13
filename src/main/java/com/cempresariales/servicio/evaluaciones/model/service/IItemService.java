package com.cempresariales.servicio.evaluaciones.model.service;

import java.util.List;

import com.cempresariales.servicio.commons.model.entity.Item;



public interface IItemService {


	public List<Item> findAll();
	public Item findById(Long id);
	public Item save(Item item);
	public void delete(Long id);

}
