package service;


import model.Address;

public class AddressService {


    public void determineZone(Address address){
        System.out.println(address.getState());
    }


}
