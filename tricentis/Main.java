package com.tricentis;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Main {
	WebDriver driver;
	Type t;
	EnterVehicle e;
	Insurantdata id;
	Productdata pd;
	Details d1;

	@Test(priority = 1)
	public void Automobile() {
		// vehicle data for Automobile
		t.Automobile();
		e.make("BMW");
		e.EnginePerformance("100");
		e.date("07/05/2010");
		e.seats("3");
		e.fuel("Petrol");
		e.price("100000");
		e.number("12345");
		e.milege("100");
		t.next();
		// insurance data
		id.data("Afroj", "Shaikh", "02/03/1999", "India", "431001", "Farmer");

		// product data
		pd.startdate("09/23/2024");
		pd.insurance();
		pd.merit();
		pd.damage();
		pd.check();
		pd.courtesy();
		pd.next();
		

	}

	@Test(priority = 2)
	public void Truck() {
		// vehicle data for Truck
		t.Truck();
		e.make("Skoda");
		e.EnginePerformance("34");
		e.date("04/06/2024");
		e.seats("4");
		e.fuel("Diesel");
		e.payload("100");
		e.totalweight("200");
		e.price("10000");
		e.milege("100");
		t.next();
		// insurance data for Truck
		id.data("Afroj", "Shaikh", "02/03/1999", "India", "431001", "Farmer");

		// product data for Truck
		pd.startdate("09/23/2024");
		pd.insurance();
		pd.damage();
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[1]")).click();
		pd.next();
	}

	@Test(priority = 3)
	public void Motorcycle() {
		// vehicle data for Motorcycle
		t.Motorcycle();
		e.make("Honda");
		e.model();
		e.cylinder("125");
		e.EnginePerformance("10");
		e.date("05/08/2024");
		e.motorseats("2");
		e.price("25000");
		e.milege("100");
		t.next();
		// insurance data for Motorcycle
		id.data("Afroj", "Shaikh", "02/03/1999", "India", "431001", "Farmer");
		//Product data for Motorcycle
		pd.startdate("09/23/2024");
		pd.insurance();
		pd.damage();
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[1]")).click();
		pd.next();
	}

	@Test(priority = 4)
	public void Camper() {
		// vehicle data for Camper
		t.Camper();
		e.make("Nissan");
		e.EnginePerformance("10");
		e.date("05/08/2024");
		e.seats("3");
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[5]/p/label[1]")).click();
		e.fuel("Diesel");
		e.payload("400");
		e.totalweight("450");
		e.price("35000");
		e.milege("140");
		t.next();
		// insurance data for Camper
		id.data("Afroj", "Shaikh", "02/03/1999", "India", "431001", "Farmer");
		// product data for Camper
		pd.startdate("09/23/2024");
		pd.insurance();
		pd.damage();
		driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[4]/p/label[1]")).click();
		pd.next();
	}

	@AfterMethod(alwaysRun = true)
	public void aftermethod() throws Exception {
		// Insurance plan select
		driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"nextsendquote\"]")).click();
		//Details to register and send information
		d1.detail("asd@gmail.com", "458695656", "afroj", "Shaikh123");
		// Success message appear
		d1.success();
		driver.findElement(By.xpath("/html/body/div[4]/div[7]/div")).click();

	}

	@BeforeTest(alwaysRun = true)
	public void before() {
		driver = new ChromeDriver();
		driver.get("https://sampleapp.tricentis.com/101/app.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		t = new Type(driver);
		e = new EnterVehicle(driver);
		id = new Insurantdata(driver);
		pd = new Productdata(driver);
		d1 = new Details(driver);
	}

	@AfterTest(alwaysRun = true)
	public void after() {
		driver.quit();
	}
}
