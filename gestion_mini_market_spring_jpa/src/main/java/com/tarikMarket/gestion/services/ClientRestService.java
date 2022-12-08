package com.tarikMarket.gestion.services;
import com.tarikMarket.gestion.entities.Client;
import com.tarikMarket.gestion.dao.ClientRepository ;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RestController; 
@RestController
public class ClientRestService {
	@Autowired
	private ClientRepository ClientRepository ;
	
	@RequestMapping(value="/saveClient",method=RequestMethod.POST) 
	public Client saveClient(@RequestBody (required=false) Client c) { 
	 return ClientRepository .save(c);}

	@RequestMapping(value="/listClient",method=RequestMethod.GET) 
	public Collection<Client> listClient() { 
	 return ClientRepository .findAll();}
	
	@RequestMapping(value="/deleteClient/{id_client}",method=RequestMethod.DELETE) 
	public boolean deleteClient(@PathVariable Long ID_Article) { 
		ClientRepository.deleteById(ID_Article);
	  return true;}
	
	@RequestMapping(value="/getClient/{id_client}",method=RequestMethod.GET) 
	public Client getClient(@PathVariable Long ID_Article) { 
		return ClientRepository.getOne(ID_Article);
	  }
}
