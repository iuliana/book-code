package com.book.spring.annotations;


import com.book.basics.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * Created by iuliana.cosmina on 1/11/15.
 * Skeleton repository - does not actually save anything to a database.
 * This class is used just to prove how Spring injection works.
 */
@Repository
public class JdbcPersonRepository implements PersonRepository {

    @Autowired
    private DataSource dataSource;

    @Override
    public int save(Person person){
        return 0;
    }
    
}
