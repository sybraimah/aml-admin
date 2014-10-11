package com.dreamoval.aml.mongo.services;

import com.dreamoval.aml.mongo.domain.ITransaction;
import com.dreamoval.aml.mongo.repositories.ITransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by dreamadmin on 10/11/14.
 */
@Component
public class ITransactionService {

    @Autowired
    ITransactionRepository repository;

    public ITransaction save(ITransaction transaction){
        return this.repository.save(transaction);
    }
    public void delete(ITransaction transaction){
        this.repository.delete(transaction);
    }

    public ITransaction findById(Long id){
        return this.repository.findById(id);
    }
    public List<ITransaction> findAll(){
        return this.repository.findAll();
    }
}
