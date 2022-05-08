package br.com.onliprint.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.onliprint.dto.PrestadoresDTO;
import br.com.onliprint.services.PrestadoresService;
import jakarta.validation.Valid;

@RequestMapping(path = "prestadores")
@CrossOrigin(origins = "*")
@RestController
public class PrestadorController {
	
	@Autowired
	private PrestadoresService prestadoresService;
	
	@PostMapping(path= "/save")
	public ResponseEntity<PrestadoresDTO> save(@Valid @RequestBody PrestadoresDTO novoPrestador) {
		return ResponseEntity.ok().body(prestadoresService.save(novoPrestador));
	}
}
