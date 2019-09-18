package com.cogitate.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cogitate.base.TestBase;
import com.cogitate.util.ElementUtil;

public class LoginPage extends TestBase {
	
	HomePage homepage;
	ElementUtil elementUtil;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		elementUtil = new ElementUtil(driver);
	}

//Page Factory WebElements
	By contactsMainTab = By.id("nav-primary-contacts-branch");
	By userName = By.id("txtUserName");
	By pswd = By.id("txtPassword");
	By btnLogin = By.id("btnSubmit");
	
	

	public HomePage doLogin(String username, String pwd) {
		elementUtil.doSendKeys(userName, username);
		elementUtil.doSendKeys(pswd, pwd);
		elementUtil.doClick(btnLogin);
		return new HomePage(driver);
	}

}
