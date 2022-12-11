package com.customer.customer.crud.managerimpl;

import com.customer.customer.crud.domain.Customer;
import com.customer.customer.crud.domain.CustomerAddress;
import com.customer.customer.crud.manager.CustomerService;
import com.customer.customer.crud.ras.CustomerAddressRepository;
import com.customer.customer.crud.ras.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private final CustomerRepository customerRepository;

    @Autowired
    private final CustomerAddressRepository customerAddressRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerAddressRepository customerAddressRepository) {
        this.customerRepository = customerRepository;
        this.customerAddressRepository = customerAddressRepository;
    }


    public Customer createCustomer(Customer customer){
    List<CustomerAddress> customerTemp = customerAddressRepository.findByCustomerId(customer.getId());//.orElse(null);
    /*if(customerTemp==null){
        customerTemp = new CustomerAddress();
    }*/
    //customerTemp.setPrimaryAddress(customer.getCustomerAddresses().get);
    //customer.setCustomerAddresses(customerAddress);
    return customerRepository.save(customer);
    }

    public Customer getCustomerById(int id){
        return customerRepository.findById(id).orElse(null);
    }

    public Customer updateCustomer(Customer customer){
        Customer oldCustomer = null;
        Optional<Customer> optionalCustomer = customerRepository.findById(customer.getId());
        if(optionalCustomer.isPresent()){
            oldCustomer = optionalCustomer.get();
            oldCustomer.setFirstName(customer.getFirstName());
            oldCustomer.setLastName(customer.getLastName());
            oldCustomer.setPhone(customer.getPhone());
            customerRepository.save(oldCustomer);
        }
        else {
            return new Customer();
        }
        return oldCustomer;
    }



    public String deleteCustomerById(int id){
        customerRepository.deleteById(id);
        return "User Deleted";
        //exceptional handling

    }
}
