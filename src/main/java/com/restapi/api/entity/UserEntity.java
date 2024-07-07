package com.restapi.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class UserEntity {
	/** id */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	/** username */
	@NotBlank
	@Size(max = 15)
	private String username;
	
	/** password */
	@NotBlank
	@Size(max = 120)
	private String password;
	
	/** role ("ADMIN,USER" if admin) */
	@Size(max = 20)
	private String role;
	
	public long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}

