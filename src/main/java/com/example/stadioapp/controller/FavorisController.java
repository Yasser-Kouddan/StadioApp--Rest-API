package com.example.stadioapp.controller;

import com.example.stadioapp.exception.ResourceNotFoundException;
import com.example.stadioapp.model.Favoris;
import com.example.stadioapp.repository.FavorisRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;



@RestController
@CrossOrigin
@RequestMapping("/api")
public class FavorisController {

    @Autowired
    FavorisRepository FavRepo;

    
    @GetMapping("/favoris")
    public List<Favoris> getAllFavoris() {
        return FavRepo.findAll();
    }

    
    @PostMapping("/favoris")
    public Favoris createFavoris(@Valid @RequestBody Favoris fav) {
        return FavRepo.save(fav);
    }
    

   @GetMapping("/favoris/{id}")
    public Favoris getFavorisById(@PathVariable(value = "id") long fav_id) {
        return FavRepo.findById(fav_id)
                .orElseThrow(() -> new ResourceNotFoundException("Favoris", "id", fav_id));
    }

    
    

    @PutMapping("/favoris/{id}")
    public Favoris updateFavoris(@PathVariable(value = "id") Long fav_id,
                                           @Valid @RequestBody Favoris f) {

    	Favoris fav = FavRepo.findById(fav_id)
    			.orElseThrow(() -> new ResourceNotFoundException("Favoris", "id", fav_id));

    	fav.setRes_fav(f.getRes_fav());
    	fav.setStade_id(f.getStade_id());
    	fav.setUser_id(f.getUser_id());

    	Favoris new_fav = FavRepo.save(fav);
        return new_fav;
    }
    

    @DeleteMapping("/favoris/{id}")
    public ResponseEntity<?> deleteFavoris(@PathVariable(value = "id") Long fav_id) {
    	Favoris fav = FavRepo.findById(fav_id)
    			.orElseThrow(() -> new ResourceNotFoundException("Favoris", "id", fav_id));

    	FavRepo.delete(fav);

        return ResponseEntity.ok().build();
    }
    
    
}
