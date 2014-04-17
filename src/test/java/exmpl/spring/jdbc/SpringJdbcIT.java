package exmpl.spring.jdbc;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import exmpl.spring.data.Greeting;

public class SpringJdbcIT {

	@Test
	public void helloWorldGreeting() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		GreetingDao greetingDao = (GreetingDao) context.getBean("greetingDao");
		Greeting helloWorld = greetingDao .findById(1);
		assertEquals("hello world!", helloWorld.getGreeting());
	}
}
