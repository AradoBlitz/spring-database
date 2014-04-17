package exmpl.spring.data;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import exmpl.spring.data.repository.GreetingRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringDataConfiguration.class)
public class SpringDataIT {

	@Autowired GreetingRepository repository;
	
	@Test
	public void getHelloWorld() throws Exception {
		
		
		Greeting newGreeting = new Greeting();
		newGreeting.setGreeting("Hello World!");
		repository.save(newGreeting);
		Greeting helloWorld = repository.findOne(1);
		assertNotNull(helloWorld);
		assertEquals("Hello World!", helloWorld.getGreeting());
	}
}
