package com.dreamoval.aml.model.nodes;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

import java.util.Date;
import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.RelatedTo;

/**
 * Created by dreamadmin on 10/10/14.
 */
@NodeEntity
public class Account {

    @GraphId
    private String id;
    private String accountNumber;
    private Double balance;
    private Date dateOpened;
    private String accountType;
    private String status;
    @RelatedTo(type = "Owns", direction = Direction.INCOMING)
    private @Fetch
    Customer customer;
    @RelatedTo(type = "Holds", direction = Direction.INCOMING)
    private @Fetch
    Institution institution;

    public String getId() {
        return id;
    }

    public String getNumber() {
        return accountNumber;
    }

    public void setNumber(String number) {
        this.accountNumber = number;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Date getOpened() {
        return dateOpened;
    }

    public void setOpened(Date opened) {
        this.dateOpened = opened;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the institution
     */
    public Institution getInstitution() {
        return institution;
    }

    /**
     * @param institution the institution to set
     */
    public void setInstitution(Institution institution) {
        this.institution = institution;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Date getDateOpened() {
        return dateOpened;
    }

    public void setDateOpened(Date dateOpened) {
        this.dateOpened = dateOpened;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
