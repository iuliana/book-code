package com.book.spring.xml;

import com.book.basics.Person;

import javax.sql.DataSource;

/**
 * Created by iuliana.cosmina on 1/11/15.
 */
public interface PersonRepository {

    int save(Person person);
    
    void setDataSource(DataSource dataSource);
}
