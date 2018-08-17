package advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class GrettingBeforeAndAfterAdice implements MethodBeforeAdvice,AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("After");
	}

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("Before");
	}

}
