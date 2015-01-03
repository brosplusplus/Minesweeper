package com.bros.minesweeper.domain.model;

public class Casella {
	private Integer númeroFila;
	private Integer númeroColumna;
	private Integer número;
	private Boolean estàDescoberta;
	private Boolean estàMarcada;
	private Boolean téMina;
	
	public Integer getNúmeroFila() {
		return númeroFila;
	}
	public void setNúmeroFila(Integer númeroFila) {
		this.númeroFila = númeroFila;
	}
	public Integer getNúmeroColumna() {
		return númeroColumna;
	}
	public void setNúmeroColumna(Integer númeroColumna) {
		this.númeroColumna = númeroColumna;
	}
	public Boolean getEstàDescoberta() {
		return estàDescoberta;
	}
	public void setEstàDescoberta(Boolean estàDescoberta) {
		this.estàDescoberta = estàDescoberta;
	}
	public Boolean getEstàMarcada() {
		return estàMarcada;
	}
	public void setEstàMarcada(Boolean estàMarcada) {
		this.estàMarcada = estàMarcada;
	}
	public Boolean getTéMina() {
		return téMina;
	}
	public void setTéMina(Boolean téMina) {
		this.téMina = téMina;
	}
	public Integer getNúmero() {
		return número;
	}
	public void setNúmero(Integer número) {
		this.número = número;
	}

	public void marcar(){
		//TODO implement
	}
	
	public Boolean tensMina() {
		return this.getTéMina();
	}

	public Boolean estàsDescoberta() {
		return this.getEstàDescoberta();
	}
	
	public void descobrirCasella() {
		//TODO implement
	}
}
