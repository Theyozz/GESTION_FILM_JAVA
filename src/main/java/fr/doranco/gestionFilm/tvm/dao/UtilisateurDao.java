package fr.doranco.gestionFilm.tvm.dao;

import java.sql.SQLException;

import fr.doranco.gestionFilm.tvm.business.Utilisateur;

public interface UtilisateurDao {

	Utilisateur ajouterUtilisateur(Utilisateur utilisateur) throws SQLException;
	
	boolean supprimerUtilisateur(Long id) throws SQLException;
	
	Utilisateur modifierUtilisateur(Utilisateur utilisateur) throws SQLException;
	
	Utilisateur ajouterFilmVisionne(Utilisateur utilisateur) throws SQLException;
}
