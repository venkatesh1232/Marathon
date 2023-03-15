package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[@class='selected']")).click();
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[@class='selected']")).click();
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//td[contains(text(),'16')]")).click();
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		Thread.sleep(2000);
		String Bus = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("No Of Buses Available :" +Bus);
		driver.findElement(By.xpath("(//label[@class='cbox-label'])[6]")).click();
		String name = driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]")).getText();
		System.out.println("Bus name :" +name);
		String Title = driver.getTitle();
		System.out.println("Final Page :" +Title);
		driver.close();
}
}