package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","/Users/rashelkhan/Desktop/Talent Tech/WebDriver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		Select slt = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));//Select is a class of selenium
		slt.selectByVisibleText("Baby");// i can use value & index too instead of test bt index & value is changable thats y test is depedable
		List<WebElement>option = slt.getOptions();//List is a interface if java util,WebElement is a interface of selenium i have to import both for counting the options, i use get options method from select class
		System.out.println(option.size());//how many options r there to see the console we use size 
		for(int i = 0;i<option.size();i++) {
			System.out.println(option.get(i).getText());//get(variable i) & gettext for showing the value

		}	
	}

}
