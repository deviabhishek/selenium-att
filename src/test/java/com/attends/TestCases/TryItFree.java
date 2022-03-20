package com.attends.TestCases;

import java.io.IOException;

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

public class TryItFree extends BaseClass {
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
	public void Tryitfree() throws InterruptedException, IOException {
		Log.startTestCase(" Try It Free ");
		Log.info(" verifying if ,Register web Element present on Our Daily Solutions - Attends Page ");
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
		Log.info(" yes ,Register web Element present on Our Daily Solutions - Attends Page ");
		Log.info("Verifying  page tatile after click on 'Login/Register' ");
		h.getRegister().click();
		ExpTitle e = new ExpTitle();
		Thread.sleep(2000);
		String expectedTitle = e.getExpTitle("HPRtitle");
		String actualTitle = h.actualTitle(getDriver());
		Reporter.log(actualTitle, true);
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Title of Login/Register page is match actualTitle is equal to expectedTitle ");
		Log.info(" yes ,page tatile  is match after click on 'Login/Register'");
		RegisterPom reg = new RegisterPom();
		boolean regh = reg.getTryitBlock().isDisplayed();
		if (regh == true) {
			String text = reg.getTryitBlock().getText();
			System.out.println(
					"'In Try it for free  Page  ' 'Try it block ' sub category is displaying fine  and text of sub Categoty is :- "
							+ text + " it return True/False :- " + regh);
		} else {
			System.out.println("Try it block is not present");
		}
		Log.endTestCase(" Try It Free ");
	}
}