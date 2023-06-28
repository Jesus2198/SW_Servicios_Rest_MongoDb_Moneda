package com.proyecto.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "moneda")
public class TipoMoneda {

	private int idTipoMoneda;
	private String descripcion;
	private int flag;
	

	

	
}



