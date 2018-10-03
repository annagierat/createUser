package pl.akademiakodu.createUser.service;

import pl.akademiakodu.createUser.model.Person;

import java.util.List;

public interface PersonService {

    Person createPerson (Person person);
    void deletePerson (Long id);
    List<Person> getAllPersons();

    Person findByFirstNameAndLastName(String firstName, String lastName);
}
