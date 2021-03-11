package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageElements {
	private WebElement proposals_link;
	WebDriver driver;

	public HomePageElements(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getProposalsLink() {
		proposals_link = driver.findElement(By.xpath(
				"//*/div[@class='navbar' and @id='navbar_com_liferay_site_navigation_menu_web_portlet_SiteNavigationMenuPortlet']/ul[@role='menubar']/li/a/span[text()=' Proposals ']"));
		return proposals_link;
	}

}
