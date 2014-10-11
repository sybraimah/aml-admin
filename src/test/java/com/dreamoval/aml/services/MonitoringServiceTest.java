package com.dreamoval.aml.services;

import com.dreamoval.aml.Application;
import com.dreamoval.aml.model.nodes.Account;
import com.dreamoval.aml.model.nodes.Customer;
import com.dreamoval.aml.model.nodes.Institution;
import com.dreamoval.aml.model.nodes.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class MonitoringServiceTest {

    @Autowired
    MonitoringService monitoringService;

    @Test
    public void testRunQueries() throws Exception {

        Transaction transaction = new Transaction();
        Account source = new Account();
        Customer customer = new Customer();
        customer.setName("Stephen Braimah");
        customer.setKycVerified(true);
        customer.setRiskScore(0);

        Institution stanbic = new Institution();
        stanbic.setName("Stanbic Bank");
        stanbic.setCountry("Ghana");

        source.setBalance(200000.00);
        source.setCustomer(customer);
        source.setInstitution(stanbic);
        source.setNumber("003");
        source.setOpened(new Date());
        source.setStatus("");




        Account destination = new Account();
        Customer malike = new Customer();
        malike.setName("Saint Malike");
        malike.setKycVerified(true);
        malike.setRiskScore(0);

        destination.setBalance(1000.00);
        destination.setCustomer(malike);
        destination.setInstitution(stanbic);
        destination.setNumber("002");
        destination.setOpened(new Date());
        destination.setStatus("");


        transaction.setNarrative("Test transaction");
        transaction.setDate(new Date());
        transaction.setAmount(100.00);
        transaction.setDestinationAccount(destination);
        transaction.setSourceAccount(source);
        transaction.setType("transfer");
        transaction.setSource(source.getNumber());
        transaction.setDestinationAccount(destination.getNumber());


        String result = monitoringService.runQueries(transaction);
        System.out.println(result);

    }
}