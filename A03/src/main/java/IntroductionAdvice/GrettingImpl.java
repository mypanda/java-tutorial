package IntroductionAdvice;

import org.springframework.stereotype.Component;

@Component
public class GrettingImpl implements Gretting{

	@Override
	public void sayHello(String name) {
		System.out.println("hello" + name);
	}

}
