package com.iqbal.hrms.Model;

import org.springframework.web.multipart.MultipartFile;

public class CaseBasicInfo {

	 private String policeStationName;
	 
	 private String serialNumber;
	 
	 private String caseNumber;
	 
	 private String caseDate;
	 
	 private String lawName;
	 
	 private String caseDahara;
	 
	 private int currentId;
	 
	 private String companyName;
	 
	 private String battalionName;
	 
	 private String typeOfCrime;
	 
	 private String placeOfCrime;
	 
	 private String timeOfCrime;
	 
	 private String crimeDescription;
	 
	 private String filePath;
	 
	 private String dateOfCrime;
	 
	 private String district;
	 
	 private MultipartFile file;
	 
	  
	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getDateOfCrime() {
		return dateOfCrime;
	}

	public void setDateOfCrime(String dateOfCrime) {
		this.dateOfCrime = dateOfCrime;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public String getPlaceOfCrime() {
		return placeOfCrime;
	}

	public void setPlaceOfCrime(String placeOfCrime) {
		this.placeOfCrime = placeOfCrime;
	}

	public String getTimeOfCrime() {
		return timeOfCrime;
	}

	public void setTimeOfCrime(String timeOfCrime) {
		this.timeOfCrime = timeOfCrime;
	}

	public String getCrimeDescription() {
		return crimeDescription;
	}

	public void setCrimeDescription(String crimeDescription) {
		this.crimeDescription = crimeDescription;
	}

	public String getTypeOfCrime() {
		return typeOfCrime;
	}

	public void setTypeOfCrime(String typeOfCrime) {
		this.typeOfCrime = typeOfCrime;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getBattalionName() {
		return battalionName;
	}

	public void setBattalionName(String battalionName) {
		this.battalionName = battalionName;
	}

	public int getCurrentId() {
		return currentId;
	}

	public void setCurrentId(int currentId) {
		this.currentId = currentId;
	}

	public String getPoliceStationName() {
		return policeStationName;
	}

	public void setPoliceStationName(String policeStationName) {
		this.policeStationName = policeStationName;
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

	public String getCaseDahara() {
		return caseDahara;
	}

	public void setCaseDahara(String caseDahara) {
		this.caseDahara = caseDahara;
	}

	@Override
	public String toString() {
		return "CaseBasicInfo [" + policeStationName + ", " + serialNumber + ", " + caseNumber + ", " + caseDate + ", "
				+ lawName + ", " + caseDahara + ", " + currentId + ", " + companyName + ", " + battalionName + ", "
				+ typeOfCrime + ", " + placeOfCrime + ", " + timeOfCrime + ", " + crimeDescription + "]";
	}
 

	 
 	 
}
