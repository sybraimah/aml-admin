/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dreamoval.aml.controllers;

import com.dreamoval.aml.model.nodes.Institution;
import com.dreamoval.aml.model.nodes.Transaction;
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
public class TransactionController {
    @Autowired
    NeoRestClient neo;
    
    
    @RequestMapping(value="/transaction/all", method=RequestMethod.POST, consumes="application/json")
    public @ResponseBody Object getTransactions(){
        return neo.getTransactions();
    }
    
    @RequestMapping(value="/transaction/get", method=RequestMethod.POST, consumes="application/json")
    public @ResponseBody Transaction fetchTransaction(Long transactionId){
        return neo.getTransactionById(transactionId);
    }
    
    @RequestMapping(value="/transaction/create", method=RequestMethod.POST, consumes="application/json")
    public @ResponseBody boolean createTransaction(Transaction transaction){
        return neo.addTransaction(transaction, transaction.getSourceAccount(), transaction.getDestinationAccount());
    } 
}
