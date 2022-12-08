package com.tarikMarket.gestion.entities;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToMany;

import javax.persistence.Table;
@Entity
@Table(name="Livraison")
public class Livraison implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Long numero_livraison ;
	private Date date_Livraison;
	@ManyToMany
	@JoinColumn(name="Id_Fournisseur")
	private Collection <Fournisseur> fornisseur ;
	
	public Livraison(Long numero_livraison, Date date_Livraison, Collection<Fournisseur> fornisseur) {
		super();
		this.numero_livraison = numero_livraison;
		this.date_Livraison = date_Livraison;
		this.fornisseur = fornisseur;
	}
	public Long getNumero_livraison() {
		return numero_livraison;
	}
	public void setNumero_livraison(Long numero_livraison) {
		this.numero_livraison = numero_livraison;
	}
	public Date getDate_Livraison() {
		return date_Livraison;
	}
	public void setDate_Livraison(Date date_Livraison) {
		this.date_Livraison = date_Livraison;
	}
	public Collection<Fournisseur> getFornisseur() {
		return fornisseur;
	}
	public void setFornisseur(Collection<Fournisseur> fornisseur) {
		this.fornisseur = fornisseur;
	}
	public Livraison() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
