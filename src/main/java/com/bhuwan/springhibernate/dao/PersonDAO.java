package com.bhuwan.springhibernate.dao;

import java.util.List;

import com.bhuwan.springhibernate.model.Person;
 
public interface PersonDAO {
 
    public void addPerson(Person p);
    public List<Person> listPersons();
}