package de.youness.demo.repository;

public interface AgentRepositoryCustom {
	public Long getMaxAgId();
	public long updateAgent(Long AgId, String LoginName, String FirstName, String LastName, String Initials, String EMail, String Phone, boolean Active, String DomainId, boolean IgnoreUnknownNo);
}