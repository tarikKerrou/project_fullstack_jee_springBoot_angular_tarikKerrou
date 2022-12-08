package com.tarikMarket.gestion.services;



import com.tarikMarket.gestion.entities.Article;
import com.tarikMarket.gestion.entities.Fournisseur;
import com.tarikMarket.gestion.dao.FournisseurRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController; 
@RestController
@CrossOrigin(origins = "http://localhost:4200") //pour autorisation de transformation de donnes vers autres server
public class FournisseurRestService {
@Autowired
private FournisseurRepository FournisseurRepository;

@RequestMapping(value="/saveFournisseur",method=RequestMethod.POST) 
public Fournisseur saveFournisseur(@RequestBody (required=false) Fournisseur c) { 
 return FournisseurRepository.save(c);}

@RequestMapping(value="/getFournisseur/{Id_Fournisseur}",method=RequestMethod.GET) 
public Fournisseur getFournisseur(@PathVariable String Id_Fournisseur) { 
	return  FournisseurRepository.getOne(Id_Fournisseur);
  }
@RequestMapping(value="/deleteFournisseur/{Id_Fournisseur}",method=RequestMethod.DELETE) 
public boolean deleteFournisseur(@PathVariable String Id_Fournisseur) { 
	FournisseurRepository.deleteById(Id_Fournisseur);
  return true;}

@RequestMapping(value="/checherFournisseur",method=RequestMethod.GET) 
public Page<Fournisseur> checherFournisseur(
		@RequestParam(name="mc",defaultValue="") String mc ,
		@RequestParam(name="page",defaultValue="0")  int page ,
		@RequestParam(name="size",defaultValue="5")  int size) 
{ 
 return FournisseurRepository.chercherFo("%"+mc+"%", PageRequest.of(page,size));
}

@RequestMapping(value="/listFournisseur",method=RequestMethod.GET) 
public List<Fournisseur> lisFournisseur() { 
 return FournisseurRepository.findAll();}

}
