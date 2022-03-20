package com.attends.TestCases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.attends.PageObject.Homepage;
import com.attends.PageObject.ProductsPom;
import com.attends.Utility.Log;
import com.attends.base.BaseClass;

public class ProductSelect extends BaseClass {
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
	public void productselect() throws InterruptedException, IOException {
		Log.startTestCase(" Products Select ");
		Log.info(" Verifying whether the user able to select the product according to their needs");
		Homepage h = new Homepage();
		h.getCookies().click();
		JavascriptExecutor jExecutor = (JavascriptExecutor) getDriver();
		WebElement nElement = h.getProducts();
		jExecutor.executeScript("arguments[0].click();", nElement);
		Thread.sleep(2000);
		Set<String> windowhandler = getDriver().getWindowHandles();
		Iterator<String> iter = windowhandler.iterator();
		String parentwindowr = iter.next();
		String childwindowr = iter.next();
		getDriver().switchTo().window(childwindowr);
		Thread.sleep(2000);
		ProductsPom pp = new ProductsPom();
		WebElement cElement = pp.getCategory();
		jExecutor.executeScript("arguments[0].click();", cElement);
		Thread.sleep(2000);
		WebElement sElement = pp.getsCategory();
		jExecutor.executeScript("arguments[0].click();", sElement);
		Thread.sleep(2000);
		WebElement iElement = pp.getIncontinence();
		jExecutor.executeScript("arguments[0].click();", iElement);
		Thread.sleep(2000);
		WebElement kElement = pp.getsIncontinence();
		jExecutor.executeScript("arguments[0].click();", kElement);
		WebElement aElement = pp.getAsorbency();
		jExecutor.executeScript("arguments[0].click();", aElement);
		Thread.sleep(2000);
		WebElement lElement = pp.getsAbsorbency();
		jExecutor.executeScript("arguments[0].click();", lElement);
		Thread.sleep(2000);
		WebElement dElement = pp.getDisplay();
		jExecutor.executeScript("arguments[0].click();", dElement);
		Thread.sleep(2000);
		WebElement rElement = pp.getsDisplay();
		jExecutor.executeScript("arguments[0].click();", rElement);
		Thread.sleep(2000);
		WebElement bElement = pp.getCot();
		jExecutor.executeScript("arguments[0].click();", bElement);
		Thread.sleep(2000);
		WebElement xElement = pp.getScot();
		jExecutor.executeScript("arguments[0].click();", xElement);

		Log.info(" yes,the user able to select the product according to their needs");
		Log.endTestCase(" Products Select ");
		getDriver().close();
		getDriver().switchTo().window(parentwindowr);

	}
}
