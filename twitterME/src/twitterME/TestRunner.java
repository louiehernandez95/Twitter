package twitterME;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class TestRunner {
	public void test() {
		Result result = JUnitCore.runClasses(Tester.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println(result.wasSuccessful());
	}
}
