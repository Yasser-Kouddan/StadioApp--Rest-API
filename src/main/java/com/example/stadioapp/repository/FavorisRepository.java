package com.example.stadioapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stadioapp.model.Favoris;



@Repository
public interface FavorisRepository extends JpaRepository<Favoris, Long> {
	

}
