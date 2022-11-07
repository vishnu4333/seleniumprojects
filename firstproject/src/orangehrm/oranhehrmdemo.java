package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class oranhehrmdemo {
	
	public static String vishnu = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C://Users//hp//Downloads//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get(vishnu);
		Thread.sleep(3000);
		String beforeLogin=driver.getTitle();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(3000);
		String afterlogin=driver.getTitle();
		if(beforeLogin.equals(afterlogin)) {
			driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
					Thread.sleep(3000);	
					driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
					System.out.println("Title matches");
		}else {
			System.out.println("title mismatched");
		}
	
		}
	}
