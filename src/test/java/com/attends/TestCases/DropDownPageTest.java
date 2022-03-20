package com.attends.TestCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.attends.PageObject.DropDownPom;
import com.attends.PageObject.Homepage;
import com.attends.Utility.Log;
import com.attends.base.BaseClass;

public class DropDownPageTest extends BaseClass {
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
	public void dropdown() throws InterruptedException, IOException {
		Log.startTestCase(" Drop Down Page  ");
		Log.info("Verifying For All drop down Element present on homepage ");
		Homepage h = new Homepage();
		DropDownPom cg = new DropDownPom();
		h.getCookies().click();
		Thread.sleep(1000);
		JavascriptExecutor jExecutor = (JavascriptExecutor) getDriver();
		WebElement nElement = h.getCaregivers();
		jExecutor.executeScript("arguments[0].click();", nElement);

		java.util.List<WebElement> list = cg.getCaregiverDropDown();
		System.out.println(
				"Total number of 'Drop Down' After click on  'Care Giver' In 1nd Column  is displaying on Home Page :- "
						+ list.size());
		for (WebElement webElement : list) {
			Boolean col = webElement.isDisplayed();
			if (col == true) {
				String text = webElement.getText();
				System.out.println("' Column 1 Drop Down'  in 'Care Giver' is displaying fine expected true/false :- "
						+ col + " and text  each Drop Down  are :- " + text);
			} else {
				System.out.println("Column 1'  in 'Care Giver' is  Not displaying");
			}

		}
		java.util.List<WebElement> list1 = cg.getCaregiverDropDown2();
		System.out.println(
				"Total number of 'Drop Down' After click on  'Care Giver' In 2nd Column   is displaying on Home Page :- "
						+ list1.size());
		for (WebElement webElement1 : list1) {
			Boolean col = webElement1.isDisplayed();
			if (col == true) {
				String text = webElement1.getText();
				System.out.println("' Column 2 Drop Down'  in 'Care Giver' is displaying fine expected true/false :- "
						+ col + " and text  each Drop Down  are :- " + text);
			} else {
				System.out.println(" Column 2 Drop Down'  in 'Care Giver' is  Not displaying");
			}
		}
		Thread.sleep(1000);
		WebElement iElement = h.getIncontinence();
		jExecutor.executeScript("arguments[0].click();", iElement);

		java.util.List<WebElement> list2 = cg.getINCONTINENCEDropDown();
		System.out.println(
				"Total number of 'Drop Down' After click on  'INCONTINENCE  Products' In 1st Column   is displaying on Home Page :- "
						+ list2.size());
		for (WebElement webElement2 : list2) {
			Boolean col = webElement2.isDisplayed();
			if (col == true) {
				String text = webElement2.getText();
				System.out.println(
						"' Column 1 Drop Down'  in 'INCONTINENCE  Products' is displaying fine expected true/false :- "
								+ col + " and text  each Drop Down  are :- " + text);
			} else {
				System.out.println(" Column 1 Drop Down'  in 'INCONTINENCE  Products' is  Not displaying");
			}
		}

		java.util.List<WebElement> list3 = cg.getProductDropDown2();
		System.out.println(
				"Total number of 'Drop Down' After click on  'INCONTINENCE  Products' In 2nd Column   is displaying on Home Page :- "
						+ list3.size());
		for (WebElement webElement3 : list3) {
			Boolean col = webElement3.isDisplayed();
			if (col == true) {
				String text = webElement3.getText();
				System.out.println(
						"' Column 2 Drop Down'  in 'INCONTINENCE  Products' is displaying fine expected true/false :- "
								+ col + " and text  each Drop Down  are :- " + text);
			} else {
				System.out.println(" Column 2 Drop Down'  in 'INCONTINENCE  Products' is  Not displaying");
			}
		}
		Thread.sleep(1000);
		WebElement pElement = h.getProfessionals();
		jExecutor.executeScript("arguments[0].click();", pElement);
		java.util.List<WebElement> list4 = cg.getProfessionDropDown();
		System.out.println(
				"Total number of 'Drop Down' After click on  'Professional' In 1nd Column  is displaying on Home Page :- "
						+ list4.size());
		for (WebElement webElement4 : list4) {
			Boolean col = webElement4.isDisplayed();
			if (col == true) {
				String text = webElement4.getText();
				System.out.println("' Column 1 Drop Down'  in 'Professional' is displaying fine expected true/false :- "
						+ col + " and text  each Drop Down  are :- " + text);
			} else {
				System.out.println("Column 1'  in 'professional' is  Not displaying");
			}

		}
		java.util.List<WebElement> list5 = cg.getProfessionDropDown2();
		System.out.println(
				"Total number of 'Drop Down' After click on  'Professional' In 2nd Column   is displaying on Home Page :- "
						+ list5.size());
		for (WebElement webElement5 : list5) {
			Boolean col = webElement5.isDisplayed();
			if (col == true) {
				String text = webElement5.getText();
				System.out.println("' Column 2 Drop Down'  in 'Professional' is displaying fine expected true/false :- "
						+ col + " and text  each Drop Down  are :- " + text);
			} else {
				System.out.println(" Column 2 Drop Down'  in 'Professional' is  Not displaying");
			}
		}
		Thread.sleep(1000);
		WebElement aElement = h.getAboutAttends();
		jExecutor.executeScript("arguments[0].click();", aElement);

		java.util.List<WebElement> list6 = cg.getAboutDropDown();
		System.out.println(
				"Total number of 'Drop Down' After click on  'About Attends' In 1nd Column  is displaying on Home Page :- "
						+ list6.size());
		for (WebElement webElement6 : list6) {
			Boolean col = webElement6.isDisplayed();
			if (col == true) {
				String text = webElement6.getText();
				System.out
						.println("' Column 1 Drop Down'  in 'About Attends' is displaying fine expected true/false :- "
								+ col + " and text  each Drop Down  are :- " + text);
			} else {
				System.out.println("Column 1'  in 'About Attends  Products' is  Not displaying");
			}

		}
		java.util.List<WebElement> list7 = cg.getAboutDropDown2();
		System.out.println(
				"Total number of 'Drop Down' After click on  'About Attends' In 2nd Column   is displaying on Home Page :- "
						+ list7.size());
		for (WebElement webElement7 : list7) {
			Boolean col = webElement7.isDisplayed();
			if (col == true) {
				String text = webElement7.getText();
				System.out
						.println("' Column 2 Drop Down'  in 'About Attends' is displaying fine expected true/false :- "
								+ col + " and text  each Drop Down  are :- " + text);
			} else {
				System.out.println(" Column 2 Drop Down'  in 'About Attends' is  Not displaying");
			}
		}
		Thread.sleep(1000);
		boolean image = cg.getImage().isDisplayed();
		if (image == true) {
			System.out.println(
					"'In Home Page ' After Click on  'About Attends ' drop down Image  is displaying fine expected true/false :- "
							+ image);
		} else {
			System.out.println("'In Home Page ' After Click on  'About Attends 'drop down  Image  is is not present");
		}
		Log.info(" Yes,Verifying For All drop down Element present on homepage ");
		Log.endTestCase(" Drop Down Page Test ");
	}
}