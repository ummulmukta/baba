package com.pagetitle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://disneyworld.disney.go.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("Walt Disney World Resort")) {
			System.out.println("Passed");
			}
		
		else {
			System.out.println("Fail");
		}
	}

}
