package com.DemoBlaze.com.TestScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.DemoBlaze.com.GenericLib.BaseTest;

import PomPages.HomePage;

public class TestScript1  extends BaseTest{
	
	@Test
	public void addingProductsIntoCart() throws InterruptedException
	{
		//Adding first product into cart
		HomePage page = new HomePage(driver);
		
		
		//Adding first product into cart
		page.addingFirstProductsIntoCart(driver);
		
		//Adding Second product into cart
		page.addingSecondProductsIntoCart(driver);
		
		//Adding third product into cart
		page.addingThirdProductsIntoCart(driver);
		
		//clicking on cart
		page.clickOnCart();
		
		//verify the price
		page.verifyingTheTotalPrice(driver, "1470");
		
		//remove product from cart
		page.removeFromCart();
		
		//verifying the total prive
		page.verifyingTheTotalPrice(driver, "1150");
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
