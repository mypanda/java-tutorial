package aroundAdvice;

import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;

import advice.Gretting;
import advice.GrettingImpl;

public class GreetingTest {
	
	@Test
	public void testHello() {
		System.out.println("Hello");
	}
	
	@Test
	public void testGretting() {
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(new GrettingImpl());
		proxyFactory.addAdvice(new GrettingAroundAdvice());
		
		Gretting gretting = (Gretting) proxyFactory.getProxy();
		gretting.sayHello("panda");
	}
}
