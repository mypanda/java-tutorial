package springaop;

public class HelloWorldImpl implements HelloWorld {

	@Override
	public void welcome() {
		System.out.println("HelloWorldImpl welcome method");
	}

	@Override
	public void doPrint() {
		System.out.println("HelloWorldImpl doprint method");
	}

}
