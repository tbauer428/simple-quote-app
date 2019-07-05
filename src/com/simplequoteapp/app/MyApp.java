package com.simplequoteapp.app;

import model.Address;
import model.Order;

import java.math.BigDecimal;

public class MyApp {

    public static void main(String[] args){


             Address address1 = new Address("777 Lucky Way", "St. Louis", "MO", "United States", "63123");
             Address address2 = new Address("13 Unlucky Way", "Austin", "TX", "United States", "73301");

            Order order1 = new Order("Billy", "Domestic", new BigDecimal("1800"), address1, address2);

            System.out.println(order1.getCustomerName() + order1.getType() + order1.getFromAddress().getCity() + order1.getToAddress().getCity() + order1.getWeight());

    }

}
