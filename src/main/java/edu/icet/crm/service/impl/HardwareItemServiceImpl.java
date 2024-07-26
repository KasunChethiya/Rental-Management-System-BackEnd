package edu.icet.crm.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.dto.HardwareItem;
import edu.icet.crm.entity.HardwareItemEntity;
import edu.icet.crm.repository.HardwareRepository;
import edu.icet.crm.service.HardwareItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service

public class HardwareItemServiceImpl implements HardwareItemService {
    final HardwareRepository hardwareRepository;
    @Override
    public void addHardwareItem(HardwareItem hardwareItem) {
        HardwareItemEntity hardwareItemEntity = new ObjectMapper().convertValue(hardwareItem, HardwareItemEntity.class);
        hardwareRepository.save(hardwareItemEntity);
    }
}
