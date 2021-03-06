package com.demo.app.Models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="user")
@EntityListeners(AuditingEntityListener.class)
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long accountID;
	
	@NotBlank
	String email;
	
	@NotBlank
	String password;
	
	int isActive;
	
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	Date lastLogin;
	
	public Long getAccountID() {
		return accountID;
	}
	public void setAccountID(Long id) {
		this.accountID = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	public Date getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Date string) {
		this.lastLogin = string;
	}
	@Override
	public String toString() {
		return "User [accountID=" + accountID + ", email=" + email + ", isActive=" + isActive + ", lastLogin="
				+ lastLogin + "]";
	}
	
}
