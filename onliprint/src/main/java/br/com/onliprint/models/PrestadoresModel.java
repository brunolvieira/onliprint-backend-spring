package br.com.onliprint.models;

import org.modelmapper.ModelMapper;

import br.com.onliprint.dto.PrestadoresDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "prestadores")
public class PrestadoresModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPrestador;
	private String nome;
	private String sobrenome;
	private String cnpj;
	private String nomeEmpreendimento;
	
	public PrestadoresDTO toDTO() {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(this, PrestadoresDTO.class);
	}

	public int getIdPrestador() {
		return idPrestador;
	}

	public void setIdPrestador(int idPrestador) {
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
