package spring.person.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.person.dao.PersonDao;
import spring.person.model.Person;

@Service
public class PersonService {
	@Resource
	PersonDao personDao;

	public Person findOne(Integer person) {
		return personDao.findOne(person);
	}

	public List<Person> findAll() {
		return personDao.findAll();
	}

	@Transactional
	public void delete(Integer person) {
		personDao.delete(person);
	}

	@Transactional
	public void delete(Person person) {
		personDao.delete(person);
	}

	@Transactional
	public Person save(Person person) {
		return personDao.save(person);
	}
}
