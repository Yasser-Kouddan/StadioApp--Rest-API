package com.example.stadioapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stadioapp.model.Reservation;



@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
	

}
