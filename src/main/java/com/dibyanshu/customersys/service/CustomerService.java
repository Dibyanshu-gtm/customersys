package com.dibyanshu.customersys.service;

import com.dibyanshu.customersys.dao.CustomerDAO;
import com.dibyanshu.customersys.exception.CustomerNotFoundException;
import com.dibyanshu.customersys.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class CustomerService {

    @Autowired
    private CustomerDAO customerDAO;




    public Customer addCustomer(Customer customer)
    {
       return customerDAO.save(customer);

    }

    public List<Customer> getCustomers(){

        return customerDAO.findAll();
    }

    public Customer getCustomer(int customerid)
    {
        Optional<Customer> optcust=customerDAO.findById(customerid);
       if(!optcust.isPresent())
           throw new CustomerNotFoundException("Customer Record is not available");
       return optcust.get();
    }

    public Customer updateCustomer(int customerid,Customer customer)
    {
        customer.setCustomerid(customerid);


       return customerDAO.save(customer);
    }

    public void deleteCustomer(int customerid)
    {

        customerDAO.deleteById(customerid);
    }


}
