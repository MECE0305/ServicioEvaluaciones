package com.cempresariales.servicio.evaluaciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.cempresariales.servicio.commons.model.entity"})
public class ServicioEvaluacionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioEvaluacionesApplication.class, args);
	}

}
