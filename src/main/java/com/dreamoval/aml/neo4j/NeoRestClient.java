package com.dreamoval.aml.neo4j;

import com.dreamoval.aml.model.Response;
import com.dreamoval.aml.model.nodes.Account;
import com.dreamoval.aml.model.nodes.Customer;
import com.dreamoval.aml.model.nodes.Institution;
import com.dreamoval.aml.model.nodes.Transaction;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;


/**
 * Created by dreamadmin on 10/11/14.
 */
@Component
public class NeoRestClient {

    String baseUrl = "http://192.168.0.235:7474/db/data/";

    public boolean addCustomer(Customer customer){
        String url = baseUrl+"/node";
        try{
            RestTemplate rest = new RestTemplate();
            MultiValueMap<String,String> map = new LinkedMultiValueMap<String,String>();
            String query = String.format("CREATE UNIQUE (:Customer {name: '%s', kycVerified: %s, riskScore: %d})", customer.getName(), customer.isKycVerified(), customer.getRiskScore());
            map.add("query",query);

            rest.postForEntity(url,map,Customer.class);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean addAccount(Customer customer, Account account){
        String url = baseUrl+"/node";
        try{
            RestTemplate rest = new RestTemplate();
            MultiValueMap<String,String> map = new LinkedMultiValueMap<String,String>();
            String query = String.format("MATCH (c:Customer {id: %d}) CREATE UNIQUE (c)-[:Owns]->(:Account {accountNumber: '%s', balance: 0, dateOpened: %d, status: 'ACTIVE'})", customer.getId(), account.getNumber(), account.getOpened().getTime());
            map.add("query",query);

            rest.postForEntity(url,map,Account.class);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean addTransaction(Transaction transaction, Account sourceAccount, Account destinationAccount){
        String url = baseUrl+"/node";
        try{
            RestTemplate rest = new RestTemplate();
            MultiValueMap<String,String> map = new LinkedMultiValueMap<String,String>();
            String query = String.format("MATCH (a:Account {id: %d}) CREATE UNIQUE (a)-[:Has]->(:Transaction {narrative: '%s', type: '%s', source: '%s', destination: '%s', flag: '%s', amount: '%f', date: '%d'})", sourceAccount.getId(), transaction.getNarrative(), sourceAccount.getNumber(), destinationAccount.getNumber(), transaction.getFlag(), transaction.getAmount(), transaction.getDate().getTime());
            map.add("query",query);
            rest.postForEntity(url,map,Transaction.class);
            
            query = String.format("MATCH (b:Account {id: %d}), (t:Transaction {id: %d}) CREATE UNIQUE (b)-[:Has]->(t)", destinationAccount.getId(), transaction.getId());
            map.add("query",query);
            rest.postForEntity(url,map,Account.class);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean addFinancialInstitution(Institution institution){
        String url = baseUrl+"/node";
        try{
            RestTemplate rest = new RestTemplate();
            MultiValueMap<String,String> map = new LinkedMultiValueMap<String,String>();
            String query = String.format("CREATE UNIQUE (:FI {name: '%s', shortName: '%s', country: '%s'})", institution.getName(), institution.getShortName(), institution.getCountry());
            map.add("query",query);

            rest.postForEntity(url,map,Customer.class);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public String addNode(MultiValueMap<String,String> map){
        String url = baseUrl+"/node";
        try{
            RestTemplate rest = new RestTemplate();
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.APPLICATION_JSON);
//            MultiValueMap<String,String> map = new LinkedMultiValueMap<String, String>();
//            map.add("name","Steve");
//            HttpEntity<String> entity = new HttpEntity<String>(node,headers);

            ResponseEntity<String> result = rest.postForEntity(url,map,String.class);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }

    public String updateNode(String id){
        String url = baseUrl+"/cypher";
        try{
            RestTemplate rest = new RestTemplate();
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.APPLICATION_JSON);
            MultiValueMap<String,String> map = new LinkedMultiValueMap<String, String>();
            map.add("query","MATCH (:Transaction {id:"+id+"})<-[:Has]-(:Account)<-[:Owns]-(c:Customer) SET c.riskScore = (c.riskScore + 1) return c");
//            HttpEntity<String> entity = new HttpEntity<String>(node,headers);

            ResponseEntity<String> result = rest.postForEntity(url,map,String.class);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return "";
    }

    public Response runQuery(MultiValueMap<String,String> map){
        String url = baseUrl+"/cypher";
        try{
            RestTemplate rest = new RestTemplate();
            ResponseEntity<Response> result = rest.postForEntity(url,map, Response.class);
            return result.getBody();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public String call(RestTemplate rest){

        return "";
    }
}
