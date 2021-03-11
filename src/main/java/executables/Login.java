package executables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import elements.LoginPageElements;
import variables.Urls;

public class Login {
	WebDriver driver;
	WebDriverWait wait;
	FluentWait<WebDriver> fluentWait;
	Urls urls;
	
	WebElement username_textbox, password_textbox, login_btn;
	
	public Login(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		urls = new Urls();
		wait = new WebDriverWait(driver,10,1);
		
		
		/*fluentWait = new FluentWait<>(driver).withTimeout(500, TimeUnit.SECONDS)
	            .pollingEvery(100, TimeUnit.MILLISECONDS)
	            .ignoring(NoSuchElementException.class);*/
	}
	
	public void login(String username, String password) {
		LoginPageElements loginPageElements = new LoginPageElements(driver);
		//driver.get(urls.getLoginUrl());
		driver.get(urls.getFaConnectUrl());
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(loginPageElements.getLoginButton()));
		
		username_textbox = loginPageElements.getUsernameTextbox();
		password_textbox = loginPageElements.getPasswordTextbox();
		login_btn = loginPageElements.getLoginButton();
		
		//username_textbox.sendKeys("lmuchemi");
		//password_textbox.sendKeys("Password1");

		username_textbox.sendKeys(username);
		password_textbox.sendKeys(password);
		login_btn.click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//*/div[@class='navbar' and @id='navbar_com_liferay_site_navigation_menu_web_portlet_SiteNavigationMenuPortlet']/ul[@role='menubar']/li/a/span[text()=' Proposals ']")));
		
		System.out.println("Logged In");
	}

}
