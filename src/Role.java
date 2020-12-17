import java.util.*;

class Role {
	String nomRole;
	
	Role(String nom) {
		this.nomRole = nom;
	}
	
	public boolean equals(Object o) {
		if (o instanceof Role) {
			if (((Role)o).nomRole == this.nomRole) {
				return true;
			}
		}
		return false;
	}
	
	public int hashCode() {
		return this.nomRole.hashCode();
	}
}