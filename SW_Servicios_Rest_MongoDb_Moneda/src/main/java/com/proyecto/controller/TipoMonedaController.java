package com.proyecto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.entity.TipoMoneda;
import com.proyecto.service.TipoMonedaService;

@RestController
@RequestMapping("/rest/TipoMoneda")
public class TipoMonedaController {

	@Autowired
	private TipoMonedaService service;
	
	@GetMapping()
	public ResponseEntity<?>  lista(){
		List<TipoMoneda> lstSalida = service.listaTipoMoneda();
		return ResponseEntity.ok(lstSalida);
	}
	
	@GetMapping("/porDescripcion/{descripcion}")
	public ResponseEntity<?>  listaPorDescripcion(@PathVariable("descripcion") String descripcionTipoMoneda){
		List<TipoMoneda> lstSalida = service.listaTipoMonedaPorDescripcion(descripcionTipoMoneda);
		return ResponseEntity.ok(lstSalida);
	}
	
	@GetMapping("/porId/{id}")
	public ResponseEntity<?> listaPorId(@PathVariable("id") int idTipoMoneda){
		List<TipoMoneda> lstSalida = service.listaTipoMonedaPorId(idTipoMoneda);
		return ResponseEntity.ok(lstSalida);
	}
	
	

	
	@PostMapping
	public ResponseEntity<?>  inserta(@RequestBody TipoMoneda obj){
		TipoMoneda objSalida = service.insertaTipoMoneda(obj);
		return ResponseEntity.ok(objSalida);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?>  eliminaTipoMoneda(@PathVariable Integer id){
		service.eliminaTipoMoneda(id);
		Optional<TipoMoneda> optTipoMoneda = service.buscaTipoMoneda(id);
		if (optTipoMoneda.isEmpty()) {
			return ResponseEntity.ok("Eliminación exitosa");
		}
		return ResponseEntity.ok("No existe el id " + id);
	}
	
	@PutMapping
	public ResponseEntity<?> actualiza(@RequestBody TipoMoneda obj){
		Optional<TipoMoneda> optTipoMoneda = service.buscaTipoMoneda(obj.getIdTipoMoneda());
		if (optTipoMoneda.isPresent()) {
			TipoMoneda objSalida = service.insertaTipoMoneda(obj);
			return ResponseEntity.ok(objSalida);
		}else {
			return ResponseEntity.ok("El Tipo de Moneda no existe");
		}
	}
	

}






