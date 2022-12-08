package com.tarikMarket.gestion.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarikMarket.gestion.entities.Client;
public interface ClientRepository extends JpaRepository<Client, Long>  {

}
