package com.onliprint.onliprintbackendspring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onliprint.onliprintbackendspring.model.dto.ProvidersDTO;
import com.onliprint.onliprintbackendspring.services.ProvidersService;

@RequestMapping(path="providers")
@CrossOrigin(origins="*")
@RestController
public class ProvidersController {

	@Autowired
	private ProvidersService providersService;
	
	@PostMapping(path="/save")
	public void save(@Valid @RequestBody ProvidersDTO newProvider) {
		providersService.save(newProvider);
	}
}
