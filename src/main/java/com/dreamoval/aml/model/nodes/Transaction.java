package com.dreamoval.aml.model.nodes;

import java.util.Date;
import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

/**
 * Created by dreamadmin on 10/11/14.
 */
@NodeEntity
public class Transaction {

    @GraphId
    private String id;
    private String narrative;
    private String type;
    private String source;
    private String destination;
    private String flag;
    private Double amount;
    private Date date;
    @RelatedTo(type = "Has", direction = Direction.INCOMING)
    private @Fetch
    Account sourceAccount;
    @RelatedTo(type = "Has", direction = Direction.INCOMING)
    private @Fetch
    Account destinationAccount;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the narrative
     */
    public String getNarrative() {
        return narrative;
    }

    /**
     * @param narrative the narrative to set
     */
    public void setNarrative(String narrative) {
        this.narrative = narrative;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the sourceAccount
     */
    public String getSource() {
        return source;
    }

    /**
     * @param sourceAccount the sourceAccount to set
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return the destinationAccount
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destinationAccount the destinationAccount to set
     */
    public void setDestinationAccount(String destination) {
        this.destination = destination;
    }

    /**
     * @return the flag
     */
    public String getFlag() {
        return flag;
    }

    /**
     * @param flag the flag to set
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }

    /**
     * @return the amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the sourceAccount
     */
    public Account getSourceAccount() {
        return sourceAccount;
    }

    /**
     * @param sourceAccount the sourceAccount to set
     */
    public void setSourceAccount(Account sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    /**
     * @return the destinationAccount
     */
    public Account getDestinationAccount() {
        return destinationAccount;
    }

    /**
     * @param destinationAccount the destinationAccount to set
     */
    public void setDestinationAccount(Account destinationAccount) {
        this.destinationAccount = destinationAccount;
    }
}
