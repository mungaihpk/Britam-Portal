package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApplicationDetailsPageElements {
	WebDriver driver;

	private WebElement passport_input;
	private WebElement national_id_input;
	private WebElement pin_input;
	private WebElement source_of_funds_dropdown;
	private WebElement nationality_dropdown;
	private WebElement postal_address_input;
	private WebElement postal_code_input;
	private WebElement city_input;
	private WebElement country_input;

	private WebElement mobile_communication_checkbox;
	private WebElement email_communication_checkbox;

	private WebElement beneficiary_firstname_input;
	private WebElement beneficiary_middlename_input;
	private WebElement beneficiary_lastname_input;
	private WebElement beneficiary_relationship_dropdown;
	private WebElement beneficiary_date_of_birth_input;
	private WebElement beneficiary_percentage_input;
	private WebElement beneficiary_national_id_input;
	private WebElement beneficiary_gender_dropdown;
	private WebElement beneficiary_mobile_number_input;
	private WebElement beneficiary_email_input;
	private WebElement beneficiary_add_button;

	private WebElement save_proposal_button;
	private WebElement proceed_button;
	
	private WebElement file_upload_input;

	public ApplicationDetailsPageElements(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getPassportInput() {
		passport_input = driver.findElement(
				By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_passportNumber_application']"));
		return passport_input;
	}

	public WebElement getNationalIdInput() {
		national_id_input = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_national_Id_application']"));
		return national_id_input;
	}

	public WebElement getPinInput() {
		pin_input = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_pin_application']"));
		return pin_input;
	}

	public WebElement getSourceOfFundsDropdown() {
		source_of_funds_dropdown = driver.findElement(
				By.xpath("//select[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_sourceOfFund_application']"));
		return source_of_funds_dropdown;
	}

	public WebElement getNationalityDropdown() {
		nationality_dropdown = driver.findElement(
				By.xpath("//select[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_nationality_application']"));
		return nationality_dropdown;
	}

	public WebElement getPostalAddressInput() {
		postal_address_input = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_postCode_application']"));
		return postal_address_input;
	}

	public WebElement getPostalCodeInput() {
		postal_code_input = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_pobox_application']"));
		return postal_code_input;
	}

	public WebElement getCityInput() {
		city_input = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_city_application']"));
		return city_input;
	}

	public WebElement getCountryInput() {
		country_input = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_street_application']"));
		return country_input;
	}

	public WebElement getMobileCommunicationCheckbox() {
		mobile_communication_checkbox = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_mobile_communication']"));
		return mobile_communication_checkbox;
	}

	public WebElement getEmailCommunicationCheckbox() {
		email_communication_checkbox = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_email_communication']"));
		return email_communication_checkbox;
	}

	public WebElement getBeneficiaryFirstnameInput() {
		beneficiary_firstname_input = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_firstName_beneficiary']"));
		return beneficiary_firstname_input;
	}

	public WebElement getBeneficiaryMiddlenameInput() {
		beneficiary_middlename_input = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_middleName_beneficiary']"));
		return beneficiary_middlename_input;
	}

	public WebElement getBeneficiaryLastnameInput() {
		beneficiary_lastname_input = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_lastName_beneficiary']"));
		return beneficiary_lastname_input;
	}

	public WebElement getBeneficiaryRelationshipDropdown() {
		beneficiary_relationship_dropdown = driver.findElement(
				By.xpath("//select[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_relationship_beneficiary']"));
		return beneficiary_relationship_dropdown;
	}

	public WebElement getBeneficiaryDateOfBirthInput() {
		beneficiary_date_of_birth_input = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_dob_beneficiary']"));
		return beneficiary_date_of_birth_input;
	}

	public WebElement getBeneficiaryPercentageInput() {
		beneficiary_percentage_input = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_percentage_beneficiary']"));
		return beneficiary_percentage_input;
	}

	public WebElement getBeneficiaryNationalIdInput() {
		beneficiary_national_id_input = driver.findElement(
				By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_nationalIdBene_beneficiary']"));
		return beneficiary_national_id_input;
	}

	public WebElement getBeneficiaryGenderDropdown() {
		beneficiary_gender_dropdown = driver
				.findElement(By.xpath("//select[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_gender_beneficiary']"));
		return beneficiary_gender_dropdown;
	}

	public WebElement getBeneficiaryMobileNumberInput() {
		beneficiary_mobile_number_input = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_mobileNo_beneficiary']"));
		return beneficiary_mobile_number_input;
	}

	public WebElement getBeneficiaryEmailInput() {
		beneficiary_email_input = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_emailId_beneficiary']"));
		return beneficiary_email_input;
	}

	public WebElement getBeneficiaryAddButton() {
		beneficiary_add_button = driver
				.findElement(By.xpath("//button[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_add_beneficiary']"));
		return beneficiary_add_button;
	}

	public WebElement getSaveProposalButton() {
		save_proposal_button = driver
				.findElement(By.xpath("//button[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_save_proposal']"));
		return save_proposal_button;
	}

	public WebElement getProceedButton() {
		proceed_button = driver
				.findElement(By.xpath("//button[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_submit_quote']"));
		return proceed_button;
	}

	public WebElement getFileUploadInput() {
		file_upload_input = driver
				.findElement(By.xpath("//input[@id='fileUpload1']"));
		return file_upload_input;
	}

}
