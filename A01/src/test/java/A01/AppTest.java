package A01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;
import pojo.Person;
import service.AnimalService;

public class AppTest  extends TestCase
{
  
    public void testApp01()
    {
    	// 1.加载bean.xml
    	ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
    	// 2.获取某一个对象
        Person p1 = (Person) context.getBean("person1");
        // 3.对象的方法
        p1.setId(1000);
        p1.setName("panda");
        p1.setAge(10);
        
        System.out.println(p1.toString());
        
        // 4.关闭context实例
        ((AbstractApplicationContext) context).close();
    }
    public void testApp02()
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
        Person p1 = (Person) context.getBean("person2");
        System.out.println(p1.toString());
        ((AbstractApplicationContext) context).close();
    }
    
    public void testApp03()
    {
    	// set注入
    	ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
    	AnimalService a1 = (AnimalService) context.getBean("animalService");
    	a1.say("panda");
        ((AbstractApplicationContext) context).close();
    }
}
