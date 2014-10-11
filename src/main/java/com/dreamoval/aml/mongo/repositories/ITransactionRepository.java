package com.dreamoval.aml.mongo.repositories;

import com.dreamoval.aml.mongo.domain.ITransaction;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by dreamadmin on 10/11/14.
 */
public interface ITransactionRepository extends MongoRepository<ITransaction,Long> {

    public ITransaction findById(Long id);
}
