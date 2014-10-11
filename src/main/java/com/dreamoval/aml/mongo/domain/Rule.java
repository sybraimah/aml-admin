package com.dreamoval.aml.mongo.domain;

import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by dreamadmin on 10/11/14.
 */

public class Rule {
    @Id
    private String id;
    private String query;
    private Date dateCreated;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
