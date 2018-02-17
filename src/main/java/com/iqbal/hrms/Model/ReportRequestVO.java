package com.iqbal.hrms.Model;

public class ReportRequestVO {
	
	private String startingDate;
	
	private String endDate;
	
	private String battalionName;
	
	private String companyName;
	
	private String thanaName;
	private String distName;
	
	private String caseDhara;
	
	private String typeOfCrime;
	
	private String lawName;
	
	
    public String getCaseDhara() {
		return caseDhara;
	}

	public void setCaseDhara(String caseDhara) {
		this.caseDhara = caseDhara;
	}

	public String getTypeOfCrime() {
		return typeOfCrime;
	}

	public void setTypeOfCrime(String typeOfCrime) {
		this.typeOfCrime = typeOfCrime;
	}

	public String getLawName() {
		return lawName;
	}

	public void setLawName(String lawName) {
		this.lawName = lawName;
	}

	public String getThanaName() {
		return thanaName;
	}

	public void setThanaName(String thanaName) {
		this.thanaName = thanaName;
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

	public String getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(String startingDate) {
		this.startingDate = startingDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	

	public String getDistName() {
		return distName;
	}

	public void setDistName(String distName) {
		this.distName = distName;
	}

	@Override
	public String toString() {
		return "ReportRequestVO [startingDate=" + startingDate + ", endDate="
				+ endDate + ", battalionName=" + battalionName
				+ ", companyName=" + companyName + ", thanaName=" + thanaName
				+ ", distName=" + distName + ", caseDhara=" + caseDhara
				+ ", typeOfCrime=" + typeOfCrime + ", lawName=" + lawName + "]";
	}
 
}
