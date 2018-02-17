package com.iqbal.hrms.Model;

public class ReportData {
	
	private String battalionName;
	
	private int totalCount;
	
	private String lawName;
	


	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public String getLawName() {
		return lawName;
	}

	public void setLawName(String lawName) {
		this.lawName = lawName;
	}

	public String getBattalionName() {
		return battalionName;
	}

	public void setBattalionName(String battalionName) {
		this.battalionName = battalionName;
	}

	@Override
	public String toString() {
		return "['" + battalionName + "', " + totalCount + "]";
	}
  
}
