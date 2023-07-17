package com.stepdefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.ListIterator;
import java.util.Optional;
import java.util.Comparator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Greens.cucuproj2.TBasefunctions;
import junit.framework.Assert;

public class dotry extends TBasefunctions {

	
	public static void main(String[] args) throws InterruptedException {
		browserlauncher("chrome");
		gourl("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("about_sidebar_link")).click();
		String title = driver.getTitle();
		System.out.println("Yes it is saucelabs"+title);
		driver.navigate().back();
		String title2 = driver.getTitle();
		System.out.println("Yes it is products page"+title2);
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
		List<WebElement> addtocart = driver.findElements(By.xpath("//button[text()='Add to cart']"));
		double highestprice=0;
		
		
		
WebElement cartbutton = null;
for(int i=0;i<price.size();i++)
		{
		String text = price.get(i).getText();  
		String pr=text.split("\\$")[1];
		double thisprice = Double.parseDouble(pr); 
		if(thisprice>highestprice)
		{
		highestprice=thisprice;
		cartbutton=addtocart.get(i);
		}
		
		
		}	
		

	cartbutton.click();
driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
WebElement element = driver.findElement(By.xpath("//span[text()='Your Cart']"));
if(element.getText().equals("Your Cart") )
{
	System.out.println("Your cart page validated");
}

driver.findElement(By.id("checkout")).click();


WebElement element1 = driver.findElement(By.xpath("//span[text()='Checkout: Your Information']"));
if(element1.getText().equals("Checkout: Your Information") )
{
	System.out.println("Checkout: Your Information validated");
}
driver.findElement(By.id("first-name")).sendKeys("vishnu");
driver.findElement(By.id("last-name")).sendKeys("priya");
driver.findElement(By.id("postal-code")).sendKeys("624007");
driver.findElement(By.id("continue")).click();

WebElement element2 = driver.findElement(By.xpath("//span[text()='Checkout: Overview']"));


if(element2.getText().equals("Checkout: Overview") )
{
	System.out.println("Checkout: Overview validated");
}
String text = driver.findElement(By.xpath("//div[@class='summary_info_label summary_total_label']")).getText();
System.out.println("The total is"+text+"and it is in $xx.yy format" );

	}

}
