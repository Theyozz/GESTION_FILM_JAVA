package fr.doranco.gestionFilm.tvm.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import fr.doranco.gestionFilm.tvm.business.Utilisateur;
import fr.doranco.gestionFilm.tvm.dao.ConnexionBd;
import fr.doranco.gestionFilm.tvm.dao.Requetes;
import fr.doranco.gestionFilm.tvm.dao.UtilisateurDao;

public class UtilisateurDaoImpl implements UtilisateurDao{
	
	private Connection connexion;
	
	public UtilisateurDaoImpl() {
		try {
			connexion = ConnexionBd.getConnection();
		} catch (ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
	}

	@Override
	public Utilisateur ajouterUtilisateur(Utilisateur utilisateur) throws SQLException {
		
		PreparedStatement ps = connexion.prepareStatement(Requetes.AJOUT_UTILISATEUR, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, utilisateur.getNom());
		ps.setString(2, utilisateur.getPrenom());
		ps.setString(3, utilisateur.getTelephone());
		ps.setString(4, utilisateur.getEmail());
		ps.setString(5, utilisateur.getMotDePasse());
		ps.setTimestamp(6, Timestamp.valueOf(utilisateur.getDateHeureInscription()));
		ps.executeUpdate();

		ResultSet rs = ps.getGeneratedKeys();
		if (rs.next()) {
			utilisateur.setId(rs.getLong(1));
		}
		return utilisateur;
	}

	@Override
	public boolean supprimerUtilisateur(Long id) throws SQLException {
		PreparedStatement ps = connexion.prepareStatement(Requetes.SUPPRIMER_UTILISATEUR);
		ps.setLong(1, id);
		return ps.execute();
	}

	@Override
	public Utilisateur modifierUtilisateur(Utilisateur utilisateur) throws SQLException {
		PreparedStatement ps = connexion.prepareStatement(Requetes.MODIFIER_UTILISATEUR);
		ps.setString(1, utilisateur.getNom());
		ps.setString(2, utilisateur.getPrenom());
		ps.setString(3, utilisateur.getTelephone());
		ps.setString(4, utilisateur.getEmail());
		ps.setString(5, utilisateur.getMotDePasse());
		ps.setLong(6, utilisateur.getId());
		ps.executeUpdate();
		return utilisateur;
	}

	@Override
	public Utilisateur ajouterFilmVisionne(Utilisateur utilisateur) throws SQLException {
		/*
		PreparedStatement ps = connexion.prepareStatement(Requetes.AJOUTER_FILM_VISIONNE, Statement.RETURN_GENERATED_KEYS);
		ps.setLong(1, utilisateur.getId());
		ps.setLong(2, utilisateur.getFilms().get);
		ps.executeUpdate();

		ResultSet rs = ps.getGeneratedKeys();
		if (rs.next()) {
			utilisateur.setId(rs.getLong(1));
		}
		return utilisateur; */
		return null;
	}

}
