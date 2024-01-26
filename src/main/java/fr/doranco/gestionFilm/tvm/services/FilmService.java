package fr.doranco.gestionFilm.tvm.services;

import java.util.List;

import fr.doranco.gestionFilm.tvm.business.Film;

public interface FilmService {
	
	Film ajouterFilm(Film film);
	
	List<Film> trouverToutLesFilms();
	
	Film trouverFilmParId(Long id);

}
