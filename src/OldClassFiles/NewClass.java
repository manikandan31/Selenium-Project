package OldClassFiles;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewClass {
	
	@Test
	// public static void main(String[] args)throws InterruptedException, IOException {
		
	public static void test() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Software\\chromedriver.exe");
		System.out.println("Hello World,,,,1");
		
		//ChromeOptions options = new ChromeOptions();		
		//options.addArguments("--disable-extensions");
		WebDriver driver  = new ChromeDriver();
		
//		WebDriver driver= new FirefoxDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		
		String baseurl= "https://login.naukri.com/nLogin/Login.php";
		//driver.get("https://login.naukri.com/nLogin/Login.php");
		//driver.navigate().to("https://google.com");
		driver.navigate().to(baseurl);
		driver.manage().window().maximize();

		driver.findElement(By.id("emailTxt")).sendKeys("manikandan.iiet@gmail.com");
		driver.findElement(By.id("pwd1")).sendKeys("687736");
		//driver.findElement(By.xpath("//*[@id='sbtLog']")).click();
		//new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sbtLog']")));
		
		int ok_size=driver.findElements(By.xpath("//*[@id='sbtLog']")).size();
        driver.findElements(By.xpath("//*[@id='sbtLog']")).get(ok_size-1).click();
		
		//Actions actions = new Actions(driver);
        //WebElement availableAction = driver.findElement(By.xpath("//div[@class = 'row clear-after']"));
        //actions.moveToElement(availableAction).moveToElement(driver.findElement(By.xpath("//*[@id='sbtLog']"))).click().build().perform();
        
		//driver.findElement(By.xpath("//div[@class = 'row clear-after'] //input[@id= 'sbtLog' And class ='logSBtn']")).click();
		
        driver.findElement(By.xpath("//*[@id='colL']/div[2]/div[1]/a[1]")).click();
        driver.findElement(By.xpath("//*[@id='rPanel']/div/div[1]/div[2]/h1/a")).click();
        
        
        String resumeHeadline1="Senior Testing Engineer with 2 years and 4 months of experience in Manual Testing specialisation in Insurance domain.Having sound knowledge on requirement analysis, writing test cases, executing test cases, logging defects and, preparing test report";
        String resumeHeadline2="Senior Testing Engineer with 2 years and 4 months of experience in Manual Testing specialisation in Insurance domain.Having sound knowledge on requirement analysis, writing test cases, executing test cases, logging defects and, preparing test report.";
        String resumeHeadline = driver.findElement(By.xpath("//*[@id='title']")).getText();
        //Boolean match1 ,match2= false;
       // match1= (resumeHeadline==resumeHeadline1)?true:false;
//       // match2= resumeHeadline==resumeHeadline2;
        System.out.printf("Resume Headline   :%s \n",resumeHeadline);
        
        driver.findElement(By.xpath("//*[@id='title']")).clear();
        Thread.sleep(2000);
        
        if(resumeHeadline.equals(resumeHeadline1))
        {
        	System.out.println("string matches with headline 1");
        	driver.findElement(By.xpath("//*[@id='title']")).sendKeys(resumeHeadline2);
        	    	
        }
        else if(resumeHeadline.equals(resumeHeadline2))
        {
        	System.out.println("string matches with headline 2");
        	driver.findElement(By.xpath("//*[@id='title']")).sendKeys(resumeHeadline1);
        	
        }
        else
        {
        	System.out.println("string doesnot matches available data");
        	driver.findElement(By.xpath("//*[@id='title']")).sendKeys(resumeHeadline1);
        	
        }
        
        //driver.findElement(By.xpath("//button[@value='Save Changes']")).submit();
        
        //*****************Profile summary checking   ************************
        String profileSummary1="Senior Test Engineer with 2 year of work experience in Manual Testing and specialization in Commercial Insurance domain. Well versed with Software Testing Life Cycle (STLC) and software testing methodology. Very good experience in Functional Testing, Regression Testing, Smoke Testing, Adhoc Testing and Service Testing. Completed  B.Tech with first class currently residing in Mumbai";
        String profileSummary2="Senior Test Engineer with 2 year of work experience in Manual Testing and specialization in Commercial Insurance domain. Well versed with Software Testing Life Cycle (STLC) and software testing methodology. Very good experience in Functional Testing, Regression Testing, Smoke Testing, Adhoc Testing and Service Testing. Completed  B.Tech with first class currently residing in Mumbai...";
        
        //String profileSummary= driver.findElement(By.)
        
        
        //match2=driver.findElement(By.xpath("//*[@id='rPanel']/div/div/form/div[5]/div/button/div/b")).isEnabled();
        //driver.findElement(By.xpath("//*[@id='rPanel']/div/div/form/div[5]/div/button/div/b")).click();
      //
//        String profileSummary1="Senior Test Engineer with 2 year of work experience in Manual Testing and specialization in Commercial Insurance domain. Well versed with Software Testing Life Cycle (STLC) and software testing methodology. Very good experience in Functional Testing, Regression Testing, Smoke Testing, Adhoc Testing and Service Testing. Completed  B.Tech with first class currently residing in Mumbai";
//        String profileSummary2="Senior Test Engineer with 2 year of work experience in Manual Testing and specialization in Commercial Insurance domain. Well versed with Software Testing Life Cycle (STLC) and software testing methodology. Very good experience in Functional Testing, Regression Testing, Smoke Testing, Adhoc Testing and Service Testing. Completed  B.Tech with first class currently residing in Mumbai.";
//        String profileSummary = driver.findElement(By.xpath("//*[@id='summary']")).getAttribute("value");
//        System.out.printf("Resume Headline   :%s",resumeHeadline);
//        driver.findElement(By.xpath("//*[@id='summary']")).clear();
//        if(profileSummary==profileSummary1)
//            	driver.findElement(By.xpath("//*[@id='summary']")).sendKeys(profileSummary2);
//        else
//        	    driver.findElement(By.xpath("//*[@id='summary']")).sendKeys(profileSummary1);
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id='editForm']/div[2]/div/button/div/b")).click();	
//               
//        
        
        
	}

}