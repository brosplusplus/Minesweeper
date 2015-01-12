package com.bros.minesweeper.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Casella")
public class Casella {
	@EmbeddedId
	private CasellaID id;
	
	private Integer numero;
	private Boolean estaDescoberta;
	private Boolean estaMarcada;
	private Boolean teMina;
	
	public Casella() {
		id = new CasellaID();
	}
	
	public void setPartida(Partida p)
	{
		this.id.partida = p;
	}
	
	public Integer getNumeroFila() {
		return id.numeroFila;
	}
	public void setNumeroFila(Integer numeroFila) {
		this.id.numeroFila = numeroFila;
	}
	public Integer getNumeroColumna() {
		return this.id.numeroColumna;
	}
	public void setNumeroColumna(Integer numeroColumna) {
		this.id.numeroColumna = numeroColumna;
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
	public void setEstaMarcada(Boolean estaMarcada) {
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

	public void marcar() throws Exception{
		if (getEstaDescoberta()) throw new Exception("La casella esta descoberta i no es pot marcar");
		if (getEstaMarcada()) throw new Exception("La casella ja esta marcada");
		setEstaMarcada(true);
	}
	
	public void desmarcar() throws Exception{
		if (getEstaDescoberta()) throw new Exception("La casella esta descoberta i no es pot desmarcar");
		if (!getEstaMarcada()) throw new Exception("La casella ja esta desmarcada");
		setEstaMarcada(false);
	}
	
	public Boolean tensMina() {
		return this.getTeMina();
	}

	public Boolean estaDescoberta() {
		return this.getEstaDescoberta();
	}
	
	public void descobrirCasella() throws Exception {
		if (getEstaDescoberta()) throw new Exception("La casella esta descoberta");
		if (getEstaMarcada()) throw new Exception("La casella esta marcada i no es pot descobrir");
		setEstaDescoberta(true);
	}
	
	@Embeddable
	public class CasellaID implements Serializable{
		@ManyToOne 
		private Partida partida;
		private Integer numeroFila;
		private Integer numeroColumna;
	}
}
