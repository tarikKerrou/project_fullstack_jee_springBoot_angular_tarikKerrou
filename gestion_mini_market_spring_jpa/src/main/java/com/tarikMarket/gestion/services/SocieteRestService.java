package com.tarikMarket.gestion.services;
import com.tarikMarket.gestion.dao.SocieteRepository;
import com.tarikMarket.gestion.entities.Article;
import com.tarikMarket.gestion.entities.Client;
import com.tarikMarket.gestion.entities.Societe;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RestController; 
@RestController
public class SocieteRestService {
@Autowired
private  SocieteRepository SocieteRepository;

@RequestMapping(value="/saveSociete",method=RequestMethod.POST) 
public Societe saveClient(@RequestBody (required=false) Societe c) { 
 return SocieteRepository.save(c);}

@RequestMapping(value="/getSociete/{Id_societe}",method=RequestMethod.GET) 
public Societe getClient(@PathVariable String Id_societe) { 
	return SocieteRepository.getOne(Id_societe);
  }
@RequestMapping(value="/deleteSociete/{Id_societe}",method=RequestMethod.DELETE) 
public boolean deleteSociete(@PathVariable String Id_societe) { 
	SocieteRepository.deleteById(Id_societe);
  return true;}



@RequestMapping(value="/listSociete",method=RequestMethod.GET) 
public List<Societe> listSociete() { 
 return SocieteRepository.findAll();}

}
