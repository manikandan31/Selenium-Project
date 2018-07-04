import java.io.IOException;
import java.util.List;

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
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.gherkin.model.IGherkinFormatterModel;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ProperProgram {

	//public static void main(String[] args)
	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("F:\\Selenium\\reports.html");
	ExtentReports report;
	ExtentTest logger;
	WebDriver driver;
		
	@BeforeSuite
	  public void resumeHeadline() throws Exception {
		
		report= new ExtentReports();
		report.attachReporter(htmlReporter);
		logger= report.createTest("Driver Initialize", "Driver Initialization");
			 	
		System.setProperty("webdriver.chrome.driver","F:/selenium-2.53.0/chromedriver.exe");
		System.out.println("Hello World,,,,");
		
		ChromeOptions options = new ChromeOptions();		
		options.addArguments("--disable-extensions");
		driver  = new ChromeDriver(options);
	}
	
//		WebDriver driver= new FirefoxDriver();
		//FirefoxDriver driver = new FirefoxDriver();
	@Test(priority=1)
	public void naukriLogin() {
		String baseurl= "https://login.naukri.com/nLogin/Login.php";
		driver.navigate().to(baseurl);
		driver.navigate().to("https://www.youtube.com");
		driver.manage().window().maximize();
		logger=report.createTest("Naukri Login", "To login into Naukri Application");
        logger.log(Status.INFO, "Naukri Web page is opened successfully");
		driver.findElement(By.id("emailTxt")).sendKeys("manikandan.iiet@gmail.com");
		driver.findElement(By.id("pwd1")).sendKeys("687736");
		//driver.findElement(By.xpath("//*[@id='sbtLog']")).click();
		//new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sbtLog']")));
		
		int ok_size=driver.findElements(By.xpath("//*[@id='sbtLog']")).size();
        driver.findElements(By.xpath("//*[@id='sbtLog']")).get(ok_size-1).click();
        
//        driver.findElement(By.xpath("//input[@id='sbtLog']")).submit();
		logger.log(Status.PASS, "Logged in to Naukri successfully");
	}
		//Actions actions = new Actions(driver);
        //WebElement availableAction = driver.findElement(By.xpath("//div[@class = 'row clear-after']"));
        //actions.moveToElement(availableAction).moveToElement(driver.findElement(By.xpath("//*[@id='sbtLog']"))).click().build().perform();
        
		//driver.findElement(By.xpath("//div[@class = 'row clear-after'] //input[@id= 'sbtLog' And class ='logSBtn']")).click();
	
	@Test (priority=2)
	public void headlineUpdate() throws Exception  {    
		
		logger=report.createTest("Resume Headline", "To Upload Resume Headline in Naukri");
	driver.findElement(By.xpath("//*[@id='colL']/div[2]/div[1]/a[1]")).click();
        
        for(int i=0; i<1; i++)
        	//for(int i=0; i<100; i++)
        {
        driver.findElement(By.xpath("//*[@id='rPanel']/div/div[1]/div[2]/h1/a")).click();
        
        
        String resumeHeadline1="Working as Senior Testing Engineer with 3 years and 2 months of experience in Manual ans Automation Testing specialisation in Insurance domain.Having well versed knowledge in testing process. Sound knowledge in Selenium automation testing.";
        String resumeHeadline2="Working as Senior Testing Engineer with 3 years and 2 months of experience in Manual ans Automation Testing specialisation in Insurance domain.Having well versed knowledge in testing process. Sound knowledge in Selenium automation testing";
        String resumeHeadline = driver.findElement(By.xpath("//*[@id='title']")).getText().toString();
        Boolean match= driver.findElement(By.xpath("//*[@id='title']")).getText().equals(resumeHeadline1); 
        Boolean match1 ,match2= false;
//        match1= (resumeHeadline==resumeHeadline1)?true:false;
////        match2= resumeHeadline==resumeHeadline2;
//        System.out.printf("Resume Headline   :%n%s%n%s %n %b       %b   %b",resumeHeadline,resumeHeadline1,match1,match2,match );
        driver.findElement(By.xpath("//*[@id='title']")).clear();
        
       
        if(match)
            	driver.findElement(By.xpath("//*[@id='title']")).sendKeys(resumeHeadline2);
        else
        	  driver.findElement(By.xpath("//*[@id='title']")).sendKeys(resumeHeadline1);
        Thread.sleep(2000);
        
        match2=driver.findElement(By.xpath("//*[@id='rPanel']/div/div/form/div[5]/div/button/div/b")).isEnabled();
        driver.findElement(By.xpath("//*[@id='rPanel']/div/div/form/div[5]/div/button/div/b")).submit();
        //logger.pass("Resume headline updated Successfully").addScreenCaptureFromPath(imagePath)
        
        logger.log(Status.PASS, "Resume Headline is Updated Successfully");
//        report.removeTest(logger);
                }
	}
	
	@Test(priority=3)
	public void resumeUpload(){
		logger=report.createTest("ResumeUpload", "Test case to upload esume in Naukri");
		List<WebElement> elems = driver.findElements(By.xpath("//*[@id='leftNav_updateProfile']/ul/li/a[4]"));
		if (elems.size() == 0) {
		        System.out.println("My element was not found on the page");
		} else
		        System.out.println("My element was found on the page");
		
		driver.findElement(By.xpath("//*[@id='leftNav_updateProfile']/ul/li/a[4]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/h2[8]/a")).click();
		driver.findElement(By.xpath("//*[@id='attachCV']")).sendKeys("C:\\Users\\mani\\Desktop\\Resume_Manikandan_3 Years.docx");
		driver.findElement(By.xpath("//*[@id='editForm']/div[7]/button/div/b")).click();
		
		String message;
		message=driver.findElement(By.xpath("//*[@id='confirmMessage']")).getText();
		Assert.assertEquals(message, "Your naukri profile has been updated with your uploaded resume");
		
		System.out.println("Resume Upload ETs cas is run sucsessfully");
		logger.log(Status.PASS, "Resume uploaded successfully");
	
		
		
	}
	@AfterSuite
	public void reportOpen(){
		System.out.println("Program Executed Successfully");
		report.flush();
	    //driver.get("F:\\Selenium\\reports.html");
	}
}
