package com.org.mavenautomation.SecondMavenProject;

import org.testng.annotations.Test;

public class GoogleTest {
	
	@Test
	public void googlelaunch()
	{
	
		Login a = new Login();
		a.Login("https://google.co.in");
		
	}
	

}
