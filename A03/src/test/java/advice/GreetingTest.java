package advice;

import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;

public class GreetingTest {
	
	@Test
	public void TestGretting() {
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(new GrettingImpl());
		proxyFactory.addAdvice(new GrettingBeforeAndAfterAdice());
		
		Gretting gretting = (Gretting) proxyFactory.getProxy();
		gretting.sayHello("panda");
	}
}
