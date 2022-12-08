package com.tarikMarket.gestion.entities;
import java.io.Serializable;

import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name="Client") 

public class Client implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Long id_client; 
	private String nom_client; 
	private String prenom_client;
	private String adress_client;
	private String tel_client;
	private String ville_client;
	
	
	
	public Long getId_client() {
		return id_client;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setId_client(Long id_client) {
		this.id_client = id_client;
	}
	public String getNom_client() {
		return nom_client;
	}
	public void setNom_client(String nom_client) {
		this.nom_client = nom_client;
	}
	public String getPrenom_client() {
		return prenom_client;
	}
	public void setPrenom_client(String prenom_client) {
		this.prenom_client = prenom_client;
	}
	public String getAdress_client() {
		return adress_client;
	}
	public void setAdress_client(String adress_client) {
		this.adress_client = adress_client;
	}
	public String getTel_client() {
		return tel_client;
	}
	public void setTel_client(String tel_client) {
		this.tel_client = tel_client;
	}
	public String getVille_client() {
		return ville_client;
	}
	public void setVille_client(String ville_client) {
		this.ville_client = ville_client;
	}

}
