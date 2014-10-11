package com.dreamoval.aml.mongo.services;

import com.dreamoval.aml.mongo.domain.Rule;
import com.dreamoval.aml.mongo.repositories.RuleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by dreamadmin on 10/11/14.
 */
public class RuleService {

    @Autowired
    RuleRepository queryRepository;

    public Rule find(String id){
        return queryRepository.findById(id);
    }

    public List<Rule> findAll(){
        return queryRepository.findAll();
    }

    public Rule save(Rule rule){
        return queryRepository.save(rule);
    }

    public void delete(Rule rule){
        queryRepository.delete(rule);
    }
}
