package com.example.stadioapp.controller;

import com.example.stadioapp.exception.ResourceNotFoundException;
import com.example.stadioapp.model.User;
import com.example.stadioapp.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;



@RestController
@CrossOrigin
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserRepository UserRepo;

    
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return UserRepo.findAll();
    }
    

    
    @PostMapping("/users")
    public User createUser(@Valid @RequestBody User user) {
        return UserRepo.save(user);
    }
    

   @GetMapping("/users/{id}")
    public User getUserById(@PathVariable(value = "id") long user_id) {
        return UserRepo.findById(user_id)
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", user_id));
    }

    
    

    @PutMapping("/users/{id}")
    public User updateNote(@PathVariable(value = "id") Long user_id,
                                           @Valid @RequestBody User u) {

    	User user = UserRepo.findById(user_id)
    			.orElseThrow(() -> new ResourceNotFoundException("User", "id", user_id));

    	user.setName(u.getName());
    	user.setEmail(u.getEmail());
    	user.setPassword(u.getPassword());
		user.setVille(u.getVille());
		user.setPhone(u.getPhone());
		user.setAge(u.getAge());
		user.setRole(u.getRole());
    	

        User new_user = UserRepo.save(user);
        return new_user;
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long user_id) {
    	User user = UserRepo.findById(user_id)
    			.orElseThrow(() -> new ResourceNotFoundException("User", "id", user_id));

        UserRepo.delete(user);

        return ResponseEntity.ok().build();
    }
}
