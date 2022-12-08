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
@Table(name="LigneCommendes")
public class Lignes_Commandes implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.AUTO) 
	private Long mumero_ligne; 
	private Integer quantite_commande;
	@ManyToOne
	@JoinColumn(name="NUMERO_COMMANDES")
	private Commandes cmd;
	@OneToMany 
	@JoinColumn(name="ID_Article")
	private Collection< Article> article;
	
	public Lignes_Commandes(Long mumero_ligne, Integer quantite_commande, Commandes cmd, Collection<Article> article) {
		super();
		this.mumero_ligne = mumero_ligne;
		this.quantite_commande = quantite_commande;
		this.cmd = cmd;
		this.article = article;
	}
	public Long getMumero_ligne() {
		return mumero_ligne;
	}
	public void setMumero_ligne(Long mumero_ligne) {
		this.mumero_ligne = mumero_ligne;
	}
	public Integer getQuantite_commande() {
		return quantite_commande;
	}
	public void setQuantite_commande(Integer quantite_commande) {
		this.quantite_commande = quantite_commande;
	}
	public Commandes getCmd() {
		return cmd;
	}
	public void setCmd(Commandes cmd) {
		this.cmd = cmd;
	}
	public Collection<Article> getArticle() {
		return article;
	}
	public void setArticle(Collection<Article> article) {
		this.article = article;
	}
	public Lignes_Commandes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
