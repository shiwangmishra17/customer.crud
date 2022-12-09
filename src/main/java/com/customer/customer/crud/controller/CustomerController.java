package com.customer.customer.crud.controller;

import com.customer.customer.crud.domain.Customer;
import com.customer.customer.crud.manager.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/createcustomer")
    public Customer createCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomerById(@PathVariable int id){
        return customerService.getCustomerById(id);
    }

    @PostMapping("/updatecustomer")
    public Customer update(@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("/deletecustomer/{id}")
    public String deleteCustomer(@PathVariable int id) {
        return customerService.deleteCustomerById(id);

    }
}
