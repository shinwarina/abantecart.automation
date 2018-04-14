package com.abantecart.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abantecart.utilities.Driver;

public class RegistrationPage extends DashboardPage {

	private WebDriver driver;

	public RegistrationPage() {
		driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "heading1")
	public WebElement labelCreateAccount;

	@FindBy(id = "AccountFrm_firstname")
	public WebElement firstName;

	@FindBy(id = "AccountFrm_lastname")
	public WebElement lastName;

	@FindBy(id = "AccountFrm_email")
	public WebElement email;

	@FindBy(id = "AccountFrm_telephone")
	public WebElement telephone;

	@FindBy(id = "AccountFrm_fax")
	public WebElement fax;

	@FindBy(id = "AccountFrm_company")
	public WebElement company;

	@FindBy(id = "AccountFrm_address_1")
	public WebElement address;

	@FindBy(id = "AccountFrm_address_2")
	public WebElement address2;

	@FindBy(id = "AccountFrm_city")
	public WebElement city;

	@FindBy(id = "AccountFrm_zone_id")
	public WebElement state;

	@FindBy(id = "AccountFrm_postcode")
	public WebElement zipCode;

	@FindBy(id = "AccountFrm_country_id")
	public WebElement country;

	@FindBy(id = "AccountFrm_loginname")
	public WebElement loginName;

	@FindBy(id = "AccountFrm_password")
	public WebElement password;

	@FindBy(id = "AccountFrm_confirm")
	public WebElement passwordConfirm;

	@FindBy(id = "AccountFrm_newsletter1")
	public WebElement newsSubscribeYes;

	@FindBy(id = "AccountFrm_newsletter0")
	public WebElement newsSubscribeNo;

	@FindBy(id = "AccountFrm_agree")
	public WebElement agreePrivacyPolicy;

	@FindBy(xpath = "//button[@title = 'Continue']")
	public WebElement continueButton;

	@FindBy(xpath = "//ul[@class='side_account_list']//a")
	public List<WebElement> accountLinks;

	@FindBy(className = "help-block")
	public List<WebElement> helpMessages;

	@FindBy(className = "alert")
	public WebElement warningAlert;

	@FindBy(className = "maintext")
	public WebElement headingText;

	public boolean isAt() {
		return driver.getTitle().equalsIgnoreCase("Create Account");
	}

	public String customerFieldCheck(String str) {
		String[] empty = { "<firstName>", "<lastName>", "<email>", "<telephone>", "<fax>",
				"<company>", "<address>", "<address2>", "<city>", "<state>", "<zipCode>", "<country>",
				"<loginName>", "<password>", "<passwordConfirm>" };

		for (String string : empty) {
			if (str.equals(string))
				return "";
		}

		return str;
	}

	public String generateRandomLoginName(String name) {
		return name + new Random().nextInt(1000000);
	}

	public String generateRandomEmail(String fullEmail) {
		Random r = new Random();
		if (fullEmail.contains("@") && fullEmail.contains(".com")) {
			String[] arr = fullEmail.split("@");
			return arr[0] + r.nextInt(100000) + "@" + arr[1];
		}

		return fullEmail + r.nextInt(100000);
	}

	public List<WebElement> getElementsFromLabels(List<String> strList) {
		List<WebElement> eleList = new ArrayList<>();

		int index = 0;
		for (WebElement ele : Driver.getDriver().findElements(By.tagName("label"))) {
			if (ele.getText().startsWith(strList.get(index))) {
				eleList.add(ele);
				index++;
			}

		}

		return eleList;
	}

	public WebElement getLabelsField(WebElement element) {
		Driver.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		try {
			return element.findElement(By.xpath("./..//input"));
		} catch (NoSuchElementException e) {
			return element.findElement(By.xpath("./..//select"));
		} finally {
			Driver.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		}
	}

}
