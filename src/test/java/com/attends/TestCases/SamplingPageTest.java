package com.attends.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.attends.PageObject.Homepage;
import com.attends.PageObject.SampleCartPom;
import com.attends.Utility.Log;
import com.attends.base.BaseClass;

public class SamplingPageTest extends BaseClass {

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
	public void sampling() throws InterruptedException, IOException {
		Log.startTestCase(" ***** Sampling ***** ");
		Homepage h = new Homepage();
		SampleCartPom sp = new SampleCartPom();
		h.getCookies().click();
		Thread.sleep(2000);
		JavascriptExecutor jExecutor = (JavascriptExecutor) getDriver();
		Log.info("Verifying if user able to click Free sample button  on home page ");
		WebElement nElement = h.getFreeSample();
		jExecutor.executeScript("arguments[0].click();", nElement);
		WebElement gElement = sp.getGetSample();
		jExecutor.executeScript("arguments[0].click();", gElement);
		Thread.sleep(2000);
		WebElement dElement = sp.getSelectProducts();
		jExecutor.executeScript("arguments[0].click();", dElement);
		Thread.sleep(2000);
		boolean info = sp.getProductinfo().isDisplayed();
		if (info == true) {
			String text = sp.getProductinfo().getText();
			System.out.println(
					"'Pull-Ons page ' product info   is displaying and text written for information are :- " + text);
		} else {
			System.out.println("' product info' is not present");
		}
		sp.getIncontincelevel().click();
		sp.getAbsorbencylevel().click();
		Thread.sleep(2000);
		sp.getProductSample().click();
		Thread.sleep(8000);
		String text = sp.getMessage().getText();
		System.out.println(text);
		sp.getShoppingcart().click();
		Thread.sleep(2000);
		WebElement click = sp.getDeleteProduct();
		jExecutor.executeScript("arguments[0].click();", click);
		Thread.sleep(1000);
		String t = getDriver().findElement(By.xpath("//div[@id='modal-content-20']/div")).getText();
		Thread.sleep(1000);
		System.out.println(t);
		getDriver().findElement(By.xpath("//span[.='OK']")).click();
		Thread.sleep(2000);
		String text1 = getDriver().findElement(By.xpath("//strong[@class='subtitle empty']")).getText();
		System.out.println(text1);
		Log.endTestCase(" ******** Sampling ******** ");

	}
}