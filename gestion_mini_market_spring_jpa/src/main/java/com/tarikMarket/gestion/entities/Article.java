package com.tarikMarket.gestion.entities;
import java.io.Serializable;

import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id;

import javax.persistence.Table;
@Entity
@Table(name="Article")
public class Article implements Serializable  {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Long ID_Article;
	private String nom_article;
	private Double pu;
	private Double quantite_article;
	
	public Article(Long iD_Article, String nom_article, Double pu, Double quantite_article) {
		super();
		ID_Article = iD_Article;
		this.nom_article = nom_article;
		this.pu = pu;
		this.quantite_article = quantite_article;
	}
	public Long getID_Article() {
		return ID_Article;
	}
	public void setID_Article(Long iD_Article) {
		ID_Article = iD_Article;
	}
	public String getNom_article() {
		return nom_article;
	}
	public void setNom_article(String nom_article) {
		this.nom_article = nom_article;
	}
	public Double getPu() {
		return pu;
	}
	public void setPu(Double pu) {
		this.pu = pu;
	}
	public Double getQuantite_article() {
		return quantite_article;
	}
	public void setQuantite_article(Double quantite_article) {
		this.quantite_article = quantite_article;
	}
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
}
