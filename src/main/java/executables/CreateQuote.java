package executables;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import elements.ApplicationDetailsPageElements;
import elements.CreateQuotePageElements;
import elements.ProposalPaymentsPageElements;
import elements.ReviewQuotePageElements;
import variables.Quote;

public class CreateQuote {
	WebDriver driver;
	WebElement create_quote_button, get_benefits_button, get_quote_button, proceed_button;
	WebElement insured_dob_input, firstname_input, middlename_input, lastname_input, phonenumber_input, email_input, date_of_birth_input, premium_input, sum_assured_input, payment_bank_account_number_input;
	WebElement smoker_yes_radio, smoker_no_radio, calculate_sum_assured_radio, calculate_premium_radio;
	Select line_of_business_dropdown, category_dropdown, product_dropdown, gender_dropdown, occupation_dropdown, frequency_dropdown, terms_dropdown, payment_method_dropdown, payment_bank_dropdown, payment_bank_branch_dropdown, payment_bank_account_number_dropdown, payment_dd_processing_bank_dropdown, payment_collection_day_dropdown, benefit_payment_method, benefit_bank_dropdown, benefit_bank_branch_dropdown, benefit_bank_account_number_dropdown;
	
	CreateQuotePageElements createQuotePageElements;
	ReviewQuotePageElements reviewQuotePageElements;
	ApplicationDetailsPageElements applicationDetailsPageElements;
	ProposalPaymentsPageElements proposalPaymentsPageElements;
	Proposals proposals;
	
	Quote quote;

	public CreateQuote(WebDriver driver) {
		this.driver = driver;
	}

