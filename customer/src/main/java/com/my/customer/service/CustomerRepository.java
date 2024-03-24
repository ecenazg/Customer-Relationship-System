package com.my.customer.service;
import com.my.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * @author Ecenaz Güngör
 */
@Repository
public interface CustomerRepository<C, L extends Number> extends JpaRepository<Customer, Long> {
    public Customer saveCustomer(Customer customer);

    public Customer findCustomerById(Long id);

    public List<Customer> findAllCustomers();
    public void deleteCustomer(Long id);

    List<Customer> findByNameContainingIgnoreCase(String name);
}

