package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MovieTickets {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(options);
		driver.get(" https://in.bookmyshow.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[contains(text(),'Hyderabad')]")).click();
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		driver.findElement(By.xpath("//div[@class='sc-jTzLTM sc-chbbiW hPUYXB']")).click();
		driver.findElement(By.xpath("//input[@class='sc-hCaUpS cLnzvB']")).sendKeys("Sir");
		driver.findElement(By.xpath("(//span[@class='sc-jhaWeW ChCae'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(text(),'Book tickets')])[1]")).click();
		String Theatre = driver.findElement(By.xpath("//a[@class='__venue-name']")).getText();
		System.out.println("First Threatre :" +Theatre);
		driver.findElement(By.xpath("//div[@class='venue-info-text']")).click();
		String name = driver.findElement(By.xpath("//div[contains(text(),'Parking Facility')]")).getText();
		System.out.println(name);
		driver.findElement(By.xpath("//div[@class='cross-container']")).click();
		driver.findElement(By.xpath("//div[@class='showtime-pill-container _available']")).click();
		driver.findElement(By.xpath("//li[@id='pop_1']")).click();
		driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
		driver.findElement(By.xpath("//a[@class='_available']")).click();
		driver.findElement(By.xpath("(//a[@class='bar-btn _primary'])[1]")).click();
		Thread.sleep(2000);
		String Amt = driver.findElement(By.xpath("//span[@class='__amount-payable']")).getText();
		Thread.sleep(2000);
		System.out.println("Amount payable :" + Amt);
		driver.close();
	}

}
