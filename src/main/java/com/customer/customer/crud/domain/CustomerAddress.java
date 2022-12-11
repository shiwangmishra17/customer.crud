package com.customer.customer.crud.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="CUSTOMER_ADDRESS")
public class CustomerAddress {

@Id
@Column(name="customer_address_id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

@Column(name = "address")
private String primaryAddress;

@JsonBackReference
@ManyToOne
@JoinColumn(name="id")
private Customer customer;
}
