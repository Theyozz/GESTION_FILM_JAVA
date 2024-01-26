package fr.doranco.gestionFilm.tvm.dao;

import java.sql.SQLException;
import java.util.List;

import fr.doranco.gestionFilm.tvm.business.Film;

public interface FilmDao {
	
	Film ajoutFilm(Film film) throws SQLException;
	
	List<Film> trouverToutLesfilms() throws SQLException;
	
	Film trouverFilmParId(Long id) throws SQLException;

}
