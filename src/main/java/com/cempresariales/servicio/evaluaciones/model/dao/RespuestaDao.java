package com.cempresariales.servicio.evaluaciones.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cempresariales.servicio.commons.model.entity.Respuesta;

public interface RespuestaDao extends JpaRepository<Respuesta, Long>{
	

	@Query("select r from Respuesta r where r.idCatalogoPregunta in "
			+ "(select cp.idCatalogoPregunta from CatalogoPregunta cp where cp.categoria.idCategoria = ?1)")
	public List<Respuesta> findByCategoria(@Param("idCategoria") Long idCategoria);

}
