package com.devrrior.ecommercespring.repositories;

import com.devrrior.ecommercespring.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
