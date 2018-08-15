package A01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;
import pojo.Person;

public class AppTest  extends TestCase
{
  
    public void testApp01()
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
        Person p1 = (Person) context.getBean("person1");
        p1.setId(1000);
        p1.setName("panda");
        p1.setAge(10);
        
        System.out.println(p1.toString());
        
        ((AbstractApplicationContext) context).close();
    }
    public void testApp02()
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
        Person p1 = (Person) context.getBean("person2");
        System.out.println(p1.toString());
        ((AbstractApplicationContext) context).close();
    }
}
