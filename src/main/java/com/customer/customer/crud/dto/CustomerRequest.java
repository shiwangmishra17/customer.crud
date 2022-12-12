package com.customer.customer.crud.dto;

import com.customer.customer.crud.domain.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequest {
    private Customer customer;
}
