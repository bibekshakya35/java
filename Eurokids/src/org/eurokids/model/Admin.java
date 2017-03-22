package org.eurokids.model;

public class Admin {
	private int id;
	private String username;
	private String email;
	private String password;
	private int status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Admin(int id, String username, String email, String password, int status) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.status = status;
	}
	public Admin() {
		super();
	}
	public Admin(String username, String email, String password, int status) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.status = status;
	}
	public Admin(String username, String email, String password) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		
	}
	
}
