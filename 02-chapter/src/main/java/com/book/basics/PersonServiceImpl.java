package com.book.basics;

/**
 * Created by iuliana.cosmina on 1/10/15.
 */

/**
 * Created by iuliana.cosmina on 1/10/15.
 */
public class PersonServiceImpl implements PersonService {
    PersonRepository repo;

    public PersonServiceImpl(PersonRepository repo) {
        this.repo = repo;
    }

    @Override
    public int save(Person person) {
        System.out.println("... Person was saved ...");
        return 0;
    }
}
