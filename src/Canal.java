import java.util.*;

class Canal implements Comparable<Canal>, Destinataire {
	
	Map<Role, List<Utilisateur>> mapping_role_utilisateurs;
	Integer ordre;
	List<Webhook> webhooks;
	String nom;
	Map<Role, List<Habilitation>> mapping_role_habilitations;
	List<Message> historique;
	
	Canal() {
		this.mapping_role_utilisateurs = new HashMap<Role, List<Utilisateur>>();
		this.ordre = 0;
		this.webhooks = new ArrayList<Webhook>();
		this.nom = "";
		this.mapping_role_habilitations = new HashMap<Role, List<Habilitation>>();
		this.historique = new ArrayList<Message>();
	}
	
	void ecrireMessage(Utilisateur u, Message m) {
		// Qu'est-ce qu'on est censés faire de l'utilisateur ? Le message a déjà un champ "auteur"...
		this.historique.add(m);
	}
	
	public int compareTo(Canal c) {
		return this.ordre - c.ordre;
	}	
}