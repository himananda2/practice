package selenium;

import java.util.LinkedHashSet;
import java.util.LinkedList;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MultipleWindows {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\himananda\\selenium\\chromedriver_win32\\chromedriver.exe");

		RemoteWebDriver driver = new ChromeDriver();

		driver.get("https://www.naukri.com/");

		@SuppressWarnings("unchecked")
		LinkedHashSet<String> abc = (LinkedHashSet<String>) driver.getWindowHandles();

		java.util.Iterator<String> itr = abc.iterator();

		LinkedList<String> list = new LinkedList<String>();

		list.addAll(abc);

		driver.switchTo().window(list.get(list.size() - 4));

		driver.close();
		driver.quit();

	}

}
