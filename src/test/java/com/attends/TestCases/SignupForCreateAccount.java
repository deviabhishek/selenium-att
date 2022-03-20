package com.attends.TestCases;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
import com.attends.PageObject.RegisterPom;
import com.attends.Utility.ExpTitle;
import com.attends.Utility.Log;
import com.attends.Utility.XLUtility;
import com.attends.base.BaseClass;

public class SignupForCreateAccount extends BaseClass {
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

	public void signUp(String firstName, String lastName, String email, String phoneNumber, String password,
			String houseno, String exp) throws InterruptedException, IOException {
		Log.startTestCase(" Create Account page ");
		Homepage h = new Homepage();
		h.getCookies().click();
		RegisterPom reg = new RegisterPom();
		JavascriptExecutor jExecutor = (JavascriptExecutor) getDriver();
		WebElement nElement = h.getRegister();
		jExecutor.executeScript("arguments[0].click();", nElement);
		Log.info("Verifying if user able to click on  create account Button  in costmer login page ");
		WebElement create = reg.getCreateAccount();
		jExecutor.executeScript("arguments[0].click();", create);
		Thread.sleep(2000);
		ExpTitle r = new ExpTitle();
		String expectedTitle1 = r.getExpTitle("CAtitle");
		String actualTitle1 = h.actualTitle(getDriver());
		Reporter.log(actualTitle1, true);
		Assert.assertEquals(actualTitle1, expectedTitle1);
		System.out.println("Title of create  Account page is match ,actualTitle is equal to expectedTitle ");
		Log.info("User able to click on create account button in costmer login page successfully ");

		Log.info("Verifying if user able to  fill the all fields  for create account on  create new account page");
		WebElement textFirstName = reg.getFirstName();
		textFirstName.clear();
		textFirstName.sendKeys(firstName);
		WebElement textlastName = reg.getLastName();
		textlastName.clear();
		textlastName.sendKeys(lastName);
		WebElement terms = reg.getTerm();
		jExecutor.executeScript("arguments[0].click();", terms);

		WebElement street = reg.getStreet();
		street.sendKeys("Black");
		Thread.sleep(2000);
		java.util.List<WebElement> list = getDriver().findElements(By.xpath("//*[@id='street-auto-complete']/ul/li"));
		System.out.println("Total number of suggestion after type 'Bang' is  :- " + list.size()
				+ "  and list of address are given below :- ");
		for (int k = 0; k < list.size(); k++) {
			System.out.println(list.get(k).getText());

		}
		WebElement PElement = getDriver().findElement(By
				.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div/div[2]/div/form/div/div[4]/div/div/div/ul/li[1]"));
		jExecutor.executeScript("arguments[0].click();", PElement);
		Thread.sleep(5000);
		WebElement dropdowngender = reg.getGender();
		Select selectg = new Select(dropdowngender);
		selectg.selectByIndex(2);

		Thread.sleep(2000);
		WebElement dropdowntatile = reg.getTitle();
		Select selectt = new Select(dropdowntatile);
		selectt.selectByIndex(1);
		Thread.sleep(2000);
		WebElement company = reg.getCompanyName();
		company.sendKeys("Abc Pvt Ltd , USA");
		Thread.sleep(2000);
		WebElement companyID = reg.getCompanyId();
		companyID.sendKeys("234567");
		Thread.sleep(2000);
		WebElement JobTatile = reg.getJobTitle();
		JobTatile.sendKeys("test engineer");
		Thread.sleep(3500);
		WebElement dropdowntype = reg.getType();
		Select selecty = new Select(dropdowntype);
		selecty.selectByIndex(3);
		Thread.sleep(1000);
		WebElement hear = reg.getHear();
		hear.sendKeys(" By News Paper ");
		Thread.sleep(2000);
		WebElement info = reg.getAdditional();
		info.sendKeys(" please write the additional information ");
		Thread.sleep(2000);
		WebElement textemail = reg.getEmail();
		textemail.clear();
		textemail.sendKeys(email);
		Thread.sleep(2000);
		WebElement textHouseNO = reg.getHouseNumber();
		textHouseNO.clear();
		textHouseNO.sendKeys(houseno);
		Thread.sleep(2000);
		WebElement textphones = reg.getPhoneNumber();
		textphones.clear();
		textphones.sendKeys(phoneNumber);
		Thread.sleep(2000);
		WebElement textpassword = reg.getPassword();
		textpassword.clear();
		textpassword.sendKeys(password);
		Thread.sleep(2000);
		WebElement textrepassword = reg.getConfirmpassword();
		textrepassword.clear();
		textrepassword.sendKeys(password);
		Log.info(" Verifying if user able to click on calender for D.O.B ");
		WebElement calender = reg.getCalendertextBox();
		jExecutor.executeScript("arguments[0].click();", calender);
		Thread.sleep(3000);
		String date = "15-Dec-1994";
		String dateArr[] = date.split("-");
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];

		reg.getYear().click();
		Select select1 = new Select(reg.getYear());
		select1.selectByVisibleText(year);

		reg.getMonth().click();
		Select select = new Select(reg.getMonth());
		select.selectByVisibleText(month);

		String beforeXpath = "//*[@id='ui-datepicker-div']/table/tbody/tr[";
		String AfterXpath = "]/td[";
		final int totalweekdays = 7;
		boolean flag = false;
		String dayval = null;
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= totalweekdays; j++) {
				try {
					dayval = getDriver().findElement(By.xpath(beforeXpath + i + AfterXpath + j + "]")).getText();
				} catch (NoSuchElementException e) {
					System.out.println("Please enter a correct date value ");
					flag = false;
					break;
				}

				if (dayval.equals(day)) {
					getDriver().findElement(By.xpath(beforeXpath + i + AfterXpath + j + "]")).click();
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}

		}
		Thread.sleep(1000);
		Log.info(" user able to  fill the all fields  for create account on  create new account page Successfully ");
		java.util.List<WebElement> listContact = getDriver().findElements(By.xpath("(//div[@class='col-9'])"));

		System.out.println("Total number of Way To contact with company  is  :- " + listContact.size()
				+ "  and their list are given below :- ");

		for (WebElement webElement : listContact) {

			System.out.println(webElement.getText());

		}
		Log.info("Address of company are displaying fine in create account page ");

		Log.endTestCase(" Create Account page ");

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
