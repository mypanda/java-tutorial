package A02;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

public class MyResource implements ApplicationContextAware{
	
	private ApplicationContext ctx;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.ctx = applicationContext;
	}
	
	
	public void resource() throws IOException{
		Resource res = (Resource) ctx.getResource("classpath:config.txt");
		System.out.println(res.getFilename());
		System.out.println(res.contentLength());
	}
}
