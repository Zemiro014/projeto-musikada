package com.musikada.ciphers.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cipher implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String letra;
	private String acordes;
	
	public Cipher() {
		
	}

	public Cipher(String letra, String acordes) {
		super();
		this.letra = letra;
		this.acordes = acordes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public String getAcordes() {
		return acordes;
	}

	public void setAcordes(String acordes) {
		this.acordes = acordes;
	}	
}
