package com.book.plain;

import com.book.base.Person;
import com.book.base.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;

/**
 * Created by iuliana.cosmina on 1/11/15.
 * Skeleton repository - does not actually save anything to a database, just prints a log message to let
 * the developer this method was called.
 * This class is used just to prove how Spring injection works.
 */
public class PlainPersonRepository implements PersonRepository {

    private Logger logger = LoggerFactory.getLogger(PlainPersonRepository.class);

    private DataSource dataSource;

    @Override
    public int save(Person person) {
        logger.info("-> Person was saved .");
        //we are returning 1, because a real repository would return the number of records saved
        // in this case, 1 person would be saved
        return 1;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

}
