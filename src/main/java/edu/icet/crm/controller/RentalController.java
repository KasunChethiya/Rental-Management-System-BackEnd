package edu.icet.crm.controller;


import edu.icet.crm.dto.Rental;

import edu.icet.crm.entity.RentalEntity;
import edu.icet.crm.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rental-controller")
@RequiredArgsConstructor
@CrossOrigin
public class RentalController {
    final RentalService rentalService;
    @PostMapping("add-rental")
    @ResponseStatus(HttpStatus.CREATED)
    public void addRental(@RequestBody Rental rental){
        rentalService.addRental(rental);

    }
    @GetMapping("get-all-rental")
    public List<RentalEntity> getAll(){
        return rentalService.getAll();
    }
    @DeleteMapping("/delete-rental/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String deleteRental(@PathVariable Long id){
        rentalService.deleteRentalById(id);
        return "Deleted";
    }
    @PostMapping("/update-rental")
    public void updateRental(@RequestBody Rental rental){
        rentalService.updateRental(rental);
    }
    @GetMapping("/find-by-rental-id/{id}")
    public Rental findById(@PathVariable Long id){
        return rentalService.findById(id);
    }



}
