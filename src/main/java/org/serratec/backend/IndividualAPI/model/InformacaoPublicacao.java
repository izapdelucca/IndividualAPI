package org.serratec.backend.IndividualAPI.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Embeddable
public class InformacaoPublicacao {

	@Column(nullable = false, length = 40)
	private String autor;

	@Column(nullable = false, name = "data_publicacao")
	@Temporal(TemporalType.DATE)
	private LocalDate dataPublicacao;
	
	@Column(nullable = false, length = 40)
	private String editora;

	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

		
}
