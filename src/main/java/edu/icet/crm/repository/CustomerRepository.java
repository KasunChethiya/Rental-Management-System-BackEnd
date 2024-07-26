package edu.icet.crm.repository;

import edu.icet.crm.entity.CustomerEntity;

import edu.icet.crm.entity.HardwareItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
    CustomerEntity findByName(String name);
}
