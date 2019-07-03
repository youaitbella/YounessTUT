package de.youness.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ccAgent")
public class Agent {
	
	@Id
	@Column(name="agId")
	private Long id;
	
	@Column(name="agLoginName")
	private String LoginName;
	
	@Column(name="agFirstName")
	private String FirstName;
	
	@Column(name="agLastName")
	private String LastName;
	
	@Column(name="agInitials")
	private String Initials;
	
	
	@Column(name="agEMail")
	private String EMail;
	
	@Column(name="agPhone")
	private String Phone;
	
	@Column(name="agActive")
	private boolean Active;
	
	@Column(name="agDomainId")
	private String DomainId;
	
	@Column(name="agIgnoreUnknownNo")
	private boolean IgnoreUnknownNo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoginName() {
		return LoginName;
	}

	public void setLoginName(String loginName) {
		LoginName = loginName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getInitials() {
		return Initials;
	}

	public void setInitials(String initials) {
		Initials = initials;
	}

	public String getEMail() {
		return EMail;
	}

	public void setEMail(String eMail) {
		EMail = eMail;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public boolean getActive() {
		return Active;
	}

	public void setActive(boolean active) {
		Active = active;
	}

	public String getDomainId() {
		return DomainId;
	}

	public void setDomainId(String domainId) {
		DomainId = domainId;
	}

	public boolean getIgnoreUnknownNo() {
		return IgnoreUnknownNo;
	}

	public void setIgnoreUnknownNo(boolean ignoreUnknownNo) {
		IgnoreUnknownNo = ignoreUnknownNo;
	}

	@Override
	public String toString() {
		return "Agent [LoginName=" + LoginName + ", FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}
	
	
	
}
