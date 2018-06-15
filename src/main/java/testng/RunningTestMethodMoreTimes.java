package testng;

import org.testng.annotations.Test;

public class RunningTestMethodMoreTimes {

	int c = 0;

	@Test(invocationCount = 10)
	public void test1() {
		System.out.println("test1 - " + c);
	}

}
