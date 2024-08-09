package com.stepFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepFile {
	WebDriver driver;
	static PageObject locator;
	@When("the user enter valid user and password")
	public void the_user_enter_valid_user_and_password(){
		driver=new ChromeDriver();
		locator=new PageObject(driver);
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		locator.enterUsername();

		locator.enterPass();
		
	}

	@When("click the login button")
	public void click_the_login_button() {
		locator.loginButton();
	}

	@Then("user should select one product and add the product to the cart")
	public void user_should_select_one_product_and_add_the_product_to_the_cart() {
		locator.addCart();
		
	}

	@Then("click the cart icon")
	public void click_the_cart_icon() {
		locator.cartLink();
	}

	@Then("click the checkout button")
	public void click_the_checkout_button() {
		locator.checkOut();
	}

	@Then("the user enter firstname,lastname and pincode")
	public void the_user_enter_firstname_lastname_and_pincode() {
		locator.enterFirstname();
		locator.enterLastname();
		locator.enterPincode();
	}

	@Then("click the finish button")
	public void click_the_finish_button() throws InterruptedException {
		locator.Continue();
		Thread.sleep(2000);
		locator.finishButton();
	}

	@When("the user in response page click the open menu")
	public void the_user_in_response_page_click_the_open_menu() {
		locator.openMenu();
	}

	@Then("click the logout button")
	public void click_the_logout_button() throws InterruptedException {
		
		Thread.sleep(2000);
		locator.logoutClick();
	}
}
