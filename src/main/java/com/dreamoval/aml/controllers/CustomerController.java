/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dreamoval.aml.controllers;

import com.dreamoval.aml.model.nodes.Account;
import com.dreamoval.aml.model.nodes.Customer;
import com.dreamoval.aml.model.nodes.Institution;
import com.dreamoval.aml.neo4j.NeoRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
    @RequestMapping(value="/customer/get", method=RequestMethod.POST, consumes="application/json")
    public @ResponseBody Customer fetchCustomer(Long customerId){
        return neo.getCustomerById(customerId);
    }
    
 *
 * @author dreamadmin
 */
@Controller
public class CustomerController {

    @Autowired
    NeoRestClient neo;
    
    @RequestMapping(value="/customer/all", method=RequestMethod.POST, consumes="application/json")
    public @ResponseBody Object getCustomers(){
        return neo.getCustomers();
    }
    
    @RequestMapping(value="/customer/get", method=RequestMethod.POST, consumes="application/json")
    public @ResponseBody Customer fetchCustomer(Long customerId){
        return neo.getCustomerById(customerId);
    }
    
    @RequestMapping(value="/customer/create", method=RequestMethod.POST, consumes="application/json")
    public @ResponseBody boolean createCustomer(Customer customer){
        return neo.addCustomer(customer);
    } 
    
    @RequestMapping(value="/customer/accounts", method=RequestMethod.POST, consumes="application/json")
    public @ResponseBody Object getCustomerAccounts(Long customerId){
        return neo.getAccountsForCustomer(customerId);
    }    
        
    @RequestMapping(value="/customer/transactions", method=RequestMethod.POST, consumes="application/json")
    public @ResponseBody Object getCustomerTransactions(Long customerId){
        return neo.getCustomerTransactions(customerId);
    }
    
}
