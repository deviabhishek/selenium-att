package com.attends.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.attends.base.BaseClass;

public class ForMePom extends BaseClass {
	public ForMePom() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//div[@class='dropdown-menu show']//img[@alt='Group']")
	private WebElement image;
	@FindBy(xpath = "//a[@class='dropdown-item text-dark'][normalize-space()='I am a Woman']")
	private WebElement woman;
	@FindBy(xpath = "//a[@class='dropdown-item text-dark'][normalize-space()='I am a Man']")
	private WebElement man;
	@FindBy(xpath = "//div[@class='dropdown-menu show']//a[@class='dropdown-item text-dark'][normalize-space()='All Products']")
	private WebElement AllProduct;
	@FindBy(xpath = "//div[@class='dropdown-menu show']//a[@class='dropdown-item text-dark'][normalize-space()='Product Categories']")
	private WebElement ProductCategories;
	@FindBy(xpath = "//a[@class='dropdown-item text-dark'][normalize-space()='Living with Incontinence']")
	private WebElement LivingIncontinence;
	@FindBy(xpath = "//div[@class='dropdown-menu show']//a[@class='dropdown-item text-dark'][normalize-space()='Hints & Tips']")
	private WebElement Hints_Tips;
	@FindBy(xpath = "//div[@class='dropdown-menu show']//a[@class='dropdown-item text-dark'][normalize-space()='Customer Stories']")
	private WebElement Customer_Stroies;
	@FindBy(xpath = "//div[@class='dropdown-menu show']//a[@class='dropdown-item text-dark'][normalize-space()='Technologies and Benefits']")
	private WebElement Technologies_Benifits;
	@FindBy(xpath = "//ul[@class='items']")
	private WebElement breadcrumbs;
	@FindBy(xpath = "//*[@id='maincontent']/div[3]/div/div[2]/div/figure/img[1]")
	private WebElement wimage;
	@FindBy(xpath = "//div[@class='our-daily-solution product-by-gender']")
	private WebElement InnerBlock;
	@FindBy(xpath = "//*[@id='maincontent']/div[3]/div/div[3]/div/div[2]/ul/li[1]")
	private WebElement TabLight;
	@FindBy(xpath = "//*[@id='XQQFFJK']/div[1]")
	private WebElement TabLightcontent;
	@FindBy(xpath = "//*[@id='XQQFFJK']/div[3]/p/a")
	private WebElement TabLighlern;
	@FindBy(xpath = "//*[@id='maincontent']/div[3]/div/div[3]/div/div[2]/ul/li[2]")
	private WebElement TabModerate;
	@FindBy(xpath = "//*[@id='A6W93O7']/div[1]")
	private WebElement TabModeratecontent;
	@FindBy(xpath = "//*[@id='A6W93O7']/div[3]/p/a")
	private WebElement TabModeratelern;
	@FindBy(xpath = "//*[@id='maincontent']/div[3]/div/div[3]/div/div[2]/ul/li[2]")
	private WebElement TabHeavy;
	@FindBy(xpath = "//*[@id='CX44SWT']/div[1]")
	private WebElement TabHeavycontent;
	@FindBy(xpath = "//*[@id='CX44SWT']/div[3]/p/a")
	private WebElement TabHeavylern;
	@FindBy(xpath = "//span[@class='base']")
	private WebElement NumberSystem;

	public WebElement getNumberSystem() {
		return NumberSystem;
	}

	public WebElement getTabLighlern() {
		return TabLighlern;
	}

	public WebElement getTabModeratelern() {
		return TabModeratelern;
	}

	public WebElement getTabHeavylern() {
		return TabHeavylern;
	}

	public WebElement getTabLightcontent() {
		return TabLightcontent;
	}

	public WebElement getTabModerate() {
		return TabModerate;
	}

	public WebElement getTabHeavy() {
		return TabHeavy;
	}

	public WebElement getTabModeratecontent() {
		return TabModeratecontent;
	}

	public WebElement getTabHeavycontent() {
		return TabHeavycontent;
	}

	public WebElement getTabLight() {
		return TabLight;
	}

	public WebElement getInnerBlock() {
		return InnerBlock;
	}

	public WebElement getWimage() {
		return wimage;
	}

	public WebElement getBreadcrumbs() {
		return breadcrumbs;
	}

	public WebElement getWoman() {
		return woman;
	}

	public WebElement getMan() {
		return man;
	}

	public WebElement getAllProduct() {
		return AllProduct;
	}

	public WebElement getProductCategories() {
		return ProductCategories;
	}

	public WebElement getLivingIncontinence() {
		return LivingIncontinence;
	}

	public WebElement getHints_Tips() {
		return Hints_Tips;
	}

	public WebElement getCustomer_Stroies() {
		return Customer_Stroies;
	}

	public WebElement getTechnologies_Benifits() {
		return Technologies_Benifits;
	}

	public WebElement getImage() {
		return image;
	}

}
