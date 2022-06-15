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

import com.model.Empresa;
import com.service.EmpresaService;

@RestController
@RequestMapping("/empresa")
public class Empresa_Controller {

	@Autowired
	private EmpresaService empresaService;
	
	//create
	@PostMapping
	public ResponseEntity<?> create(@RequestBody Empresa empresa ){
	return ResponseEntity.status(HttpStatus.CREATED).body(empresaService.save(empresa));
	}
	//read
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable(value = "id") Long empresaId){
		Optional<Empresa> oEmpresa = empresaService.findById(empresaId);
		if (!oEmpresa.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(oEmpresa);
	}
	//update
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Empresa empresaDetails, @PathVariable(value = "id")Long empresaId){
		Optional<Empresa> empresa = empresaService.findById(empresaId);
		
		if (!empresa.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		BeanUtils.copyProperties(empresaDetails, empresa.get());
		empresa.get().setNombre_Empresa(empresaDetails.getNombre_Empresa());
		empresa.get().setDireccion_Empresa(empresaDetails.getDireccion_Empresa());
		empresa.get().setTelefono_Empresa(empresaDetails.getTelefono_Empresa());
		///la llave foranea
		return ResponseEntity.status(HttpStatus.CREATED).body(empresaService.save(empresa.get()));
	}
	
	
	//delete
		@DeleteMapping("/{id}")
		public ResponseEntity<?> delete(@PathVariable(value = "id")Long empresaId){
			if (!empresaService.findById(empresaId).isPresent()) {
				return ResponseEntity.notFound().build();
			}
			empresaService.deleteById(empresaId);
			return ResponseEntity.ok().build();
		}
	//read all
		@GetMapping
		public List<Empresa> readAll(){
			List<Empresa>empresas = StreamSupport.stream(empresaService.findAll().spliterator(),false).collect(Collectors.toList());
			return empresas;
		}

}
