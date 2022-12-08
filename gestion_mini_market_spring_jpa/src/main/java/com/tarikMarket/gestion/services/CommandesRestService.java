package com.tarikMarket.gestion.services;
import com.tarikMarket.gestion.dao.ClientRepository;
import com.tarikMarket.gestion.entities.Client;
import com.tarikMarket.gestion.entities.Commandes;
import com.tarikMarket.gestion.dao.CommandesRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RestController; 
@RestController
public class CommandesRestService {
	private CommandesRepository CommandesRepository ;
	
	@RequestMapping(value="/saveCommandes",method=RequestMethod.POST) 
	public Commandes saveClient(@RequestBody (required=false)Commandes c) { 
	 return CommandesRepository.save(c);}

	@RequestMapping(value="/listCommandes",method=RequestMethod.GET) 
	public List<Commandes> listCommandes() { 
	 return CommandesRepository .findAll();}
	
	@RequestMapping(value="/deleteCommandes/{NUMERO_COMMANDES}",method=RequestMethod.DELETE) 
	public boolean deleteCommandes(@PathVariable Long NUMERO_COMMANDES) { 
		CommandesRepository.deleteById(NUMERO_COMMANDES);
	  return true;}
	
	@RequestMapping(value="/getClient/{NUMERO_COMMANDES}",method=RequestMethod.GET) 
	public Commandes getCommandes(@PathVariable Long NUMERO_COMMANDES) { 
		return CommandesRepository.getOne(NUMERO_COMMANDES);
	  }
}
