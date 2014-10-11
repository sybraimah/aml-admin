/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dreamoval.aml.controllers;

import com.dreamoval.aml.model.nodes.Account;
import com.dreamoval.aml.model.nodes.Transaction;
import com.dreamoval.aml.neo4j.NeoRestClient;
import com.dreamoval.aml.util.JSONResponse;
import com.google.gson.Gson;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author malike_st
 */
@Controller
public class TransactionController {

    @Autowired
    private NeoRestClient neo;

    @RequestMapping(value = "/send/transactions")
    @ResponseBody
    public JSONResponse sendTransactions(
            @RequestParam("transaction") String transaction,
            @RequestParam("source") String source,
            @RequestParam("destination") String destination,
            HttpServletResponse response, HttpServletRequest request) {
        response.setContentType("application/json;charset=UTF-8");
        JSONResponse jSONResponse = new JSONResponse();
        Transaction t = new Gson().fromJson(transaction, Transaction.class);
        Account s = new Gson().fromJson(transaction, Account.class);
        Account d = new Gson().fromJson(transaction, Account.class);
        neo.addTransaction(t, s, d);
        jSONResponse.setStatus(true);
        jSONResponse.setMessage("Success");
        return jSONResponse;
    }

    @RequestMapping(value = "/transaction/all", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody
    Object getTransactions() {
        return neo.getTransactions();
    }

    @RequestMapping(value = "/transaction/get", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody
    Object fetchTransaction(Long transactionId) {
        return neo.getTransactionById(transactionId);
    }

    @RequestMapping(value = "/transaction/create", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody
    boolean createTransaction(Transaction transaction) {
        return neo.addTransaction(transaction, transaction.getSourceAccount(), transaction.getDestinationAccount());
    }
}
