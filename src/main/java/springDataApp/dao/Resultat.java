package springDataApp.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Resultat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Election e;
	private Candidat c;
	private int nbreVote;

}
