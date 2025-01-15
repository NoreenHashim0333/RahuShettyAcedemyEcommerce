package RizElectric;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RizElectric {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/client");
		Driver.manage().window().maximize();
		Driver.findElement(By.id("userEmail")).sendKeys("noreenhashimkhan@gmail.com");
		Driver.findElement(By.id("userPassword")).sendKeys("Noreen@12345");
		Driver.findElement(By.id("login")).click();
		

		 
		
		
	

}}