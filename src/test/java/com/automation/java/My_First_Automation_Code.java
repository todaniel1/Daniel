package com.automation.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class My_First_Automation_Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver1 = new ChromeDriver();//Ctrl+shift+O
		driver1.manage().window().maximize();
		driver1.get("https://www.yahoo.com");
		driver1.quit();
		
		WebDriver driver2 = new FirefoxDriver();//Ctrl+shift+O
		driver2.manage().window().maximize();
		driver2.get("https://www.flipkart.com");
		driver2.quit();
		
		WebDriver driver3 = new ChromeDriver();//Ctrl+shift+O
		driver3.manage().window().maximize();
		driver3.get("https://www.facebook.com");
		driver3.quit();
		
		
	}

}
