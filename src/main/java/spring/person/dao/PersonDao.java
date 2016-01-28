package spring.person.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.person.model.Person;

public interface PersonDao extends JpaRepository<Person, Integer> {
}
