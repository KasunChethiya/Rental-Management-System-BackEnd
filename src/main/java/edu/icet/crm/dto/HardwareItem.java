package edu.icet.crm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HardwareItem {
    private Long itemID;
    private String name;
    private String rentalPerDay;
    private String finePerDay;
    private String availability;

}
