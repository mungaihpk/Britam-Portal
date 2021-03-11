package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageElements {
	private WebElement username_textbox;
	private WebElement password_textbox;
	private WebElement login_button;
	WebDriver driver;

	public LoginPageElements(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUsernameTextbox() {
		username_textbox = driver
				.findElement(By.xpath("//*/input[@id='_com_liferay_login_web_portlet_LoginPortlet_login']"));
		return username_textbox;
	}

	public WebElement getPasswordTextbox() {
		password_textbox = driver.findElement(
				By.xpath("//*/input[@id='_com_liferay_login_web_portlet_LoginPortlet_user-pwds']\r\n" + ""));
		return password_textbox;
	}

	public WebElement getLoginButton() {
		login_button = driver.findElement(By.xpath("//*/button/span[normalize-space(text())='Sign In']"));
		return login_button;
	}
}
