package edu.icet.crm.controller;

import edu.icet.crm.dto.HardwareItem;
import edu.icet.crm.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hardware-controller")
@RequiredArgsConstructor
@CrossOrigin
public class RentalController {

    final RentalService rentalService;

    @PostMapping("add-hardware-item")
    @ResponseStatus(HttpStatus.CREATED)
    public void addHardwareItem(@RequestBody HardwareItem hardwareItem){
        rentalService.addHardwareItem(hardwareItem);

    }
}
