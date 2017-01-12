package com.book.spring.components;


import com.book.base.Person;
import com.book.base.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * Created by iuliana.cosmina on 1/11/15.
 * Skeleton repository - does not actually save anything to a database.
 * This class is used just to prove how Spring injection works.
 */
@Repository("personRepository")
public class FakePersonRepository implements PersonRepository {

    private Logger logger = LoggerFactory.getLogger(FakePersonRepository.class);

    @Autowired
    private DataSource dataSource;

    @Override
    public int save(Person person) {
        logger.info("-> Person was saved.");
        //we are returning 1, because a real repository would return the number of records saved
        // in this case, 1 person would be saved
        return 1;
    }

    //we will not be using this setter- @Autowired will take care of injecting the dependency,
    // this implementation is kept here because the interface PersonRepository requires it
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
