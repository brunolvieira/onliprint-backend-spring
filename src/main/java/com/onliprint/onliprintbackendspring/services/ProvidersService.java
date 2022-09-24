package com.onliprint.onliprintbackendspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onliprint.onliprintbackendspring.model.ProvidersModel;
import com.onliprint.onliprintbackendspring.model.dto.ProvidersDTO;
import com.onliprint.onliprintbackendspring.repository.ProvidersRepository;

@Service
public class ProvidersService {

	@Autowired
	private ProvidersRepository providersRepository;
	
	public void save(ProvidersDTO providerDTO) {
		
		ProvidersModel providerModel = new ProvidersModel();
		
		providerModel.setId_provider(providerDTO.getIdProvider());
		providerModel.setName(providerDTO.getName());
		providerModel.setSurname(providerDTO.getSurname());
		providerModel.setCnpj(providerDTO.getCnpj());
		providerModel.setBusiness_name(providerDTO.getBusinessName());
		
		providerModel = providersRepository.save(providerModel);
		
//		providerDTO.setIdProvider(providerModel.getId_provider());
//		providerDTO.setName(providerModel.getName());
//		providerDTO.setSurname(providerModel.getSurname());
//		providerDTO.setCnpj(providerModel.getCnpj());
//		providerDTO.setBusinessName(providerModel.getBusiness_name());
//		
//		return providerDTO;
	}
}
