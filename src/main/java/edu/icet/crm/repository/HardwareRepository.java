package edu.icet.crm.repository;

import edu.icet.crm.entity.HardwareItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HardwareRepository extends JpaRepository<HardwareItemEntity, Long> {
    HardwareItemEntity findByName(String name);

}


