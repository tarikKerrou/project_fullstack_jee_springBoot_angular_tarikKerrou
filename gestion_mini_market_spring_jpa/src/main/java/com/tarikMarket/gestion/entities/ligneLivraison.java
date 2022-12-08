package com.tarikMarket.gestion.entities;


import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="LigneLivraison")
public class  ligneLivraison implements Serializable   {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Long ID_lignelivrison;
	@OneToMany
	@JoinColumn(name="ID_Article")
	private Collection<Article> article;
	@ManyToOne
	@JoinColumn(name="numero_livraison")
	private Livraison livraison;
	Double quantite_livraison;
	
	public ligneLivraison(Collection<Article> article, Livraison livraison, Double quantite_livraison) {
		super();
		this.article = article;
		this.livraison = livraison;
		this.quantite_livraison = quantite_livraison;
	}
	public Collection<Article> getArticle() {
		return article;
	}
	public void setArticle(Collection<Article> article) {
		this.article = article;
	}
	public Livraison getLivraison() {
		return livraison;
	}
	public void setLivraison(Livraison livraison) {
		this.livraison = livraison;
	}
	public Double getQuantite_livraison() {
		return quantite_livraison;
	}
	public void setQuantite_livraison(Double quantite_livraison) {
		this.quantite_livraison = quantite_livraison;
	}
	public ligneLivraison() {
		super();
		// TODO Auto-generated constructor stub
	}
}
