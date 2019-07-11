package com.webservice.voiture.DAO;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webservice.voiture.model.Voiture;

@Repository
public interface VoitureDAO extends JpaRepository<Voiture, Integer> {

	 //List<Voiture> findAllByConstructeur(Constructeur constructeur);
	 //List<Plot> findAllPlotByCityCityId(int cityId);

}
