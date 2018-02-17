package com.iqbal.hrms.Model;

public class SearchResultVO {
	
	private String serialNumber;
	
	private String caseNumber;
	
	private String caseDate;
	
	private String lawName;
	
	private String caseDhara;
	
	private int caseSystemId;
	
	private String typeOfCrime;
	
	private String battalionName;
	
	private String companyName;
	
	private String thanaName;
	
	

	public String getThanaName() {
		return thanaName;
	}

	public void setThanaName(String thanaName) {
		this.thanaName = thanaName;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public String getCaseDate() {
		return caseDate;
	}

	public void setCaseDate(String caseDate) {
		this.caseDate = caseDate;
	}

	public String getLawName() {
		return lawName;
	}

	public void setLawName(String lawName) {
		this.lawName = lawName;
	}

	public String getCaseDhara() {
		return caseDhara;
	}

	public void setCaseDhara(String caseDhara) {
		this.caseDhara = caseDhara;
	}

	 

	public int getCaseSystemId() {
		return caseSystemId;
	}

	public void setCaseSystemId(int caseSystemId) {
		this.caseSystemId = caseSystemId;
	}

	public String getTypeOfCrime() {
		return typeOfCrime;
	}

	public void setTypeOfCrime(String typeOfCrime) {
		this.typeOfCrime = typeOfCrime;
	}

	public String getBattalionName() {
		return battalionName;
	}

	public void setBattalionName(String battalionName) {
		this.battalionName = battalionName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "SearchResultVO [" + serialNumber + ", " + caseNumber + ", " + caseDate + ", " + lawName + ", "
				+ caseDhara + ", " + caseSystemId + ", " + typeOfCrime + ", " + battalionName + ", " + companyName
				+ ", " + thanaName + "]";
	}

 	
}
