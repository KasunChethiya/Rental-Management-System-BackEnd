package edu.icet.crm.service;


import edu.icet.crm.dto.Rental;
import edu.icet.crm.entity.RentalEntity;

import java.util.List;

public interface RentalService {
    void addRental(Rental rental);

    List<RentalEntity> getAll();

    void deleteRentalById(Long id);

    void updateRental(Rental rental);

    Rental findById(Long id);

}
