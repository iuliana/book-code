package com.book.beans;

/**
 * Created by iuliana.cosmina on 1/10/15.
 */

import com.book.base.Person;
import com.book.base.PersonRepository;
import com.book.base.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by iuliana.cosmina on 1/10/15.
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {
    PersonRepository repo;

    @Autowired(required = true)
    public PersonServiceImpl(PersonRepository personRepository) {
        this.repo = personRepository;
    }

    @Override
    public int save(Person person) {
        System.out.println("... @Service save(person) is called ...");
        return repo.save(person);
    }
}
