package springaop;

public class LogHandler {
	public void LogBefore() {
		System.out.println(" log before method!");
	}
	public void LogAfter() {
		System.out.println("log after method!");
	}
}
