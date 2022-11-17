package com.onliprint.onliprintbackendspring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onliprint.onliprintbackendspring.model.dto.ProvidersDTO;
import com.onliprint.onliprintbackendspring.services.ProvidersService;

@RestController
@RequestMapping(path="providers")
@CrossOrigin(origins="*")
public class ProvidersController {

	@Autowired
	private ProvidersService providersService;
	
	@PostMapping(path="/save")
	public void save(@Valid @RequestBody ProvidersDTO newProvider) {
		providersService.save(newProvider);
	}
	
	@GetMapping(path="/get/all")
	public ResponseEntity<List<ProvidersDTO>> findAll() {
		return ResponseEntity.ok().body(this.providersService.findAll());
	}
	
	@GetMapping(path="/get/{providerId}")
	public ResponseEntity<ProvidersDTO> findOneById(@PathVariable int providerId) {
		return ResponseEntity.ok().body(this.providersService.findOneById(providerId));
	}
}
