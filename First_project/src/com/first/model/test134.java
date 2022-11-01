package com.first.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test134 {

	//public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
	            "H:\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//String beforelogin=driver.getTitle();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
		//driver.findElement(By.xpath("//*[@class='orangehrm-header-container']/button")).click();
		//driver.findElement(By.xpath("//*[@class='oxd-grid-item oxd-grid-item--gutters']"));
		//WebElement dd=driver.findElement(By.xpath("//*[@class='oxd-select-wrapper']/div/div[2]/i"));
		//dd.click();
		//Select s=new Select(dd);
		//s.selectByVisibleText("ESS");
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Performance")).click();
		//driver.findElement(By.partialLinkText("Per")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='oxd-select-text-input']")).click();
		//driver.findElement(By.partialLinkText("Add")).click();
		//driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
//		String afterlogin=driver.getTitle();
//		if(beforelogin.equals(afterlogin)) {
//			driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
//			System.out.println("the title is same so i logout");
//		}else {
//			System.out.print("the title of the page is not same");
//		}

		//driver.close();
		
	}
}
