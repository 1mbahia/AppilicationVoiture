package com.webservice.voiture.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.voiture.DAO.ConstructeurDAO;
import com.webservice.voiture.model.Constructeur;

@RestController
public class ConstructeurController {
	@Autowired
	ConstructeurDAO constructeurDAO;

	/**
	 * Get all constructeurs.
	 * 
	 * @param
	 * 
	 * @return All constructeurs, or 404 if not found.
	 */
	@GetMapping(value = "/getAllConstructeurs")
	public List<Constructeur> getAllConstructeurs() {
		List<Constructeur> constructeursFound = constructeurDAO.findAll();
		return constructeursFound;
	}

	/**
	 * Get a specific constructeur by id.
	 * 
	 * @param Id
	 *            of the constructeur wished.
	 * @return The constructeur wished, or 404 if not found.
	 */
	@GetMapping(value = "/getConstructeurFoundById/{id}")
	public Constructeur getConstructeurFoundById(@PathVariable int id) {
		Constructeur constructeurFound = constructeurDAO.findOne(id);
		return constructeurFound;
	}

	/**
	 * Request a new constructeur creation.
	 * 
	 * @param constructeur
	 *            json contains informations for the new constructeur creation.
	 * @return URI of the constructeur newly created, or 409 (Conflict) if constructeur name already
	 *         exists.
	 */
	@PostMapping(value = "/createConstructeur")
	public Constructeur createCar(@RequestBody Constructeur constructeur) {
		Constructeur createdCar = constructeurDAO.save(constructeur);
		return createdCar;
	}

	/**
	 * Update an existing constructeur.
	 * 
	 * @param constructeur
	 *            josn contians informations to put in the actual constructeur.
	 * @return 200 if correctly updated, 404 if no such constructeur Id found.
	 */
	@PutMapping(value = "/updateConstructeur")
	public Constructeur updateConstructeur(@RequestBody Constructeur constructeur) {
		Constructeur updatedConstructeur = constructeurDAO.save(constructeur);
		return updatedConstructeur;
	}

	/**
	 * Delete a specific constructeur.
	 * 
	 * @param Id
	 * 
	 * @return void, or 404 if not found.
	 */
	@DeleteMapping(value = "/deleteConstructeurById/{id}")
	public void deleteConstructeurById(@PathVariable int id) {
		constructeurDAO.delete(id);
	}
}
