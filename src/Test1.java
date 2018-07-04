import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("In Method 1");
		driver.get("https://www.youtube.com/watch?v=F-vQzjYIqcU");
	}
	
	void method2(){
		System.out.println("In Method 2");
	}
	
	void method3(){
		System.out.println("In Method 3");
	}
	
	void method4(){
		System.out.println("In Method 4");
	}
}
