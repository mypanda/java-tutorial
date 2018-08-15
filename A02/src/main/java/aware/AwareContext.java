package aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AwareContext implements ApplicationContextAware{

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("aware context 函数获取bean" + applicationContext.getBean("awareContext").hashCode());
	}

}
