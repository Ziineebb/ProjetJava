package springDataApp.dao;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Candidat extends Personne {
	private String region;
	private String parti;
	@Override
	public String toString() {
		return "Candidat [Id=" + getId() + ", nom=" + getNom() + " ,prenom=" + getPrenom() + ", email=" + getEmail()
				+ ", parti=" + parti + ", region=" + region + "]";
	}
	

}
