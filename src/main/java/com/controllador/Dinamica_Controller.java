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
import com.model.Dinamica;
import com.model.Empresa;
import com.service.DetalleService;
import com.service.DinamicaService;
import com.service.EmpresaService;

@RestController
@RequestMapping("/dinamica")
public class Dinamica_Controller {

	@Autowired
	private DinamicaService dinamicaService;
	
	//create
	@PostMapping
	public ResponseEntity<?> create(@RequestBody Dinamica dinamica ){
	return ResponseEntity.status(HttpStatus.CREATED).body(dinamicaService.save(dinamica));
	}
	//read
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable(value = "id") Long dinamicaId){
		Optional<Dinamica> oDinamica = dinamicaService.findById(dinamicaId);
		if (!oDinamica.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(oDinamica);
	}
	//update
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Dinamica dinamicaDetails, @PathVariable(value = "id")Long dinamicaId){
		Optional<Dinamica> dinamica = dinamicaService.findById(dinamicaId);
		
		if (!dinamica.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		BeanUtils.copyProperties(dinamicaDetails, dinamica.get());
		dinamica.get().setConcepto_Pago(dinamicaDetails.getConcepto_Pago());
		dinamica.get().setDetalles(dinamicaDetails.getDetalles());
		dinamica.get().setDevengo(dinamicaDetails.getDevengo());
		///la llave foranea
		return ResponseEntity.status(HttpStatus.CREATED).body(dinamicaService.save(dinamica.get()));
	}
	
	
	//delete
		@DeleteMapping("/{id}")
		public ResponseEntity<?> delete(@PathVariable(value = "id")Long dinamicaId){
			if (!dinamicaService.findById(dinamicaId).isPresent()) {
				return ResponseEntity.notFound().build();
			}
			dinamicaService.deleteById(dinamicaId);
			return ResponseEntity.ok().build();
		}
	//read all
		@GetMapping
		public List<Dinamica> readAll(){
			List<Dinamica>dinamicas = StreamSupport.stream(dinamicaService.findAll().spliterator(),false).collect(Collectors.toList());
			return dinamicas;
		}

}
