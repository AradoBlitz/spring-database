package exmpl.spring.jdbc;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import exmpl.spring.data.Greeting;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/Spring-Module.xml")
public class SpringJdbcIT {

	@Autowired
	private GreetingDao greetingDao;
	@Test
	public void helloWorldGreeting() throws Exception {
		
		Greeting helloWorld = greetingDao.findById(1);
		assertEquals("hello world!", helloWorld.getGreeting());
	}
}
