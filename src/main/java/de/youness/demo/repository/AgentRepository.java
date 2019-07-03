package de.youness.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import de.youness.demo.entity.Agent;

public interface AgentRepository extends CrudRepository<Agent, Long> {
	Agent findByIId(Long id);
	List<Agent>findByName(String name);	
	List<Agent>findByLogin(String login);
	@Query("SELECT coalesce(max(e.id),0) FROM Agent a")
	Long getMaxId();
}
