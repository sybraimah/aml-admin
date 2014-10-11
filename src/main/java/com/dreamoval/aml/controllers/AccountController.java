/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dreamoval.aml.controllers;

import com.dreamoval.aml.model.nodes.Account;
import com.dreamoval.aml.model.nodes.Customer;
import com.dreamoval.aml.neo4j.NeoRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dreamadmin
 */
@RestController
public class AccountController {
    @Autowired
    NeoRestClient neo;
    
    @RequestMapping(value="/account/all", method=RequestMethod.POST, consumes="application/json")
    public @ResponseBody Object getAccounts(){
        return neo.getAccounts();
    }
    
    @RequestMapping(value="/account/get", method=RequestMethod.POST, consumes="application/json")
    public @ResponseBody Account fetchAccount(String accountNumber){
        return neo.getAccountByNumber(accountNumber);
    }
    
    @RequestMapping(value="/account/create", method=RequestMethod.POST, consumes="application/json")
    public boolean createAccount(Account account, String customerNo){
        return neo.addAccount(account.getCustomer(), account);
    }
}
