package springaop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
	
	
	
	
	@Test
	public void testAop() {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean-aop.xml");
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorldImpl");
		HelloWorld helloWorld2 = (HelloWorld) context.getBean("helloWorldImpl2");
		
		helloWorld.welcome();
		System.out.println();
		helloWorld.doPrint();
		
		
		
		
		
		System.out.println();
		helloWorld2.welcome();
		System.out.println();
		helloWorld2.doPrint();
		
		
		
		
		
		
		
		
	}
}
