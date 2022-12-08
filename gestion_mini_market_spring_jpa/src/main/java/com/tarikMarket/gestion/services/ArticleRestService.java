package com.tarikMarket.gestion.services;
import com.tarikMarket.gestion.entities.Article;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import com.tarikMarket.gestion.dao.ArticleRepository;

import java.util.Collection;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200") //pour autorisation de transformation de donnes vers autres server
@EnableSwagger2
public class ArticleRestService {
@Autowired
private ArticleRepository ArticleRepository;


@PostMapping(path="/saveArticle") 
public Article saveClient(@RequestBody Article c) { 
 return ArticleRepository.save(c);}

@RequestMapping(value="/getArticle/{ID_Article}",method=RequestMethod.GET) 
public Article getArticle(@PathVariable Long ID_Article)
{return ArticleRepository.getOne(ID_Article);
  }
@RequestMapping(value="/deleteArticle/{ID_Article}",method=RequestMethod.DELETE) 
public void deleteClient(@PathVariable Long ID_Article) { 
  ArticleRepository.deleteById(ID_Article);
 }
@RequestMapping(value="/updateArticle/{ID_Article}",method=RequestMethod.PUT) 
public Article updateClient(@PathVariable Long ID_Article,@RequestBody Article c) {
	c.setID_Article(ID_Article);
	return ArticleRepository.save(c);
	
} 

@RequestMapping(value="/listArticle",method=RequestMethod.GET) 
public Collection<Article> listArticle() { 
 return ArticleRepository.findAll();}

@RequestMapping(value="/checherArticle",method=RequestMethod.GET) 
public Page<Article> checherArticle(
		@RequestParam(name="mc",defaultValue="") String mc ,
		@RequestParam(name="page",defaultValue="0")  int page ,
		@RequestParam(name="size",defaultValue="5")  int size) 
{ 
 return ArticleRepository.chercher("%"+mc+"%", PageRequest.of(page,size));}
}
