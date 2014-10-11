package com.dreamoval.aml.mongo.services;


import com.dreamoval.aml.mongo.domain.DailySummary;
import com.dreamoval.aml.mongo.repositories.DailySummaryRepository;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dreamadmin on 7/24/14.
 */
@Service
public class DailySummaryService {

    @Autowired
    private DailySummaryRepository dailySummaryRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public DailySummary save(DailySummary dailySummary){
        return this.dailySummaryRepository.save(dailySummary);
    }

    public DailySummary findDailySummary(){
        DateTime beginning = new DateTime();
        beginning = beginning.withTimeAtStartOfDay();

        DateTime end = new DateTime();
        end = end.withTime(23, 59, 59, 999);

        Query query = new Query();
        query.addCriteria(Criteria.where("dateCreated").gt(beginning).lte(end));

        return mongoTemplate.findOne(query,DailySummary.class);
    }

    public List<DailySummary> findMonthlySummary(){
        DateTime beginning = new DateTime().dayOfMonth().withMinimumValue().withTimeAtStartOfDay();
        DateTime end = new DateTime().dayOfMonth().withMaximumValue().withTime(23, 59, 59, 999);
        Query query = new Query();
        query.addCriteria(Criteria.where("dateCreated").gt(beginning).lte(end));

        return mongoTemplate.find(query,DailySummary.class);
    }

    public void delete(DailySummary dailySummary){
        this.dailySummaryRepository.delete(dailySummary);
    }

    public void updateSummary(String field, int count){
        DateTime beginning = new DateTime();
        beginning = beginning.withTimeAtStartOfDay();

        DateTime end = new DateTime();
        end = end.withTime(23, 59, 59, 999);

        Query query = new Query();
        query.addCriteria(Criteria.where("dateCreated").gt(beginning).lte(end));
        Update update = new Update().inc(field,count).set("dateCreated",new DateTime());

        mongoTemplate.upsert(query,update,DailySummary.class);
    }
}
