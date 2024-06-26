package com.EasySeleniumFrameworkQuestions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGQuestions {
	
	public WebDriver driver;

		@BeforeMethod
		public void naviageToWebsite() {
			
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialsninja.com/demo/");
		}
		
		@Test(priority = 1)
		public void question1() {
			String actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			String expectedTitle = "Your Store";
			Assert.assertTrue(expectedTitle.contains(actualTitle));
			
		}
		
		
		@Test(priority = 2)
		public void question2and3() {
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();
			driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		}
		

		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
		
	

}
