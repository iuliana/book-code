package com.book.beans;


import com.book.base.Person;
import com.book.base.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * Created by iuliana.cosmina on 1/11/15.
 * Skeleton repository - does not actually save anything to a database.
 * This class is used just to prove how Spring injection works.
 */
@Repository("personRepository")
public class JdbcPersonRepository implements PersonRepository {

    @Autowired
    private DataSource dataSource;

    @Override
    public int save(Person person){
        System.out.println("... @Repository: saving person ...");
        return 0;
    }

    //we will not be using this setter, this implementation is kept here because the interface PersonRepository requires it
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
