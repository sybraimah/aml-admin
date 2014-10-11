package com.dreamoval.aml.model.services;

import com.dreamoval.aml.Application;
import com.dreamoval.aml.model.nodes.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.neo4j.graphdb.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.neo4j.conversion.Result;
import org.springframework.data.neo4j.core.GraphDatabase;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class CustomerServiceTest {

    @Autowired
    CustomerService customerService;

    @Autowired
    GraphDatabase graphDatabase;

    @Test
    public void testFindAll() throws Exception {
        Transaction tx = graphDatabase.beginTx();
        try{
            Iterable<Customer> result = customerService.findAll();

            System.out.println("Test results");
            for(Customer customer:result){
                System.out.println(customer.toString());
            }
            tx.success();
        }finally {
            tx.close();
        }



    }
}