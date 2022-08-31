package com.example.stadioapp.model;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity( name = "user" )
@Table( name = "user" )
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long user_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="ville")
	private String ville;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="age")
	private int age;
	
	@Column(name="role")
	private String role;
	
	
	
	



	public User(long id, String name, String email, String password, String ville, String phone, int age,String role) {
		super();
		this.user_id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.ville = ville;
		this.phone = phone;
		this.age = age;
		this.role = role;
	}
	


	public User() {
		
	}

	public long getId() {
		return user_id;
	}

	public void setId(long id) {
		this.user_id = id;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	
	
	

}