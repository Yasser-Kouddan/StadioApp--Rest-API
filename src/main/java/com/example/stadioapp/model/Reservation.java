package com.example.stadioapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity( name = "reservation" )
@Table( name = "reservation" )
public class Reservation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long res_id;
	
	@Column(name="stade_id")
	private long stade_id;
	
	@Column(name="promo")
	private int promo;
	
	@Column(name="tarif")
	private float tarif;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="time")
	private String time;
	
	@Column(name="gilet")
	private boolean gilet;
	
	@Column(name="boisson")
	private boolean boisson;
	
	@Column(name="douche")
	private boolean douche;
	
	@Column(name="arbitre")
	private boolean arbitre;
	
	@Column(name="n_carte")
	private String n_carte;
	
	@Column(name="porteur_carte")
	private String porteur_carte;
	
	@Column(name="exp_carte")
	private String exp_carte;
	
	@Column(name="password_carte")
	private String password_carte;
	
	
	
	public long getRes_id() {
		return res_id;
	}

	public void setRes_id(long res_id) {
		this.res_id = res_id;
	}

	public long getStade_id() {
		return stade_id;
	}

	public void setStade_id(long stade_id) {
		this.stade_id = stade_id;
	}

	public int getPromo() {
		return promo;
	}

	public void setPromo(int promo) {
		this.promo = promo;
	}

	public float getTarif() {
		return tarif;
	}

	public void setTarif(float tarif) {
		this.tarif = tarif;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public boolean isGilet() {
		return gilet;
	}

	public void setGilet(boolean gilet) {
		this.gilet = gilet;
	}

	public boolean isBoisson() {
		return boisson;
	}

	public void setBoisson(boolean boisson) {
		this.boisson = boisson;
	}

	public boolean isDouche() {
		return douche;
	}

	public void setDouche(boolean douche) {
		this.douche = douche;
	}

	public boolean isArbitre() {
		return arbitre;
	}

	public void setArbitre(boolean arbitre) {
		this.arbitre = arbitre;
	}

	public String getN_carte() {
		return n_carte;
	}

	public void setN_carte(String n_carte) {
		this.n_carte = n_carte;
	}

	public String getPorteur_carte() {
		return porteur_carte;
	}

	public void setPorteur_carte(String porteur_carte) {
		this.porteur_carte = porteur_carte;
	}

	public String getExp_carte() {
		return exp_carte;
	}

	public void setExp_carte(String exp_carte) {
		this.exp_carte = exp_carte;
	}

	public String getPassword_carte() {
		return password_carte;
	}

	public void setPassword_carte(String password_carte) {
		this.password_carte = password_carte;
	}

	
	public Reservation(long res_id, long stade_id, int promo, float tarif, Date date, String time, boolean gilet,
			boolean boisson, boolean douche, boolean arbitre, String n_carte, String porteur_carte, String exp_carte,
			String password_carte) {
		super();
		this.res_id = res_id;
		this.stade_id = stade_id;
		this.promo = promo;
		this.tarif = tarif;
		this.date = date;
		this.time = time;
		this.gilet = gilet;
		this.boisson = boisson;
		this.douche = douche;
		this.arbitre = arbitre;
		this.n_carte = n_carte;
		this.porteur_carte = porteur_carte;
		this.exp_carte = exp_carte;
		this.password_carte = password_carte;
	}

	public Reservation() {
		
	}

	

}
