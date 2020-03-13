package com.cempresariales.servicio.evaluaciones.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cempresariales.servicio.commons.model.entity.Categoria;
import com.cempresariales.servicio.evaluaciones.model.service.CategoriaServiceImpl;


@RestController
public class CategoriaController {

	
	@Autowired
	private CategoriaServiceImpl categoriaService;
	
	@GetMapping("/listarCategorias")
	public List<Categoria> listarItems(){
		return categoriaService.findAll();
	}
	
	@GetMapping("/categoria/{id}")
	public Categoria verItem(@PathVariable Long id){
		return categoriaService.findById(id);
	}
	
	@PostMapping("/crear/{categoria}")
	public Categoria crear(@PathVariable Categoria categoria){
		return categoriaService.save(categoria);
	}
	
	@DeleteMapping("/eliminarCategoria/{id}")
	public void eliminar(@PathVariable Long id){
		categoriaService.delete(id);
	}
}
