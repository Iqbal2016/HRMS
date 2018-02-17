package com.iqbal.hrms.Model;

import org.springframework.web.multipart.MultipartFile;

public class InvestigationResult {

	private String csNumber;

	private String frNumber;

	private String caseDhara;

	private String resultDate;

	private String defulderName;
	
    private String defulderNumber;
	
	private String defulderAddress;

	private int id;
	
	private String frType;
	
	private String frDate;
	
	private String filePath;
	
	private MultipartFile file;
	
	
	
 	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public String getDefulderNumber() {
		return defulderNumber;
	}

	public void setDefulderNumber(String defulderNumber) {
		this.defulderNumber = defulderNumber;
	}

	public String getFrType() {
		return frType;
	}

	public void setFrType(String frType) {
		this.frType = frType;
	}

	public String getFrDate() {
		return frDate;
	}

	public void setFrDate(String frDate) {
		this.frDate = frDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCsNumber() {
		return csNumber;
	}

	public void setCsNumber(String csNumber) {
		this.csNumber = csNumber;
	}

	public String getFrNumber() {
		return frNumber;
	}

	public void setFrNumber(String frNumber) {
		this.frNumber = frNumber;
	}

	public String getCaseDhara() {
		return caseDhara;
	}

	public void setCaseDhara(String caseDhara) {
		this.caseDhara = caseDhara;
	}

	public String getResultDate() {
		return resultDate;
	}

	public void setResultDate(String resultDate) {
		this.resultDate = resultDate;
	}

	public String getDefulderName() {
		return defulderName;
	}

	public void setDefulderName(String defulderName) {
		this.defulderName = defulderName;
	}

	public String getDefulderAddress() {
		return defulderAddress;
	}

	public void setDefulderAddress(String defulderAddress) {
		this.defulderAddress = defulderAddress;
	}

	@Override
	public String toString() {
		return "InvestigationResult [csNumber=" + csNumber + ", frNumber=" + frNumber + ", caseDhara=" + caseDhara
				+ ", resultDate=" + resultDate + ", defulderName=" + defulderName + ", defulderNumber=" + defulderNumber
				+ ", defulderAddress=" + defulderAddress + ", id=" + id + ", frType=" + frType + ", frDate=" + frDate
				+ ", filePath=" + filePath + "]";
	}

	 
 
}
