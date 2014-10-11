package com.dreamoval.aml.mongo.repositories;


import com.dreamoval.aml.mongo.domain.DailySummary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by dreamadmin on 7/24/14.
 */
public interface DailySummaryRepository extends MongoRepository<DailySummary, Serializable> {

}
