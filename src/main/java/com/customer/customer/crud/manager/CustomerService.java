package com.customer.customer.crud.manager;

import com.customer.customer.crud.domain.Customer;
import org.springframework.web.bind.annotation.*;


public interface CustomerService {


    public Customer createCustomer(@RequestBody Customer customer);

    public Customer getCustomerById(@PathVariable int id);

    public Customer updateCustomer(@RequestBody Customer customer);

    public String deleteCustomerById(@PathVariable int id);
}
