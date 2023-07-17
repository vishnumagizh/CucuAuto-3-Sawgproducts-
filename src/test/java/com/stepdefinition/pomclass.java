package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomclass {

	public static WebDriver driver;
	
	@FindBy(id = "user-name")private WebElement user;
	
	@FindBy(id = "password")private WebElement pwd;
	
	@FindBy(id = "login-button")private WebElement login;
	
	@FindBy(id="react-burger-menu-btn")private WebElement menu;
	
     @FindBy(id = "about_sidebar_link")private WebElement about;
	
	@FindBy(xpath = "//div[@class='inventory_item_price']")private List<WebElement> price;
	
	@FindBy(xpath = "//button[text()='Add to cart']")private List<WebElement> addtocartele;
	
@FindBy(xpath = "//a[@class='shopping_cart_link']")private WebElement clickaddtocart;
	
	@FindBy(xpath = "//span[text()='Your Cart']")private WebElement yourcart;
	
	@FindBy(xpath = "//span[text()='Checkout: Your Information']")private WebElement yourinfo;
	
	@FindBy(id="first-name")private WebElement firstname;
	

	@FindBy(id = "last-name")private WebElement lastname;
	
	@FindBy(id = "postal-code")private WebElement postalcode;
	
	@FindBy(id = "continue")private WebElement contbutton;
	
	
@FindBy(xpath = "//span[text()='Checkout: Overview']")private WebElement overview;
	
	@FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")private WebElement total;
	
	
	
	
	
    
    
    public pomclass(WebDriver driver) {
    	 this.driver=driver;
		PageFactory.initElements(driver, this);
	}
//Getters







	public static WebDriver getDriver() {
		return driver;
	}







	public WebElement getUser() {
		return user;
	}







	public WebElement getPwd() {
		return pwd;
	}







	public WebElement getLogin() {
		return login;
	}







	public WebElement getMenu() {
		return menu;
	}







	public WebElement getAbout() {
		return about;
	}







	public List<WebElement> getPrice() {
		return price;
	}







	public List<WebElement> getAddtocartele() {
		return addtocartele;
	}







	public WebElement getClickaddtocart() {
		return clickaddtocart;
	}







	public WebElement getYourcart() {
		return yourcart;
	}







	public WebElement getYourinfo() {
		return yourinfo;
	}







	public WebElement getFirstname() {
		return firstname;
	}







	public WebElement getLastname() {
		return lastname;
	}







	public WebElement getPostalcode() {
		return postalcode;
	}







	public WebElement getContbutton() {
		return contbutton;
	}







	public WebElement getOverview() {
		return overview;
	}







	public WebElement getTotal() {
		return total;
	}




	   
	   
	
}
