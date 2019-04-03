package com.formation.domain;

import java.util.List;

public class Pays {
	private int id; 
	private String nom;
	private List <Hotel> hostels;
	public Pays() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Hotel> getHostels() {
		return hostels;
	}
	public void setHostels(List<Hotel> hostels) {
		this.hostels = hostels;
	}
	
	
}
