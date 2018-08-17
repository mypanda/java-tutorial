package statement;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import advice.Gretting;

public class GreetingTest {
	
	@Test
	public void testGretting() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
		Gretting  gretting = (Gretting) context.getBean("greetingProxy");
		gretting.sayHello("panda");
	}
}
