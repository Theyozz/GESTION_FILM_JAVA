package fr.doranco.gestionFilm.tvm.services;


import fr.doranco.gestionFilm.tvm.business.Image;

public interface ImageService {

	Image ajoutImage(Image image);
	
	Image trouverImageParFilmId(Long id);

}
