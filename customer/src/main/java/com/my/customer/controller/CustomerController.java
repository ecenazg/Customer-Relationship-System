package com.my.customer.controller;

import com.my.customer.entity.Customer;
import com.my.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

/**
 * @author Ecenaz Güngör
 */

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public String listCustomers(Model cus) {
        List<Customer> customers = customerService.findAllCustomers();
        cus.addAttribute("customers", customers);
        return "list-customers";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model cus) {

        Customer newCustomer = new Customer();
        cus.addAttribute("customer", newCustomer);

        return "customer-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer cus) {

        customerService.saveCustomer(cus);
        return "redirect:/customer/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("customer_id") Long id, Model cus) {
        Optional<Customer> result = customerService.findCustomerById(id);

        if (result.isPresent()) {
            Customer existingCustomer = result.get();
            cus.addAttribute("customer", existingCustomer);
        } else {
            return "redirect:/customer/list";
        }

        return "customer-form";
    }



    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("customerId") Long id) {

        customerService.deleteCustomer(id);
        return "redirect:/customer/list";
    }

    @GetMapping("/search")
    public String searchCustomers(@RequestParam("name") String name,
                                  Model cus) {

        List<Customer> customer = customerService.searchCustomers(name);
        cus.addAttribute("customers", customer);

        return "list-customers";
    }

}
