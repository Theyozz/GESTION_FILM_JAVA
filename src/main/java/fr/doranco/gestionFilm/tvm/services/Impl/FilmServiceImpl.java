package fr.doranco.gestionFilm.tvm.services.Impl;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import fr.doranco.gestionFilm.tvm.business.Film;
import fr.doranco.gestionFilm.tvm.dao.FilmDao;
import fr.doranco.gestionFilm.tvm.dao.Impl.FilmDaoImpl;
import fr.doranco.gestionFilm.tvm.services.FilmService;

public class FilmServiceImpl implements FilmService{
	
	FilmDao filmDao = new FilmDaoImpl();

	@Override
	public Film ajouterFilm(Film film) {
		
		try {
			return filmDao.ajoutFilm(film);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Film> trouverToutLesFilms() {
		
		try {
			return filmDao.trouverToutLesfilms();		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	@Override
	public Film trouverFilmParId(Long id) {
		try {
			return filmDao.trouverFilmParId(id);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
