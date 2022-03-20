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

public class HeaderPageTest extends BaseClass {
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
	public void header() throws InterruptedException, IOException {
		Log.startTestCase(" Header ");
		Log.info("Verifying all Web Element present in Header Section at home page");
		Homepage h = new Homepage();
		h.getCookies().click();
		boolean logo = h.getLogo().isDisplayed();
		if (logo == true) {
			String text = h.getLogo().getAttribute("alt");
			System.out.println("'In Home Page ' 'logo ' in Header Section is displaying fine expected true/false :- "
					+ logo + " and attribute is :- " + text);
		} else {
			System.out.println("'In Home Page ' 'logo ' is not present");
		}
		boolean forMe = h.getForMe().isDisplayed();
		if (forMe == true) {
			String text = h.getForMe().getText();
			System.out.println("'In Home Page ' 'For Me ' in Header Section is displaying fine expected true/false :- "
					+ forMe + " and text of Web Element is :- " + text);
		} else {
			System.out.println("'In Home Page ' 'For Me ' is not present");
		}
		boolean Caregivers = h.getCaregivers().isDisplayed();
		if (Caregivers == true) {
			String text = h.getCaregivers().getText();
			System.out.println(
					"'In Home Page ' 'Caregivers ' in Header Section is displaying fine expected true/false :- "
							+ Caregivers + " and text of Web Element is :- " + text);
		} else {
			System.out.println("'In Home Page ' 'Caregivers ' is not present");
		}
		boolean professional = h.getProfessionals().isDisplayed();
		if (professional == true) {
			String text = h.getProfessionals().getText();
			System.out.println(
					"'In Home Page ' 'professional' in Header Section is displaying fine expected true/false :- "
							+ professional + " and text of Web Element is :- " + text);
		} else {
			System.out.println("'In Home Page ' 'professional' is not present");
		}
		boolean Incontinence = h.getIncontinence().isDisplayed();
		if (Incontinence == true) {
			String text = h.getIncontinence().getText();
			System.out.println(
					"'In Home Page ' 'Incontinence ' in Header Section is displaying fine expected true/false :- "
							+ Incontinence + " and text of Web Element is :- " + text);
		} else {
			System.out.println("'In Home Page ' 'Incontinence ' is not present");
		}
		boolean about = h.getAboutAttends().isDisplayed();
		if (about == true) {
			String text = h.getAboutAttends().getText();
			System.out.println(
					"'In Home Page ' 'AboutAttends' in Header Section is displaying fine expected true/false :- "
							+ about + " and text of Web Element is :- " + text);
		} else {
			System.out.println("'In Home Page ' 'about' is not present");
		}
		java.util.List<WebElement> list1 = getDriver().findElements(By.xpath("//*[@id='store.menu']/nav/div[3]/a"));
		System.out.println("Total number of 'button in store menu' present in Home Page :- " + list1.size()
				+ "  and list of all 'button in store menu'  are given below :- ");
		for (WebElement webElement : list1) {
			String text = webElement.getText();
			System.out.println(text);
		}
		Log.info("Yes, all Web Element present in header Section at home page  ");
		Log.endTestCase("  Header ");
	}
}