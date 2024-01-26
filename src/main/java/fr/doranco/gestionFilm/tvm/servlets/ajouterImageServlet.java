package fr.doranco.gestionFilm.tvm.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import fr.doranco.gestionFilm.tvm.business.Film;
import fr.doranco.gestionFilm.tvm.business.Image;
import fr.doranco.gestionFilm.tvm.services.FilmService;
import fr.doranco.gestionFilm.tvm.services.ImageService;
import fr.doranco.gestionFilm.tvm.services.Impl.FilmServiceImpl;
import fr.doranco.gestionFilm.tvm.services.Impl.ImageServiceImpl;

/**
 * Servlet implementation class ajouterImageServlet
 */
@WebServlet("/ajoutImage")
public class ajouterImageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ImageService imageService = new ImageServiceImpl();
	private FilmService filmService = new FilmServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ajouterImageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Film> films = filmService.trouverToutLesFilms();
		request.setAttribute("films", films);
		request.getRequestDispatcher("WEB-INF/ajoutImage.jsp").forward(request, response);	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Film film = new Film();
		film.setId(Long.parseLong(request.getParameter("ID_FILM")));
		
		Image image = new Image();
		image.setUrl(request.getParameter("URL_IMAGE"));
		image.setFilm(film);
		imageService.ajoutImage(image);
		response.sendRedirect("index");
	}

}
