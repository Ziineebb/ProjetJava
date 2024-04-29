package springDataApp.dao;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Electeur extends Personne {
	private String sexe;
	private int age;
	private String adresse;
	private int num;
	@Override
	public String toString() {
		return "Electeur [Id=" + getId() + ", nom=" + getNom() + ", prenom=" + getPrenom() + ", num=" + num + ", email="
				+ getEmail() + ", age=" + age + ", sexe=" + sexe + ", adresse=" + adresse
				+ "]";
	}

}
