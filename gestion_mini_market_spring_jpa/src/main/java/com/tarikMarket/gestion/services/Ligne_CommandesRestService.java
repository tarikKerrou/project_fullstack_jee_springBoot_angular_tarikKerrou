package com.tarikMarket.gestion.services;
import com.tarikMarket.gestion.entities.Article;
import com.tarikMarket.gestion.entities.Client;
import com.tarikMarket.gestion.entities.Lignes_Commandes;
import com.tarikMarket.gestion.dao.Lignes_CommandesRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RestController; 
@RestController
public class Ligne_CommandesRestService {
	@Autowired
	private Lignes_CommandesRepository Lignes_CommandesRepository;
	
	@RequestMapping(value="/saveLignes_Commandes",method=RequestMethod.POST) 
	public Lignes_Commandes saveClient(@RequestBody Lignes_Commandes lc) { 
	 return Lignes_CommandesRepository.save(lc);}

	@RequestMapping(value="/getLignes_Commandes/{mumero_ligne}",method=RequestMethod.GET) 
	public Lignes_Commandes getClient(@PathVariable String mumero_ligne) { 
		return Lignes_CommandesRepository.getOne(mumero_ligne);
	  }
	@RequestMapping(value="/deleteArticle/{mumero_ligne}",method=RequestMethod.DELETE) 
	public boolean deleteClient(@PathVariable String mumero_ligne) { 
		Lignes_CommandesRepository.deleteById(mumero_ligne);
	  return true;}



	@RequestMapping(value="/listLignes_Commandes",method=RequestMethod.GET) 
	public List<Lignes_Commandes> listArticle() { 
	 return Lignes_CommandesRepository.findAll();}
	
	
	
}
