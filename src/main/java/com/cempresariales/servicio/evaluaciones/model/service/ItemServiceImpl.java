package com.cempresariales.servicio.evaluaciones.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cempresariales.servicio.commons.model.entity.Item;
import com.cempresariales.servicio.evaluaciones.model.dao.ItemDao;

@Service
public class ItemServiceImpl implements IItemService{

	@Autowired
	private ItemDao itemDao;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Item> findAll() {		
		return (List<Item>) itemDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Item findById(Long id) {
		return itemDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Item save(Item item) {
		return itemDao.save(item);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		itemDao.deleteById(id);		
	}

}
