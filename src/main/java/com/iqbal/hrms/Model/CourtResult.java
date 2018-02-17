package com.iqbal.hrms.Model;

public class CourtResult {

	private String order;

	private String result;

	private String fmNumber;

	private String date;

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getFmNumber() {
		return fmNumber;
	}

	public void setFmNumber(String fmNumber) {
		this.fmNumber = fmNumber;
	}

	@Override
	public String toString() {
		return "CourtResult [order=" + order + ", result=" + result + ", fmNumber=" + fmNumber + ", date=" + date
				+ ", id=" + id + "]";
	}
 
}
