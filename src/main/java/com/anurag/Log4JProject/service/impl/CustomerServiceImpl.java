package com.anurag.Log4JProject.service.impl;

import com.anurag.Log4JProject.entity.Customer;
import com.anurag.Log4JProject.service.CustomerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private static final Logger LOG = LogManager.getLogger(CustomerServiceImpl.class);

    @Override
    public Customer getCustomerById(String id) {
        LOG.debug("Customer Service impl : Inside get customer by id for : " + id);
        return new Customer(id, "User-"+id, "abc@gmail.com");
    }
}
