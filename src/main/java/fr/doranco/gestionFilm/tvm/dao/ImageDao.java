package fr.doranco.gestionFilm.tvm.dao;

import java.sql.SQLException;

import fr.doranco.gestionFilm.tvm.business.Image;

public interface ImageDao {

	Image ajoutImage(Image image) throws SQLException;
	
	Image trouverImageParFilmId(Long id) throws SQLException;
	
	}
