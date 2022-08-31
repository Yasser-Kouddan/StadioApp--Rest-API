package com.example.stadioapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity( name = "favoris" )
@Table( name = "favoris" )
public class Favoris {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long fav_id;
	
	@Column(name="stade_id")
	private long stade_id;
	
	@Column(name="user_id")
	private long user_id;
	
	

	public Favoris(long fav_id, long stade_id, long user_id) {
		super();
		this.fav_id = fav_id;
		this.stade_id = stade_id;
		this.user_id = user_id;
	}
	
	public Favoris() {
		
	}

	public long getRes_fav() {
		return fav_id;
	}

	public void setRes_fav(long res_fav) {
		this.fav_id = res_fav;
	}

	public long getStade_id() {
		return stade_id;
	}

	public void setStade_id(long stade_id) {
		this.stade_id = stade_id;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	
	
	

	

}
