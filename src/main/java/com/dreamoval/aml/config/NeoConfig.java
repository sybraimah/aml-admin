package com.dreamoval.aml.config;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.rest.SpringRestGraphDatabase;
//import org.springframework.data.neo4j.rest.SpringRestGraphDatabase;

/**
 * Created by dreamadmin on 10/10/14.
 */

//@Configuration
//@EnableNeo4jRepositories(basePackages = "com.dreamoval.aml.model")
public class NeoConfig{

//    public NeoConfig(){
//        setBasePackage("com.dreamoval.aml.model");
//    }
//
//    @Bean
//    public SpringRestGraphDatabase graphDatabaseService(){
//        return new SpringRestGraphDatabase("http://192.168.0.235:7474/db/data/");
//
////        return new GraphDatabaseFactory().newEmbeddedDatabase("http://192.168.0.235:7474/db/data/");
//    }


}
