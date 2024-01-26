package fr.doranco.gestionFilm.tvm.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.doranco.gestionFilm.tvm.business.Film;
import fr.doranco.gestionFilm.tvm.dao.ConnexionBd;
import fr.doranco.gestionFilm.tvm.dao.FilmDao;
import fr.doranco.gestionFilm.tvm.dao.Requetes;

public class FilmDaoImpl implements FilmDao{
	
	private Connection connexion;
	
	public FilmDaoImpl() {
		try {
			connexion = ConnexionBd.getConnection();
		} catch (ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
	}

	@Override
	public Film ajoutFilm(Film film) throws SQLException {
		
		PreparedStatement ps = connexion.prepareStatement(Requetes.AJOUT_FILM, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, film.getNom());
		ps.setString(2, film.getRealisateur());
		ps.setInt(3, film.getAnneeSortie());
		ps.executeUpdate();

		ResultSet rs = ps.getGeneratedKeys();
		if (rs.next()) {
			film.setId(rs.getLong(1));
		}
		return film;
	}

	@Override
	public List<Film> trouverToutLesfilms() throws SQLException {
		
		PreparedStatement ps = connexion.prepareStatement(Requetes.TROUVER_TOUS_FILMS);
        ResultSet rs = ps.executeQuery();
        List<Film> films = new ArrayList<>();

        while(rs.next()) {
        	Film film = new Film();
        	film.setId(rs.getLong("Id_Film"));
        	film.setNom(rs.getString("nom"));
        	film.setRealisateur(rs.getString("realisateur"));
        	film.setAnneeSortie(rs.getInt("anneeDeSortie"));
        	films.add(film);
        }


        return films;
	}

	@Override
	public Film trouverFilmParId(Long id) throws SQLException {
		PreparedStatement ps = connexion.prepareStatement(Requetes.TROUVER_FILM_PAR_ID);
		ps.setLong(1, id);

		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			Film film = new Film();
			film.setId(rs.getLong("Id_Film"));
			film.setNom(rs.getString("nom"));
			film.setRealisateur(rs.getString("realisateur"));
			film.setAnneeSortie(rs.getInt("anneeDeSortie"));
			return film;
		}
		return null;
	}

}
