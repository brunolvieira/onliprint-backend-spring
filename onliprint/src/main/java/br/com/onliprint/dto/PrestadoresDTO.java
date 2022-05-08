package br.com.onliprint.dto;

import org.modelmapper.ModelMapper;

import br.com.onliprint.models.PrestadoresModel;

public class PrestadoresDTO {
	
	private String idPrestador;
	private String nome;
	private String sobrenome;
	private String cnpj;
	private String nomeEmpreendimento;
	
	public PrestadoresModel toEntity() {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(this, PrestadoresModel.class);
	}

	public String getIdPrestador() {
		return idPrestador;
	}

	public void setIdPrestador(String idPrestador) {
		this.idPrestador = idPrestador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeEmpreendimento() {
		return nomeEmpreendimento;
	}

	public void setNomeEmpreendimento(String nomeEmpreendimento) {
		this.nomeEmpreendimento = nomeEmpreendimento;
	}
	
}
