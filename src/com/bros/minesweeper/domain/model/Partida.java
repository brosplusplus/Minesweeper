package com.bros.minesweeper.domain.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Partida represents a single game of minesweeper
 * 
 * @author Borja Arias
 * @version 0.1
 */

@Entity
@Table(name="Partida")
public class Partida {
	/**
	 * Partida own atributes
	 */
	@Id
	@GeneratedValue
	@Column(name="idPartida")
	private Integer idPartida;
	private Boolean estaAcabada;
	private Boolean estaGuanyada;
	private Integer nombreTirades;
	private Integer casellesPerDescobrir;
	
	/**
	 * Association attributes
	 */
	
	@OneToOne
	@JoinColumn(name="JugadorActual_username")
	private Jugador jugadorPartidaActual;
	@ManyToOne
	@JoinColumn(name="Jugador_username")
	private Jugador jugadorPartidaJugada;
	
	
	@ManyToOne
	@JoinColumn(name="nomNivell")
	private Nivell teNivell;
	
	@Transient
	private EstrategiaPuntuacio estrategia;
	@Transient
	private Integer puntuacio_temps;
	@Transient
	private Integer puntuacio_tirades;
	
	@OneToMany (targetEntity=Casella.class, mappedBy="idCasella")
	private List<Casella> taulell;
	@Transient
	private Integer nCols; //numero de columnes del taulell
	@Transient
	private Integer nRows; //numero de files del taulell

	public Integer getIdPartida() {
		return idPartida;
	}
	
	public void setIdPartida(Integer idPartida) {
		this.idPartida = idPartida;
	}
	
	public Boolean getEstaAcabada() {
		return estaAcabada;
	}
	
	public void setEstaAcabada(Boolean estaAcabada) {
		this.estaAcabada = estaAcabada;
	}
	
	public Boolean getEstaGuanyada() {
		return estaGuanyada;
	}
	
	public void setEstaGuanyada(Boolean estaGuanyada) {
		this.estaGuanyada = estaGuanyada;
	}
	
	public Integer getNombreTirades() {
		return nombreTirades;
	}
	
	public void setNombreTirades(Integer nombreTirades) {
		this.nombreTirades = nombreTirades;
	}
	
	public Integer getCasellesPerDescobrir() {
		return casellesPerDescobrir;
	}
	
	public void setCasellesPerDescobrir(Integer casellesPerDescobrir) {
		this.casellesPerDescobrir = casellesPerDescobrir;
	}
	
	public Jugador getJugadorPartidaActual() {
		return jugadorPartidaActual;
	}
	
	public void setJugadorPartidaActual(Jugador jugadorPartidaActual) {
		this.jugadorPartidaActual = jugadorPartidaActual;
	}
	
	public Jugador getJugadorPartidaJugada() {
		return jugadorPartidaJugada;
	}
	
	public void setJugadorPartidaJugada(Jugador jugadorPartidaJugada) {
		this.jugadorPartidaJugada = jugadorPartidaJugada;
	}
	
	public Nivell getTeNivell() {
		return teNivell;
	}
	
	public void setTeNivell(Nivell teNivell) {
		this.teNivell = teNivell;
	}
	
	
	public EstrategiaPuntuacio getEstrategia() {
		return estrategia;
	}
	
	public void setEstrategia(EstrategiaPuntuacio estrategia) {
		this.estrategia = estrategia;
	}
	
	public List<Casella> getTaulell() {
		return taulell;
	}
	
	public void setTaulell(ArrayList<Casella> taulell) {
		this.taulell = taulell;
	}
	
	private void setCasella(int numF, int numC, Casella c) {
		set(this.taulell, numF ,numC, c);
	}
	private Casella getCasella(int numF, int numC) {
		return get(this.taulell, numF ,numC);
	}
	
	public void marcarCasella(int numF, int numC){
		Casella c = new Casella();
		c = getCasella(numF, numC);
		c.marcar();
	}
	
	public void desmarcarCasella (int numF, int numC) {
		Casella c = new Casella();
		c = getCasella(numF, numC);
		c.desmarcar();
	}
	
	public EstatPartida descobrirCasella (int numF, int numC) {
		Casella c = new Casella();
		c = getCasella(numF, numC);
		c.descobrirCasella();
		EstatPartida es = new EstatPartida();
		return es;
	}
	
	public void inicialitzarCaselles( ) {
		Integer filesDelNivell = this.teNivell.getNombreCasellesxFila();
		Integer columnesDelNivell = this.teNivell.getNombreCasellesxColumna();
		for (int i = 0; i < filesDelNivell; ++i) {
			for (int j = 0; j <  columnesDelNivell; ++i) {
				Casella c = new Casella();
				c.setNumeroFila(i);
				c.setNumeroColumna(j);
				c.setNumero(null);
				c.setEstaDescoberta(false);
				c.setEstaMarcada(false);
				c.setTeMina(null);
				setCasella(i, j, c);
			}
		}
	}
	
	public void assignarPuntuacio() {
		//TODO implement
	}
	
	
	
	private void set(List<Casella> array, int x, int y, Casella casella) {
		int index = x * nCols + y;
		array.set(index, casella);
	}
	
	private Casella get(List<Casella> array, int x, int y) {
		int index = x * nCols + y;
		return array.get(index);
	}
	
	
	public static void main(String[] args) {
		Partida p = new Partida();
		EstatPartida es = p.descobrirCasella(0, 0);
		System.out.print(es.puntuacio);
	}
}
