package com.dreamoval.aml.services;

import com.dreamoval.aml.model.Response;
import com.dreamoval.aml.model.nodes.Transaction;
import com.dreamoval.aml.mongo.domain.DailySummary;
import com.dreamoval.aml.mongo.domain.ITransaction;
import com.dreamoval.aml.mongo.domain.Rule;
import com.dreamoval.aml.mongo.services.DailySummaryService;
import com.dreamoval.aml.mongo.services.ITransactionService;
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

    @Autowired
    ITransactionService transactionService;

    @Autowired
    DailySummaryService dailySummary;

    //run query
    public String runQueries(Transaction transaction){
        ITransaction tx = new ITransaction();

        tx.setAmount(transaction.getAmount());
        tx.setDate(transaction.getDate());
        tx.setDestination(transaction.getDestination());
        tx.setSource(transaction.getSource());
        tx.setId(transaction.getId());
        tx.setDestinationAccount(transaction.getDestinationAccount().getNumber());
        tx.setSourceAccount(transaction.getSourceAccount().getNumber());
        tx.setNarrative(transaction.getNarrative());
        tx.setType(transaction.getType());
        tx.setFlag(transaction.getFlag());

        transactionService.save(tx);

        //get queries
        List<Rule> rules = ruleService.findAll();

        //for each query
        for(Rule rule:rules){
            MultiValueMap<String,String> map = new LinkedMultiValueMap<String, String>();
            dailySummary.updateSummary("flaggedTransactions",1);

            //run for source
            map.add("query",parseQuery(rule.getQuery(), transaction.getSourceAccount().getCustomer().getId(),
                    transaction.getSourceAccount().getId()));
            Gson gson = new Gson();
            Response result = rest.runQuery(map);
            if(result.getData().size()>0){
                //get query for for updating customer
                rest.updateNode(String.valueOf(transaction.getSourceAccount().getId()));
                //run query

                //send notification
            }

            //run for destination
            map.clear();
            map.add("query",parseQuery(rule.getQuery(),transaction.getSourceAccount().getCustomer().getId(),
                    transaction.getDestinationAccount().getId()));
            result = rest.runQuery(map);

            if(result.getData().size()>0){
                dailySummary.updateSummary("flaggedTransactions",1);

                //get query for for updating customer
                rest.updateNode(String.valueOf(transaction.getDestinationAccount().getId()));
                //run query

                //send notification
            }



        }




        return "done";
    }

    public String parseQuery(String query,long customer, long accountId){
        query = query.replaceAll("<cust_id>",String.valueOf(customer));
        query = query.replaceAll("<account_no>",String.valueOf(accountId));
        return query;
    }

}
