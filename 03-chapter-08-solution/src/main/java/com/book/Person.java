package com.book;

/**
 * Created by iuliana.cosmina on 3/18/15.
 */
public class Person {
    public Long id;
    public String firstName;
    public String lastName;

    public Person(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
