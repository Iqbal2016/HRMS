package com.iqbal.hrms.Model;

import org.springframework.web.multipart.MultipartFile;

public class CourtOrder {

	private String courtOrder;

	private String fmNumber;
	
	private MultipartFile file;
	
	private String filePath;

	private String date;

	private int id;

	 

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourtOrder() {
		return courtOrder;
	}

	public void setCourtOrder(String courtOrder) {
		this.courtOrder = courtOrder;
	}

	public String getFmNumber() {
		return fmNumber;
	}

	public void setFmNumber(String fmNumber) {
		this.fmNumber = fmNumber;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "CourtOrder [courtOrder=" + courtOrder + ", fmNumber=" + fmNumber + ", date=" + date + ", id=" + id
				+ "]";
	}
 
}
