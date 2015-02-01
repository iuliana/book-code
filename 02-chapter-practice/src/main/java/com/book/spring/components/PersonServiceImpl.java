package com.book.spring.components;

import com.book.base.Person;
import com.book.base.PersonRepository;
import com.book.base.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by iuliana.cosmina on 1/10/15.
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {

    private Logger logger = LoggerFactory.getLogger(PersonServiceImpl.class);
    PersonRepository repo;

    @Autowired(required = true)
    public PersonServiceImpl(PersonRepository personRepository) {
        this.repo = personRepository;
    }

    @Override
    public int save(Person person) {
        logger.info("-> @Service save(person) is called.");
        return repo.save(person);
    }
}
