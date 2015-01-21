package com.book.aop;

import com.book.base.Person;
import com.book.base.PersonRepository;
import com.book.base.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * Created by iuliana.cosmina on 1/21/15.
 */
@Service("personService")
@Transactional
public class PersonServiceImpl implements PersonService {

    private Logger logger = LoggerFactory.getLogger(PersonServiceImpl.class);

    @Autowired
    @Qualifier("personRepository")
    PersonRepository repo;

    public PersonServiceImpl() {
    }

    @Override
    public int save(Person person) {
        logger.info("-> Calling repo.save(person)");
        int result = repo.save(person);
        logger.info("-> repo.save execution completed.");
        return result;
    }
}
