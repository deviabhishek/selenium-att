package com.attends.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.attends.PageObject.Homepage;
import com.attends.PageObject.RegisterPom;
import com.attends.Utility.ExpTitle;
import com.attends.Utility.Log;
import com.attends.base.BaseClass;

public class RegisterPageTest extends BaseClass {
	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser) {
		launchApp(browser);
	}

	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}

	@Test
	public void register() throws InterruptedException, IOException {
		Log.startTestCase("register");

		Homepage h = new Homepage();
		h.getCookies().click();
		boolean register = h.getRegister().isDisplayed();
		if (register == true) {
			String text = h.getRegister().getText();
			System.out.println(
					"'In Home Page ' 'Login/Register' in Header Section is displaying fine  and text of sub Categoty is :- "
							+ text);
		} else {
			System.out.println("'In Home Page ' 'Login/Register' is not present");
		}
		Log.info("Register web Element present on Our Daily Solutions - Attends Page ");
		h.getRegister().click();
		ExpTitle e = new ExpTitle();
		Thread.sleep(2000);
		String expectedTitle = e.getExpTitle("HPRtitle");
		String actualTitle = h.actualTitle(getDriver());
		Reporter.log(actualTitle, true);
		Log.info("Verifying if user able to login");
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Title of Login/Register page is match actualTitle is equal to expectedTitle ");
		RegisterPom reg = new RegisterPom();
		boolean regh = reg.getHeading().isDisplayed();
		if (regh == true) {
			String text = reg.getHeading().getText();
			System.out.println(
					"'In  Login/Register Page' 'Customer Login' sub category is displaying fine  and text of sub Categoty is :- "
							+ text + " it return True/False :- " + regh);
		} else {
			System.out.println("Customer Login is not present");
		}
		boolean regsubh = reg.getSubheading().isDisplayed();
		System.out.println(
				" 'New Customers sub section' is Displaying in  Customer Login Page, is fine expected :-True/False :- "
						+ " " + regsubh + " And Text Of Web Element is :- " + reg.getSubheading().getText());

		boolean regsubh1 = reg.getSubheading1().isDisplayed();
		System.out.println(
				" 'Registered Customers sub section ' is Displaying in  Customer Login Page , is  fine expected :-True/False :- "
						+ " " + regsubh1 + " And Text Of Web Element is :- " + reg.getSubheading1().getText());

		boolean regsubht = reg.getSubheading1Text().isDisplayed();
		System.out.println(
				" 'Text Under Registered Customers sub heading ' is Displaying in  Customer Login Page, is fine expected :-True/False :- "
						+ " " + regsubht + " And Text Of Web Element is :- " + reg.getSubheading1Text().getText());
		boolean regButton = reg.getCreateAccount().isDisplayed();
		System.out.println(
				" 'Create Account Button' is Displaying in  Customer Login Page,is fine expected :-True/False :- "
						+ regButton + " And Text Of Web Element is :-  " + " " + reg.getCreateAccount().getText());
		boolean forgetlink = reg.getForgetPassword().isDisplayed();
		System.out.println(
				" 'Forget Password link' is Displaying in  Customer Login Page,is fine expected :-True/False :- "
						+ forgetlink + " And Text Of Web Element is :-  " + " " + reg.getForgetPassword().getText());
		boolean loginButton = reg.getLoginbutton().isDisplayed();
		System.out.println(" 'Login Button ' is Displaying in  Customer Login Page,is fine expected :-True/False :- "
				+ loginButton + " And Text Of Web Element is :-  " + " " + reg.getLoginbutton().getText());
		WebElement button = reg.getCreateAccount();
		button.click();
		ExpTitle r = new ExpTitle();
		Thread.sleep(2000);
		String expectedTitle1 = r.getExpTitle("CAtitle");
		String actualTitle1 = h.actualTitle(getDriver());
		Reporter.log(actualTitle1, true);
		Assert.assertEquals(actualTitle1, expectedTitle1);
		System.out.println("Title of Create Account page is match actualTitle is equal to expectedTitle ");
		getDriver().navigate().back();
		Log.endTestCase("register");

	}

}
