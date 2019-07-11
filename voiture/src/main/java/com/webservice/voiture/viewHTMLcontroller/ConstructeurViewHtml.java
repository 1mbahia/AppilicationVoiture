package com.webservice.voiture.viewHTMLcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webservice.voiture.DAO.ConstructeurDAO;
import com.webservice.voiture.model.Constructeur;

@Controller
@RequestMapping("/constructeur")
public class ConstructeurViewHtml {
	@Autowired
	private ConstructeurDAO constructeurDAO;

	@GetMapping(value = "/showConstructeur")
	public String pageShowConstructeurs(Model model) {
		List<Constructeur> constructeurs = constructeurDAO.findAll();
		model.addAttribute("constructeurs", constructeurs);
		return "ShowConstructeur";
	}
}
