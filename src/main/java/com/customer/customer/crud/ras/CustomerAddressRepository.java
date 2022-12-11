package com.customer.customer.crud.ras;

import com.customer.customer.crud.domain.CustomerAddress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerAddressRepository extends JpaRepository<CustomerAddress,Integer> {
    List<CustomerAddress> findByCustomerId(int id);

    //void deleteById(int id);

    //void saveCustomerAddress(CustomerAddress customerAddress);
}
