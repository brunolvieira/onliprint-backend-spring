package com.onliprint.onliprintbackendspring.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onliprint.onliprintbackendspring.model.ProvidersModel;
import com.onliprint.onliprintbackendspring.model.dto.ProvidersDTO;
import com.onliprint.onliprintbackendspring.repository.ProvidersRepository;

@Service
public class ProvidersService {

	@Autowired
	private ProvidersRepository providersRepository;
	
	public void save(ProvidersDTO providerDto) {
		providersRepository.save(providerDto.toModel());
	}

	public List<ProvidersDTO> findAll() {
		List<ProvidersModel> providersList = providersRepository.findAll();
		return providersList.stream().map(model -> model.toDto()).collect(Collectors.toCollection(ArrayList :: new));
	}

	public ProvidersDTO findOneById(int providerId) {
		ProvidersModel providerModel = this.providersRepository.findOneById(providerId);
		return providerModel.toDto();
	}
}
