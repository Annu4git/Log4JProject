package com.anurag.Log4JProject.controller;

import com.anurag.Log4JProject.entity.Customer;
import com.anurag.Log4JProject.service.CustomerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* Dummy controller */
@RestController
@RequestMapping("customers")
public class CustomerController {

    private static final Logger LOG = LogManager.getLogger(CustomerController.class);
    @Autowired
    CustomerService customerService;

    @GetMapping("customer/{id}")
    public Customer getCustomer(@PathVariable String id) {

        LOG.debug("This is debug statement in controller");
        LOG.warn("This is warning statement in controller");
        LOG.error("This is error statement in controller");
        LOG.info("This is info statement in controller");
        LOG.fatal("This is fatal statement in controller");
        LOG.debug("This is last debug statement in controller *******************************************");


        return customerService.getCustomerById(id);

    }
}
