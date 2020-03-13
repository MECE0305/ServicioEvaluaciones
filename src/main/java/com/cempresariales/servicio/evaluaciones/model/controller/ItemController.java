package com.cempresariales.servicio.evaluaciones.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cempresariales.servicio.commons.model.entity.Item;
import com.cempresariales.servicio.evaluaciones.model.service.ItemServiceImpl;



@RestController
public class ItemController {

	
	@Autowired
	private ItemServiceImpl itemService;
	
	@GetMapping("/listarItems")
	public List<Item> listarItems(){
		return itemService.findAll();
	}
	
	@GetMapping("/item/{id}")
	public Item verItem(@PathVariable Long id){
		return itemService.findById(id);
	}
	
	@PostMapping("/crearItem/{item}")
	public Item crear(@PathVariable Item item){
		return itemService.save(item);
	}
	
	@DeleteMapping("/eliminarItem/{id}")
	public void eliminar(@PathVariable Long id){
		itemService.delete(id);
	}
}
