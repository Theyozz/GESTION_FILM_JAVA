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
 * Servlet implementation class infosFilmServlet
 */
@WebServlet("/infosFilm")
public class infosFilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FilmService filmService = new FilmServiceImpl();
	private ImageService imageService = new ImageServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public infosFilmServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Film film = filmService.trouverFilmParId(Long.parseLong(request.getParameter("id")));
		Image image = imageService.trouverImageParFilmId(Long.parseLong(request.getParameter("id")));
		request.setAttribute("film", film);
		request.setAttribute("image", image);
		request.getRequestDispatcher("WEB-INF/infosFilm.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
