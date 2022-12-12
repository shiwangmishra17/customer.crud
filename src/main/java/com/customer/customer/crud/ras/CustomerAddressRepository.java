package com.customer.customer.crud.ras;

import com.customer.customer.crud.domain.CustomerAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerAddressRepository extends JpaRepository<CustomerAddress,Integer> {
}
