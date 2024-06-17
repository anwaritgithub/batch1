package com.hr7;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Base_hr7 {
	
	
	WebDriver driver;
	Actions ac;
	
	public void login() throws Exception {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.24hr7comit.site/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@value='login']")).click();
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\24HR7\\error.png"));
		System.out.println("login button clicked sucessfully");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Signup")).click();
		Thread.sleep(3000);
		File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("C:\\24HR7\\error1.png")); 
		
		
		Thread.sleep(3000);
		driver.navigate().back();
		 Thread.sleep(3000);
		driver.findElement(By.linkText("Careers")).click();
		Thread.sleep(3000);
		File f2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f2, new File("C:\\24HR7\\error2.png"));
		driver.navigate().back();
		Thread.sleep(3000);
		 
		driver.findElement(By.linkText("Internships")).click();
		 Thread.sleep(3000);
		 File f3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f3, new File("C:\\24HR7\\error3.png"));
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Team")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		  
		  driver.findElement(By.xpath("/html/body/section[5]/div/div[1]/a")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.linkText("JOIN US")).click();
		  Thread.sleep(3000);
		  driver.navigate().back();
		  Thread.sleep(3000);
		  driver.navigate().back();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("/html/body/section[5]/div/div[2]/a")).click();
		  Thread.sleep(3000);
          driver.findElement(By.linkText("JOIN US")).click();
          Thread.sleep(3000);
          driver.navigate().back();
          Thread.sleep(3000);
          driver.navigate().back();
          Thread.sleep(3000);
          driver.findElement(By.xpath("/html/body/section[5]/div/div[3]/a")).click();
          Thread.sleep(3000);
          driver.findElement(By.linkText("JOIN US")).click();
          driver.navigate().back();
          Thread.sleep(3000);
          driver.navigate().back();
          Thread.sleep(3000);
          driver.findElement(By.xpath("/html/body/section[5]/div/div[4]/a")).click();
          Thread.sleep(3000);
          driver.findElement(By.linkText("JOIN US")).click();
          Thread.sleep(3000);
          driver.navigate().back();
          Thread.sleep(3000);
          driver.navigate().back();
          Thread.sleep(3000);
          driver.findElement(By.xpath("/html/body/section[5]/div/div[5]/a")).click();
          Thread.sleep(3000);
          driver.findElement(By.linkText("JOIN US")).click();
          Thread.sleep(3000);
          driver.navigate().back();
          Thread.sleep(3000);
          driver.navigate().back();
          Thread.sleep(3000);
          driver.findElement(By.xpath("/html/body/section[5]/div/div[6]/a")).click();
          Thread.sleep(3000);
          driver.findElement(By.linkText("JOIN US")).click();
          Thread.sleep(3000);
          driver.navigate().back();
          Thread.sleep(3000);
          driver.navigate().back();
          Thread.sleep(3000);
	}
	public void About() throws Exception {
		
		driver.findElement(By.linkText("About")).click();
		Thread.sleep(3000);
		WebElement ab=driver.findElement(By.xpath("//h1[text()='CEO']"));
		Thread.sleep(3000);
		 ac=new Actions(driver);
		 Thread.sleep(3000);
		ac.moveToElement(ab).perform();
		Thread.sleep(3000);
		System.out.println("CEO profile viewed");
		Thread.sleep(3000);
		WebElement ab1=driver.findElement(By.xpath("//h1[text()='PRESIDENT']"));
		Thread.sleep(3000);
		ac.moveToElement(ab1).perform();
		Thread.sleep(3000);
		System.out.println("PRESIDENT profile viewed");
		Thread.sleep(3000);
		WebElement ab2=driver.findElement(By.xpath("//h1[text()='IT-OPERATIONS HEAD']"));
		Thread.sleep(3000);
		ac.moveToElement(ab2).perform();
		Thread.sleep(3000);
		System.out.println("IT-OPERATIONS HEAD profile viewed");
		Thread.sleep(3000);
		WebElement ab3=driver.findElement(By.xpath("//h1[text()='VICE PRESIDENT']"));
		Thread.sleep(3000);
		ac.moveToElement(ab3).perform();
		Thread.sleep(3000);
		System.out.println("VICE PRESIDENT profile viewed");
		Thread.sleep(3000);
		WebElement ab4=driver.findElement(By.xpath("//h1[text()='OPERATIONS HEAD & HR Admin']"));
		Thread.sleep(3000);
		ac.moveToElement(ab4).perform();
		Thread.sleep(3000);
		System.out.println("OPERATIONS HEAD & HR Admin profile viewed");
		Thread.sleep(3000);
		WebElement ab5=driver.findElement(By.xpath("//h1[text()=' Operations Lead']"));
		Thread.sleep(3000);
		ac.moveToElement(ab5).perform();
		Thread.sleep(3000);
		System.out.println("Operations Lead profile viewed");

	}
	public void Ambition() throws Exception {
		
		driver.findElement(By.linkText("Ambitions")).click();
		Thread.sleep(3000);
		System.out.println("Ambition page displayed");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Read More")).click();
		Thread.sleep(3000);
		
	}
	
	public void Service() throws Exception {
		
		driver.findElement(By.linkText("Services")).click();
		Thread.sleep(3000);
		System.out.println("Services page displayed");
	}
	public void Industries() throws Exception {
		
		driver.findElement(By.linkText("Industries")).click();
		System.out.println("Industries page displayed");
		Thread.sleep(3000);
		WebElement a=driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div/figure/img"));
		ac=new Actions(driver);
		ac.moveToElement(a).perform();
		Thread.sleep(3000);
		WebElement a1=driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/figure/img"));
		Thread.sleep(3000);
		ac.moveToElement(a1).perform();
		Thread.sleep(3000);
		WebElement a2=driver.findElement(By.xpath("/html/body/section[2]/div/div[3]/div/figure/img"));
		Thread.sleep(3000);
		ac.moveToElement(a2).perform();	
		Thread.sleep(3000);
	}
	public void Insights() throws Exception {
		
		driver.findElement(By.linkText("Insights")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("DISCOVER")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Gallery")).click();
		Thread.sleep(3000);
		WebElement b=driver.findElement(By.xpath("//h1[text()='WORKSPACE']"));
		Thread.sleep(3000);
		ac=new Actions(driver);
		ac.moveToElement(b).perform();
		Thread.sleep(3000);
		WebElement b1=driver.findElement(By.xpath("//h1[text()='EVENTS']"));
		Thread.sleep(3000);
		ac.moveToElement(b1).perform();
		Thread.sleep(3000);
		WebElement b2=driver.findElement(By.xpath("//h1[text()='DRIVES']"));
		Thread.sleep(3000);
		ac.moveToElement(b2).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("HOME")).click();
		Thread.sleep(3000);
	}
	
	public void Contact() throws Exception {
		
		driver.findElement(By.linkText("Contact us")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("user");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("user.user@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("phone")).sendKeys("1234567890");
		Thread.sleep(3000);
		driver.findElement(By.id("message")).sendKeys("hii");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(3000);
		Alert a=driver.switchTo().alert();
		
		a.accept();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(3000);
	}
	public void close() {
		
		driver.close();
	}
	public static void main(String[] args) throws Exception {
		
		Base_hr7 obj=new Base_hr7();
		obj.login();
		obj.About();
		obj.Ambition();
		obj.Service();
		obj.Industries();
		obj.Insights();
		obj.Contact();
		obj.close();
	}

}
