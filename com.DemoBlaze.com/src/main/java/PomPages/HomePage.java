package PomPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class HomePage extends BaseClass {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[text()='Home ']")
	private WebElement homeLink;

	public WebElement getHomeLink() {
		return homeLink;
	}

	public WebElement getSamsungAddTocart() {
		return samsungAddTocart;
	}

	public WebElement getIphoneAddTocart() {
		return iphoneAddTocart;
	}

	public WebElement getSonyAddTocart() {
		return sonyAddTocart;
	}

	@FindBy(xpath = "//a[text()='Samsung galaxy s6']")
	private WebElement samsungGalaxy;

	@FindBy(xpath = "//h2[text()='Samsung galaxy s6']/ancestor::div[@id='tbodyid']/descendant::a[text()='Add to cart']")
	private WebElement samsungAddTocart;

	@FindBy(xpath = "//a[text()='Iphone 6 32gb']")
	private WebElement iphone32gb;

	@FindBy(xpath = "//h2[text()='Iphone 6 32gb']/ancestor::div[@id='tbodyid']/descendant::a[text()='Add to cart']")
	private WebElement iphoneAddTocart;

	@FindBy(xpath = "//a[text()='Sony xperia z5']")
	private WebElement sonyXperia;

	@FindBy(xpath = "//h2[text()='Sony xperia z5']/ancestor::div[@id='tbodyid']/descendant::a[text()='Add to cart']")
	private WebElement sonyAddTocart;

	@FindBy(xpath = "//h3[@id='totalp']")
	private WebElement totalPrice;

	@FindBy(xpath = "//td[text()='Sony xperia z5']/ancestor::tr[@class='success']/descendant::a")
	private WebElement removeIstProduct;

	@FindBy(xpath = "//a[text()='Cart']")
	private WebElement cartLink;

	public WebElement getSamsungGalaxy() {
		return samsungGalaxy;
	}

	public WebElement getIphone32gb() {
		return iphone32gb;
	}

	public WebElement getSonyXperia() {
		return sonyXperia;
	}

	public void addingFirstProductsIntoCart(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		samsungGalaxy.click();
		samsungAddTocart.click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		homeLink.click();
	}

	public void addingSecondProductsIntoCart(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		iphone32gb.click();
		iphoneAddTocart.click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		homeLink.click();
	}

	public void addingThirdProductsIntoCart(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		sonyXperia.click();
		sonyAddTocart.click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		homeLink.click();
	}

	public void clickOnCart() {
		cartLink.click();
	}

	public void verifyingTheTotalPrice(WebDriver driver, String expectedTotalPrice) throws InterruptedException {

		Thread.sleep(4000);

		String ActualtotalPrice = totalPrice.getText();
		
		
		
		
		
		// Perform the verification
		if (ActualtotalPrice.equals(expectedTotalPrice)) {
			System.out.println("Total price is correct.");
		} else {
			System.out.println(
					"Total price is incorrect. Expected: " + expectedTotalPrice + ", Actual: " + ActualtotalPrice);
		}
	}
	
	
	public String getUpdatedPrice()
	{
		 return totalPrice.getText();
	}

	

	public WebElement getRemoveIstProduct() {
		return removeIstProduct;
	}

	public WebElement getCartLink() {
		return cartLink;
	}

	public void removeFromCart() {

		cartLink.click();
		removeIstProduct.click();
	}
}
