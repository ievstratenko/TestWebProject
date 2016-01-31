package springtest;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.*;

import spring.person.model.Person;
import spring.person.service.PersonService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/testContext.xml")
@Rollback(value = false)
public class PersonTest extends AbstractTransactionalJUnit4SpringContextTests {
	@Resource
	PersonService service;

	@Test
	public void dummyTest() {
		System.out.println(service.findAll());
		service.save(new Person("Sara"));
	}
}
