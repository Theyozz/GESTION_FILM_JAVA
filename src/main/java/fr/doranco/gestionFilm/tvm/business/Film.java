package fr.doranco.gestionFilm.tvm.business;

import java.util.ArrayList;
import java.util.List;

public class Film {

	private Long id;
	private String nom;
	private String realisateur;
	private int anneeSortie;
	
	private List<Utilisateur> utilisateurs;
	
	public Film() {
		super();
	}
	
	public Film(String nom, String realisateur, int anneeSortie) {
		this();
		this.nom = nom;
		this.realisateur = realisateur;
		this.anneeSortie = anneeSortie;
		this.utilisateurs = new ArrayList<>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}

	public int getAnneeSortie() {
		return anneeSortie;
	}

	public void setAnneeSortie(int anneeSortie) {
		this.anneeSortie = anneeSortie;
	}

	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	
}
