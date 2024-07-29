package com.tricentis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Productdata {
	WebDriver driver;
	Select sl;

	public Productdata(WebDriver d) {
		this.driver = d;
	}
	public void startdate(String date) {
		driver.findElement(By.name("Start Date")).sendKeys(date);
		
	}
	public void insurance() {
		//Insurance Sum
		WebElement s= driver.findElement(By.name("Insurance Sum"));
		Select is=new Select(s);
		is.selectByIndex(2);
	
		
	
		
		
		
	
	}
	public void merit() {
		//Merit Rating
		WebElement m=driver.findElement(By.name("Merit Rating"));
		Select merit=new Select(m);
		merit.selectByIndex(3);
	}
	public void damage() {
		WebElement d=driver.findElement(By.name("Damage Insurance"));
		Select damage=new Select(d);
		damage.selectByVisibleText("Full Coverage");
	}
	public void check() {
		WebElement check=driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]"));
		if(!check.isSelected()) {
		      check.click();
		}
		
	}
	
	public void courtesy() {
		//Courtesy car
		WebElement cc=driver.findElement(By.name("Courtesy Car"));
		Select courtesy=new Select(cc);
		courtesy.selectByVisibleText("No");
		
	
	}
	public void next() {
		// Next
		driver.findElement(By.name("Next (Select Price Option)")).click();
	}
	
	

}
