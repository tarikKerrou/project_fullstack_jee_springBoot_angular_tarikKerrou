package com.tarikMarket.gestion.services;

import com.tarikMarket.gestion.dao.LivraisonRepository;
import com.tarikMarket.gestion.entities.Article;
import com.tarikMarket.gestion.entities.Client;
import com.tarikMarket.gestion.entities.Livraison;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivraisonRestService {
	@Autowired
	private LivraisonRepository LivraisonRepository;

	@RequestMapping(value = "/saveLivraison", method = RequestMethod.POST)
	public Livraison saveLivraison(@RequestBody Livraison c) {
		return LivraisonRepository.save(c);
	}

	@RequestMapping(value = "/getLivraison/{ID_Article}", method = RequestMethod.GET)
	public Livraison getClient(@PathVariable String numero_livraison) {
		return LivraisonRepository.getOne(numero_livraison);
	}

	@RequestMapping(value = "/deleteLivraison/{ID_Article}", method = RequestMethod.DELETE)
	public boolean deleteLivraison(@PathVariable String numero_livraison) {
		LivraisonRepository.deleteById(numero_livraison);
		return true;
	}

	@RequestMapping(value = "/listLivraison", method = RequestMethod.GET)
	public List<Livraison> listLivraison() {
		return LivraisonRepository.findAll();
	}
}
