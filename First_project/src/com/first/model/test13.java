package com.first.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test13 {

	//public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
	            "H:\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		String beforelogin=driver.getTitle();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		String afterlogin=driver.getTitle();
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[5]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-form-row'][2]/div/div[2]/div/div/input")).sendKeys("nrs");		
		//driver.findElement(By.xpath("//*[@class='oxd-grid-item oxd-grid-item--gutters']//div//div//input")).sendKeys("srn");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
//		driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li[3]/a")).click();
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("srinath");
//		driver.findElement(By.xpath("//*[@name='middleName']")).sendKeys("nath");
//		driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("sri");
//		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[6]/a")).click();
//		Thread.sleep(5000);
		

		//driver.close();
		
	}
}
