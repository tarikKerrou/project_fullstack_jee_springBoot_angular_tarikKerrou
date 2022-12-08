package com.tarikMarket.gestion.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tarikMarket.gestion.entities.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
@Query("select c from Article c where c.nom_article like :x")
	public Page<Article> chercher(@Param ("x")String mc ,Pageable pageable);
	

}
