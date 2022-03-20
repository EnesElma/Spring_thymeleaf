package com.enes.spring_thymeleaf.service;

import com.enes.spring_thymeleaf.model.Address;
import com.enes.spring_thymeleaf.repo.IAddressRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AddressServiceTest {

    @Mock
    private IAddressRepository repository;

    @InjectMocks
    private AddressService service;

    private Address address,address1;

    @BeforeEach
    public void setup(){
        address = Address.builder().id(1L).city("istanbul").district("Kadıköy").build();
        address1 = Address.builder().id(2L).city("istanbul").district("Esenler").build();
    }

    @Test
    void save() {
        //given
        BDDMockito.given(repository.save(address)).willReturn(address);

        //when
        Address savedAddress = service.save(address);

        //then
        assertEquals(savedAddress,address);

    }

    @Test
    void allAddress() {
        //given
        BDDMockito.given(repository.findAll()).willReturn(List.of(address,address1));

        //when
        List<Address> addressList = service.allAddress();

        //then
        assertNotNull(addressList);
        assertEquals(addressList.size(),2);
    }
}