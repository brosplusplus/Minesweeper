package com.bros.minesweeper.domain.model;

public abstract class UsuariRegistrat {
	private String nom;
	private String cognom;
	private String username;
	
	public String getCognom() {
		return cognom;
	}
	public void setCognom(String cognom) {
		this.cognom = cognom;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	private String pwd;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
}