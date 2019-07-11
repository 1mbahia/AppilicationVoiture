package com.webservice.voiture.viewHTMLcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webservice.voiture.DAO.VoitureDAO;
import com.webservice.voiture.model.Voiture;

@Controller
@RequestMapping("/car")
public class VoitureViewHtmlController {
	@Autowired
	private VoitureDAO voitureDAO;

	@GetMapping(value = "/showListCars")
	public String pageShowCars(Model model) {
		List<Voiture> cars = voitureDAO.findAll();
		model.addAttribute("cars", cars);
		return "ShowCars";
	}
}