	public void navigateToCreateQuotePage() {
		proposals = new Proposals(driver);
		proposals.navigateToProposalsPage();
		
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));

		WebDriverWait wait = new WebDriverWait(driver, 200);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//select[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_lob']")));

	}

	public void createConventionalProduct() {
		navigateToCreateQuotePage();
		
		createQuotePageElements = new CreateQuotePageElements(driver);
		
		quote = prepareQuote();
		line_of_business_dropdown = createQuotePageElements.getLineOfBusinessDropdown();
		line_of_business_dropdown.selectByVisibleText(quote.getLineOfBusiness());
		
		insured_dob_input = createQuotePageElements.getInsuredDob();
		insured_dob_input.clear();
		insured_dob_input.sendKeys(quote.getInsuredDateOfBirth());
		
		WebDriverWait wait = new WebDriverWait(driver, 200);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//select[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_category']")));
		
		category_dropdown = createQuotePageElements.getCategoryDropdown();
		category_dropdown.selectByVisibleText(quote.getCategory());
		
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//select[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_product']")));
		
		product_dropdown = createQuotePageElements.getProductDropdown();
		product_dropdown.selectByVisibleText(quote.getProduct());
		
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//button[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_get_riders']")));
		
		firstname_input = createQuotePageElements.getFirstnameInput();
		firstname_input.clear();
		firstname_input.sendKeys(quote.getFirstname());
		
		middlename_input = createQuotePageElements.getMiddlenameInput();
		middlename_input.clear();
		middlename_input.sendKeys(quote.getMiddleName());
		
		lastname_input = createQuotePageElements.getLastnameInput();
		lastname_input.clear();
		lastname_input.sendKeys(quote.getLastName());
		
		phonenumber_input = createQuotePageElements.getPhonenumberInput();
		phonenumber_input.clear();
		phonenumber_input.sendKeys(quote.getPhoneNumber());
		
		email_input = createQuotePageElements.getEmailInput();
		email_input.clear();
		email_input.sendKeys(quote.getEmail());
		
		date_of_birth_input = createQuotePageElements.getDobInput();
		date_of_birth_input.clear();
		date_of_birth_input.sendKeys(quote.getDateOfBirth());
		
		gender_dropdown = createQuotePageElements.getGenderDropdown();
		gender_dropdown.selectByVisibleText(quote.getGender());
		
		smoker_yes_radio = createQuotePageElements.getSmokerYesRadio();
		smoker_no_radio = createQuotePageElements.getSmokerNoRadio();
		
		boolean is_smoker = quote.getIsSmoker();
		
		if(is_smoker)
			smoker_yes_radio.click();
		else
			smoker_no_radio.click();
		
		occupation_dropdown= createQuotePageElements.getOccupationDropdown();
		occupation_dropdown.selectByVisibleText(quote.getOccupation());
		
		Double sum_assured = quote.getSumAssured();
		
		calculate_sum_assured_radio = createQuotePageElements.getCalculateSumAssuredRadio();
		calculate_premium_radio = createQuotePageElements.getCalculatePremiumRadio();
		
		if(sum_assured>0) {
			calculate_premium_radio.click();
			sum_assured_input = createQuotePageElements.getSumAssuredInput();
			sum_assured_input.clear();
			sum_assured_input.sendKeys(String.valueOf(sum_assured));
		} else {
			calculate_sum_assured_radio.click();
			premium_input = createQuotePageElements.getPremiumInput();
			premium_input.clear();
			premium_input.sendKeys(String.valueOf(quote.getPremium()));
		}
		
		frequency_dropdown = createQuotePageElements.getFrequencyDropdown();
		frequency_dropdown.selectByVisibleText(quote.getFrequency());
		
		terms_dropdown = createQuotePageElements.getTermsDropdown();
		terms_dropdown.selectByVisibleText(String.valueOf(quote.getTerms()));
		
		get_benefits_button = createQuotePageElements.getGetBenefitsButton();
		get_benefits_button.click();
		
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//button[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_get_quote']")));
		get_quote_button = createQuotePageElements.getGetBenefitsButton();
		get_quote_button.click();
	}
	
	public void reviewQuote() {
		reviewQuotePageElements = new ReviewQuotePageElements(driver);
		
		WebDriverWait wait = new WebDriverWait(driver, 200);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//button[@id='_QuoteCalculator_INSTANCE_ms03ctkSkfxq_create_proposal']")));
		
		proceed_button = reviewQuotePageElements.getProceedButton();
		proceed_button.click();
	}
	
	public void setApplicationDetails() {
		applicationDetailsPageElements = new ApplicationDetailsPageElements(driver);
		
	}
	
	public void setPaymentInfo() {
		proposalPaymentsPageElements = new ProposalPaymentsPageElements(driver);
		
		WebDriverWait wait = new WebDriverWait(driver, 200);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("_QuoteCalculator_INSTANCE_ms03ctkSkfxq_payment-method_initial")));
		
		payment_method_dropdown = proposalPaymentsPageElements.getPaymentMethodDropdown();
		payment_method_dropdown.selectByVisibleText(quote.getPaymentMethod());
		
		payment_bank_dropdown = proposalPaymentsPageElements.getBankDropdown();
		payment_bank_dropdown.selectByVisibleText(quote.getPaymentBank());
		
		payment_bank_branch_dropdown = proposalPaymentsPageElements.getBranchDropdown();
		payment_bank_branch_dropdown.selectByVisibleText(quote.getPaymentBankBranch());
		
		payment_bank_account_number_input = proposalPaymentsPageElements.getAccountNumberInput();
		payment_bank_account_number_input.clear();
		payment_bank_account_number_input.sendKeys(quote.getPaymentBankAccountNumber());
		
		payment_dd_processing_bank_dropdown = proposalPaymentsPageElements.getDdProcessingBankDropdown();
		payment_dd_processing_bank_dropdown.selectByVisibleText(quote.getPaymentProcessingBank());
		
		payment_collection_day_dropdown = proposalPaymentsPageElements.getCollectionDayDropdown();
		payment_collection_day_dropdown.selectByVisibleText(String.valueOf(quote.getPaymentCollectionDay()));
			
	}

	public Quote prepareQuote() {
		String line = "";
		String split_by = ",";
		
		Quote quote = new Quote();
		BufferedReader bufferedReader;
		
		try {
			bufferedReader = new BufferedReader(new FileReader("files/quotes.csv"));
			line = bufferedReader.readLine();
			
			while ((line = bufferedReader.readLine()) != null) {
				String[] quote_entry = line.split(split_by);
				quote.setLineOfBusiness(quote_entry[0]);
				quote.setInsuredDateOfBirth(quote_entry[1]);
				quote.setStartDate(quote_entry[2]);
				quote.setCategory(quote_entry[3]);
				quote.setProduct(quote_entry[4]);
				
				String is_new_customer = quote_entry[5].toLowerCase();
				
				if( is_new_customer.equalsIgnoreCase("y")) {
					quote.setIsNewCustomer(true);
				} else {
					quote.setIsNewCustomer(false);
				}
				
				quote.setFirstname(quote_entry[6]);
				quote.setMiddleName(quote_entry[7]);
				quote.setLastName(quote_entry[8]);
				quote.setPhoneNumber(quote_entry[9]);
				quote.setEmail(quote_entry[10]);
				quote.setDateOfBirth(quote_entry[11]);
				quote.setGender(quote_entry[12]);
				
				String is_smoker = quote_entry[13].toLowerCase();
				
				if( is_smoker.equalsIgnoreCase("y")) {
					quote.setIs_smoker(true);
				} else {
					quote.setIs_smoker(false);
				}
				
				quote.setOccupation(quote_entry[14]);
				quote.setSumAssured(Double.valueOf(quote_entry[15]));
				quote.setPremium(Double.valueOf(quote_entry[16]));
				quote.setFrequency(quote_entry[17]);
				quote.setTerms(Integer.valueOf(quote_entry[18]));
				quote.setNationalId(quote_entry[19]);
				quote.setPin(quote_entry[20]);
				quote.setSourceOfFunds(quote_entry[21]);
				quote.setNationality(quote_entry[22]);
				quote.setPostalAddress(quote_entry[23]);
				quote.setPostalCode(quote_entry[24]);
				quote.setCity(quote_entry[25]);
				quote.setCountry(quote_entry[26]);
				quote.setPaymentMethod(quote_entry[27]);
				quote.setPaymentBank(quote_entry[28]);
				quote.setPaymentBankBranch(quote_entry[29]);
				quote.setPaymentBankAccountNumber(quote_entry[30]);
				quote.setPaymentProcessingBank(quote_entry[31]);
				quote.setPaymentCollectionDay(Integer.getInteger(quote_entry[32]));
				quote.setPaymentDate(quote_entry[34]);
				quote.setBenefitPaymentMethod(quote_entry[35]);
				quote.setBenefitBank(quote_entry[36]);
				quote.setBenefitBankBranch(quote_entry[37]);
				quote.setBenefitBankAccountNumber(quote_entry[38]);
			}
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return quote;
	}

}
