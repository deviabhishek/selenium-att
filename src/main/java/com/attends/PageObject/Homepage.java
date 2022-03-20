package com.attends.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.attends.base.BaseClass;

public class Homepage extends BaseClass {

	@FindBy(xpath = "(//a[normalize-space()='Login/Register'])[1]")
	public WebElement register;
	@FindBy(xpath = "//button[normalize-space()='Show Products']")
	public WebElement Products;

	@FindBy(xpath = "//a[normalize-space()='Free sample']")
	public WebElement freeSample;
	@FindBy(xpath = "//a[normalize-space()='For Me']")
	public WebElement ForMe;
	@FindBy(xpath = "//img[@class='header-logo-desktop']")
	public WebElement logo;
	@FindBy(xpath = "//img[@class='footer_logo_desktop']")
	public WebElement footerLogo;
	@FindBy(id = "btn-cookie-allow")
	private WebElement cookies;

	public WebElement getCookies() {
		return cookies;
	}

	public WebElement getFooterLogo() {
		return footerLogo;
	}

	public WebElement getProfessionals() {
		return Professionals;
	}

	public WebElement getIncontinence() {
		return incontinence;
	}

	public WebElement getAboutAttends() {
		return AboutAttends;
	}

	@FindBy(xpath = "(//a[normalize-space()='For Caregivers'])[1]")
	public WebElement Caregivers;
	@FindBy(xpath = "(//a[normalize-space()='Professionals'])[1]")
	public WebElement Professionals;
	@FindBy(xpath = "(//a[normalize-space()='INCONTINENCE Products'])[1]")
	public WebElement incontinence;
	@FindBy(xpath = "(//a[normalize-space()='About ATTENDS'])[1]")
	public WebElement AboutAttends;

	public WebElement getCaregivers() {
		return Caregivers;
	}

	public WebElement getLogo() {
		return logo;
	}

	public WebElement getForMe() {
		return ForMe;
	}

	public WebElement getFreeSample() {
		return freeSample;
	}

	public WebElement getProducts() {
		return Products;
	}

	public Homepage() {
		PageFactory.initElements(getDriver(), this);
	}

	public String actualTitle(WebDriver driver) {
		String title = driver.getTitle();
		return title;
	}

	public WebElement getRegister() {
		return register;
	}

}
