package com.hr7;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Out_look {
	
	WebDriver driver;
	
	public void login() throws Exception {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://outlook.live.com/mail/0/");
	 	
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		
		String parent=driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();
		Iterator<String>I1=s.iterator();
		while(I1.hasNext()) {
			String child_window=I1.next();


			if(!parent.equals(child_window))
			{
			driver.switchTo().window(child_window);
			driver.findElement(By.id("i0116")).sendKeys("Anwar9515@outlook.com");
			driver.findElement(By.id("idSIButton9")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("passwd")).sendKeys("Anwar231@");
			
			driver.findElement(By.id("idSIButton9")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='No']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='New mail']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@aria-label='To']")).sendKeys("pydi.dhanunjay@gmail.com");
			Thread.sleep(5000);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		
			driver.findElement(By.id("")).sendKeys("hiii");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Send']")).click();
			}
			//driver.findElement(By.name("loginfmt")).sendKeys("pydi.dhanunjay@gmail.com");
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       Out_look ob=new Out_look();
       ob.login();
	}

}
//pydi.dhanunjay@gmail.com

