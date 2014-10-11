package com.dreamoval.aml.mongo.services;

import com.dreamoval.aml.Application;
import com.dreamoval.aml.mongo.domain.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class RuleServiceTest {

    @Autowired
    RuleService ruleService;

    @Test
    public void testSave() throws Exception {
//        Rule rule = new Rule();
//        rule.setId("1");
//        rule.setQuery("match (c:Customer)-[:Owns]->(a:Account {number: <account_no>}) where c.riskScore > <threshold> return c.id;");
//        ruleService.save(rule);
    }
}