package com.iqbal.hrms.Model;

import org.springframework.web.multipart.MultipartFile;

public class SeizedAssetDetails {

	private String details;

	private String cost;

	private String place;

	private String date;

	private String prNumber;

	private String mrNumbber;

	private String officerName;

	private String officerPost;

	private String assetReliseProcess;

	private String assetReliseDate;
	
	private String time;
	
	private String reliseTime;
	
	private String filePath;
	
	private MultipartFile file;
	
 
	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getReliseTime() {
		return reliseTime;
	}

	public void setReliseTime(String reliseTime) {
		this.reliseTime = reliseTime;
	}

	public String getAssetReliseProcess() {
		return assetReliseProcess;
	}

	public void setAssetReliseProcess(String assetReliseProcess) {
		this.assetReliseProcess = assetReliseProcess;
	}

	public String getAssetReliseDate() {
		return assetReliseDate;
	}

	public void setAssetReliseDate(String assetReliseDate) {
		this.assetReliseDate = assetReliseDate;
	}

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOfficerName() {
		return officerName;
	}

	public void setOfficerName(String officerName) {
		this.officerName = officerName;
	}

	public String getOfficerPost() {
		return officerPost;
	}

	public void setOfficerPost(String officerPost) {
		this.officerPost = officerPost;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPrNumber() {
		return prNumber;
	}

	public void setPrNumber(String prNumber) {
		this.prNumber = prNumber;
	}

	public String getMrNumbber() {
		return mrNumbber;
	}

	public void setMrNumbber(String mrNumbber) {
		this.mrNumbber = mrNumbber;
	}

	@Override
	public String toString() {
		return "SeizedAssetDetails [details=" + details + ", cost=" + cost + ", place=" + place + ", date=" + date
				+ ", prNumber=" + prNumber + ", mrNumbber=" + mrNumbber + ", officerName=" + officerName
				+ ", officerPost=" + officerPost + ", assetReliseProcess=" + assetReliseProcess + ", assetReliseDate="
				+ assetReliseDate + ", time=" + time + ", reliseTime=" + reliseTime + ", filePath=" + filePath + ", id="
				+ id + "]";
	}

 
	 

}
