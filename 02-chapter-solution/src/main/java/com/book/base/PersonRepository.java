package com.book.base;

import com.book.base.Person;

import javax.sql.DataSource;

/**
 * Created by iuliana.cosmina on 1/11/15.
 * Description: Interface needed to implement repositories
 */
public interface PersonRepository {

    int save(Person person);

    void setDataSource(DataSource dataSource);
}
