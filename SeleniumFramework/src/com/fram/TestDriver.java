package com.fram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestDriver{

	public static void main(String args[])
	{
		EnvironmentSetting.loadproperties();
		EnvironmentSetting es=new EnvironmentSetting();
		seleniumDriver sd=new seleniumDriver();
		WebDriver wd=sd.LoadDriver(es.getBrowser());
		ObjectRepository n=new ObjectRepository();
		n.googlesearchxpath();
		wd.findElement(By.xpath("//input[@id='bb']")).sendKeys("gfggfg");
		
		//jatin git hub
		
	}
}