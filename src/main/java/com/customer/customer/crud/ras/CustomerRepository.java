package com.customer.customer.crud.ras;

import com.customer.customer.crud.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
