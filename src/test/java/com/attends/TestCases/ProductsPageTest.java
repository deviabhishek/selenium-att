package com.attends.TestCases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.attends.PageObject.Homepage;
import com.attends.PageObject.ProductsPom;
import com.attends.Utility.ExpTitle;
import com.attends.Utility.Log;
import com.attends.base.BaseClass;

public class ProductsPageTest extends BaseClass {
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
	public void products() throws InterruptedException, IOException {
		Log.startTestCase(" Products ");

		Homepage h = new Homepage();
		h.getCookies().click();
		boolean register = h.getProducts().isDisplayed();
		if (register == true) {
			String text = h.getProducts().getText();
			System.out.println(
					"'In Home Page ' 'Show Products' in Header Section is displaying fine expected true/false :- "
							+ register + " and text of sub Categoty is :- " + text);
		} else {
			System.out.println("'In Home Page ' 'Show Products' is not present");
		}
		Log.info("Show Products web Element present on Home Page ");
		Log.info("Verifying if user able to click  Show Products in home page ");
		JavascriptExecutor jExecutor = (JavascriptExecutor) getDriver();
		WebElement nElement = h.getProducts();
		jExecutor.executeScript("arguments[0].click();", nElement);
		Thread.sleep(2000);
		Set<String> windowhandler = getDriver().getWindowHandles();
		Iterator<String> iter = windowhandler.iterator();
		String parentwindowr = iter.next();
		String childwindowr = iter.next();
		getDriver().switchTo().window(childwindowr);
		Thread.sleep(3000);
		ExpTitle e = new ExpTitle();
		String expectedTitle = e.getExpTitle("Ptitle");
		String actualTitle = h.actualTitle(getDriver());
		Reporter.log(actualTitle, true);
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Title of Show Products page is match actualTitle is equal to expectedTitle ");
		Log.info("user able to click on web element Show Products successfully ");
		Thread.sleep(2000);
		ProductsPom pp = new ProductsPom();
		boolean items = pp.getItems().isDisplayed();
		if (items == true) {
			String textp = pp.getItems().getText();
			System.out.println("'In View All Products 'page Navigation Bar  is displaying fine expected true/false :- "
					+ items + " and text on Navigation Bar is :- " + textp);
		} else {
			System.out.println("WebElement is not present in the page");
		}
		boolean heading = pp.getHeading().isDisplayed();
		if (heading == true) {
			String texth = pp.getHeading().getText();
			System.out.println("'In View All Products page' Heading   is displaying fine expected true/false :- "
					+ heading + " and text on Heading is :- " + texth);
		} else {
			System.out.println("WebElement is not present in the page");
		}
		boolean img = pp.getHeading().isDisplayed();
		if (img == true) {

			System.out.println("'In View All Products page' 'Image' is present 'expected true/false :-' " + img);
		} else {
			System.out.println("Image is not present in the page");
		}
		boolean content = pp.getContent().isDisplayed();
		if (content == true) {
			String textc = pp.getContent().getText();
			System.out.println(
					"'In View All Products page' beside Image 'Contect Block '  is displaying 'fine expected true/false :-' "
							+ content + " and text which written inside Content block is :- " + textc);
		} else {
			System.out.println("'Contect Block 'is not present in the page");
		}
		boolean tablist = pp.getTabList().isDisplayed();
		if (tablist == true) {
			String textl = pp.getTabList().getText();
			System.out.println("'In View All Products page' 'Tab List'  is present 'expected true/false :-' " + tablist
					+ " and text which written inside is Tab List :- " + textl);
		} else {
			System.out.println("'Tab List 'is not present in the page");
		}
		Log.info(" Verifying All the drown down for all products are present in View all products page ");
		WebElement cElement = pp.getCategory();
		jExecutor.executeScript("arguments[0].click();", cElement);
		Thread.sleep(2000);
		java.util.List<WebElement> list = getDriver()
				.findElements(By.xpath("//*[@id='narrow-by-list']/div[1]/div[2]/ol/li/a"));
		System.out.println(
				"Total number of products in View All Products page after click on 'Category' Drop Down' is  :- "
						+ list.size() + "  and list of all products are given below :- ");
		for (WebElement webElement : list) {
			String text = webElement.getText();
			System.out.println(text);

		}

		WebElement fElement = pp.getGender();
		jExecutor.executeScript("arguments[0].click();", fElement);
		Thread.sleep(2000);
		java.util.List<WebElement> list1 = getDriver()
				.findElements(By.xpath("//*[@id='narrow-by-list']/div[2]/div[2]/ol/li/a"));
		for (WebElement webElement : list1) {
			System.out.println(webElement.getText());

		}
		WebElement aElement = pp.getAsorbency();
		jExecutor.executeScript("arguments[0].click();", aElement);
		Thread.sleep(2000);
		java.util.List<WebElement> list2 = getDriver()
				.findElements(By.xpath("//*[@id='narrow-by-list']/div[4]/div[2]/div/div/a/div"));
		for (WebElement webElement : list2) {
			System.out.println(webElement.getText());
		}
		WebElement dElement = pp.getDisplay();
		jExecutor.executeScript("arguments[0].click();", dElement);
		Thread.sleep(2000);
		java.util.List<WebElement> list3 = getDriver()
				.findElements(By.xpath("//*[@id='narrow-by-list']/div[5]/div[2]/div/div/a"));
		for (WebElement webElement : list3) {
			System.out.println(webElement.getText());
		}
		WebElement sElement = pp.getSorter();
		jExecutor.executeScript("arguments[0].click();", sElement);
		Thread.sleep(2000);
		java.util.List<WebElement> list4 = getDriver().findElements(By.xpath("//*[@id='sorter']/option"));
		for (WebElement webElement : list4) {
			System.out.println(webElement.getText());
		}
		WebElement iElement = pp.getIncontinence();
		jExecutor.executeScript("arguments[0].click();", iElement);
		Thread.sleep(2000);
		java.util.List<WebElement> list5 = getDriver()
				.findElements(By.xpath("//*[@id='narrow-by-list']/div[3]/div[2]/div/div/a/div"));
		for (WebElement webElement : list5) {
			System.out.println(webElement.getText());
		}
		Log.info(" yes , In All the drown down for all products are present in View all products page  ");
		Log.endTestCase(" Products page ");
		getDriver().close();
		getDriver().switchTo().window(parentwindowr);

	}
}