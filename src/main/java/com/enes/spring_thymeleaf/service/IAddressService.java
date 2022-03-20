package com.enes.spring_thymeleaf.service;

import com.enes.spring_thymeleaf.model.Address;

import java.util.List;

public interface IAddressService {
    Address save(Address address);

    List<Address> allAddress();
}
