package com.dreamoval.aml.model.services;

import com.dreamoval.aml.model.nodes.Customer;
import com.dreamoval.aml.model.repositories.CustomerRepository;
import com.dreamoval.aml.neo4j.NeoRestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

/**
 * Created by dreamadmin on 10/10/14.
 */

@Component
public class CustomerService {
//    @Autowired
//    CustomerRepository customerRepository;
    @Autowired
    NeoRestClient neo;

//    public Iterable<Customer> findAll(){
//        MultiValueMap<String,String> map = new LinkedMultiValueMap<>();
//        map.put("query", "MATCH (n:Customer)");
//        neo.runQuery(map);
//    }
}
