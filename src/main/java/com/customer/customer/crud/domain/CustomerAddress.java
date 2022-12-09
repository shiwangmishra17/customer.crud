package com.customer.customer.crud.domain;

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
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

@Column(name = "primary_address")
private String primary_address;

@Column(name = "secondary_address")
private String secondary_address;
}
