package com.iqbal.hrms.Model;

public class AssetReliseProcess {
	
	private String assetDetails;
	
	private String assetReliseProcess;
	
	private String assetReliseDate;
	
	private int id;
	
	
	public String getAssetDetails() {
		return assetDetails;
	}

	public void setAssetDetails(String assetDetails) {
		this.assetDetails = assetDetails;
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
	 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "AssetReliseProcess [assetDetails=" + assetDetails + ", assetReliseProcess=" + assetReliseProcess
				+ ", assetReliseDate=" + assetReliseDate + ", id=" + id + "]";
	}

	 
 
}
