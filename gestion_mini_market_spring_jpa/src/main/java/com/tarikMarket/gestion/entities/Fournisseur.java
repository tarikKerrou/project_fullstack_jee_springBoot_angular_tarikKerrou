package com.tarikMarket.gestion.entities;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Fournisseur")
public class Fournisseur implements Serializable  {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Long Id_Fournisseur ;
	private String Nom_Fournisseur ;
	private String Ville_Fournisseur ;
	private String Tel_Fournisseur ;
	@OneToMany  
	@JoinColumn(name="Id_societe")
	private Collection<Societe> societe;
	
	
	public Collection<Societe> getSociete() {
		return societe;
	}
	public void setSociete(Collection<Societe> societe) {
		this.societe = societe;
	}
	public Fournisseur(Long id_Fournisseur, String nom_Fournisseur, String ville_Fournisseur, String tel_Fournisseur) {
		super();
		Id_Fournisseur = id_Fournisseur;
		Nom_Fournisseur = nom_Fournisseur;
		Ville_Fournisseur = ville_Fournisseur;
		Tel_Fournisseur = tel_Fournisseur;
	}
	public Long getId_Fournisseur() {
		return Id_Fournisseur;
	}
	public void setId_Fournisseur(Long id_Fournisseur) {
		Id_Fournisseur = id_Fournisseur;
	}
	public String getNom_Fournisseur() {
		return Nom_Fournisseur;
	}
	public void setNom_Fournisseur(String nom_Fournisseur) {
		Nom_Fournisseur = nom_Fournisseur;
	}
	public String getVille_Fournisseur() {
		return Ville_Fournisseur;
	}
	public void setVille_Fournisseur(String ville_Fournisseur) {
		Ville_Fournisseur = ville_Fournisseur;
	}
	public String getTel_Fournisseur() {
		return Tel_Fournisseur;
	}
	public void setTel_Fournisseur(String tel_Fournisseur) {
		Tel_Fournisseur = tel_Fournisseur;
	}
	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
