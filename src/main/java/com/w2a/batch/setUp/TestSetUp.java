package com.w2a.batch.setUp;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.w2a.batch.TestUtils.ExcelReader;

public class TestSetUp {
	
	public WebDriver driver;
	public Properties configPropert;
	public Properties ORProperties;
	
	public ExcelReader excel=new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\testData\\simple.xlsx");
	


}
