package com.attends.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.attends.PageObject.Homepage;
import com.attends.PageObject.LoginPom;
import com.attends.Utility.ExpTitle;
import com.attends.Utility.Log;
import com.attends.Utility.XLUtility;
import com.attends.base.BaseClass;

public class LoginPageTest extends BaseClass {

	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser) {
		launchApp(browser);
	}

	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}

	@Test(dataProvider = "login")
	public void login(String userid, String password) throws InterruptedException, IOException {
		Log.startTestCase("login");
		Homepage h = new Homepage();
		h.getCookies().click();
		LoginPom lp = new LoginPom();
		JavascriptExecutor jExecutor = (JavascriptExecutor) getDriver();
		Log.info("Verifying if user able to click register page ");
		WebElement nElement = h.getRegister();
		jExecutor.executeScript("arguments[0].click();", nElement);
		Log.info("user able to click register page  successfully ");
		boolean loginBlock = lp.getLoginBlock().isDisplayed();
		Log.info("Verifying login block present in Customer Login page ");
		if (loginBlock == true) {
			String text = lp.getLoginBlock().getText();
			System.out.println(
					"'In Customer Login  Page ' 'Login Block' is displaying fine  and text of Block is :- " + text);
		} else {
			System.out.println("'Login Block' is not present");
		}
		Log.info("login block present in Customer Login page ");
		Log.info("Verifying if user able to click login button after enter email and passowrd ");
		WebElement textemail = lp.getEmail();
		textemail.clear();
		textemail.sendKeys(userid);
		WebElement textpassword = lp.getPassword();
		textpassword.clear();
		textpassword.sendKeys(password);
		WebElement login = lp.getLoginButton();
		jExecutor.executeScript("arguments[0].click();", login);
		Thread.sleep(4000);

		ExpTitle r = new ExpTitle();
		String expectedTitle1 = r.getExpTitle("Ltitle");
		String actualTitle1 = h.actualTitle(getDriver());
		Reporter.log(actualTitle1, true);
		Assert.assertEquals(actualTitle1, expectedTitle1);
		System.out.println("Title of login Account page is match actualTitle is equal to expectedTitle ");
		Log.info(" user able to click login button after enter email and passowrd successfully  ");
		boolean pageTatile = lp.getPageTitle().isDisplayed();
		Log.info("Verifying page Tatile in My Accpount page ");
		if (pageTatile == true) {
			String text = lp.getPageTitle().getText();
			System.out.println(
					"'In Account Login  Page ' 'Page Title ' is displaying fine  and text of Title is :- " + text);
		} else {
			System.out.println("'Page Title' is not present");
		}
		Log.info(" page Tatile is present in  My Accpount page successfully ");

		java.util.List<WebElement> TabList = getDriver().findElements(By.xpath("//*[@id='myTab']/li"));
		System.out.println("Total number of Tab present My Account page is   :- " + TabList.size()
				+ "  and their list are given below :- ");
		System.out.println(" ");
		for (WebElement webElement : TabList) {

			System.out.println(webElement.getText());

		}
		Log.info(
				" Verifying Previous data while enter  by user at the time of account creation  in  Accpount create  page ");
		java.util.List<WebElement> ListDatsa = getDriver().findElements(By.xpath("//*[@id='display-account']/div"));
		System.out.println("Total number of Row for  Store data in  My Account page is   :- " + ListDatsa.size()
				+ "  and their store data  are given below :- ");
		System.out.println(" ");
		for (WebElement webElement : ListDatsa) {

			System.out.println(webElement.getText());

		}
		Log.info(
				" Previous data  are store  successfully while enter  by user at the time of account creation  in  Accpount create  page ");

		boolean editinfo = lp.getAccountedit().isDisplayed();
		Log.info(
				"Verifying  admins are able to edit previous store data which is enter by user during aaccount creation time  ");
		if (editinfo == true) {
			String text = lp.getAccountedit().getText();
			System.out.println("'In my account  Page '  ' is displaying fine  and text on edit option  is :- " + text);
			lp.getAccountedit().click();
			System.out.println("Edit Option is clickable ");
			getDriver().navigate().back();
		} else {
			System.out.println("''Edit Option' is not present");
		}
		Log.info(
				"admins are able to edit previous store data which is enter by user during aaccount creation time successfully  ");

		Log.endTestCase("login ");

	}

	@DataProvider(name = "login")
	public String[][] getData() throws IOException {

		String path = ".\\TestData\\Data.xlsx";

		XLUtility xlutil = new XLUtility(path);
		int totalRows = xlutil.getRowCount("Sheet3");
		int totalCols = xlutil.getCellCount("Sheet3", 1);
		String login[][] = new String[totalRows][totalCols];
		for (int i = 1; i <= totalRows; i++) {
			for (int j = 0; j < totalCols; j++) {
				login[i - 1][j] = xlutil.getCellData("Sheet3", i, j);
			}
		}

		return login;
	}
}
