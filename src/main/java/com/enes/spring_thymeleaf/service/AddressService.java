package com.enes.spring_thymeleaf.service;

import com.enes.spring_thymeleaf.model.Address;
import com.enes.spring_thymeleaf.repo.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressService implements IAddressService{

    private final IAddressRepository repository;

    public AddressService(IAddressRepository repository) {
        this.repository = repository;
    }

    @Override
    public Address save(Address address){
        return repository.save(address);
    }

    @Override
    public List<Address> allAddress(){
        return repository.findAll();
    }
}
