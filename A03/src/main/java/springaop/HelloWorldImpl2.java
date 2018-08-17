package springaop;

public class HelloWorldImpl2 implements HelloWorld {

	@Override
	public void welcome() {
		System.out.println("HelloWorldImpl2 welcome method");
	}

	@Override
	public void doPrint() {
		System.out.println("HelloWorldImpl2 doprint method");
	}

}
