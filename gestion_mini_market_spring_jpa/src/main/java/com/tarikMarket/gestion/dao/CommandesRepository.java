package com.tarikMarket.gestion.dao;
import com.tarikMarket.gestion.entities.Commandes;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CommandesRepository  extends JpaRepository<Commandes, Long> {

}
