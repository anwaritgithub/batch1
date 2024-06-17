package autoit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_file {
	
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\Anwar\\OneDrive\\Documents\\code.exe");
		
	}

}
