import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Normal {
	@Test
	void method1(){
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("In Method 1");
		driver.get("https://www.youtube.com/watch?v=F-vQzjYIqcU");
	}
	@Test
	void method2(){
		System.out.println("In Method 2");
	}
	@Test
	void method3(){
		System.out.println("In Method 3");
	}
	@Test
	void method4(){
		System.out.println("In Method 4");
	}
}
