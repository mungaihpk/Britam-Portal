package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateQuotePageElements {
	private WebElement create_quote_button;
	private Select line_of_business_dropdown;
	private WebElement insured_dob_input;
	private WebElement start_date_input;
	private Select category_dropdown;
	private Select product_dropdown;
	private WebElement existing_customer_radio;
	private WebElement new_customer_radio;
	private WebElement nationalid_input;
	private WebElement search_id_button;
	private WebElement reset_id_button;
	private WebElement get_quote_button;

	private WebElement birth_certificate_input;
	private WebElement surname_input;
	private WebElement search_birth_certificate_button;
	private WebElement reset_birth_certificate_button;

	private WebElement firstname_input;
	private WebElement middlename_input;
	private WebElement lastname_input;
	private WebElement country_code_dropdown;
	private WebElement phonenumber_input;
	private WebElement email_input;
	private WebElement dob_input;
	private Select gender_dropdown;
	private WebElement smoker_yes_radio;
	private WebElement smoker_no_radio;
	private Select occupation_dropdown;

	private WebElement calculate_sum_assured_radio;
	private WebElement calculate_premium_radio;

	private WebElement premium_input;
	private Select frequency_dropdown;
	private Select terms_dropdown;

	private WebElement add_member_button;

	private WebElement sum_assured_input;

	private WebElement get_benefits_button;

	WebDriver driver;

	public CreateQuotePageElements(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement getCreateQuoteButton() {
		create_quote_button = driver.findElement(By.xpath("//a[text()='Create Quote']"));
		return create_quote_button;
	}

	public Select getLineOfBusinessDropdown() {
		line_of_business_dropdown = new Select(
				driver.findElement(By.xpath("//select[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_lob']")));
		return line_of_business_dropdown;
	}

	public WebElement getInsuredDob() {
		insured_dob_input = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_main-dob']"));
		return insured_dob_input;
	}

	public WebElement getStartDateInput() {
		start_date_input = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_main-start-date']"));
		return start_date_input;
	}

	public Select getCategoryDropdown() {
		category_dropdown = new Select(
				driver.findElement(By.xpath("//select[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_category']")));
		return category_dropdown;
	}

	public Select getProductDropdown() {
		product_dropdown = new Select(
				driver.findElement(By.xpath("//select[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_product']")));
		return product_dropdown;
	}

	public WebElement getNationalidInput() {

		return nationalid_input;
	}

	public WebElement getNewCustomerRadio() {
		new_customer_radio = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_new-customer']"));
		return new_customer_radio;
	}

	public WebElement getSearchIdButton() {
		search_id_button = driver.findElement(
				By.xpath("//button[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_search_nationalId_insured']"));
		return search_id_button;
	}

	public WebElement getResetIdButton() {
		reset_id_button = driver.findElement(By.xpath(
				"//button[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_reset_search_insured' and @onclick=\"resetNationalSearch('_insured');\"]"));
		return reset_id_button;
	}

	public WebElement getExistingCustomerRadio() {
		existing_customer_radio = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_exitsing-customer']"));
		return existing_customer_radio;
	}

	public WebElement getBirthCertificateInput() {
		birth_certificate_input = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_certiNumer_insured']"));
		return birth_certificate_input;
	}

	public WebElement getSurnameInput() {
		surname_input = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_surname_insured']"));
		return surname_input;
	}

	public WebElement getSearchBirthCertificateButton() {
		search_birth_certificate_button = driver.findElement(
				By.xpath("//button[@id=\"_QuoteCalculator_INSTANCE_ms03ctkSkfxq_search_birthCerti_insured\"]"));
		return search_birth_certificate_button;
	}

	public WebElement getResetBirthCertificateButton() {
		reset_birth_certificate_button = driver.findElement(By.xpath(
				"//button[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_reset_search_insured' and @onclick=\"resetNationalSearch('_insured');\"]"));
		return reset_birth_certificate_button;
	}

	public WebElement getFirstnameInput() {
		firstname_input = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_firstName_insured']"));
		return firstname_input;
	}

	public WebElement getLastnameInput() {
		lastname_input = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_lastName_insured']"));
		return lastname_input;
	}

	public WebElement getCountryCodeDropdown() {
		country_code_dropdown = driver
				.findElement(By.xpath("//select[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_countryCode_insured']"));
		return country_code_dropdown;
	}

	public WebElement getPhonenumberInput() {
		phonenumber_input = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_mobileNo_insured']"));
		return phonenumber_input;
	}

	public WebElement getEmailInput() {
		email_input = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_emailId_insured']"));
		return email_input;
	}

	public WebElement getDobInput() {
		dob_input = driver.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_dob_insured']"));
		return dob_input;
	}

	public Select getGenderDropdown() {
		gender_dropdown = new Select(
				driver.findElement(By.xpath("//select[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_gender_insured']")));
		return gender_dropdown;
	}

	public WebElement getSmokerYesRadio() {
		smoker_yes_radio = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_smoker_ys_insured']"));
		return smoker_yes_radio;
	}

	public WebElement getSmokerNoRadio() {

		smoker_no_radio = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_smoker_no_insured']"));
		return smoker_no_radio;
	}

	public Select getOccupationDropdown() {
		occupation_dropdown = new Select(driver
				.findElement(By.xpath("//select[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_occupation_insured']")));
		return occupation_dropdown;
	}

	public WebElement getAddMemberButton() {
		add_member_button = driver
				.findElement(By.xpath("//button[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_add_insured']"));
		return add_member_button;
	}

	public WebElement getPremiumInput() {
		return premium_input;
	}

	public Select getFrequencyDropdown() {
		frequency_dropdown = new Select(
				driver.findElement(By.xpath("//select[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_frequency']")));
		return frequency_dropdown;
	}

	public Select getTermsDropdown() {
		terms_dropdown = new Select(
				driver.findElement(By.xpath("//select[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_terms']")));
		return terms_dropdown;
	}

	public WebElement getSumAssuredInput() {
		sum_assured_input = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_premium']"));
		return sum_assured_input;
	}

	public WebElement getMiddlenameInput() {
		middlename_input = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_middleName_insured']"));
		return middlename_input;
	}

	public WebElement getGetBenefitsButton() {
		get_benefits_button = driver
				.findElement(By.xpath("//button[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_get_riders']"));
		return get_benefits_button;
	}

	public WebElement getCalculateSumAssuredRadio() {
		calculate_sum_assured_radio = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_assured-type']"));
		return calculate_sum_assured_radio;
	}

	public WebElement getCalculatePremiumRadio() {
		calculate_premium_radio = driver
				.findElement(By.xpath("//input[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_premium-type']"));
		return calculate_premium_radio;
	}

	public WebElement getGetQuoteButton() {
		return get_quote_button;
	}

	public void setGet_quote_button(WebElement get_quote_button) {
		get_quote_button = driver
				.findElement(By.xpath("//button[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_get_quote']"));
		this.get_quote_button = get_quote_button;
	}

}
