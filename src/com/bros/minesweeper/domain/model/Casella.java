package com.bros.minesweeper.domain.model;

public class Casella {
	private Integer n�meroFila;
	private Integer n�meroColumna;
	private Integer n�mero;
	private Boolean est�Descoberta;
	private Boolean est�Marcada;
	private Boolean t�Mina;
	
	public Integer getN�meroFila() {
		return n�meroFila;
	}
	public void setN�meroFila(Integer n�meroFila) {
		this.n�meroFila = n�meroFila;
	}
	public Integer getN�meroColumna() {
		return n�meroColumna;
	}
	public void setN�meroColumna(Integer n�meroColumna) {
		this.n�meroColumna = n�meroColumna;
	}
	public Boolean getEst�Descoberta() {
		return est�Descoberta;
	}
	public void setEst�Descoberta(Boolean est�Descoberta) {
		this.est�Descoberta = est�Descoberta;
	}
	public Boolean getEst�Marcada() {
		return est�Marcada;
	}
	public void setEst�Marcada(Boolean est�Marcada) {
		this.est�Marcada = est�Marcada;
	}
	public Boolean getT�Mina() {
		return t�Mina;
	}
	public void setT�Mina(Boolean t�Mina) {
		this.t�Mina = t�Mina;
	}
	public Integer getN�mero() {
		return n�mero;
	}
	public void setN�mero(Integer n�mero) {
		this.n�mero = n�mero;
	}

	public void marcar(){
		//TODO implement
	}
	
	public Boolean tensMina() {
		return this.getT�Mina();
	}

	public Boolean est�sDescoberta() {
		return this.getEst�Descoberta();
	}
	
	public void descobrirCasella() {
		//TODO implement
	}
}
