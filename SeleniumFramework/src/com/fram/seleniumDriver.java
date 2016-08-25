package com.fram;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumDriver {
	WebDriver driver;
	
	public WebDriver LoadDriver(String browsertype)
	{
		if(browsertype.equalsIgnoreCase("Firefox")){
		driver=new FirefoxDriver();//create the object of firefox
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		return driver;
	}
		

		if(browsertype.equalsIgnoreCase("Chrome")){
		driver=new FirefoxDriver();//create the object of firefox
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		return driver;
	}

		if(browsertype.equalsIgnoreCase("InternetExplorer")){
		driver=new FirefoxDriver();//create the object of firefox
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		return driver;
	}
		return driver;
		
	}

}
		
	
