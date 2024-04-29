package springDataApp.services;

import org.springframework.data.jpa.repository.JpaRepository;

import springDataApp.dao.Vote;

public interface IGestionVote extends JpaRepository<Vote, Integer> {

}
