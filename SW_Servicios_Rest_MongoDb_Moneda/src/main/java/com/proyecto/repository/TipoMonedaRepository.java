package com.proyecto.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.proyecto.entity.TipoMoneda;

public interface TipoMonedaRepository extends MongoRepository<TipoMoneda, Integer>{
	
	@Query("{descripcion: ?0}")
	public List<TipoMoneda> listaTipoMonedaPorDescripcion(String descripcion);
	
	@Query("{idTipoMoneda: ?0}")
	public List<TipoMoneda> listaTipoMonedaPorId(int idTipoMoneda);
	


	
}
