package com.personal.seleniumtests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
String actual = driver.getTitle();
Assert.assertEquals(actual,"Practice Page");
driver.close();


	}

}
