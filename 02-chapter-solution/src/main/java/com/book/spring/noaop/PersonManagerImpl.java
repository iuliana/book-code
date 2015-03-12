package com.book.spring.noaop;

import com.book.base.Person;
import com.book.base.PersonManager;
import com.book.base.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * Created by iuliana.cosmina on 1/21/15.
 * Description: PersonManager implementation that executes a method in a transactional context,
 * transaction is handled explicitly
 */
@Component("personManager")
public class PersonManagerImpl implements PersonManager {

    @Autowired
    @Qualifier("txManager")
    PlatformTransactionManager transactionManager;

    @Autowired
    @Qualifier("personRepository")
    PersonRepository repo;

    public PersonManagerImpl() {
    }

    @Override
    public int save(Person person) {
        TransactionDefinition def = new DefaultTransactionDefinition();
        TransactionStatus status = transactionManager.getTransaction(def);

        int result = repo.save(person);

        transactionManager.commit(status);
        return result;
    }
}