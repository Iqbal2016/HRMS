package com.iqbal.hrms.Model;

public class ActivityReportVO {
	
	private String caseDhara;
	
	private String serialNo;
	
	private String caseNumber;
	
	private String caseDate;
	
	private String lawName;
	
	private String battalionName;
	
	private String companyName;

	public String getCaseDhara() {
		return caseDhara;
	}

	public void setCaseDhara(String caseDhara) {
		this.caseDhara = caseDhara;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
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
		return "ActivityReportVO [" + caseDhara + ", " + serialNo + ", " + caseNumber + ", " + caseDate + ", " + lawName
				+ ", " + battalionName + ", " + companyName + "]";
	}
	
	

}
