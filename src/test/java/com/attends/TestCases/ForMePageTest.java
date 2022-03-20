package com.attends.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.attends.PageObject.ForMePom;
import com.attends.PageObject.Homepage;
import com.attends.Utility.ExpTitle;
import com.attends.Utility.Log;
import com.attends.base.BaseClass;

public class ForMePageTest extends BaseClass {
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
	public void forMe() throws InterruptedException, IOException {
		Log.startTestCase(" For Me ");
		Log.info("Verifying For Me Web Element present on homepage ");
		Homepage h = new Homepage();
		h.getCookies().click();
		boolean forMe = h.getForMe().isDisplayed();
		if (forMe == true) {
			String text = h.getForMe().getText();
			System.out.println("'In Home Page ' 'For Me ' in Header Section is displaying fine expected true/false :- "
					+ forMe + " and text of Web Element is :- " + text);
		} else {
			System.out.println("'In Home Page ' 'For Me ' is not present");
		}
		Log.info("Yes, 'For Me' Web Element present on homepage ");
		JavascriptExecutor jExecutor = (JavascriptExecutor) getDriver();
		WebElement nElement = h.getForMe();
		jExecutor.executeScript("arguments[0].click();", nElement);
		Thread.sleep(2000);
		ExpTitle r = new ExpTitle();
		String expectedTitle = r.getExpTitle("Rtitle");
		String actualTitle = h.actualTitle(getDriver());
		Reporter.log(actualTitle, true);
		Assert.assertEquals(actualTitle, expectedTitle);
		Log.info("user able to click 'For ME' button successfully on home page ");
		Log.info(
				"Verifying  whether all the Drop Drown in 'For Me' Web Element present on homepage  after click on 'For Me' Button  ");
		java.util.List<WebElement> list = getDriver()
				.findElements(By.xpath("//*[@id='navbarNavDropdown01']/ul/li[1]/div/div[1]/a"));
		System.out.println("Total number of 'dropdown-col 1' present in Home Pge  after click on 'For Me' Button   :- "
				+ list.size() + "  and list of all ' dropdown-col 1'  are given below :- ");
		for (WebElement webElement : list) {
			String text = webElement.getText();
			System.out.println(text);
		}
		java.util.List<WebElement> list1 = getDriver()
				.findElements(By.xpath("//*[@id='navbarNavDropdown01']/ul/li[1]/div/div[2]/a"));
		System.out.println("Total number of 'dropdown-col 2' present in Home Pge  after click on 'For Me' Button   :- "
				+ list1.size() + "  and list of all ' dropdown-col 2'  are given below :- ");
		for (WebElement webElement : list1) {
			String text = webElement.getText();
			System.out.println(text);
		}
		Log.info(
				"yes, all the Drop Drown in 'For Me' Web Element present on homepage  after click on 'For Me' Button ");
		ForMePom fm = new ForMePom();
		boolean image = fm.getImage().isDisplayed();
		if (image == true) {
			System.out.println(
					"'In Home Page ' After Click on  'For Me ' Button Image  is displaying fine expected true/false :- "
							+ image);
		} else {
			System.out.println("'In Home Page ' After Click on  'For Me ' Button Image  is is not present");
		}

		WebElement wElement = fm.getWoman();
		jExecutor.executeScript("arguments[0].click();", wElement);
		Thread.sleep(2000);
		ExpTitle w = new ExpTitle();
		String expectedTitle1 = w.getExpTitle("ttitle");
		String actualTitle1 = h.actualTitle(getDriver());
		Reporter.log(actualTitle1, true);
		Assert.assertEquals(actualTitle1, expectedTitle1);
		boolean breadcrumbs = fm.getBreadcrumbs().isDisplayed();
		if (breadcrumbs == true) {
			String text = fm.getBreadcrumbs().getText();
			System.out.println(" 'After Click on Woman link'  breadcrumbs is displaying fine expected true/false :- "
					+ breadcrumbs + " Text written on breadcrumbs " + text);
		} else {
			System.out.println("'After Click on Woman link'  breadcrumbs is not present");
		}
		boolean Wimage = fm.getWimage().isDisplayed();
		if (Wimage == true) {

			System.out.println(
					" 'After Click on  Woman link'  Image is displaying on for woman page fine expected true/false :- "
							+ breadcrumbs);
		} else {
			System.out.println("'After Click on For Woman link'  Image is not present");
		}
		boolean innerBlock = fm.getInnerBlock().isDisplayed();
		if (innerBlock == true) {
			String text = fm.getInnerBlock().getText();
			System.out.println(
					" 'After Click on Woman link' 'Inner Block ' is displaying on for woman page fine expected true/false :- "
							+ innerBlock + " and text wriiten under  'Inner Block ' is :- " + text);
		} else {
			System.out.println(" 'After Click on Woman link' 'Inner Block ' is not present");
		}
		java.util.List<WebElement> list2 = getDriver()
				.findElements(By.xpath("//*[@id='maincontent']/div[3]/div/div[3]/div/div[2]/ul/li"));
		System.out.println("Total number of ' Tab ' present in For woman Page  :- " + list2.size()
				+ "  and list of all 'Tab'  are given below :- ");
		for (WebElement webElement : list2) {
			String text = webElement.getText();
			System.out.println(text);
		}

		WebElement lElement = fm.getTabLight();
		jExecutor.executeScript("arguments[0].click();", lElement);
		Thread.sleep(2000);
		boolean lightcontent = fm.getTabLightcontent().isDisplayed();
		if (lightcontent == true) {
			String text = fm.getTabLightcontent().getText();
			System.out.println(
					" 'After Click on light Tab' 'content' is displaying on for woman page fine expected true/false :- "
							+ lightcontent + " and text wriiten under  'light tab' is :- " + text);
		} else {
			System.out.println(" 'After Click on light Tab' 'content ' is not present");
		}
		WebElement leElement = fm.getTabLighlern();
		jExecutor.executeScript("arguments[0].click();", leElement);
		Thread.sleep(2000);
		ExpTitle le = new ExpTitle();
		String expectedTitle2 = le.getExpTitle("Otitle");
		String actualTitle2 = h.actualTitle(getDriver());
		Reporter.log(actualTitle2, true);
		Assert.assertEquals(actualTitle2, expectedTitle2);
		boolean number = fm.getNumberSystem().isDisplayed();
		if (number == true) {
			String text = fm.getNumberSystem().getText();
			System.out
					.println(" 'Heading'  is displaying on Attends Numbering System  page fine expected true/false :- "
							+ number + " and text wriiten for  'Heading' is :- " + text);
		} else {
			System.out.println(" 'Heading'  is displaying on Attends Numbering System  page is not present");
		}
		java.util.List<WebElement> list3 = getDriver()
				.findElements(By.xpath("//*[@id='maincontent']/div[3]/div/div[2]/div/div"));
		System.out.println(
				"Total number of 'Menu Column' in Attends Numbering System  page  is displaying on Home Page :- "
						+ list3.size());
		for (WebElement webElement : list3) {
			Boolean col = webElement.isDisplayed();
			if (col == true) {
				String text = webElement.getText();
				System.out.println(
						"'Attends Numbering System  page ' 'all Columns' is displaying fine expected true/false :- "
								+ col + " and text which each Columns are :- " + text);
			} else {
				System.out.println(" 'Attends Numbering System  page ' 'all Columns'  is not present");
			}

		}

		Log.endTestCase(" For Me ");
	}
}
