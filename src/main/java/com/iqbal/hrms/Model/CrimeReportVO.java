package com.iqbal.hrms.Model;

public class CrimeReportVO {
	
	private String lawName;
	
	private String typeOfCrime;
	
	private String battalionName;
	
	private String companyName;
	
	private int totalCaseNo;
	
	private String caseDate;
	
	

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

	public int getTotalCaseNo() {
		return totalCaseNo;
	}

	public void setTotalCaseNo(int totalCaseNo) {
		this.totalCaseNo = totalCaseNo;
	}

	@Override
	public String toString() {
		return "CrimeReportVO [lawName=" + lawName + ", typeOfCrime=" + typeOfCrime + ", battalionName=" + battalionName
				+ ", companyName=" + companyName + ", totalCaseNo=" + totalCaseNo + "]";
	}
	
	

}
