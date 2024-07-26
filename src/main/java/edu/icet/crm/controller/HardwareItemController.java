package edu.icet.crm.controller;

import edu.icet.crm.dto.HardwareItem;
import edu.icet.crm.service.HardwareItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hardware-controller")
@RequiredArgsConstructor
@CrossOrigin
public class HardwareItemController {

    final HardwareItemService hardwareItemService;

    @PostMapping("add-hardware-item")
    @ResponseStatus(HttpStatus.CREATED)
    public void addHardwareItem(@RequestBody HardwareItem hardwareItem){
        hardwareItemService.addHardwareItem(hardwareItem);

    }
}
