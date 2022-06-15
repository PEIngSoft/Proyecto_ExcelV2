package com.controllador;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Detalle;
import com.model.Empresa;
import com.model.Encabezado;
import com.service.DetalleService;
import com.service.EmpresaService;
import com.service.EncabezadoService;

@RestController
@RequestMapping("/encabezado")
public class Encabezado_Controller {

	@Autowired
	private EncabezadoService encabezadoService;
	
	//create
	@PostMapping
	public ResponseEntity<?> create(@RequestBody Encabezado encabezado ){
	return ResponseEntity.status(HttpStatus.CREATED).body(encabezadoService.save(encabezado));
	}
	//read
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable(value = "id") Long encabezadoId){
		Optional<Encabezado> oEncabezado = encabezadoService.findById(encabezadoId);
		if (!oEncabezado.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(oEncabezado);
	}
	//update
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Encabezado encabezadoDetails, @PathVariable(value = "id")Long encabezadoId){
		Optional<Encabezado> encabezado = encabezadoService.findById(encabezadoId);
		
		if (!encabezado.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		BeanUtils.copyProperties(encabezadoDetails, encabezado.get());
		encabezado.get().setId_Usuariof(encabezadoDetails.getId_Usuariof());
		encabezado.get().setId_Tipo(encabezadoDetails.getId_Tipo());
		encabezado.get().setLiquidacion(encabezadoDetails.getLiquidacion());
		encabezado.get().setFecha_Sancion(encabezadoDetails.getFecha_Sancion());
		encabezado.get().setTipo_Acto(encabezadoDetails.getTipo_Acto());
		///la llave foranea
		return ResponseEntity.status(HttpStatus.CREATED).body(encabezadoService.save(encabezado.get()));
	}
	
	
	//delete
		@DeleteMapping("/{id}")
		public ResponseEntity<?> delete(@PathVariable(value = "id")Long encabezadoId){
			if (!encabezadoService.findById(encabezadoId).isPresent()) {
				return ResponseEntity.notFound().build();
			}
			encabezadoService.deleteById(encabezadoId);
			return ResponseEntity.ok().build();
		}
	//read all
		@GetMapping
		public List<Encabezado> readAll(){
			List<Encabezado>encabezados = StreamSupport.stream(encabezadoService.findAll().spliterator(),false).collect(Collectors.toList());
			return encabezados;
		}

}
