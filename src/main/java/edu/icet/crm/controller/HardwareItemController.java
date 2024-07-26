package edu.icet.crm.controller;

import edu.icet.crm.service.HardwareItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hardware-controller")
@RequiredArgsConstructor
@CrossOrigin
public class HardwareItemController {

    final HardwareItemService hardwareItemService;
}
