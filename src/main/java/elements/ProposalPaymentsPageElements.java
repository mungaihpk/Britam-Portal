package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProposalPaymentsPageElements {
	WebDriver driver;

	private Select payment_method_dropdown;
	private Select bank_dropdown;
	private Select branch_dropdown;
	private WebElement account_number_input;

	private Select dd_processing_bank_dropdown;
	private Select collection_day_dropdown;
	private WebElement payment_date_input;

	private WebElement postal_address_input;
	private WebElement postal_code_input;
	private WebElement city_input;
	private WebElement country_input;

	private WebElement mobile_communication_checkbox;
	private WebElement email_communication_checkbox;

	private Select benefit_payment_method_dropdown;
	private Select benefit_bank_dropdown;
	private Select benefit_branch_dropdown;
	private WebElement benefit_account_number_input;

	private WebElement save_button;
	private WebElement proceed_button;

	public ProposalPaymentsPageElements(WebDriver driver) {
		this.driver = driver;
	}

	public Select getPaymentMethodDropdown() {
		payment_method_dropdown = new Select(driver
				.findElement(By.xpath("//select[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_payment-method_initial']")));
		return payment_method_dropdown;
	}

	public Select getBankDropdown() {
		bank_dropdown = new Select(driver
				.findElement(By.xpath("//select[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_bank_initial']")));
		return bank_dropdown;
	}

	public Select getBranchDropdown() {
		branch_dropdown = new Select(driver
				.findElement(By.xpath("//select[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_branch_initial']")));
		return branch_dropdown;
	}

	public WebElement getAccountNumberInput() {
		account_number_input = driver.findElement(
				By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_accountNumberDirect_initial']"));
		return account_number_input;
	}

	public Select getDdProcessingBankDropdown() {
		dd_processing_bank_dropdown = new Select(driver.findElement(
				By.xpath("//select[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_dd-processing-bank_initial']")));
		return dd_processing_bank_dropdown;
	}

	public Select getCollectionDayDropdown() {
		collection_day_dropdown = new Select(driver
				.findElement(By.xpath("//select[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_collection-day_initial']")));
		return collection_day_dropdown;
	}

	public WebElement getPaymentDateInput() {
		payment_date_input = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_paymentDate_initial']"));
		return payment_date_input;
	}

	public WebElement getPostalAddressInput() {
		postal_address_input = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_postCode_payer-payment']"));
		return postal_address_input;
	}

	public WebElement getPostalCodeInput() {
		postal_code_input = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_pobox_payer-payment']"));
		return postal_code_input;
	}

	public WebElement getCityInput() {
		city_input = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_city_payer-payment']"));
		return city_input;
	}

	public WebElement getCountryInput() {
		country_input = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_street_payer-payment']"));
		return country_input;
	}

	public WebElement getMobileCommunicationCheckbox() {
		mobile_communication_checkbox = driver.findElement(
				By.xpath("(//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_mobile_communication'])[2]"));
		return mobile_communication_checkbox;
	}

	public WebElement getEmailCommunicationCheckbox() {
		email_communication_checkbox = driver.findElement(
				By.xpath("(//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_email_communication'])[2]"));
		return email_communication_checkbox;
	}

	public Select getBenefitPaymentMethodDropdown() {
		benefit_payment_method_dropdown = new Select(driver
				.findElement(By.xpath("//select[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_payment-method_benefit']")));
		return benefit_payment_method_dropdown;
	}

	public Select getBenefitBankDropdown() {
		benefit_bank_dropdown = new Select(driver
				.findElement(By.xpath("//select[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_bank_benefit']")));
		return benefit_bank_dropdown;
	}

	public Select getBenefitBranchDropdown() {
		benefit_bank_dropdown = new Select(driver
				.findElement(By.xpath("//select[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_branch_benefit']")));
		return benefit_branch_dropdown;
	}

	public WebElement getBenefitAccountNumberInput() {
		benefit_account_number_input = driver.findElement(
				By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_accountNumberDirect_benefit']"));
		return benefit_account_number_input;
	}

	public WebElement getSaveButton() {
		save_button = driver
				.findElement(By.xpath("//button[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_save_proposal_payment']"));
		return save_button;
	}

	public WebElement getProceedButton() {
		proceed_button = driver.findElement(
				By.xpath("//button[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_proceed_proposal_payment']"));
		return proceed_button;
	}

}
