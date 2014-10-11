package com.dreamoval.aml.config;

import com.mongodb.Mongo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by dreamadmin on 10/11/14.
 */
@Configuration
@EnableMongoRepositories
@ComponentScan(basePackages = "com.dreamoval.aml.mongo")
public class MongoConfiguration extends AbstractMongoConfiguration {

    @Override
    protected String getDatabaseName() {
        return "smpp-client";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new Mongo();
    }
}
