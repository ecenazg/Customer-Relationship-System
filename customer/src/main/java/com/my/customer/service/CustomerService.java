package com.my.customer.service;

import com.my.customer.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
/**
 * @author Ecenaz Güngör
 */
@Service
public class CustomerService{
    @Autowired
    private CustomerRepository customerRepository;
    public Customer saveCustomer(Customer customer) {
        return (Customer) customerRepository.save(customer);
    }


    public Optional findCustomerById(Long id) {
        return customerRepository.findById(id);
    }


    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }


    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);

    }

    public List<Customer> searchCustomers(String name){
        return customerRepository.findByNameContainingIgnoreCase(name);
    }


}
