package com.bros.minesweeper.domain.model;

import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * Nivell represents a level of a minesweeper game
 * @author Borja Arias
 * @version 0.1
 */

@Entity
@Table(name="InfoNivell")
public class Nivell {
	private String nom;
	/**
	 * Number of columns
	 */
	private Integer nombreCasellesxFila;
	/**
	 * Number of rows
	 */
	private Integer nombreCasellesxColumna; 
	
	
	private Integer nombreMines;

	/**
	 * Association attributes
	 */
	
	private ArrayList<Partida> partides;
	
	@Id
	@Column(name=("nomNivell"))
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getNombreCasellesxFila() {
		return nombreCasellesxFila;
	}

	public void setNombreCasellesxFila(Integer nombreCasellesxFila) {
		this.nombreCasellesxFila = nombreCasellesxFila;
	}

	public Integer getNombreCasellesxColumna() {
		return nombreCasellesxColumna;
	}

	public void setNombreCasellesxColumna(Integer nombreCasellesxColumna) {
		this.nombreCasellesxColumna = nombreCasellesxColumna;
	}

	public Integer getNombreMines() {
		return nombreMines;
	}

	public void setNombreMines(Integer nombreMines) {
		this.nombreMines = nombreMines;
	}
	
	@OneToMany(targetEntity=Partida.class, mappedBy="teNivell", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	public ArrayList<Partida> getPartides() {
		return partides;
	}
	public void setPartides(ArrayList<Partida> partides) {
		this.partides = partides;
	}
}
