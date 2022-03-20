package com.attends.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.attends.base.BaseClass;

public class SampleCartPom extends BaseClass {
	public SampleCartPom() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "(//span[@class='base'])[1]")
	private WebElement heading;

	@FindBy(xpath = "//a[normalize-space()='Free sample']")
	private WebElement freeSample;
	@FindBy(xpath = "//img[@class='pagebuilder-mobile-hidden']")
	private WebElement image;
	@FindBy(xpath = "//div[@data-content-type='text']")
	private WebElement TextContent;

	@FindBy(xpath = "//*[@id='mini-cart']/li/div/div/strong/a")
	private WebElement ProductName;

	@FindBy(xpath = "//div[@class='field required']//input[@id='customer-email']")
	private WebElement email;
	@FindBy(xpath = "//span[@class='base']")
	private WebElement pagetitle;
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstName;
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastName;
	@FindBy(xpath = "//select[@name='gender']")
	private WebElement gender;
	@FindBy(xpath = "//select[@name='title']")
	private WebElement type;
	@FindBy(xpath = "//select[@name='country_id']")
	private WebElement country;
	@FindBy(xpath = "//select[@name='country_id']")
	private WebElement city;

	public WebElement getCity() {
		return city;
	}

	public WebElement getRegion() {
		return region;
	}

	@FindBy(xpath = "//select[@name='region_id']")
	private WebElement region; //
	@FindBy(xpath = "//input[@name='how_did_you']")
	private WebElement hear;
	@FindBy(xpath = "//textarea[@class='admin__control-textarea']")
	private WebElement Additional;
	@FindBy(xpath = "//input[@name='terms_condition']")
	private WebElement term;
	@FindBy(xpath = "(//input[@name='street[0]'])[1]")
	private WebElement street;
	@FindBy(xpath = "//input[@name='company']")
	private WebElement company;
	@FindBy(xpath = "//input[@name='company_id']")
	private WebElement companyId;

	@FindBy(name = "custom_attributes[house_number]")
	private WebElement houseno;

	@FindBy(xpath = "//input[@name='postcode']")
	private WebElement ZipCode;
	@FindBy(xpath = "//input[@name='telephone']")
	private WebElement phoneNumber;

	@FindBy(xpath = "// input[@name='date_of_birth']")
	private WebElement calendertextBox;

	@FindBy(xpath = "(//select[@class='ui-datepicker-month'])[1]") // //select[@class='ui-datepicker-month']
	private WebElement Month;
	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	private WebElement Year;

	public WebElement getMonth() {
		return Month;
	}

	public WebElement getYear() {
		return Year;
	}

	public WebElement getCalendertextBox() {
		return calendertextBox;
	}

	public WebElement getFirstName() {
		return firstName;
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

	public WebElement getCountry() {
		return country;
	}

	public WebElement getHear() {
		return hear;
	}

	public WebElement getAdditional() {
		return Additional;
	}

	public WebElement getTerm() {
		return term;
	}

	public WebElement getStreet() {
		return street;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getCompanyId() {
		return companyId;
	}

	public WebElement getHouseno() {
		return houseno;
	}

	public WebElement getZipCode() {
		return ZipCode;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPagetitle() {
		return pagetitle;
	}

	public WebElement getProductName() {
		return ProductName;
	}

	public WebElement getTextContent() {
		return TextContent;
	}

	@FindBy(xpath = "//a[@class='pagebuilder-button-primary']")
	private WebElement getSample;
	@FindBy(xpath = "(//span[contains(text(),'Get Sample')])[3]")
	private WebElement Sample;
	@FindBy(xpath = "//div[@class='product attribute description']")
	private WebElement productdescription;
	@FindBy(xpath = "//div[@class='product-info-main']")
	private WebElement productinfo;
	@FindBy(xpath = "//span[normalize-space()='Product Features']")
	private WebElement featureButton;
	@FindBy(xpath = "//*[@id='mini-cart']/li/div/div/div[2]/div/div[2]/img")
	private WebElement editPlus;
	@FindBy(xpath = "//*[@id='mini-cart']/li/div/div/div[2]/div/div[1]/img")
	private WebElement editMinus;
	@FindBy(xpath = "(//span[normalize-space()='Update'])[1]")
	private WebElement upadte;
	@FindBy(xpath = "//button[@id='top-cart-btn-checkout']")
	private WebElement checkout;
	@FindBy(xpath = "//select[@name='title']")
	private WebElement DropTitle;
	@FindBy(xpath = "//iframe[@title='reCAPTCHA']")
	private WebElement frame;
	@FindBy(xpath = "(//span[@id ='recaptcha-anchor'])")
	private WebElement recaptcha;
	@FindBy(xpath = "//button[@class='button action continue primary']")
	private WebElement shipSample;
	@FindBy(xpath = "(//a[@title='Get Sample'])[4]")
	private WebElement selectProducts;
	@FindBy(xpath = "//a[.='shopping cart']/..")
	private WebElement message;

	public WebElement getMessage() {
		return message;
	}

	public WebElement getSelectProducts() {
		return selectProducts;
	}

	public void setSelectProducts(WebElement selectProducts) {
		this.selectProducts = selectProducts;
	}

	public WebElement getShipSample() {
		return shipSample;
	}

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getRecaptcha() {
		return recaptcha;
	}

	public WebElement getDropTitle() {
		return DropTitle;
	}

	public WebElement getUpadte() {
		return upadte;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getEditPlus() {
		return editPlus;
	}

	public WebElement getEditMinus() {
		return editMinus;
	}

	public WebElement getFeatureButton() {
		return featureButton;
	}

	@FindBy(xpath = "//table[@id='product-attribute-specs-table']")
	private WebElement productFeature;

	public WebElement getProductFeature() {
		return productFeature;
	}

	@FindBy(xpath = "//div[.='Moderate']")
	private WebElement incontincelevel;

	@FindBy(xpath = "//div[@aria-label='4']")
	private WebElement absorbencylevel;

	@FindBy(xpath = "//button[@id='product-addtocart-button']")
	private WebElement productSample;

	@FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
	private WebElement shoppingcartmessage;

	@FindBy(xpath = "//a[@class='action showcart']")
	private WebElement shoppingcart;
	@FindBy(xpath = "//span[.='Remove']")
	private WebElement deleteProduct;

	public WebElement getDeleteProduct() {
		return deleteProduct;
	}

	public WebElement getImage() {
		return image;
	}

	public WebElement getShoppingcart() {
		return shoppingcart;
	}

	public WebElement getProductdescription() {
		return productdescription;
	}

	public WebElement getProductinfo() {
		return productinfo;
	}

	public WebElement getIncontincelevel() {
		return incontincelevel;
	}

	public WebElement getAbsorbencylevel() {
		return absorbencylevel;
	}

	public WebElement getProductSample() {
		return productSample;
	}

	public WebElement getShoppingcartmessage() {
		return shoppingcartmessage;
	}

	public WebElement getHeading() {
		return heading;
	}

	public WebElement getFreeSample() {
		return freeSample;
	}

	public WebElement getGetSample() {
		return getSample;
	}

	public WebElement getSample() {
		return Sample;
	}
}
