package edu.icet.crm.repository;

import edu.icet.crm.entity.CustomerEntity;

import edu.icet.crm.entity.RentalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<RentalEntity,Long> {
    CustomerEntity findByName(String name);
}
