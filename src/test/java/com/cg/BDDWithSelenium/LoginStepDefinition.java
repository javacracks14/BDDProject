//package com.cg.BDDWithSelenium;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//
//public class LoginStepDefinition 
//{
//	WebDriver driver;
//	
//	@Given("User is on Login Page")
//	public void user_is_on_Login_Page() 
//	{
//	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
//	    driver = new ChromeDriver();
//	    driver.get("https://www.saucedemo.com/");
//	}
//	@When("User Enters USERNAME and PASSWORD")
//	public void user_Enters_USERNAME_and_PASSWORD() 
//	{
//	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
//	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
//	    driver.findElement(By.id("login-button")).click();
//	}
//
//	@Then("User Redirects to Product Page")
//	public void user_Redirects_to_Product_Page() 
//	{
//		String s = driver.findElement(By.className("title")).getText();
//		Assert.assertEquals("PRODUCTS", s);
//		driver.close();
//	}
//}

//package com.cg.BDDWithSelenium;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//
//public class LoginStepDefinition 
//{
//	WebDriver driver;
//	
//	@Given("User is on Login Page")
//	public void user_is_on_Login_Page() 
//	{
//	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
//	    driver = new ChromeDriver();
//	    driver.get("https://www.saucedemo.com/");
//	}
//	@When("User Enters USERNAME and PASSWORD")
//	public void user_Enters_USERNAME_and_PASSWORD() 
//	{
//	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
//	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
//	    driver.findElement(By.id("login-button")).click();
//	}
//
//	@Then("User Redirects to Product Page")
//	public void user_Redirects_to_Product_Page() 
//	{
//		String s = driver.findElement(By.className("title")).getText();
//		Assert.assertEquals("PRODUCTS", s);
//	}
//
//	@Given("User is on Product Page")
//	public void user_is_on_Product_Page() 
//	{
//	    
//	}
//
//	@When("User Clicks on Add to Cart Button")
//	public void user_Clicks_on_Add_to_Cart_Button() throws InterruptedException 
//	{
//	    driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
//	    //Thread.sleep(5000);
//	}
//
//	@Then("Product is Added")
//	public void product_is_Added() {
//		String data = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).getText();
//	    Assert.assertEquals("REMOVE", data);
//	}
//
//	@When("User Open the Cart To Check Product")
//	public void user_Open_the_Cart_To_Check_Product() 
//	{
//	    driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
//	}
//
//	@Then("Product is Displayed")
//	public void product_is_Displayed() 
//	{
//	    String output = driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();
//	    Assert.assertEquals("Sauce Labs Backpack", output);
//	    driver.close();
//	}
//}


package com.cg.BDDWithSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition 
{
	WebDriver driver;
	
	
}
