package com.attends.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.attends.PageObject.Homepage;
import com.attends.Utility.Log;
import com.attends.base.BaseClass;

public class FooterpageTest extends BaseClass {
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
	public void footer() throws InterruptedException, IOException {
		Log.startTestCase("Footer");
		Log.info("Verifying all Web Element present in Footer Section on home page");
		Homepage h = new Homepage();
		h.getCookies().click();
		boolean logo = h.getFooterLogo().isDisplayed();
		if (logo == true) {
			String text = h.getFooterLogo().getAttribute("alt");
			System.out.println("'In Home Page ' 'logo ' in Footer Section is displaying fine expected true/false :- "
					+ logo + " and attribute is :- " + text);
		} else {
			System.out.println("'In Home Page ' 'logo ' is not present");
		}
		java.util.List<WebElement> list = getDriver()
				.findElements(By.xpath("/html/body/div[2]/footer/footer/div[1]/div[2]/div/div"));
		System.out.println(
				"Total number of 'Menu Column' in Footer Section  is displaying on Home Page :- " + list.size());

		for (WebElement webElement : list) {
			Boolean footer = webElement.isDisplayed();
			if (footer == true) {
				String text = webElement.getText();
				System.out.println(
						"'In Home Page ' 'all Element' in Footer Section is displaying fine expected true/false :- "
								+ footer + " and text which each menu Columns are :- " + text);
			} else {
				System.out.println("'In Home Page ' 'Footer' is not present");
			}

		}

		Log.info("Yes, all Web Element present in Footer Section at home page  ");
		Log.endTestCase("  Footer ");
	}
}