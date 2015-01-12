package com.book.base;

import org.joda.time.DateTime;

import java.util.Date;

/**
 * Created by iuliana.cosmina on 1/11/15.
 */
public class Person {
    
    public String firstName;
    
    public String lastName;
    
    private Date dateOfBirth;

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public Person(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = DateTime.parse(dateOfBirth).toDate();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
