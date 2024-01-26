package fr.doranco.gestionFilm.tvm.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import fr.doranco.gestionFilm.tvm.business.Utilisateur;
import fr.doranco.gestionFilm.tvm.services.UtilisateurService;
import fr.doranco.gestionFilm.tvm.services.Impl.UtilisateurServiceImpl;

/**
 * Servlet implementation class modifierUtilisateurServlet
 */
@WebServlet("/modifierUtilisateur")
public class modifierUtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UtilisateurService utilisateurService = new UtilisateurServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modifierUtilisateurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Utilisateur utilisateur = utilisateurService.trouverUtilisateurParId(Long.parseLong(request.getParameter("id")));
		request.setAttribute("utilisateur", utilisateur);
		request.getRequestDispatcher("WEB-INF/modifierUtilisateur.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setId(Long.parseLong(request.getParameter("id")));
		utilisateur.setNom(request.getParameter("NOM_UTILISATEUR"));
		utilisateur.setPrenom(request.getParameter("PRENOM_UTILISATEUR"));
		utilisateur.setEmail(request.getParameter("EMAIL_UTILISATEUR"));
		utilisateur.setTelephone(request.getParameter("TELEPHONE_UTILISATEUR"));
		utilisateur.setMotDePasse(request.getParameter("MDP_UTILISATEUR"));
		utilisateurService.modifierUtilisateur(utilisateur);
		response.sendRedirect("index");
	}

}
