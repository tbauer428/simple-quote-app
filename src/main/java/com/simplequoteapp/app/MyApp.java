package com.simplequoteapp.app;

import model.Address;
import model.Order;
import service.AddressService;
import service.ContainerService;
import service.QuoteService;

import java.math.BigDecimal;

public class MyApp {

    public static void main(String[] args) {
        AddressService addressService = new AddressService();
        ContainerService containerService = new ContainerService();
        QuoteService quoteService = new QuoteService();


        Address address1 = new Address("777 Lucky Way", "St. Louis", "MO", "United States", "63123");
        Address address2 = new Address("13 Unlucky Way", "Austin", "TX", "United States", "73301");

        Order order1 = new Order("Billy", "Domestic", new BigDecimal("1800"), address1, address2);


        addressService.determineZone(order1.getFromAddress());
        containerService.determineNumberOfContainers();
        quoteService.calculateDomesticQuote();
        quoteService.calculateInternationalQuote();


    }

}
