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
import com.service.DetalleService;
import com.service.EmpresaService;

@RestController
@RequestMapping("/detalle")
public class Detalle_Controller {

	@Autowired
	private DetalleService detalleService;
	
	//create
	@PostMapping
	public ResponseEntity<?> create(@RequestBody Detalle detalle ){
	return ResponseEntity.status(HttpStatus.CREATED).body(detalleService.save(detalle));
	}
	//read
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable(value = "id") Long detalleId){
		Optional<Detalle> oDetalle = detalleService.findById(detalleId);
		if (!oDetalle.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(oDetalle);
	}
	//update
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Detalle detalleDetails, @PathVariable(value = "id")Long detalleId){
		Optional<Detalle> detalle = detalleService.findById(detalleId);
		
		if (!detalle.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		BeanUtils.copyProperties(detalleDetails, detalle.get());
		detalle.get().setSueldo_Basico(detalleDetails.getSueldo_Basico());
		detalle.get().setDias_Laborados(detalleDetails.getDias_Laborados());
		detalle.get().setHoras_Extras(detalleDetails.getHoras_Extras());
		///la llave foranea
		return ResponseEntity.status(HttpStatus.CREATED).body(detalleService.save(detalle.get()));
	}
	
	
	//delete
		@DeleteMapping("/{id}")
		public ResponseEntity<?> delete(@PathVariable(value = "id")Long detalleId){
			if (!detalleService.findById(detalleId).isPresent()) {
				return ResponseEntity.notFound().build();
			}
			detalleService.deleteById(detalleId);
			return ResponseEntity.ok().build();
		}
	//read all
		@GetMapping
		public List<Detalle> readAll(){
			List<Detalle>detalles = StreamSupport.stream(detalleService.findAll().spliterator(),false).collect(Collectors.toList());
			return detalles;
		}

}
