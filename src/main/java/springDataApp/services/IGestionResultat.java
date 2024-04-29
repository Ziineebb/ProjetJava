package springDataApp.services;

import org.springframework.data.jpa.repository.JpaRepository;

import springDataApp.dao.Resultat;

public interface IGestionResultat extends JpaRepository<Resultat, Integer>{

}
