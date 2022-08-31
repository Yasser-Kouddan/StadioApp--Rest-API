package com.example.stadioapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.stadioapp.model.User;




@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
		

}
