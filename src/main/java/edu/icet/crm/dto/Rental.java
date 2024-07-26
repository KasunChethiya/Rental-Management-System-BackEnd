package edu.icet.crm.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Rental {
    private Long rentId;
    private String rentalDate;
    private String returnDate;
    private String dueDate;
    private Double fine ;
    private Double totalCost;

}
