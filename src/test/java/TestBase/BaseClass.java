package TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public static WebDriver driver;
	public Properties p;
	@BeforeClass
	public void setup() throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//confi.properties");
		p=new Properties();
		p.load(file);
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
		
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	public String randomAlfaNumeric() {
		String alfaNum=RandomStringUtils.randomAlphanumeric(10);
		return alfaNum;
	}
	
	public String randomNumber() {
		String number=RandomStringUtils.randomNumeric(10);
		return number;
	}
	
	public String randomString() {
		String alfa=RandomStringUtils.randomAlphabetic(5);
		return alfa;
	}
	
public String captureScreen(String tname) throws IOException {
		
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\"+ tname + "_" + timeStamp + ".png";
		File targetFile= new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
		
		return targetFilePath;
	}
	

}
