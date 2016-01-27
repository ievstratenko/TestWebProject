package spring.person.dao;

import org.springframework.data.repository.CrudRepository;

import spring.person.model.Person;

public interface PersonDao extends CrudRepository<Person, Integer> {
}
