package com.attends.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.attends.base.BaseClass;

public class DropDownPom extends BaseClass {
	public DropDownPom() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//*[@id='navbarNavDropdown01']/ul/li[2]/div/div[1]/a")
	private java.util.List<WebElement> caregiverDropDown;

	public java.util.List<WebElement> getCaregiverDropDown() {
		return caregiverDropDown;
	}

	@FindBy(xpath = "//*[@id='navbarNavDropdown01']/ul/li[2]/div/div[2]/a")
	private java.util.List<WebElement> caregiverDropDown2;

	public java.util.List<WebElement> getCaregiverDropDown2() {
		return caregiverDropDown2;
	}

	// *************************************************************************************
	@FindBy(xpath = "//*[@id='navbarNavDropdown01']/ul/li[3]/div/div[1]/a")
	private java.util.List<WebElement> ProfessionDropDown;

	public java.util.List<WebElement> getProfessionDropDown() {
		return ProfessionDropDown;
	}

	@FindBy(xpath = "//*[@id='navbarNavDropdown01']/ul/li[3]/div/div[2]/a")
	private java.util.List<WebElement> ProfessionDropDown2;

	public java.util.List<WebElement> getProfessionDropDown2() {
		return ProfessionDropDown2;
	}

	// **********************************************************************************************
	@FindBy(xpath = "//*[@id='navbarNavDropdown01']/ul/li[4]/div/div[1]/a")
	private java.util.List<WebElement> INCONTINENCEDropDown;

	public java.util.List<WebElement> getINCONTINENCEDropDown() {
		return INCONTINENCEDropDown;
	}

	@FindBy(xpath = "//*[@id='navbarNavDropdown01']/ul/li[4]/div/div[2]/a")
	private java.util.List<WebElement> ProductDropDown2;

	public java.util.List<WebElement> getProductDropDown2() {
		return ProductDropDown2;
	}

	// *******************************************************************************************************
	@FindBy(xpath = "//*[@id='navbarNavDropdown01']/ul/li[5]/div/div[1]/a")
	private java.util.List<WebElement> AboutDropDown;

	public java.util.List<WebElement> getAboutDropDown() {
		return AboutDropDown;
	}

	@FindBy(xpath = "//*[@id='navbarNavDropdown01']/ul/li[5]/div/div[2]/a")
	private java.util.List<WebElement> AboutDropDown2;

	public java.util.List<WebElement> getAboutDropDown2() {
		return AboutDropDown2;
	}

	// **************************************************************************************************
	@FindBy(xpath = "//div[@class='dropdown-menu show']//img")
	private WebElement image;

	public WebElement getImage() {
		return image;
	}
}
