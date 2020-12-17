import java.util.*;


class Utilisateur implements Destinataire {
	String prenom;
	String nom;
	String login;
	String motDePasse;
	String mail;
	List<ServeurDiscussion> serveurs;
	
	Utilisateur() {
		this.prenom = "";
		this.nom = "";
		this.login = "";
		this.motDePasse = "";
		this.serveurs = new ArrayList<ServeurDiscussion>();	
	}
}