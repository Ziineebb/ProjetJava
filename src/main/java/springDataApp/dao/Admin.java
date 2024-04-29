package springDataApp.dao;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Admin extends Personne {
	private int num;

	@Override
	public String toString() {
		return "Admin [id=" + getId() +  ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom()
		+", num=" + num +", getEmail()=" + getEmail() + "]";
	}

}
