package fr.doranco.gestionFilm.tvm.services.Impl;

import java.sql.SQLException;

import fr.doranco.gestionFilm.tvm.business.Image;
import fr.doranco.gestionFilm.tvm.dao.ImageDao;
import fr.doranco.gestionFilm.tvm.dao.Impl.ImageDaoImpl;
import fr.doranco.gestionFilm.tvm.services.ImageService;

public class ImageServiceImpl implements ImageService{
	
	ImageDao imageDao = new ImageDaoImpl();

	@Override
	public Image ajoutImage(Image image) {
		try {
			return imageDao.ajoutImage(image);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Image trouverImageParFilmId(Long id) {
		try {
			return imageDao.trouverImageParFilmId(id);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
