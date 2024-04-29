package springDataApp.services;

import org.springframework.data.jpa.repository.JpaRepository;

import springDataApp.dao.Election;

public interface IGestionElections extends JpaRepository<Election, Integer> {

}
