package com.customer.customer.crud.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
@GeneratedValue(strategy = GenerationType.SEQUENCE)
@JsonIgnore
private int id;

@Column(name = "streetaddress")
private String streetAddress;

@Column(name = "city")
private String city;

@Column(name="state")
private String state;

@Column(name = "country")
private String country;
@Column(name = "postalcode")
private String postalCode;

@JsonBackReference
@ManyToOne
@JoinColumn(name="id")
private Customer customer;
}
