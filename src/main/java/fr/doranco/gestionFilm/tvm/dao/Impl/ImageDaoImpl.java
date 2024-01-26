package fr.doranco.gestionFilm.tvm.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import fr.doranco.gestionFilm.tvm.business.Film;
import fr.doranco.gestionFilm.tvm.business.Image;
import fr.doranco.gestionFilm.tvm.dao.ConnexionBd;
import fr.doranco.gestionFilm.tvm.dao.ImageDao;
import fr.doranco.gestionFilm.tvm.dao.Requetes;

public class ImageDaoImpl implements ImageDao{
	
	private Connection connexion;
	
	public ImageDaoImpl() {
		try {
			connexion = ConnexionBd.getConnection();
		} catch (ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
	}

	@Override
	public Image ajoutImage(Image image) throws SQLException {
		PreparedStatement ps = connexion.prepareStatement(Requetes.AJOUT_IMAGE, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, image.getUrl());
		ps.setLong(2, image.getFilm().getId());
		ps.executeUpdate();

		ResultSet rs = ps.getGeneratedKeys();
		if (rs.next()) {
			image.setId(rs.getLong(1));
		}
		return image;
	}

	@Override
	public Image trouverImageParFilmId(Long id) throws SQLException {
		PreparedStatement ps = connexion.prepareStatement(Requetes.TROUVER_IMAGE_PAR_FILM_ID);
		ps.setLong(1, id);

		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			Image image = new Image();
			image.setId(rs.getLong("Id_Image"));
			image.setUrl(rs.getString("url"));

			return image;
		}
		return null;
	}

}
