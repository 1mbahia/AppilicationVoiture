package com.webservice.voiture.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webservice.voiture.model.Constructeur;

@Repository
public interface ConstructeurDAO extends JpaRepository<Constructeur, Integer> {

}
