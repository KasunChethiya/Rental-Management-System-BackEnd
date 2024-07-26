package edu.icet.crm.controller;

import edu.icet.crm.dto.Rental;
import edu.icet.crm.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rental-controller")
@RequiredArgsConstructor
@CrossOrigin
public class RentalController {
    final RentalService rentalService;
    @PostMapping("add-rental")
    @ResponseStatus(HttpStatus.CREATED)
    public void addRental(@RequestBody Rental rental){

    }

}
