package com.webservice.voiture.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Constructeur")
public class Constructeur {
	@Id
	@GeneratedValue
	private int id;
	@Column(name = "nom", nullable = false, unique = true)
	private String nom;
	private int creation;
	private String fondateur;
	private String pays;

	public Constructeur() {
		super();
	}

	public Constructeur(int id, String nom, int creation, String fondateur, String pays) {
		super();
		this.id = id;
		this.nom = nom;
		this.creation = creation;
		this.fondateur = fondateur;
		this.pays = pays;
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

	public int getCreation() {
		return creation;
	}

	public void setCreation(int creation) {
		this.creation = creation;
	}

	public String getFondateur() {
		return fondateur;
	}

	public void setFondateur(String fondateur) {
		this.fondateur = fondateur;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + creation;
		result = prime * result + ((fondateur == null) ? 0 : fondateur.hashCode());
		result = prime * result + id;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((pays == null) ? 0 : pays.hashCode());
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
		Constructeur other = (Constructeur) obj;
		if (creation != other.creation)
			return false;
		if (fondateur == null) {
			if (other.fondateur != null)
				return false;
		} else if (!fondateur.equals(other.fondateur))
			return false;
		if (id != other.id)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (pays == null) {
			if (other.pays != null)
				return false;
		} else if (!pays.equals(other.pays))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Constructeur [id=" + id + ", nom=" + nom + ", creation=" + creation + ", fondateur=" + fondateur
				+ ", pays=" + pays + "]";
	}

}
