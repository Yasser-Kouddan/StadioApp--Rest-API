package com.example.stadioapp.controller;

import com.example.stadioapp.exception.ResourceNotFoundException;
import com.example.stadioapp.model.Stade;
import com.example.stadioapp.repository.StadeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;



@RestController
@CrossOrigin
@RequestMapping("/api")
public class StadeController {

    @Autowired
    StadeRepository StadeRepo;

    
    @GetMapping("/stades")
    public List<Stade> getAllStades() {
        return StadeRepo.findAll();
    }

    
    @PostMapping("/stades")
    public Stade createUser(@Valid @RequestBody Stade s) {
        return StadeRepo.save(s);
    }
    

   @GetMapping("/stades/{id}")
    public Stade getStadeById(@PathVariable(value = "id") long stade_id) {
        return StadeRepo.findById(stade_id)
                .orElseThrow(() -> new ResourceNotFoundException("Stade", "id", stade_id));
    }

    
    

    @PutMapping("/stades/{id}")
    public Stade updateNote(@PathVariable(value = "id") Long stade_id,
                                           @Valid @RequestBody Stade s) {

    	Stade stade = StadeRepo.findById(stade_id)
    			.orElseThrow(() -> new ResourceNotFoundException("Stade", "id", stade_id));

    	stade.setName(s.getName());
    	stade.setPrix(s.getPrix());
    	stade.setPromotion(s.getPromotion());
    	stade.setNbr_joueur(s.getNbr_joueur());
    	stade.setNbr_etoile(s.getNbr_etoile());
    	stade.setLoc_x(s.getLoc_x());
    	stade.setLoc_y(s.getLoc_y());
    	stade.setVille(s.getVille());
    	stade.setQuartier(s.getQuartier());
    	stade.setImageUrl(s.getImageUrl());
   
 
		Stade new_stade = StadeRepo.save(stade);
        return new_stade;
    }

    @DeleteMapping("/stades/{id}")
    public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long stade_id) {
    	Stade stade = StadeRepo.findById(stade_id)
    			.orElseThrow(() -> new ResourceNotFoundException("Stade", "id", stade_id));

    	StadeRepo.delete(stade);

        return ResponseEntity.ok().build();
    }
}
