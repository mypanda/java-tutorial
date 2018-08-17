package IntroductionAdvice;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import advice.Gretting;

public class IntroductionAdviceTest {
	
	
	@Test
	public void testApp() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
		GrettingImpl  grettingImpl = (GrettingImpl) context.getBean("greetingProxy");
		grettingImpl.sayHello("panda");
		
		Love love = (Love)grettingImpl;
		love.display("panda");
	}
}
