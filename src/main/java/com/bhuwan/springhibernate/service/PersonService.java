package com.bhuwan.springhibernate.service;

import java.util.List;

import com.bhuwan.springhibernate.model.Person;
 
public interface PersonService {
 
    public void addPerson(Person p);
    public List<Person> listPersons();
     
}