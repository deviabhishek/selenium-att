package com.attends.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.attends.base.BaseClass;

public class LoginPom extends BaseClass {
	public LoginPom() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "(//div[@class='block-content'])[1]")
	private WebElement loginBlock;
	@FindBy(xpath = "(//input[@id='email'])[1]")
	private WebElement email;
	@FindBy(xpath = "//p[@class='password-wrapper']//input[@id='pass']")
	private WebElement password;
	@FindBy(xpath = "(//button[@id='send2'])[1]")
	private WebElement LoginButton;
	@FindBy(xpath = "//h1[@class='page-title']")
	private WebElement PageTitle;
	@FindBy(xpath = "//a[@id='edit-info']")
	private WebElement accountedit;

	public WebElement getPageTitle() {
		return PageTitle;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public WebElement getAccountedit() {
		return accountedit;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getLoginBlock() {
		return loginBlock;
	}

}
