package com.org.mavenautomation.SecondMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	
	public void Login(String a)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get(a);
		driver.quit();
		
	}

}
