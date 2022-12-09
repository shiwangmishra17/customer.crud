package com.customer.customer.crud.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="CUSTOMER_GENERAL_DATA")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="phone")
    private String phone;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="fid",referencedColumnName = "id")
    List<CustomerAddress> customerAddresses = new ArrayList<>();
}
