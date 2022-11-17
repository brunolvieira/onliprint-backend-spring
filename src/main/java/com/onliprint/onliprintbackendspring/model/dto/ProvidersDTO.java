package com.onliprint.onliprintbackendspring.model.dto;

import com.onliprint.onliprintbackendspring.model.ProvidersModel;

public class ProvidersDTO {

	private int idProvider;
	private String name;
	private String surname;
	private String cnpj;
	private String businessName;

	public int getIdProvider() {
		return idProvider;
	}

	public void setIdProvider(int idProvider) {
		this.idProvider = idProvider;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	
	public ProvidersModel toModel() {
		
		ProvidersModel providerModel = new ProvidersModel();
		
		providerModel.setId_provider(this.idProvider);
		providerModel.setId_provider(this.getIdProvider());
		providerModel.setName(this.getName());
		providerModel.setSurname(this.getSurname());
		providerModel.setCnpj(this.getCnpj());
		providerModel.setBusiness_name(this.getBusinessName());
		
		return providerModel;
	}
}
