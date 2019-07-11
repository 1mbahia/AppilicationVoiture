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

import com.webservice.voiture.DAO.VoitureDAO;
import com.webservice.voiture.model.Voiture;

@RestController
public class VoitureController {

	@Autowired
	VoitureDAO voitureDAO;

	/**
	 * Get all cars.
	 * 
	 * @param
	 * 
	 * @return All cars, or 404 if not found.
	 */
	@GetMapping(value = "/getAllCars")
	public List<Voiture> getAllCars() {
		List<Voiture> carsFound = voitureDAO.findAll();
		return carsFound;
	}

	/**
	 * Get a specific car by id.
	 * 
	 * @param Id
	 *            of the city wished.
	 * @return The car wished, or 404 if not found.
	 */
	@GetMapping(value = "/getCarById/{id}")
	public Voiture getCarById(@PathVariable int id) {
		Voiture carFound = voitureDAO.findOne(id);
		return carFound;
	}

	/**
	 * Request a new car creation.
	 * 
	 * @param car
	 *            json contains informations for the new city creation.
	 * @return URI of the city newly created, or 409 (Conflict) if car name already
	 *         exists.
	 */
	@PostMapping(value = "/createCar")
	public Voiture createCar(@RequestBody Voiture voiture) {
		Voiture createdCar = voitureDAO.save(voiture);
		return createdCar;
	}

	/**
	 * Update an existing car.
	 * 
	 * @param car
	 *            josn contians informations to put in the actual car.
	 * @return 200 if correctly updated, 404 if no such car Id found.
	 */
	@PutMapping(value = "/updateCar")
	public Voiture updateCar(@RequestBody Voiture voiture) {
		Voiture updatedCar = voitureDAO.save(voiture);
		return updatedCar;
	}

	/**
	 * Delete a specific car.
	 * 
	 * @param Id
	 * 
	 * @return void, or 404 if not found.
	 */
	@DeleteMapping(value = "/deleteCarById/{id}")
	public void deleteCarById(@PathVariable int id) {
		voitureDAO.delete(id);
	}

}
