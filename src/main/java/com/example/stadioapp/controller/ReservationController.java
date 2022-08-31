zpackage com.example.stadioapp.controller;

import com.example.stadioapp.exception.ResourceNotFoundException;
import com.example.stadioapp.model.Reservation;
import com.example.stadioapp.repository.ReservationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;



@RestController
@CrossOrigin
@RequestMapping("/api")
public class ReservationController {

    @Autowired
    ReservationRepository ResRepo;

    
    @GetMapping("/reservation")
    public List<Reservation> getAllReservation() {
        return ResRepo.findAll();
    }

    
    @PostMapping("/reservation")
    public Reservation createReservation(@Valid @RequestBody Reservation res) {
        return ResRepo.save(res);
    }
    

   @GetMapping("/reservation/{id}")
    public Reservation getReservationById(@PathVariable(value = "id") long res_id) {
        return ResRepo.findById(res_id)
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", res_id));
    }

    
    

    @PutMapping("/reservation/{id}")
    public Reservation updateReservation(@PathVariable(value = "id") Long res_id,
                                           @Valid @RequestBody Reservation r) {

    	Reservation res = ResRepo.findById(res_id)
    			.orElseThrow(() -> new ResourceNotFoundException("Reservation", "id", res_id));

    	res.setRes_id(r.getRes_id());
    	res.setStade_id(r.getStade_id());
    	res.setPromo(r.getPromo());
    	res.setTarif(r.getTarif());
    	
    	res.setDate(r.getDate());
    	res.setTime(r.getTime());
    	
    	res.setGilet(r.isGilet());
    	res.setBoisson(r.isBoisson());
    	res.setDouche(r.isDouche());
    	res.setArbitre(r.isArbitre());
    	
    	res.setN_carte(r.getN_carte());
    	res.setPorteur_carte(r.getPorteur_carte());
    	res.setExp_carte(r.getExp_carte());
    	res.setPassword_carte(r.getPassword_carte());
    	

		Reservation new_res = ResRepo.save(res);
        return new_res;
    }
    

    @DeleteMapping("/reservation/{id}")
    public ResponseEntity<?> deleteReservation(@PathVariable(value = "id") Long res_id) {
    	Reservation res = ResRepo.findById(res_id)
    			.orElseThrow(() -> new ResourceNotFoundException("Reservation", "id", res_id));

    	ResRepo.delete(res);

        return ResponseEntity.ok().build();
    }
    
    
}
