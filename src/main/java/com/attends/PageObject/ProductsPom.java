package com.attends.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.attends.base.BaseClass;

public class ProductsPom extends BaseClass {
	public ProductsPom() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//ul[@class='items']")
	private WebElement items;
	@FindBy(xpath = "(//span[@class='base'])[1]")
	private WebElement heading;
	@FindBy(xpath = "//img[@class='desktop']")
	private WebElement img;
	@FindBy(xpath = "//*[@id='maincontent']/div[3]/div/div/div/div[1]/section/div/div/div/div/div/div[1]")
	private WebElement content;
	@FindBy(xpath = "(//div[@id='narrow-by-list'])[1]")
	private WebElement TabList;

	@FindBy(xpath = "//div[normalize-space()='Category']")
	private WebElement Category;
	@FindBy(xpath = "//div[normalize-space()='Gender']")
	private WebElement gender;
	@FindBy(xpath = "//div[normalize-space()='Incontinence Level']")
	private WebElement incontinence;
	@FindBy(xpath = "//div[normalize-space()='Absorbency Level']")
	private WebElement Asorbency;
	@FindBy(xpath = "//div[normalize-space()='Display Size']")
	private WebElement display;
	@FindBy(xpath = "(//select[@id='sorter'])[1]")
	private WebElement sorter;
	@FindBy(xpath = "//div[@id='layered-filter-block']//li[5]//a[1]")
	private WebElement sCategory;
	@FindBy(xpath = "//a[@aria-label='Heavy']")
	private WebElement sIncontinence;
	@FindBy(xpath = "//a[@aria-label='9']")
	private WebElement sAbsorbency;
	@FindBy(xpath = "(//a[@aria-label='L'])[1]")
	private WebElement sDisplay;
	@FindBy(xpath = "//div[@class='block-content filter-content']//div[2]//div[2]//ol[1]//li[1]//a[1]")
	private WebElement sGender;
	@FindBy(xpath = "//div[@role='tab']")
	private WebElement cot;
	@FindBy(xpath = "//div[@id='narrow-by-list']//li[2]//a[1]")
	private WebElement scot;

	public WebElement getCot() {
		return cot;
	}

	public WebElement getScot() {
		return scot;
	}

	public WebElement getsAbsorbency() {
		return sAbsorbency;
	}

	public WebElement getsDisplay() {
		return sDisplay;
	}

	public WebElement getsIncontinence() {
		return sIncontinence;
	}

	public WebElement getsCategory() {
		return sCategory;
	}

	public WebElement getsGender() {
		return sGender;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getIncontinence() {
		return incontinence;
	}

	public WebElement getAsorbency() {
		return Asorbency;
	}

	public WebElement getDisplay() {
		return display;
	}

	public WebElement getSorter() {
		return sorter;
	}

	public WebElement getCategory() {
		return Category;
	}

	public WebElement getTabList() {
		return TabList;
	}

	public WebElement getHeading() {
		return heading;
	}

	public WebElement getImg() {
		return img;
	}

	public WebElement getContent() {
		return content;
	}

	public WebElement getItems() {
		return items;
	}

}
