package com.dreamoval.aml.services;

import com.dreamoval.aml.model.Response;
import com.dreamoval.aml.model.nodes.Transaction;
import com.dreamoval.aml.mongo.domain.Rule;
import com.dreamoval.aml.mongo.services.RuleService;
import com.dreamoval.aml.neo4j.NeoRestClient;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.List;

/**
 * Created by dreamadmin on 10/11/14.
 */
@Component
public class MonitoringService {

    @Autowired
    NeoRestClient rest;

    @Autowired
    RuleService ruleService;
    //run query
    public String runQueries(Transaction transaction){
        //get queries
        List<Rule> rules = ruleService.findAll();

        //for each query
        for(Rule rule:rules){
            MultiValueMap<String,String> map = new LinkedMultiValueMap<String, String>();

            //run for source
            map.add("query",parseQuery(rule.getQuery(),transaction.getId(),transaction.getSourceAccount().getId()));
            Gson gson = new Gson();
            Response result = rest.runQuery(map);
            if(result.getData().size()>0){
                //get query for for updating customer
//                rest.updateNode()
                //run query

                //send notification
            }

            //run for destination
            map.clear();
            map.add("query",parseQuery(rule.getQuery(),transaction.getId(),transaction.getDestinationAccount().getId()));
            result = rest.runQuery(map);
            if(result.getData().size()>0){
                //get query for for updating customer
//                rest.updateNode()
                //run query

                //send notification
            }



        }




        return "";
    }

    public String parseQuery(String query,long transactionId, long accountId){
        query = query.replaceAll("%t",String.valueOf(transactionId));
        query = query.replaceAll("%F",String.valueOf(accountId));
        return query;
    }

}
