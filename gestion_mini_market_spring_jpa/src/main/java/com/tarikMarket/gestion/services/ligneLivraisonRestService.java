package com.tarikMarket.gestion.services;

import com.tarikMarket.gestion.entities.ligneLivraison;
import com.tarikMarket.gestion.entities.Client;
import com.tarikMarket.gestion.entities.Lignes_Commandes;
import com.tarikMarket.gestion.entities.ligneLivraison;

import com.tarikMarket.gestion.dao.LigneLivraisonRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RestController; 
@RestController

public class ligneLivraisonRestService {
	@Autowired
	private LigneLivraisonRepository LigneLivraisonRepository ;
	
	
	@RequestMapping(value="/save LigneLivraison",method=RequestMethod.POST) 
	public ligneLivraison saveClient(@RequestBody  ligneLivraison Lv) { 
	 return LigneLivraisonRepository.save(Lv);}

	@RequestMapping(value="/getligneLivraison/{ID_lignelivrisons}",method=RequestMethod.GET) 
	public ligneLivraison getligneLivraison(@PathVariable String ID_lignelivrison) { 
		return LigneLivraisonRepository.getOne(ID_lignelivrison);
	  }
	@RequestMapping(value="/deletligneLivraison/{ID_lignelivrison}",method=RequestMethod.DELETE) 
	public boolean deleteligneLivraison(@PathVariable String ID_lignelivrison) { 
		LigneLivraisonRepository.deleteById(ID_lignelivrison);
	  return true;}



	@RequestMapping(value="/listligneLivraison",method=RequestMethod.GET) 
	public List<ligneLivraison> listligneLivraison() { 
	 return LigneLivraisonRepository.findAll();}
}
