package framehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(3000);
		//driver.switchTo().frame("login_page");//switch to frame name
		//driver.switchTo().frame(0);//switching by index
		WebElement frame1=driver.findElement(By.name("login_page"));
		Thread.sleep(3000);
		driver.switchTo().frame(frame1);
		Thread.sleep(3000);
		driver.findElement(By.name("fldLoginUserId")).sendKeys("Jisney");
		
	}

}
               