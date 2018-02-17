package com.iqbal.hrms.Model;

public class DefulderInformation {
	
	private String defulderNumber;

	private String defulderName;

	private String defulderAddress;

	private int age; 

	private String district; 
	
	private String motherName; 
	
	private String subDistrict;
	
	private String fatherName;
	
	private String gender;

	private int id;
	
    private String husbandName;
    
    private String nationalId;
	 

  


	@Override
	public String toString() {
		return "DefulderInformation [defulderNumber=" + defulderNumber + ", defulderName=" + defulderName
				+ ", defulderAddress=" + defulderAddress + ", age=" + age + ", district=" + district + ", motherName="
				+ motherName + ", subDistrict=" + subDistrict + ", fatherName=" + fatherName + ", gender=" + gender
				+ ", id=" + id + ", husbandName=" + husbandName + ", nationalId=" + nationalId + "]";
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getNationalId() {
		return nationalId;
	}



	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getMotherName() {
		return motherName;
	}



	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}



	public String getHusbandName() {
		return husbandName;
	}



	public void setHusbandName(String husbandName) {
		this.husbandName = husbandName;
	}



	public String getSubDistrict() {
		return subDistrict;
	}

	public void setSubDistrict(String subDistrict) {
		this.subDistrict = subDistrict;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getDefulderNumber() {
		return defulderNumber;
	}

	public void setDefulderNumber(String defulderNumber) {
		this.defulderNumber = defulderNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	 
	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	 
 
}
