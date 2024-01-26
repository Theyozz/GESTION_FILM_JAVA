package fr.doranco.gestionFilm.tvm.dao;

import java.sql.SQLException;
import java.util.List;

import fr.doranco.gestionFilm.tvm.business.Utilisateur;

public interface UtilisateurDao {

	Utilisateur ajouterUtilisateur(Utilisateur utilisateur) throws SQLException;
	
	boolean supprimerUtilisateur(Long id) throws SQLException;
	
	Utilisateur modifierUtilisateur(Utilisateur utilisateur) throws SQLException;
	
	List<Utilisateur> trouverToutLesUtilisateurs() throws SQLException;
	
	Utilisateur trouverUtilisateurParId(Long id) throws SQLException;
}
