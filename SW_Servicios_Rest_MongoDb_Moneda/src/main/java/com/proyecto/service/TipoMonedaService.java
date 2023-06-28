package com.proyecto.service;

import java.util.List;
import java.util.Optional;

import com.proyecto.entity.TipoMoneda;

public interface TipoMonedaService {

	public List<TipoMoneda> listaTipoMoneda();
	public List<TipoMoneda> listaTipoMonedaPorDescripcion(String descripcion);
	public List<TipoMoneda> listaTipoMonedaPorId(int objectId);
	public TipoMoneda insertaTipoMoneda(TipoMoneda obj);
	public Optional<TipoMoneda> buscaTipoMoneda(int idTipoMoneda);
	public void eliminaTipoMoneda(int idTipoMoneda);
	
}
