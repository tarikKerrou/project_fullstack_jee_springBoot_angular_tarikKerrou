package com.tarikMarket.gestion.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tarikMarket.gestion.entities.Article;
import com.tarikMarket.gestion.entities.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur, String> {

	@Query("select c from Fournisseur c where c.Nom_Fournisseur like :x")
	public Page<Fournisseur> chercherFo(@Param ("x")String mc ,Pageable pageable);

}
