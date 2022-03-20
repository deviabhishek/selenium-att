package com.attends.TestCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.attends.PageObject.Homepage;
import com.attends.PageObject.SampleCartPom;
import com.attends.Utility.ExpTitle;
import com.attends.Utility.Log;
import com.attends.Utility.XLUtility;
import com.attends.base.BaseClass;

public class SampleCartPageTest extends BaseClass {

	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser) {
		launchApp(browser);
	}

	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}

	@Test(dataProvider = "SignUp")
	public void Sample(String firstName, String lastName, String email, String phoneNumber, String password,
			String houseno, String exp) throws InterruptedException, IOException {
		Log.startTestCase(" Free Sample ");
		Homepage h = new Homepage();
		SampleCartPom sp = new SampleCartPom();
		h.getCookies().click();
		Thread.sleep(2000);
		JavascriptExecutor jExecutor = (JavascriptExecutor) getDriver();
		Log.info("Verifying if user able to click Free sample button  on home page ");
		WebElement nElement = h.getFreeSample();
		jExecutor.executeScript("arguments[0].click();", nElement);
		Thread.sleep(2000);
		ExpTitle r = new ExpTitle();
		String expectedTitle = r.getExpTitle("Ftitle");
		String actualTitle = h.actualTitle(getDriver());
		Reporter.log(actualTitle, true);
		Assert.assertEquals(actualTitle, expectedTitle);
		Log.info("user able to click Free sample button successfully on home page ");

		boolean image = sp.getImage().isDisplayed();

		if (image == true) {

			System.out.println("'Image is present  in Free Sample page  expected true/False :- " + image);
		} else {
			System.out.println("'Image is present or not in Free Sample page");
		}
		boolean heading = sp.getHeading().isDisplayed();

		if (heading == true) {

			System.out.println("'Heading 'is present  in Free Sample page  expected true/False :- " + heading);
		} else {
			System.out.println("'Heading is present is not in Free Sample page");
		}
		boolean textContent = sp.getTextContent().isDisplayed();
		Log.info("Verifying page Tatile in My Accpount page ");
		if (textContent == true) {
			String text = sp.getTextContent().getText();
			System.out.println(
					"'In Free Sample page ' 'Text Content ' is displaying fine  and text of Content is :- " + text);
		} else {
			System.out.println(" 'In Free Sample page ' 'Text Content 'is not present");
		}
		Log.info("Verifying if the user are able select the products it goes shoping cart ");
		WebElement gElement = sp.getGetSample();
		jExecutor.executeScript("arguments[0].click();", gElement);
		Thread.sleep(2000);
		String expectedTitle2 = getDriver().getTitle();
		String ActualTitle = "View All Products | Attends";
		if (expectedTitle2.equalsIgnoreCase(ActualTitle)) {
			System.out.println("Title is matched for page  ");
		} else {
			System.out.println("Title is not  matched ");
		}
		Log.info("users are successfully landed on view all product page and users are able to select the free sample");
		WebElement dElement = sp.getSample();
		jExecutor.executeScript("arguments[0].click();", dElement);
		Thread.sleep(2000);
		System.out.println(getDriver().getTitle());
		Log.info(" users are successfully landed on Attends Pull-Ons page ");
		Log.info(
				"Verifying if the product 'Information','Discription' and 'feature' present in Pull-Ons page for selected Product by user ");
		boolean info = sp.getProductinfo().isDisplayed();
		if (info == true) {
			String text = sp.getProductinfo().getText();
			System.out.println(
					"'Pull-Ons page ' product info   is displaying and text written for information are :- " + text);
		} else {
			System.out.println("' product info' is not present");
		}
		boolean discription = sp.getProductdescription().isDisplayed();
		if (discription == true) {
			String text = sp.getProductdescription().getText();
			System.out.println(
					"'Pull-Ons page ' product discription   is displaying and text written for discription are :- "
							+ text);
		} else {
			System.out.println("' product Discription' is not present");
		}
		WebElement fElement = sp.getFeatureButton();
		jExecutor.executeScript("arguments[0].click();", fElement);
		boolean feature = sp.getProductFeature().isDisplayed();
		if (feature == true) {
			String text = sp.getProductFeature().getText();
			System.out.println(
					"'Pull-Ons page ' product Feature   is displaying and text written for Feature are :- " + text);
		} else {
			System.out.println("' product Feature' is not present");
		}
		Log.info(
				"product Information ,Discription and Feature are visible in Pull-Ons page for selected Product by user ");
		Log.info("verifying if ,selected product successfully added  in shoping Cart on Pull-Ons page ");
		sp.getIncontincelevel().click();
		Thread.sleep(1000);
		sp.getAbsorbencylevel().click();
		Thread.sleep(2000);
		sp.getProductSample().click();
		Thread.sleep(8000);
		Log.info("selected product successfully added  in shoping Cart on Pull-Ons page  ");
		Log.info("Verifying if user able to Edit Free sample in shoping Cart on Pull-Ons page  ");
		WebElement cElement = sp.getShoppingcart();
		jExecutor.executeScript("arguments[0].click();", cElement);
		Thread.sleep(2000);
		Log.info("user able to click on shoping Cart  Button on Pull-Ons page  ");
		Log.info("yes,selected product goes to shoping cart by users successfully ");
		System.out.println("Title is match after clicking proceed to check out");
		boolean ProductName = sp.getProductName().isDisplayed();
		if (ProductName == true) {
			String name = sp.getProductName().getText();
			System.out.println("'Selected Product 'is present  in Shopping Cart  expected true/False :- " + ProductName
					+ "  What is the name of products :- " + name);
		} else {
			System.out.println("'Selected Product is present is not in Free Sample page");
		}
		WebElement qElement = sp.getEditPlus();
		jExecutor.executeScript("arguments[0].click();", qElement);
		Thread.sleep(2000);
		WebElement bElement = sp.getEditMinus();
		jExecutor.executeScript("arguments[0].click();", bElement);
		Thread.sleep(2000);
		WebElement checkout = sp.getCheckout();
		jExecutor.executeScript("arguments[0].click();", checkout);
		Thread.sleep(2000);
		Log.info("Verifying if user able to  fill the all fields  for Ship samples on Checkout Attends page");
		Assert.assertTrue(getDriver().getTitle().equals("Checkout | Attends"));
		boolean PageTatile = sp.getPagetitle().isDisplayed();
		if (ProductName == true) {
			String name = sp.getPagetitle().getText();
			System.out.println("'Page Title  'is present  in Checkout Attends page  expected true/False :- "
					+ PageTatile + "  What is the name of Page Title :- " + name);
		} else {
			System.out.println("'Page Title' is present is not in Checkout Attends page ");
		}
		Thread.sleep(2000);
		WebElement textemail = sp.getEmail();
		textemail.clear();
		textemail.sendKeys(email);
		Thread.sleep(2000);
		WebElement textFirstName = sp.getFirstName();
		textFirstName.clear();
		textFirstName.sendKeys(firstName);
		Thread.sleep(2000);
		WebElement textlastName = sp.getLastName();
		textlastName.clear();
		textlastName.sendKeys(lastName);
		WebElement dropdowngender = sp.getGender();
		Select selectg = new Select(dropdowngender);
		selectg.selectByIndex(2);
		Thread.sleep(2000);
		WebElement dob = sp.getCalendertextBox();
		dob.sendKeys("12/12/1994");
		dob.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		WebElement dropdowntatile = sp.getDropTitle();
		Select selectt = new Select(dropdowntatile);
		selectt.selectByIndex(3);
		Thread.sleep(1500);
		sp.getHouseno().sendKeys("304");
		Thread.sleep(1000);
		Select select11 = new Select(sp.getCountry());
		select11.selectByVisibleText("India");
		sp.getRegion().click();
		Thread.sleep(1500);
		Select selectr = new Select(sp.getRegion());
		selectr.selectByIndex(4);
		Thread.sleep(1500);
		System.out.println("Helllo");
		sp.getStreet().sendKeys("ABC colony");
		Thread.sleep(1000);
		sp.getCompany().sendKeys("ABC School of testing");
		Thread.sleep(1000);
		sp.getCompanyId().sendKeys("304425");
		Thread.sleep(1000);
		sp.getZipCode().sendKeys("560100");
		Thread.sleep(1500);
		sp.getCountry().click();
		Thread.sleep(1500);
		WebElement textphones = sp.getPhoneNumber();
		textphones.clear();
		textphones.sendKeys(phoneNumber);
		Thread.sleep(1500);
		WebElement hear = sp.getHear();
		Thread.sleep(1500);
		hear.sendKeys(" By News Paper ");
		WebElement info1 = sp.getAdditional();
		info1.sendKeys(" please write the additional information ");
		Thread.sleep(2000);
		WebElement terms = sp.getTerm();
		jExecutor.executeScript("arguments[0].click();", terms);
		Thread.sleep(1500);
		WebElement dropdowntype = sp.getType();
		Select selecty = new Select(dropdowntype);
		selecty.selectByIndex(3);
		Thread.sleep(1500);
		WebElement frame = sp.getFrame();
		getDriver().switchTo().frame(frame);
		WebElement captcha = sp.getRecaptcha();
		jExecutor.executeScript("arguments[0].click();", captcha);
		Thread.sleep(2000);
		WebElement kElement = sp.getShipSample();
		jExecutor.executeScript("arguments[0].click();", kElement);
		Thread.sleep(2000);
		Log.endTestCase(" Free Sample ");
	}

	@DataProvider(name = "SignUp")
	public String[][] getData() throws IOException {

		String path = ".\\TestData\\Data.xlsx";

		XLUtility xlutil = new XLUtility(path);
		int totalRows = xlutil.getRowCount("Sheet2");
		int totalCols = xlutil.getCellCount("Sheet2", 1);
		String SignUp[][] = new String[totalRows][totalCols];
		for (int i = 1; i <= totalRows; i++) {
			for (int j = 0; j < totalCols; j++) {
				SignUp[i - 1][j] = xlutil.getCellData("Sheet2", i, j);
			}
		}

		return SignUp;
	}
}