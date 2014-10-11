package com.dreamoval.aml.mongo.domain;

import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by dreamadmin on 10/11/14.
 */
public class ITransaction {
    @Id
    private Long id;
    private String narrative;
    private String type;
    private String source;
    private String destination;
    private String flag;
    private Double amount;
    private Date date;
    private String sourceAccount;
    private String destinationAccount;
}
