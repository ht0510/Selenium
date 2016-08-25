package com.fram;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class EnvironmentSetting {
	
	static Properties p=new Properties();
	public static void loadproperties() throws IOException {
 
		InputStream is=p.getClass().getClassLoader().getSystemResourceAsStream("config.txt");
		p.load(is);
		System.out.println(p.get("Browser"));
	}
	public String getBrowser(){
		return p.get("Browser").toString();
		
	}
	public static void main(String [] args) throws IOException
	{
		EnvironmentSetting.loadproperties();
		
	}
	
	
	}

