package com.dreamoval.aml.mongo.repositories;

import com.dreamoval.aml.mongo.domain.Rule;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by dreamadmin on 10/11/14.
 */
public interface RuleRepository extends MongoRepository<Rule, String> {

    public Rule findById(String id);
}
