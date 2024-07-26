package edu.icet.crm.controller;

import edu.icet.crm.dto.HardwareItem;
import edu.icet.crm.entity.HardwareItemEntity;
import edu.icet.crm.service.HardwareItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("get-all-hardware-item")
    public List<HardwareItemEntity> getAll(){
        return hardwareItemService.getAll();
    }
    @DeleteMapping("/delete-hardware-item/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String deleteHardwareItem(@PathVariable Long id){
        hardwareItemService.deleteHardwareItemById(id);
        return "Deleted";
    }
    @PostMapping("/update-hardware-item")
    public void updateHardwareItem(@RequestBody HardwareItem hardwareItem){
        hardwareItemService.updateHardwareItem(hardwareItem);
    }
    @GetMapping("/find-by-item-id/{id}")
    public HardwareItem findById(@PathVariable Long id){
        return hardwareItemService.findById(id);
    }

    @GetMapping("find-by-name/{name}")
    public HardwareItem findByName(@PathVariable String name){
        return hardwareItemService.findByName(name);
    }
}
