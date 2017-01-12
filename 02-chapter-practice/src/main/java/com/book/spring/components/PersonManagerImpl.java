package com.book.spring.components;

import com.book.base.Person;
import com.book.base.PersonManager;
import com.book.base.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by iuliana.cosmina on 1/10/15.
 */
@Component("personManager")
public class PersonManagerImpl implements PersonManager {

    private Logger logger = LoggerFactory.getLogger(PersonManagerImpl.class);
    PersonRepository repo;

    @Autowired(required = true)
    public PersonManagerImpl(PersonRepository personRepository) {
        this.repo = personRepository;
    }

    @Override
    public int save(Person person) {
        logger.info("-> @Manager save(person) is called.");
        return repo.save(person);
    }
}
