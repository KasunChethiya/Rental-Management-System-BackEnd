package edu.icet.crm.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.crm.dto.HardwareItem;
import edu.icet.crm.entity.HardwareItemEntity;
import edu.icet.crm.repository.HardwareRepository;
import edu.icet.crm.service.HardwareItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service

public class HardwareItemServiceImpl implements HardwareItemService {
    final HardwareRepository hardwareRepository;
    @Override
    public void addHardwareItem(HardwareItem hardwareItem) {
        HardwareItemEntity hardwareItemEntity = new ObjectMapper().convertValue(hardwareItem, HardwareItemEntity.class);
        hardwareRepository.save(hardwareItemEntity);
    }
    @Override
    public List<HardwareItemEntity> getAll() {
        return hardwareRepository.findAll();
    }

    @Override
    public void deleteHardwareItemById(Long id) {
        if(hardwareRepository.existsById(id)){
            hardwareRepository.deleteById(id);
        }
    }

    @Override
    public void updateHardwareItem(HardwareItem hardwareItem) {
        if(hardwareRepository.findById(hardwareItem.getItemID()).isPresent()){
            hardwareRepository.save(new ObjectMapper().convertValue(hardwareItem, HardwareItemEntity.class));

        }
    }

    @Override
    public HardwareItem findById(Long id) {
        if(hardwareRepository.findById(id).isPresent()){

            Optional<HardwareItemEntity> byId = hardwareRepository.findById(id);
            return new ObjectMapper().convertValue(byId.get(), HardwareItem.class);
        }
        return new HardwareItem();
    }

    @Override
    public HardwareItem findByName(String name) {
        return new ObjectMapper().convertValue(hardwareRepository.findByName(name), HardwareItem.class);

    }
}


