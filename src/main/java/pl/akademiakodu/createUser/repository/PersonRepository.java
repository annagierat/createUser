package pl.akademiakodu.createUser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.akademiakodu.createUser.model.Person;

@Repository
public interface PersonRepository extends JpaRepository <Person, Long> {
    public Person findByFirstNameAndLastName(String firstName, String lastName);

}
