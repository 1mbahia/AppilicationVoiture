package com.webservice.voiture.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Voiture")
public class Voiture {
	@Id
	@GeneratedValue
	private int id;
	@Column(name = "nom", nullable = false, unique = true)
	private String nom;
	private String description;
	private int construction;
	private Long production;
	@Column(length = 1000)
	private String image;

	@ManyToOne
	@JoinColumn(name = "constructeur", nullable = false)
	private Constructeur Constructeur;

	public Voiture() {
		super();
	}

	public Voiture(int id, String nom, String description, int construction, Long production, String image,
			com.webservice.voiture.model.Constructeur constructeur) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.construction = construction;
		this.production = production;
		this.image = image;
		Constructeur = constructeur;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getConstruction() {
		return construction;
	}

	public void setConstruction(int construction) {
		this.construction = construction;
	}

	public Long getProduction() {
		return production;
	}

	public void setProduction(Long production) {
		this.production = production;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Constructeur getConstructeur() {
		return Constructeur;
	}

	public void setConstructeur(Constructeur constructeur) {
		Constructeur = constructeur;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Constructeur == null) ? 0 : Constructeur.hashCode());
		result = prime * result + construction;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((production == null) ? 0 : production.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voiture other = (Voiture) obj;
		if (Constructeur == null) {
			if (other.Constructeur != null)
				return false;
		} else if (!Constructeur.equals(other.Constructeur))
			return false;
		if (construction != other.construction)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (production == null) {
			if (other.production != null)
				return false;
		} else if (!production.equals(other.production))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Voiture [id=" + id + ", nom=" + nom + ", description=" + description + ", construction=" + construction
				+ ", production=" + production + ", image=" + image + ", Constructeur=" + Constructeur + "]";
	}

}
