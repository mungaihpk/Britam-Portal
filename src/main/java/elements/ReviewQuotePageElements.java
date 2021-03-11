package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReviewQuotePageElements {
	WebDriver driver;

	private WebElement modify_quote_link;
	private WebElement proceed_button;

	public ReviewQuotePageElements(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getModifyQuoteLink() {
		modify_quote_link = driver.findElement(By.xpath("//span[@id='modifyQuote']/a"));
		return modify_quote_link;
	}

	public WebElement getProceedButton() {
		proceed_button = driver
				.findElement(By.xpath("//button[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_create_proposal']"));
		return proceed_button;
	}

}
