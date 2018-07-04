import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium Doc\\Software\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
//driver.get("https://www.google.co.in/webhp?ei=mmjfWNH5BMHzvATvmJGABQ&ved=0EKkuCAYoAQ");
	//
		driver.get("file:///C:/Users/mani/Desktop/Sample.html");
		
		String filepath = "F:\\Office files\\Selenium\\Test.xlsx";
		FileInputStream fs = new FileInputStream(filepath);
		XSSFWorkbook wb= new XSSFWorkbook(fs);
		XSSFSheet sh = wb.getSheetAt(0);
		XSSFRow row = sh.getRow(1);
		XSSFCell cell = row.getCell(1);
		String value= sh.getRow(1).getCell(2).getStringCellValue();
		String value2= cell.getStringCellValue();
		System.out.println(value+value2);
		//String data = sh.getCell(0,0).getContents();
		driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys(cell.getStringCellValue());
System.out.println("Hello World,,,,1");
	}

}
