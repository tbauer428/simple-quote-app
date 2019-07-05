package model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Order {
    private String customerName;
    private String type;
    private BigDecimal weight;
    private Address toAddress;
    private Address fromAddress;




}
