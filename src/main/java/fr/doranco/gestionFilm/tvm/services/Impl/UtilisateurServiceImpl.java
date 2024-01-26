package fr.doranco.gestionFilm.tvm.services.Impl;

import java.sql.SQLException;

import fr.doranco.gestionFilm.tvm.business.Utilisateur;
import fr.doranco.gestionFilm.tvm.dao.UtilisateurDao;
import fr.doranco.gestionFilm.tvm.dao.Impl.UtilisateurDaoImpl;
import fr.doranco.gestionFilm.tvm.services.UtilisateurService;

public class UtilisateurServiceImpl implements UtilisateurService{
	
	UtilisateurDao utilisateurDao = new UtilisateurDaoImpl();

	@Override
	public Utilisateur ajouterUtilisateur(Utilisateur utilisateur) {
		try {
			return utilisateurDao.ajouterUtilisateur(utilisateur);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public boolean supprimerUtilisateur(Long id) {
		try {
			return utilisateurDao.supprimerUtilisateur(id);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public Utilisateur modifierUtilisateur(Utilisateur utilisateur) {
		try {
			return utilisateurDao.modifierUtilisateur(utilisateur);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Utilisateur ajouterFilmVisionne(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}

}
