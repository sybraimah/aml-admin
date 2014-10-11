package com.dreamoval.aml.neo4j;

import com.dreamoval.aml.model.Response;
import com.dreamoval.aml.model.nodes.Account;
import com.dreamoval.aml.model.nodes.Customer;
import com.dreamoval.aml.model.nodes.Institution;
import com.dreamoval.aml.model.nodes.Transaction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    public boolean addCustomer(Customer customer) {
        String url = baseUrl + "/node";
        try {
            RestTemplate rest = new RestTemplate();
            MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
            String query = String.format("CREATE UNIQUE (:Customer {name: '%s', kycVerified: %s, riskScore: %d})", customer.getName(), customer.isKycVerified(), customer.getRiskScore());
            map.add("query", query);

            rest.postForEntity(url, map, Customer.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public Object getCustomers() {
        try {
            RestTemplate rest = new RestTemplate();
            MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
            map.add("query", "MATCH (c:Customer) return c");
            Response result = runQuery(map);

            return responseToCollection(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Object getCustomerById(String customerId) {
        try {
            RestTemplate rest = new RestTemplate();
            MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
            String query = String.format("MATCH (c:Customer {id: '%s'}) return c", customerId);
            map.add("query", query);

            Response result = runQuery(map);
            return responseToObject(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Object getAccountsForCustomer(String customerId) {
        String url = baseUrl + "/node";
        try {
            RestTemplate rest = new RestTemplate();
            MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
            String query = String.format("MATCH (c:Customer {id: '%s'})-[:Owns]->(a:Account) return a", customerId);
            map.add("query", query);

            Response result = runQuery(map);
            ArrayList hashMap = (ArrayList) responseToCollection(result);
            if (null != hashMap) {
                return hashMap.get(0);
            }
            return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Object getCustomerTransactions(Long customerId) {
        String url = baseUrl + "/node";
        try {
            RestTemplate rest = new RestTemplate();
            MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
            String query = String.format("MATCH (c:Customer {id: %d})-[:Owns]->(:Account)-[:Has]->(t:Transaction) return t");
            map.add("query", query);

            Response result = runQuery(map);
            return responseToCollection(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean addAccount(Customer customer, Account account) {
        String url = baseUrl + "/node";
        try {
            RestTemplate rest = new RestTemplate();
            MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
            String query = String.format("MATCH (c:Customer {id: %d}) CREATE UNIQUE (c)-[:Owns]->(:Account {accountNumber: '%s', balance: 0, dateOpened: %d, status: 'ACTIVE'})", customer.getId(), account.getNumber(), account.getOpened().getTime());
            map.add("query", query);

            rest.postForEntity(url, map, Account.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public Object getAccounts() {
        String url = baseUrl + "/node";
        try {
            RestTemplate rest = new RestTemplate();
            MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
            String query = String.format("MATCH (a:Account) return a");
            map.add("query", query);

            Response result = runQuery(map);
            return responseToCollection(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Object getAccountByNumber(String accountNumber) {
        String url = baseUrl + "/node";
        try {
            RestTemplate rest = new RestTemplate();
            MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
            String query = String.format("MATCH (a:Account {accountNumber: %s}) return a", accountNumber);
            map.add("query", query);

            Response result = runQuery(map);
            return responseToObject(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Object getAccountTransactions(String accountNumber) {
        String url = baseUrl + "/node";
        try {
            RestTemplate rest = new RestTemplate();
            MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
            String query = String.format("MATCH (a:Account {accountNumber: '%s'})-[:Has]->(t:Transaction) return t", accountNumber);
            map.add("query", query);

            Response result = runQuery(map);
            return responseToCollection(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean addTransaction(Transaction transaction, String sourceAccount, String destinationAccount) {
        String url = baseUrl + "/node";
        try {
            RestTemplate rest = new RestTemplate();
            MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
            String query = String.format("MATCH (a:Account {accountNumber: '%s'}) CREATE UNIQUE (a)-[:Has]->(:Transaction {narrative: '%s', type: '%s', source: '%s', destination: '%s', flag: '%s', amount: '%f', date: '%d'})", transaction.getSource(), transaction.getNarrative(), sourceAccount, destinationAccount, transaction.getFlag(), transaction.getAmount(), transaction.getDate().getTime());
            map.add("query", query);
            rest.postForEntity(url, map, Transaction.class);

            query = String.format("MATCH (b:Account {accountNumber: '%s'}), (t:Transaction {id: %d}) CREATE UNIQUE (b)-[:Has]->(t)", transaction.getDestination(), transaction.getId());
            map.add("query", query);
            rest.postForEntity(url, map, Account.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public Object getTransactions() {
        String url = baseUrl + "/node";
        try {
            RestTemplate rest = new RestTemplate();
            MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
            String query = String.format("MATCH (t:Transaction) return t");
            map.add("query", query);

            Response result = runQuery(map);
            return responseToCollection(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Object getTransactionById(Long transactionId) {
        String url = baseUrl + "/node";
        try {
            RestTemplate rest = new RestTemplate();
            MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
            String query = String.format("MATCH (t:Transactoin {id: %d}) return t", transactionId);
            map.add("query", query);

            Response result = runQuery(map);
            return responseToObject(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean addFinancialInstitution(Institution institution) {
        String url = baseUrl + "/node";
        try {
            RestTemplate rest = new RestTemplate();
            MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
            String query = String.format("CREATE UNIQUE (:FI {name: '%s', shortName: '%s', country: '%s'})", institution.getName(), institution.getShortName(), institution.getCountry());
            map.add("query", query);

            rest.postForEntity(url, map, Customer.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public Object getInstitutions() {
        String url = baseUrl + "/node";
        try {
            RestTemplate rest = new RestTemplate();
            MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
            String query = String.format("MATCH (i:FI) return i");
            map.add("query", query);

            Response result = runQuery(map);
            return responseToCollection(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Object getInstitutionByShortName(String shortName) {
        String url = baseUrl + "/node";
        try {
            RestTemplate rest = new RestTemplate();
            MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
            String query = String.format("MATCH (i:FI {shortName: '%s'}) return i", shortName);
            map.add("query", query);

            Response result = runQuery(map);
            return responseToObject(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Object getAccountsForInstitution(String shortName) {
        String url = baseUrl + "/node";
        try {
            RestTemplate rest = new RestTemplate();
            MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
            String query = String.format("MATCH (i:FI {shortName: '%s'})-[:Holds]->(a:Account) return a", shortName);
            map.add("query", query);

            Response result = runQuery(map);
            return responseToCollection(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public String addNode(MultiValueMap<String, String> map) {
        String url = baseUrl + "/node";
        try {
            RestTemplate rest = new RestTemplate();
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.APPLICATION_JSON);
//            MultiValueMap<String,String> map = new LinkedMultiValueMap<String, String>();
//            map.add("name","Steve");
//            HttpEntity<String> entity = new HttpEntity<String>(node,headers);

            ResponseEntity<String> result = rest.postForEntity(url, map, String.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "";
    }

    public String updateNode(String id) {
        String url = baseUrl + "/cypher";
        try {
            RestTemplate rest = new RestTemplate();
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.APPLICATION_JSON);
            MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
            map.add("query", "MATCH (:Transaction {id:" + id + "})<-[:Has]-(:Account)<-[:Owns]-(c:Customer) SET c.riskScore = (c.riskScore + 1) return c");
//            HttpEntity<String> entity = new HttpEntity<String>(node,headers);

            ResponseEntity<String> result = rest.postForEntity(url, map, String.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "";
    }

    public Response runQuery(MultiValueMap<String, String> map) {
        String url = baseUrl + "/cypher";
        try {
            RestTemplate rest = new RestTemplate();
            ResponseEntity<Response> result = rest.postForEntity(url, map, Response.class);
            return result.getBody();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Object responseToObject(Response result) {
        ArrayList list = (ArrayList) result.getData();
        ArrayList records = (ArrayList) list.get(0);
        Map node = (Map) records.get(0);

        return node.get("data");
    }

    public Object responseToCollection(Response result) {
        ArrayList list = (ArrayList) result.getData();

        List<Map> coll = new ArrayList<Map>();

        for (Object record : list) {
            ArrayList<Map> nodes = (ArrayList<Map>) record;

            for (Map node : nodes) {
                coll.add((Map) node.get("data"));
            }
        }
        return coll;
    }

    public String call(RestTemplate rest) {

        return "";
    }
}
