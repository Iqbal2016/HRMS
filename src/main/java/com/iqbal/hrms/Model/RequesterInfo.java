package com.iqbal.hrms.Model;

public class RequesterInfo {

	private String requestorName;

	private String requesterId;

	private String requestTitle;

	private String requesterMobileNo;

	private String requesterAddress;

	private String district;

	private String village;

	private String subDistrict;

	private int id;
	
	

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getSubDistrict() {
		return subDistrict;
	}

	public void setSubDistrict(String subDistrict) {
		this.subDistrict = subDistrict;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRequestorName() {
		return requestorName;
	}

	public void setRequestorName(String requestorName) {
		this.requestorName = requestorName;
	}

	 

	public String getRequesterId() {
		return requesterId;
	}

	public void setRequesterId(String requesterId) {
		this.requesterId = requesterId;
	}

	public String getRequestTitle() {
		return requestTitle;
	}

	public void setRequestTitle(String requestTitle) {
		this.requestTitle = requestTitle;
	}

	public String getRequesterMobileNo() {
		return requesterMobileNo;
	}

	public void setRequesterMobileNo(String requesterMobileNo) {
		this.requesterMobileNo = requesterMobileNo;
	}

	public String getRequesterAddress() {
		return requesterAddress;
	}

	public void setRequesterAddress(String requesterAddress) {
		this.requesterAddress = requesterAddress;
	}

	@Override
	public String toString() {
		return "RequesterInfo [requestorName=" + requestorName + ", requesterId=" + requesterId + ", requestTitle="
				+ requestTitle + ", requesterMobileNo=" + requesterMobileNo + ", requesterAddress=" + requesterAddress
				+ ", district=" + district + ", village=" + village + ", subDistrict=" + subDistrict + ", id=" + id
				+ "]";
	}

	 
	 
}
