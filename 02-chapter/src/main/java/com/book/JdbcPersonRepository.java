package com.book;


import com.book.base.Person;
import com.book.base.PersonRepository;

import javax.sql.DataSource;

/**
 * Created by iuliana.cosmina on 1/11/15.
 * Skeleton repository - does not actually save anything to a database.
 * This class is used just to prove how Spring injection works.
 */

public class JdbcPersonRepository implements PersonRepository {

    private DataSource dataSource;

    @Override
    public int save(Person person){
        System.out.println("... Person was saved ...");
        return 0;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
