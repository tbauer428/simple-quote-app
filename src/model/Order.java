package model;

import java.math.BigDecimal;

public class Order {
    private String customerName;
    private String type;
    private BigDecimal weight;
    private Address toAddress;
    private Address fromAddress;


    public Order(String customerName, String type, BigDecimal weight, Address fromAddress, Address toAddress){
        this.customerName=customerName;
        this.type=type;
        this.weight=weight;
        this.fromAddress=fromAddress;
        this.toAddress=toAddress;


    }

    public Address getToAddress() {
        return toAddress;
    }

    public void setToAddress(Address toAddress) {
        this.toAddress = toAddress;
    }

    public Address getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(Address fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }
}
