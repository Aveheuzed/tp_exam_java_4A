import java.util.*;

class ServeurDiscussion {
	
	Map<Role, List<Utilisateur>> mapping_role_utilisateurs;
	List<Canal> canaux;
	String nom;
	Map<Role, List<Habilitation>> mapping_role_habilitations;
	
	ServeurDiscussion() {
		this.mapping_role_utilisateurs = new HashMap<Role, List<Utilisateur>>();
		this.canaux = new ArrayList<Canal>();
		this.nom = "";
		this.mapping_role_habilitations = new HashMap<Role, List<Habilitation>>();
	}
	
}