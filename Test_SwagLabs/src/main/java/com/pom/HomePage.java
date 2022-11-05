package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

import net.bytebuddy.dynamic.scaffold.MethodGraph.Linked;

public class HomePage extends BaseClass{

	@FindBy(xpath="//button[@id='react-burger-menu-btn']") private WebElement menuBtn;
	@FindBy(xpath="//a[@class='shopping_cart_link']") private WebElement cartBtn;
	@FindBy(xpath="//select[@class='product_sort_container']") private WebElement filterBtn;
	@FindBy(xpath="//img[@alt='Sauce Labs Backpack']") private WebElement bagpackImg;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement addBagToCart;
	@FindBy(xpath="//img[@alt='Sauce Labs Bolt T-Shirt']") private WebElement blackTShirtImg;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement addBlackTShirtToCart;

	@FindBy(xpath="//a[text()='Twitter']") private WebElement twitterBtn;
	@FindBy(xpath="//a[text()='Facebook']") private WebElement facebookBtn;
	@FindBy(xpath="//a[text()='LinkedIn']") private WebElement LinkedinBtn;
	
	
	public HomePage()
	{
		//super();
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMenuBtn()
	{
		menuBtn.click();
	}
	public void clickOnCartBtn()
	{
		cartBtn.click();
	}
	public void clickOnFilterBtn()
	{
		filterBtn.click();
	}
	public void clickOnBagpackImg()
	{
		bagpackImg.click();
	}
	public void clickOnBagToCart()
	{
		addBagToCart.click();
	}
	public void clickOnBlackTShirtImg()
	{
		blackTShirtImg.click();
	}
	public void clickOnBlackTShirtToCart()
	{
		addBlackTShirtToCart.click();
	}
	public void clickOnTwitter()
	{
		twitterBtn.click();
	}
	public void clickOnFacebook()
	{
		facebookBtn.click();
	}
	public void clickOnLinkedin()
	{
		LinkedinBtn.click();
	}
	
}
