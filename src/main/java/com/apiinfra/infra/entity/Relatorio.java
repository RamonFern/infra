package com.apiinfra.infra.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Relatorio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String data;

	@Column(nullable = false)
	private String texto;

	@Column(nullable = false)
	private String inspetor;

	public String getTexto() {
		return this.texto;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setInspetor(String inspetor) {
		this.inspetor = inspetor;
		
	}

	public void setTexto(String texto) {
		this.texto = texto;
		
	}

	public String getInspetor() {
		return this.inspetor;
	}
}
