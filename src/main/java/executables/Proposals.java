package executables;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import elements.HomePageElements;
import elements.ProposalsPageElements;

public class Proposals {
	ProposalsPageElements proposalsPageElements;
	HomePageElements homePageElements;
	WebElement proposals_link;
	Select status_dropdown;
	WebDriver driver;
	
	public Proposals(WebDriver driver) {
		this.driver = driver;
		homePageElements = new HomePageElements(driver);
	}
	
	public void navigateToProposalsPage() {
		homePageElements.getProposalsLink().click();
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*/div/button[@id='_QuoteProposal_INSTANCE_AgH3Csq73s0c_searchProposalBtn']")));
	}
	
	public void retrieveProposals() {
		//proposals_link = driver.findElement(By.xpath(
		//		"//div[@class='navbar' and @id='navbar_com_liferay_site_navigation_menu_web_portlet_SiteNavigationMenuPortlet']/ul[@role='menubar']/li/a/span[text()=' Proposals ']"));
		homePageElements.getProposalsLink().click();
		
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*/div/button[@id='_QuoteProposal_INSTANCE_AgH3Csq73s0c_searchProposalBtn']")));
		
		System.out.println("Proposals page loaded");
		
		proposalsPageElements = new ProposalsPageElements(driver);
		//proposalsPageElements.getStartDateInput().click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='datepicker1']")));
		
		//propo
		
		proposalsPageElements.getStartDateDropdown().click();
		proposalsPageElements.getStartDateDatepicker().click();
		
		status_dropdown = proposalsPageElements.getStatusDropdown();
		status_dropdown.selectByVisibleText("Approved");
		
		proposalsPageElements.getSearchButton().click();
		
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//table[@id='_QuoteProposal_INSTANCE_AgH3Csq73s0c_proposal_result_table']/tbody/tr")));
		
		System.out.println("Proposals retrieved");
	}
	
	public void retrieveApprovedProposal() {
		homePageElements.getProposalsLink().click();
		
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*/div/button[@id='_QuoteProposal_INSTANCE_AgH3Csq73s0c_searchProposalBtn']")));
		
		System.out.println("Proposals page loaded");
		
		proposalsPageElements = new ProposalsPageElements(driver);
		//proposalsPageElements.getStartDateInput().click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='datepicker1']")));
		
		proposalsPageElements.getStartDateDropdown().click();
		proposalsPageElements.getStartDateDatepicker().click();
		
		status_dropdown = proposalsPageElements.getStatusDropdown();
		status_dropdown.selectByVisibleText("Approved");
		
		proposalsPageElements.getSearchButton().click();
		
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//table[@id='_QuoteProposal_INSTANCE_AgH3Csq73s0c_proposal_result_table']/tbody/tr")));
		
		
		List<WebElement> table_rows;
		table_rows = driver.findElements(By.xpath("//table[@id='_QuoteProposal_INSTANCE_AgH3Csq73s0c_proposal_result_table']/tbody/tr"));
		
		
		if(table_rows.size() > 1) {
			int random_row;
			random_row = ThreadLocalRandom.current().nextInt(1, table_rows.size() + 1);
			
			WebElement retrieve_button = driver.findElement(By.xpath("//table[@id='_QuoteProposal_INSTANCE_AgH3Csq73s0c_proposal_result_table']/tbody/tr["+random_row+"]/td[10]/a"));
			retrieve_button.click();
			
			ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(1));
		    
		    //WebDriverWait wait = new WebDriverWait(driver, 200);
			//wait.until(ExpectedConditions
			//		.presenceOfElementLocated(By.xpath("//select[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_lob']")));
			
			Wait fluentwait = new FluentWait(driver)
					.withTimeout(900, TimeUnit.SECONDS)
					.pollingEvery(1, TimeUnit.SECONDS)
					.ignoring(Exception.class);
			
			fluentwait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath("//div[@id='btn-section-review-proposal']/a[text()='Download']")));
			
			System.out.println("Retrieved");
		}
	}
}
