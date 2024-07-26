package edu.icet.crm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "rental")
public class RentalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rentId;
    private String rentalDate;
    private String returnDate;
    private String dueDate;
    private Double fine ;
    private Double totalCost;
}
