package com.tarikMarket.gestion.entities;
import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.mapping.Set;
@Entity
@Table(name="Societe")

public class Societe implements Serializable {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Long Id_societe;
	private String nom_societe;
	private String tel_societe;
	private String fax_societe;
	private String ville_societe;
	@ManyToOne
	@JoinColumn(name="Id_Fournisseur")
	
	private Fournisseur fornisseur ;
	public Societe(String nom_societe, String tel_societe, String fax_societe, String ville_societe,
			Fournisseur fornisseur) {
		super();
		this.nom_societe = nom_societe;
		this.tel_societe = tel_societe;
		this.fax_societe = fax_societe;
		this.ville_societe = ville_societe;
		this.fornisseur = fornisseur;
	}
	public Societe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTel_societe() {
		return tel_societe;
	}
	public void setTel_societe(String tel_societe) {
		this.tel_societe = tel_societe;
	}
	public String getFax_societe() {
		return fax_societe;
	}
	public void setFax_societe(String fax_societe) {
		this.fax_societe = fax_societe;
	}
	public String getVille_societe() {
		return ville_societe;
	}
	public void setVille_societe(String ville_societe) {
		this.ville_societe = ville_societe;
	}
	
}
