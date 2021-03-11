package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProposalsPageElements {
	private WebDriver driver;
	private WebElement search_button;
	private WebElement reset_button;
	private WebElement create_quote_button;
	private WebElement start_date_dropdown;
	private WebElement start_date_datepicker;
	private WebElement proposals_table_rows;
	private WebElement start_date_input;
	private Select status_dropdown;

	public ProposalsPageElements(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getStartDateDatepicker() {
		start_date_datepicker = driver.findElement(By.xpath(
				"//*/div[@class='datepicker-container datepicker-dropdown datepicker-top-left']/div[@class='datepicker-panel']/ul[@data-view='years']/li[text()='2017']"));
		return start_date_datepicker;
	}

	public WebElement getSearchButton() {
		search_button = driver
				.findElement(By.xpath("//*/div/button[@id='_QuoteProposal_INSTANCE_AgH3Csq73s0c_searchProposalBtn']"));
		return search_button;
	}

	public WebElement getResetButton() {
		reset_button = driver
				.findElement(By.xpath("//*/div/button[@id='_QuoteProposal_INSTANCE_AgH3Csq73s0c_resetProposalBtn']"));
		return reset_button;
	}

	public WebElement getStartDateDropdown() {
		start_date_dropdown = driver.findElement(By.xpath("//div[@id='datepicker1']"));
		return start_date_dropdown;
	}

	public WebElement getCreateQuoteButton() {
		create_quote_button = driver.findElement(By.xpath("//a[text()='Create Quote']"));
		return create_quote_button;
	}

	public WebElement getProposalsTableRows() {
		return proposals_table_rows;
	}

	public void setProposalsTableRows() {
		proposals_table_rows = driver.findElement(
				By.xpath("//table[@id='_QuoteProposal_INSTANCE_AgH3Csq73s0c_proposal_result_table']/tbody/tr"));
	}

	public WebElement getStartDateInput() {
		start_date_input = driver.findElement(By.xpath("//input[@id='_QuoteProposal_INSTANCE_AgH3Csq73s0c_fromDate']"));
		return start_date_input;
	}
	
	public Select getStatusDropdown() {
		status_dropdown = new Select(driver.findElement(By.xpath("//select[@id='_QuoteProposal_INSTANCE_AgH3Csq73s0c_statusSearchProposal']")));
		return status_dropdown;
	}
}
