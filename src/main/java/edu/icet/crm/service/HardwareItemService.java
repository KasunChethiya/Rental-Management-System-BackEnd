package edu.icet.crm.service;

import edu.icet.crm.dto.HardwareItem;
import edu.icet.crm.entity.HardwareItemEntity;

import java.util.List;

public interface HardwareItemService {
    void addHardwareItem(HardwareItem hardwareItem);

    List<HardwareItemEntity> getAll();





    void deleteHardwareItemById(Long id);

    void updateHardwareItem(HardwareItem hardwareItem);

    HardwareItem findById(Long id);



    HardwareItem findByName(String name);
}
