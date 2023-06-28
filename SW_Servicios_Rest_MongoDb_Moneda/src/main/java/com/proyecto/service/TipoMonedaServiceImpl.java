package com.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.entity.TipoMoneda;
import com.proyecto.repository.TipoMonedaRepository;

@Service
public class TipoMonedaServiceImpl implements TipoMonedaService {

	@Autowired
	private TipoMonedaRepository repository;

	@Override
	public List<TipoMoneda> listaTipoMoneda() {
		return repository.findAll();
	}
	
	@Override
	public TipoMoneda insertaTipoMoneda(TipoMoneda obj) {
		return repository.save(obj);
	}

	@Override
	public Optional<TipoMoneda> buscaTipoMoneda(int idTipoMoneda) {
		return repository.findById(idTipoMoneda);
	}

	@Override
	public void eliminaTipoMoneda(int idTipoMoneda) {
		repository.deleteById(idTipoMoneda);
	}
	
	@Override
	public List<TipoMoneda> listaTipoMonedaPorId(int idTipoMoneda) {
		return repository.listaTipoMonedaPorId(idTipoMoneda);
	}

	@Override
	public List<TipoMoneda> listaTipoMonedaPorDescripcion(String descripcion) {
		return repository.listaTipoMonedaPorDescripcion(descripcion);
	}


}


