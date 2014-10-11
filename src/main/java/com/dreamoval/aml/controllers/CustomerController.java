/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dreamoval.aml.controllers;

import com.dreamoval.aml.model.nodes.Account;
import com.dreamoval.aml.model.nodes.Customer;
import com.dreamoval.aml.model.nodes.Institution;
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
 * @author dreamadmin
 */
@Controller
public class CustomerController {

    @Autowired
    private NeoRestClient neoRestClient;

    @RequestMapping(value = "/customer/create", method = RequestMethod.GET)
    @ResponseBody
    public JSONResponse createCustomer(
            @RequestParam("customer") String customer,
            @RequestParam("account") String account,
            @RequestParam("fi") String fi,
            HttpServletResponse response, HttpServletRequest request) {
        response.setContentType("application/json;charset=UTF-8");
        JSONResponse jSONResponse = new JSONResponse();
        Customer c = new Gson().fromJson(customer, Customer.class);
        Account a = new Gson().fromJson(account, Account.class);
        Institution i = new Gson().fromJson(account, Institution.class);
        neoRestClient.addCustomer(c);
        neoRestClient.addAccount(c, a);
        neoRestClient.addFinancialInstitution(i);
        jSONResponse.setStatus(true);
        jSONResponse.setMessage("Success");
        return jSONResponse;
    }

    @RequestMapping(value = "/customer/list", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public JSONResponse getCustomers(HttpServletResponse response, HttpServletRequest request) {
        response.setContentType("application/json;charset=UTF-8");
        JSONResponse jSONResponse = new JSONResponse();
//        neoRestClient.
        jSONResponse.setStatus(true);
        jSONResponse.setMessage("Success");
        return jSONResponse;
    }
}
