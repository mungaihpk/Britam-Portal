package variables;

import java.util.List;

public class Quote {
	private String line_of_business;
	private String insured_date_of_birth;
	private String start_date;
	private String category;
	private String product;

	private String national_id;
	private String birth_certificate;
	private String surname;

	private boolean is_new_customer;

	private String first_name;
	private String middle_name;
	private String last_name;
	private String country_code;
	private String phone_number;
	private String email;
	private String date_of_birth;
	private String gender;
	private boolean is_smoker;
	private String occupation;

	private double premium;
	private double sum_assured;
	private String frequency;
	private int terms;

	private String source_of_funds;
	private String nationality;
	private String pin;

	private String postal_address;
	private String postal_code;
	private String city;
	private String country;
	private List<String> communication_mode_email;
	
	private String payment_method;
	private String payment_bank;
	private String payment_bank_branch;
	private String payment_bank_account_number;
	private String payment_processing_bank;
	private int payment_collection_day;
	private String payment_date;
	private String benefit_payment_method;
	private String benefit_bank;
	private String benefit_branch;
	private String benefit_account_number;
	

	public Quote() {

	}

	public String getLineOfBusiness() {
		return line_of_business;
	}

	public void setLineOfBusiness(String line_of_business) {
		this.line_of_business = line_of_business;
	}

	public String getInsuredDateOfBirth() {
		return insured_date_of_birth;
	}

	public void setInsuredDateOfBirth(String insured_date_of_birth) {
		this.insured_date_of_birth = insured_date_of_birth;
	}

	public String getStartDate() {
		return start_date;
	}

	public void setStartDate(String start_date) {
		this.start_date = start_date;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getNationalId() {
		return national_id;
	}

	public void setNationalId(String national_id) {
		this.national_id = national_id;
	}

	public String getBirthCertificate() {
		return birth_certificate;
	}

	public void setBirthCertificate(String birth_certificate) {
		this.birth_certificate = birth_certificate;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstname() {
		return first_name;
	}

	public void setFirstname(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddleName() {
		return middle_name;
	}

	public void setMiddleName(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getLastName() {
		return last_name;
	}

	public void setLastName(String last_name) {
		this.last_name = last_name;
	}

	public String getCountryCode() {
		return country_code;
	}

	public void setCountryCode(String country_code) {
		this.country_code = country_code;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateOfBirth() {
		return date_of_birth;
	}

	public void setDateOfBirth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public boolean getIsSmoker() {
		return is_smoker;
	}

	public void setIs_smoker(boolean is_smoker) {
		this.is_smoker = is_smoker;
	}

	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}

	public double getSumAssured() {
		return sum_assured;
	}

	public void setSumAssured(double sum_assured) {
		this.sum_assured = sum_assured;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public int getTerms() {
		return terms;
	}

	public void setTerms(int terms) {
		this.terms = terms;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalAddress() {
		return postal_address;
	}

	public void setPostalAddress(String postal_address) {
		this.postal_address = postal_address;
	}

	public String getPostalCode() {
		return postal_code;
	}

	public void setPostalCode(String postal_code) {
		this.postal_code = postal_code;
	}

	public List<String> getCommunicationModeEmail() {
		return communication_mode_email;
	}

	public void setCommunicationModeEmail(List<String> communication_mode_email) {
		this.communication_mode_email = communication_mode_email;
	}

	public String getSourceOfFunds() {
		return source_of_funds;
	}

	public void setSourceOfFunds(String source_of_funds) {
		this.source_of_funds = source_of_funds;
	}

	public boolean getIsNewCustomer() {
		return is_new_customer;
	}

	public void setIsNewCustomer(boolean is_new_customer) {
		this.is_new_customer = is_new_customer;
	}

	public String getPhoneNumber() {
		return phone_number;
	}

	public void setPhoneNumber(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getPaymentMethod() {
		return payment_method;
	}

	public void setPaymentMethod(String payment_method) {
		this.payment_method = payment_method;
	}

	public String getPaymentBank() {
		return payment_bank;
	}

	public void setPaymentBank(String payment_bank) {
		this.payment_bank = payment_bank;
	}

	public String getPaymentBankBranch() {
		return payment_bank_branch;
	}

	public void setPaymentBankBranch(String payment_bank_branch) {
		this.payment_bank_branch = payment_bank_branch;
	}

	public String getPaymentBankAccountNumber() {
		return payment_bank_account_number;
	}

	public void setPaymentBankAccountNumber(String payment_bank_account_number) {
		this.payment_bank_account_number = payment_bank_account_number;
	}

	public String getPaymentProcessingBank() {
		return payment_processing_bank;
	}

	public void setPaymentProcessingBank(String payment_processing_bank) {
		this.payment_processing_bank = payment_processing_bank;
	}

	public int getPaymentCollectionDay() {
		return payment_collection_day;
	}

	public void setPaymentCollectionDay(int payment_collection_day) {
		this.payment_collection_day = payment_collection_day;
	}

	public String getPaymentDate() {
		return payment_date;
	}

	public void setPaymentDate(String payment_date) {
		this.payment_date = payment_date;
	}

	public String getBenefitPaymentMethod() {
		return benefit_payment_method;
	}

	public void setBenefitPaymentMethod(String benefit_payment_method) {
		this.benefit_payment_method = benefit_payment_method;
	}

	public String getBenefitBank() {
		return benefit_bank;
	}

	public void setBenefitBank(String benefit_bank) {
		this.benefit_bank = benefit_bank;
	}

	public String getBenefitBankBranch() {
		return benefit_branch;
	}

	public void setBenefitBankBranch(String benefit_branch) {
		this.benefit_branch = benefit_branch;
	}

	public String getBenefitBankAccountNumber() {
		return benefit_account_number;
	}

	public void setBenefitBankAccountNumber(String benefit_account_number) {
		this.benefit_account_number = benefit_account_number;
	}

}
