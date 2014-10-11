/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dreamoval.aml.controllers;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dreamadmin
 */
@RestController
public class CustomerController {
    @RequestMapping("/customer/create")
    public boolean createCustomer(HttpServletRequest request){
        
        return true;
    }
}
