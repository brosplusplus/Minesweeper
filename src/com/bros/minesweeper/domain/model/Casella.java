package com.bros.minesweeper.domain.model;

import javax.persistence.Entity;

@Entity
public class Casella {
	private Integer numeroFila;
	private Integer numeroColumna;
	private Integer numero;
	private Boolean estaDescoberta;
	private Boolean estaMarcada;
	private Boolean teMina;
	
	public Integer getNumeroFila() {
		return numeroFila;
	}
	public void setNumeroFila(Integer numeroFila) {
		this.numeroFila = numeroFila;
	}
	public Integer getNumeroColumna() {
		return numeroColumna;
	}
	public void setNumeroColumna(Integer numeroColumna) {
		this.numeroColumna = numeroColumna;
	}
	public Boolean getEstaDescoberta() {
		return estaDescoberta;
	}
	public void setEstaDescoberta(Boolean estaDescoberta) {
		this.estaDescoberta = estaDescoberta;
	}
	public Boolean getEstaMarcada() {
		return estaMarcada;
	}
	public void setestaMarcada(Boolean estaMarcada) {
		this.estaMarcada = estaMarcada;
	}
	public Boolean getTeMina() {
		return teMina;
	}
	public void setTeMina(Boolean teMina) {
		this.teMina = teMina;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer Numero) {
		this.numero = Numero;
	}

	public void marcar(){
		//TODO implement
	}
	
	public Boolean tensMina() {
		return this.getTeMina();
	}

	public Boolean estaDescoberta() {
		return this.getEstaDescoberta();
	}
	
	public void descobrirCasella() {
		//TODO implement
	}
}
