package A02;

import org.junit.Test;
import org.junit.Before;

import java.io.IOException;

import org.junit.After;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Book;
import pojo.People;

public class TestApp {
	
	private ApplicationContext context;
	
	@Before
	public void Before() {
		context = new ClassPathXmlApplicationContext("classpath:bean.xml");
	}
	
	@Test
	public void testApp() {
        People p1 = (People) context.getBean("people");
        Book b1 = (Book) context.getBean("book");
        
        
        p1.setName("panda");
        b1.setName("小王子");
        
        System.out.println(p1.toString());
        System.out.println(b1.toString());
       
	}
	@Test
	public void TestResource() {
		MyResource  resource = (MyResource) context.getBean("myResource");
		try {
			resource.resource();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void TestAware() {
		// 普通
		context.getBean("awareContext");
		// 修改name
		context.getBean("awareContextName");
	}
	
	@After
	public void After() {
		((AbstractApplicationContext) context).close();
	}
}
