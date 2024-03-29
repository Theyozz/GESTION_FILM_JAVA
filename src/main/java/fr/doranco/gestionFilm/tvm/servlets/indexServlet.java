package fr.doranco.gestionFilm.tvm.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import fr.doranco.gestionFilm.tvm.business.Film;
import fr.doranco.gestionFilm.tvm.business.Utilisateur;
import fr.doranco.gestionFilm.tvm.services.FilmService;
import fr.doranco.gestionFilm.tvm.services.UtilisateurService;
import fr.doranco.gestionFilm.tvm.services.Impl.FilmServiceImpl;
import fr.doranco.gestionFilm.tvm.services.Impl.UtilisateurServiceImpl;

/**
 * Servlet implementation class indexServlet
 */
@WebServlet(urlPatterns = {"/", "/index"})
public class indexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FilmService filmService = new FilmServiceImpl();
	private UtilisateurService utilisateurService = new UtilisateurServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public indexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Film> films = filmService.trouverToutLesFilms();
		List<Utilisateur> utilisateurs = utilisateurService.trouverTousLesUtilisateurs();
		request.setAttribute("films", films);
		request.setAttribute("utilisateurs", utilisateurs);
		request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
