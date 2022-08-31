package com.example.stadioapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity( name = "stade" )
@Table( name = "stade" )
public class Stade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long stade_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="imageUrl")
	private String imageUrl;
	
	@Column(name="prix")
	private float prix;
	
	@Column(name="promotion")
	private int promotion;
	
	@Column(name="nbr_joueur")
	private int nbr_joueur;
	
	@Column(name="nbr_etoile")
	private int nbr_etoile;
	
	@Column(name="loc_x")
	private double loc_x;
	
	@Column(name="loc_y")
	private double loc_y;
	
	@Column(name="ville")
	private String ville;
	
	@Column(name="quartier")
	private String quartier;
	

	

	

	public Stade(long stade_id, String name, float prix, int promotion, int nbr_joueur, int nbr_etoile,
		 String ville, String quartier, double x, double y, String url) {
		super();
		this.stade_id = stade_id;
		this.name = name;
		this.prix = prix;
		this.promotion = promotion;
		this.nbr_joueur = nbr_joueur;
		this.nbr_etoile = nbr_etoile;
		this.loc_x = x;
		this.loc_y = y;
		this.ville = ville;
		this.quartier = quartier;
		this.imageUrl = url;
	}
	
	public Stade() {
		
	}

	public long getStade_id() {
		return stade_id;
	}

	public void setStade_id(long stade_id) {
		this.stade_id = stade_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public int getPromotion() {
		return promotion;
	}

	public void setPromotion(int promotion) {
		this.promotion = promotion;
	}

	public int getNbr_joueur() {
		return nbr_joueur;
	}

	public void setNbr_joueur(int nbr_joueur) {
		this.nbr_joueur = nbr_joueur;
	}

	public int getNbr_etoile() {
		return nbr_etoile;
	}

	public void setNbr_etoile(int nbr_etoile) {
		this.nbr_etoile = nbr_etoile;
	}

	public double getLoc_x() {
		return loc_x;
	}

	public void setLoc_x(double d) {
		this.loc_x = d;
	}

	public double getLoc_y() {
		return loc_y;
	}

	public void setLoc_y(double d) {
		this.loc_y = d;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getQuartier() {
		return quartier;
	}

	public void setQuartier(String quartier) {
		this.quartier = quartier;
	}
	
	
	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	

	
	

	
	
	
	

}
