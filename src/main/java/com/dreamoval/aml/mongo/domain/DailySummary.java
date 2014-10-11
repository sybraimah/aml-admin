package com.dreamoval.aml.mongo.domain;

import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.UUID;

/**
 * Created by dreamadmin on 7/24/14.
 */
public class DailySummary {

    @Id
    private String id;
    private int transactionCount;
    private int flaggedTransactions;
    private DateTime dateCreated;
    @LastModifiedDate
    private DateTime lastModified;

    public DailySummary(){
        this.id = UUID.randomUUID().toString();
        dateCreated = new DateTime();
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    public void setTransactionCount(int transactionCount) {
        this.transactionCount = transactionCount;
    }

    public int getFlaggedTransactions() {
        return flaggedTransactions;
    }

    public void setFlaggedTransactions(int flaggedTransactions) {
        this.flaggedTransactions = flaggedTransactions;
    }


    public String getId() {
        return id;
    }

    public DateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(DateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public DateTime getLastModified() {
        return lastModified;
    }


}
