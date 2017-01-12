package com.book.spring.noaop;

import com.book.base.Person;
import com.book.base.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
/**
 * Created by iuliana.cosmina on 1/21/15.
 * Description: This is a real repository. Provided with a working datasource will actually
 * save a person record when save method is called.
 */
@Repository("personRepository")
public class JdbcPersonRepository implements PersonRepository {

    @Autowired
    private DataSource dataSource;

    @Override
    public int save(Person person) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String sql = "insert into person (firstname, lastname, date_of_birth) values (?,?,?)";
        //return the number of inserted rows
        return jdbcTemplate.update(sql, person.getFirstName(),
                person.getLastName(), person.getDateOfBirth()
        );
    }

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}