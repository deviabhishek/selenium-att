package com.attends.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.attends.base.BaseClass;

public class RegisterPom extends BaseClass {
	public RegisterPom() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "(//span[@class='base'])[1]")
	private WebElement heading;
	@FindBy(xpath = "(//strong[@id='block-new-customer-heading'])[1]")
	private WebElement Subheading;
	@FindBy(xpath = "(//strong[@id='block-customer-login-heading'])[1]")
	private WebElement Subheading1;
	@FindBy(xpath = "(//div[@class='field note'])[1]")
	private WebElement Subheading1Text;
	@FindBy(xpath = "(//span[contains(text(),'Create an Account')])[1]")
	private WebElement CreateAccount;
	@FindBy(xpath = "(//span[normalize-space()='Forgot Your Password?'])[1]")
	private WebElement forgetPassword;
	@FindBy(xpath = "//*[@id='street_1']")
	private WebElement street;
	@FindBy(xpath = "(//input[@id='email_address'])[1]")
	private WebElement email;
	@FindBy(xpath = "(//input[@id='telephone'])[1]")
	private WebElement phoneNumber;
	@FindBy(xpath = "(//input[@id='house_number'])[1]")
	private WebElement houseNumber;
	@FindBy(xpath = "//input[@id='lastname']")
	private WebElement lastName;
	@FindBy(xpath = "(//select[@id='gender'])[1]")
	private WebElement gender;
	@FindBy(xpath = "(//select[@id='type'])[1]")
	private WebElement type;
	@FindBy(xpath = "(//input[@id='how_did_you_hear'])[1]")
	private WebElement hear;
	@FindBy(xpath = "(//input[@id='delivery_instructions'])[1]")
	private WebElement Additional;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	@FindBy(xpath = "(//input[@id='password-confirmation'])[1]")
	private WebElement Confirmpassword;
	@FindBy(xpath = "(//input[@id='is_subscribed'])[1]")
	private WebElement Subscribed;
	@FindBy(xpath = "(//input[@id='terms_condition'])[1]")
	private WebElement term;
	@FindBy(xpath = "(//input[@id='company'])[1]")
	private WebElement companyName;
	@FindBy(xpath = "(//input[@id='job_title'])[1]")
	private WebElement JobTitle;
	@FindBy(xpath = "(//select[@id='title'])[1]")
	private WebElement title;
	@FindBy(xpath = "//input[@id='company_id']")
	private WebElement companyId;
	@FindBy(xpath = "//button[@class='ui-datepicker-trigger v-middle']")
	private WebElement calendertextBox;
	@FindBy(xpath = "(//select[@class='ui-datepicker-month'])[1]")
	private WebElement Month;
	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	private WebElement Year;
	@FindBy(xpath = "//div[@class='ui-datepicker-title']")
	private WebElement Monthandyear;
	@FindBy(xpath = "[@id='btn-cookie-allow']/span")
	private WebElement cookie;
	@FindBy(xpath = "div[@id='street-auto-complete']")
	private WebElement AdressList;
	@FindBy(xpath = "//*[@id='street-auto-complete']/ul/li[2]")
	private WebElement Adress;
	@FindBy(xpath = "(//div[@class='col-9'])")
	private WebElement CompanyTouch;
	@FindBy(xpath = "(//input[@id='firstname'])[1]")
	private WebElement firstName;
	@FindBy(xpath = "//div[@class='primary login-btn']//button[@id='send2']") // (
	private WebElement Loginbutton;
	@FindBy(xpath = "//div[@data-content-type='text']")
	private WebElement tryitBlock;

	public WebElement getTryitBlock() {
		return tryitBlock;
	}

	public WebElement getLoginbutton() {
		return Loginbutton;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getHeading() {
		return heading;
	}

	public WebElement getSubheading() {
		return Subheading;
	}

	public WebElement getSubheading1() {
		return Subheading1;
	}

	public WebElement getSubheading1Text() {
		return Subheading1Text;
	}

	public WebElement getCreateAccount() {
		return CreateAccount;
	}

	public WebElement getForgetPassword() {
		return forgetPassword;
	}

	public WebElement getStreet() {
		return street;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getHouseNumber() {
		return houseNumber;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getHear() {
		return hear;
	}

	public WebElement getAdditional() {
		return Additional;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpassword() {
		return Confirmpassword;
	}

	public WebElement getSubscribed() {
		return Subscribed;
	}

	public WebElement getTerm() {
		return term;
	}

	public WebElement getCompanyName() {
		return companyName;
	}

	public WebElement getJobTitle() {
		return JobTitle;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getCompanyId() {
		return companyId;
	}

	public WebElement getCalendertextBox() {
		return calendertextBox;
	}

	public WebElement getMonth() {
		return Month;
	}

	public WebElement getYear() {
		return Year;
	}

	public WebElement getMonthandyear() {
		return Monthandyear;
	}

	public WebElement getCookie() {
		return cookie;
	}

	public WebElement getAdressList() {
		return AdressList;
	}

	public WebElement getAdress() {
		return Adress;
	}

	public WebElement getCompanyTouch() {
		return CompanyTouch;
	}

}
