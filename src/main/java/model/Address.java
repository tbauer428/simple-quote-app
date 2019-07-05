package model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {
    private String streetName;
    private String city;
    private String state;
    private String country;
    private String postalCode;



}
