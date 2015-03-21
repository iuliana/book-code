package com.book;

import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by iuliana.cosmina on 3/18/15.
 */
public class Person {
    @Column(nullable = false)
    @NotEmpty
    public String firstName;

    @Column(nullable = false)
    @NotEmpty
    public String lastName;

    @Column
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;

    public Person(String firstName, String lastName, String dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = DateTime.parse(dob).toDate();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}
