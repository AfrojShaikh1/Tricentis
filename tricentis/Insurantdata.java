package com.tricentis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Insurantdata {
	WebDriver driver;
	Select sl;

	public Insurantdata(WebDriver d) {
		this.driver = d;

	}

// First name , last name, country ,zip code ,occupation are in one method
	public void data(String firstname, String last, String birth, String country, String zip, String occupation) {

		driver.findElement(By.name("First Name")).sendKeys(firstname);
		driver.findElement(By.name("Last Name")).sendKeys(last);
		driver.findElement(By.name("Date of Birth")).sendKeys(birth);
		// gender radio button
		WebElement gen = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]"));
		if (!gen.isSelected()) {
			gen.click();
		}
		// country
		WebElement countries = driver.findElement(By.name("Country"));
		sl = new Select(countries);
		sl.selectByVisibleText(country);
//zip code
		driver.findElement(By.name("Zip Code")).sendKeys(zip);

		WebElement occupations = driver.findElement(By.name("Occupation"));
		sl = new Select(occupations);
		sl.selectByVisibleText(occupation);
//Hobbies
		WebElement hobbies = driver
				.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]"));
		if (!hobbies.isSelected()) {
			hobbies.click();
// Next 
			driver.findElement(By.name("Next (Enter Product Data)")).click();
		}
	}

}
