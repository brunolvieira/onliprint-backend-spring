package br.com.onliprint.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.onliprint.dto.PrestadoresDTO;
import br.com.onliprint.repositories.PrestadoresRepository;

@Service
public class PrestadoresService {
	
	@Autowired
	private PrestadoresRepository prestadoresRepository;
	
	public PrestadoresDTO save(PrestadoresDTO novoPrestador) {
		return prestadoresRepository.save(novoPrestador.toEntity()).toDTO();
	}
}
