package com.enes.spring_thymeleaf.repo;

import com.enes.spring_thymeleaf.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepository extends JpaRepository<Address,Long> {
}
