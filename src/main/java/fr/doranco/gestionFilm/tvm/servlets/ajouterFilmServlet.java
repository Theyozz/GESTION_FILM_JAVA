package fr.doranco.gestionFilm.tvm.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import fr.doranco.gestionFilm.tvm.business.Film;
import fr.doranco.gestionFilm.tvm.services.FilmService;
import fr.doranco.gestionFilm.tvm.services.Impl.FilmServiceImpl;

/**
 * Servlet implementation class ajouterFilmServlet
 */
@WebServlet("/ajoutFilm")
public class ajouterFilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private FilmService filmService = new FilmServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ajouterFilmServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("WEB-INF/ajoutFilm.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Film film = new Film();
		film.setNom(request.getParameter("NOM_FILM"));
		film.setRealisateur(request.getParameter("REALISATEUR_FILM"));
		film.setAnneeSortie(Integer.parseInt(request.getParameter("ANNEE_SORTIE_FILM")));
		filmService.ajouterFilm(film);
		response.sendRedirect("index");
	}

}
