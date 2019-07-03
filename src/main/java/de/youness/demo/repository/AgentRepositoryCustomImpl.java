package de.youness.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import de.youness.demo.entity.Agent;

@Repository
public class AgentRepositoryCustomImpl implements AgentRepositoryCustom {
	@Autowired
	EntityManager entityManager;

	@Override
	public Long getMaxAgId() {
		try {
			String sql = "SELECT coslesce(max(a.id),0) FROM Agent a";
			Query query = entityManager.createQuery(sql);
			return (Long) query.getSingleResult();
		} catch (NoResultException e) {
			// TODO Auto-generated catch block
			return 0L;
		}
	}

	@Override
	public long updateAgent(Long AgId, String LoginName, String FirstName, String LastName, String Initials,
			String EMail, String Phone, boolean Active, String DomainId, boolean IgnoreUnknownNo) {
		Agent agent = entityManager.find(Agent.class, AgId);
		if(agent==null) {
			return 0;
		}
		agent.setLoginName(LoginName);
		agent.setFirstName(FirstName);
		agent.setLastName(LastName);
		agent.setInitials(Initials);
		agent.setEMail(EMail);
		agent.setPhone(Phone);
		agent.setActive(Active);
		agent.setDomainId(DomainId);
		agent.setIgnoreUnknownNo(IgnoreUnknownNo);
		entityManager.flush();
		
		return 1;
	}

}
