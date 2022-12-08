package com.tarikMarket.gestion.entities;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.OneToOne;
@Entity
@Table(name="Commandes") 
public class Commandes implements Serializable  {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Long NUMERO_COMMANDES ;
	private Date date_commande;
	@OneToOne
	@JoinColumn(name="id_client")
	private Client client;
	
	public Commandes(Long nUMERO_COMMANDES, Date date_commande, Client client) {
		super();
		NUMERO_COMMANDES = nUMERO_COMMANDES;
		this.date_commande = date_commande;
		this.client = client;
	}
	public Long getNUMERO_COMMANDES() {
		return NUMERO_COMMANDES;
	}
	public void setNUMERO_COMMANDES(Long nUMERO_COMMANDES) {
		NUMERO_COMMANDES = nUMERO_COMMANDES;
	}
	public Date getDate_commande() {
		return date_commande;
	}
	public void setDate_commande(Date date_commande) {
		this.date_commande = date_commande;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	

	public Commandes() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
