package com.tricentis;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Details {
	WebDriver driver;
	

	public Details(WebDriver d) {
		this.driver = d;

	}
	public void detail(String email,String phone,String user,String pass) {
		driver.findElement(By.name("E-Mail")).sendKeys(email);
		driver.findElement(By.name("Phone")).sendKeys(phone);
		driver.findElement(By.name("Username")).sendKeys(user);
		driver.findElement(By.name("Password")).sendKeys(pass);
		driver.findElement(By.name("Confirm Password")).sendKeys(pass);
driver.findElement(By.name("Send E-Mail")).click();
	}
	
	public void success() {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/h2"))).getText());
	}
}
