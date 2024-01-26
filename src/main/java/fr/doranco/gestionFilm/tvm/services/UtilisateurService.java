package fr.doranco.gestionFilm.tvm.services;

import java.sql.SQLException;

import fr.doranco.gestionFilm.tvm.business.Utilisateur;

public interface UtilisateurService {

	Utilisateur ajouterUtilisateur(Utilisateur utilisateur);
	
	boolean supprimerUtilisateur(Long id);
	
	Utilisateur modifierUtilisateur(Utilisateur utilisateur);
	
	Utilisateur ajouterFilmVisionne(Utilisateur utilisateur);
}
