package com.amazon.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.amazon.resources.commonActions;

public class AmazonMobilePage extends commonActions {
	commonActions co = new commonActions();
	public AmazonMobilePage() {
	PageFactory.initElements(driver, this );
	}
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	private WebElement signIn;
	@FindBy(xpath="//input[@type='email']")
	private WebElement loginuser;
	@FindBy(xpath="//input[@id='continue']")
	private WebElement mailclick;
	@FindBy(xpath="//input[@type='password']")
	private WebElement loginpass;
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement passclick;
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchbox;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement mobilesearch;
	@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	private WebElement selectmobile;
	@FindBy(xpath="//input[@id='buy-now-button']")
	private WebElement selectbuynow;
	
	
	
	public WebElement getSignIn() {
		return signIn;
	}
	public WebElement getLoginuser() {
		return loginuser;
	}
	public WebElement getMailclick() {
		return mailclick;
	}
	public WebElement getLoginpass() {
		return loginpass;
	}
	public WebElement getPassclick() {
		return passclick;
	}
	public WebElement getSearchbox() {
		return searchbox;
	}
	public WebElement getMobilesearch() {
		return mobilesearch;
	}
	public WebElement getSelectmobile() {
		return selectmobile;
	}
	public WebElement getSelectbuynow() {
		return selectbuynow;
	}

	 
	
}
	