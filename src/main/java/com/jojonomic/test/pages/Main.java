package com.jojonomic.test.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jojonomic.test.driver.DriverSingleton;

public class Main {
	
	private WebDriver driver;
	
	public Main() {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"global-header\"]/div/header/div[2]/div/nav/ul/li[4]/a")
	private WebElement location;
	
	@FindBy(xpath="//*[@id=\"homeautosuggestoYUOtBixsQQ\"]/input")
	private WebElement searchbox;
	
	@FindBy(xpath="//*[@id=\"search\"]/div/form/div/div[2]/div/button/svg")
	private WebElement icon;
	
	
	public void clickLocationus() {
		delay(1);
		location.click();
	}
	
	public void searchbox() {
		delay(1);
		searchbox.sendKeys("Sydney 2000");
	}
	
	public void searchicon() {
		icon.click();
	}
	
	@FindBy(xpath="//*[@id=\"global-header\"]/div/header/div[2]/div/nav/ul/li[4]/a")
	private WebElement location2;
	
	@FindBy(xpath="//*[@id=\"homeautosuggestoYUOtBixsQQ\"]/input")
	private WebElement searchbox2;
	
	@FindBy(xpath="//*[@id=\"search\"]/div/form/div/div[2]/div/button/svg")
	private WebElement icon2;
	
	@FindBy(xpath="//*[@id=\"locatorListView\"]/div/div[1]/div[1]/a")
	private WebElement locationfind;
	
	
	public void searchbox2() {
		delay(1);
		searchbox.sendKeys("Sydney Domestic Airport 2020");
	}
	
	static void delay(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void mcville() {
		// TODO Auto-generated method stub
	}
	
}
