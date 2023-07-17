package com.stepdefinition;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.helper.Filereadermanager;
import com.helper.Pageobjectmanager;
import com.runner.runnerclass;

import Greens.cucuproj2.TBasefunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class sttepdefinition extends  TBasefunctions{
	
	public static WebDriver driver= runnerclass.driver;
	Pageobjectmanager pom = new Pageobjectmanager(driver);
	
	@Given("launch the application")
	public void launchTheApplication() throws IOException {
		
		String siteaddress = Filereadermanager.getInstance().getcrinstance().siteaddress();
		gourl(siteaddress);
	   
	}
	@When("user enters the {string} in the username field")
	public void userEntersTheInTheUsernameField(String string) {
	    pom.getlp().getUser().sendKeys(string);
	}
	@When("user enters the {string} in the password field and clicks the login button")
	public void userEntersTheInThePasswordFieldAndClicksTheLoginButton(String string) {
		pom.getlp().getPwd().sendKeys(string);
		pom.getlp().getLogin().click();
	}
	
	@Given("user clicks on menu")
	public void userClicksOnMenu() {
	   pom.getlp().getMenu().click();
	}
	@When("User clicks on about")
	public void userClicksOnAbout() {
	   pom.getlp().getAbout().click();
	}
	@When("User validates the sauce labs page")
	public void userValidatesTheSauceLabsPage() {
		String title = driver.getTitle();
		System.out.println("Yes it is saucelabs"+title);
		driver.navigate().back();
	}
	@Then("User validates the Products page")
	public void userValidatesTheProductsPage() {
		String title2 = driver.getTitle();
		System.out.println("Yes it is products page"+title2);
	}
	@Given("User selects the product with highest price")
	public void user_selects_the_product_with_highest_price() {
		List<WebElement> price = pom.getlp().getPrice();
		List<WebElement> addtocart = pom.getlp().getAddtocartele();
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
	}

	@When("user goes to cart page")
	public void user_goes_to_cart_page() {
	   pom.getlp().getClickaddtocart().click();
	}

	@When("user verifies the cart page")
	public void user_verifies_the_cart_page() {
		WebElement element = pom.getlp().getYourcart();
		if(element.getText().equals("Your Cart") )
		{
			System.out.println("Your cart page validated");
		}

		driver.findElement(By.id("checkout")).click();
	}

	@Then("User checkout and validates the page")
	public void user_checkout_and_validates_the_page() {
		WebElement element1 = pom.getlp().getYourinfo();
		if(element1.getText().equals("Checkout: Your Information") )
		{
			System.out.println("Checkout: Your Information validated");
		}}

	@Given("User enters {string} in Firstname  and {string} in last name")
	public void user_enters_in_firstname_and_in_last_name(String string1, String string2) {
	    pom.getlp().getFirstname().sendKeys(string1);
	    pom.getlp().getLastname().sendKeys(string2);
	    
	}

	@When("user enters {string} as pincode")
	public void user_enters_as_pincode(String string) {
		 pom.getlp().getPostalcode().sendKeys(string);
	}

	@When("user clicks continue button")
	public void user_clicks_continue_button() {
	    pom.getlp().getContbutton().click();
	}

	@Then("validates the checkout page and total price")
	public void validates_the_checkout_page_and_total_price() {
		WebElement element2 = pom.getlp().getOverview();


		if(element2.getText().equals("Checkout: Overview") )
		{
			System.out.println("Checkout: Overview validated");
		}
		String text = pom.getlp().getTotal().getText();
		System.out.println("The total is"+text+"and it is in $xx.yy format" );
	}
	
}