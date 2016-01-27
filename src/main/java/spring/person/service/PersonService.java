package spring.person.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import spring.person.dao.PersonDao;
import spring.person.model.Person;

@Service
public class PersonService {
	@Resource
	PersonDao personDao;

	public Person findOne(Integer arg0) {
		return personDao.findOne(arg0);
	}
}
