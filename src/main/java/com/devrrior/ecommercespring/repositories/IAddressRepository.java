package com.devrrior.ecommercespring.repositories;

import com.devrrior.ecommercespring.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAddressRepository extends JpaRepository<Address, Long> {
    List<Address> findAllByUserId(Long userId);
}
