package fr.doranco.gestionFilm.tvm.dao;

public class Requetes {

	// Film
	public static final String AJOUT_FILM = "INSERT INTO `film`(`nom`, `realisateur`, `anneeDeSortie`) VALUES (?,?,?)";
	public static final String TROUVER_TOUS_FILMS = "SELECT * FROM `film`";
	public static final String TROUVER_FILM_PAR_ID = "SELECT * FROM `film` WHERE Id_Film = ?";
	
	// Utilisateur
	public static final String AJOUT_UTILISATEUR = "INSERT INTO `utilisateur`(`nom`, `prenom`, `telephone`, `email`, `motDePasse`,`DateHeureInscription`) VALUES (?,?,?,?,?,?)";
	public static final String SUPPRIMER_UTILISATEUR = "DELETE FROM `utilisateur` WHERE Id_Utilisateur = ?";
	public static final String MODIFIER_UTILISATEUR = "UPDATE `utilisateur` SET `nom`= ?,`prenom`= ?,`telephone`= ?,`email`= ?,`motDePasse`= ? WHERE Id_Utilisateur = ?";
	public static final String AJOUTER_FILM_VISIONNE = "INSERT INTO `visionner`(`Id_Utilisateur`, `Id_Film`) VALUES (?,?)";
	
	// Image
	public static final String AJOUT_IMAGE = "INSERT INTO `image`(`url`, `Id_Film`) VALUES (?,?)";
	public static final String TROUVER_IMAGE_PAR_FILM_ID = "SELECT * FROM `image` WHERE Id_Film = ?";
}
