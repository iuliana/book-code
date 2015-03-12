package com.book.spring.aop;

import com.book.base.Person;
import com.book.base.PersonManager;
import com.book.base.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by iuliana.cosmina on 1/21/15.
 * Description: PersonManager implementation that executes a method in a transactional context,
 * transaction is handled by the Spring IoC container
 */
@Component("personManager")
@Transactional
public class PersonManagerImpl implements PersonManager {

    @Autowired
    @Qualifier("personRepository")
    PersonRepository repo;

    public PersonManagerImpl() {
    }

    @Override
    public int save(Person person) {
        return repo.save(person);
    }
}