package com.tricentis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Type {
WebDriver driver;
public Type(WebDriver d) {
	this.driver=d;
}
public void Automobile() {
	driver.findElement(By.name("Navigation Automobile")).click();
}
public void Truck() {
	driver.findElement(By.name("Navigation Truck")).click();
}public void Motorcycle() {
	driver.findElement(By.name("Navigation Motorcycle")).click();
}
public void Camper() {
	driver.findElement(By.name("Navigation Camper")).click();
}
public void next() {
	driver.findElement(By.name("Next (Enter Insurant Data)")).click();
}
}
