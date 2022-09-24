package com.onliprint.onliprintbackendspring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="providers")
public class ProvidersModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_provider;
	private String name;
	private String surname;
	private String cnpj;
	private String business_name;

	public int getId_provider() {
		return id_provider;
	}

	public void setId_provider(int id_provider) {
		this.id_provider = id_provider;
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

	public String getBusiness_name() {
		return business_name;
	}

	public void setBusiness_name(String business_name) {
		this.business_name = business_name;
	}
}
