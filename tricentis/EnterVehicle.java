package com.tricentis;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EnterVehicle {
	WebDriver driver;
	Select sl;

	public EnterVehicle(WebDriver d) {
		this.driver = d;

	}
	

	public void make(String make) {
		WebElement m = driver.findElement(By.cssSelector("select[id=\"make\"]"));
		sl = new Select(m);
		sl.selectByVisibleText(make);
	}

	public void EnginePerformance(String EP) {
		driver.findElement(By.name("[kW]")).sendKeys(EP);

	}

	public void date(String Date) {
		driver.findElement(By.name("Date of Manufacture")).sendKeys(Date);
	}

	public void seats(String seats) {
		WebElement s = driver.findElement(By.name("Number of Seats"));
		sl = new Select(s);
		sl.selectByVisibleText(seats);
	}
	public void motorseats(String seat) {
		WebElement ms = driver.findElement(By.name("Number of Seats Motorcycle"));
		sl = new Select(ms);
		sl.selectByVisibleText(seat);
	}

	public void fuel(String ft) {
		WebElement f = driver.findElement(By.name("Fuel Type"));
		sl = new Select(f);
		sl.selectByValue(ft);

	}

	public void price(String listprice) {
		driver.findElement(By.name("List Price")).sendKeys(listprice);
		;
	}

	public void number(String num) {
		driver.findElement(By.name("License Plate Number")).sendKeys(num);

	}

	public void milege(String milege) {
		driver.findElement(By.name("Annual Mileage")).sendKeys(milege);

	}
	public void payload(String pay) {
		driver.findElement(By.xpath("//*[@id=\"payload\"]")).sendKeys(pay);
	}
	public void totalweight(String weight ) {
		driver.findElement(By.name("Total Weight")).sendKeys(weight);
	}
	public void cylinder(String ccm) {
		driver.findElement(By.name("Cylinder Capacity")).sendKeys(ccm);
	}
	public void model() {
		WebElement m=driver.findElement(By.name("Model"));
	sl=new Select(m);
	sl.selectByIndex(3);
	}
}
