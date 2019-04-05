package com.formation.domain;

public class Hotel {
	
	private String nomHotel; 
	private int nuitee;
	private int etoile;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel( String nomHotel, int nuitee, int etoile) {
		super();
		this.etoile = etoile;
		this.nomHotel = nomHotel;
		this.nuitee = nuitee;
	}
	public Hotel(String nomHotel, int nuitee) {
		super();
		this.nomHotel = nomHotel;
		this.nuitee = nuitee;
	}


	public String getNomHotel() {
		return nomHotel;
	}
	public void setNomHotel(String nomHotel) {
		this.nomHotel = nomHotel;
	}
	public int getNuitee() {
		return nuitee;
	}
	public void setNuitee(int nuitee) {
		this.nuitee = nuitee;
	}
	public int getEtoile() {
		return etoile;
	}
	public void setEtoile(int etoile) {
		this.etoile = etoile;
	} 
	
}
