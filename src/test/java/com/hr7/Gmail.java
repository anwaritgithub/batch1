package com.hr7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	
	WebDriver driver;
	public void login() throws Exception {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://mail.google.com/mail/");
		Thread.sleep(2000);
		driver.findElement(By.id("identifierId")).sendKeys("anwaruday790@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      Gmail ob=new Gmail();
      ob.login();
	}

}
