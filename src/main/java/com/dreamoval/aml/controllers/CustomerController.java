/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dreamoval.aml.controllers;

import com.dreamoval.aml.model.nodes.Customer;
import com.dreamoval.aml.neo4j.NeoRestClient;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dreamadmin
 */
@RestController
public class CustomerController {
    @Autowired
    NeoRestClient neo;
    @RequestMapping(value="/customer/create", method=RequestMethod.POST, consumes="application/json")
    public boolean createCustomer(Customer customer){
        return neo.addCustomer(customer);
    }
}
