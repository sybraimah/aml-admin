package com.dreamoval.aml.model.services;

import com.dreamoval.aml.model.nodes.Customer;
import com.dreamoval.aml.model.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.conversion.Result;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dreamadmin on 10/10/14.
 */

@Component
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Iterable<Customer> findAll(){
        return customerRepository.findAll();
    }
}
