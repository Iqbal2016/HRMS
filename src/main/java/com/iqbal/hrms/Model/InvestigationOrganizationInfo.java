package com.iqbal.hrms.Model;

public class InvestigationOrganizationInfo {

	private String officerName;

	private String officeName;

	private String officerTitle;

	private String officerMobileNO;

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

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public String getOfficerTitle() {
		return officerTitle;
	}

	public void setOfficerTitle(String officerTitle) {
		this.officerTitle = officerTitle;
	}

	public String getOfficerMobileNO() {
		return officerMobileNO;
	}

	public void setOfficerMobileNO(String officerMobileNO) {
		this.officerMobileNO = officerMobileNO;
	}

	@Override
	public String toString() {
		return "InvestigationOrganizationInfo [officerName=" + officerName + ", officeName=" + officeName
				+ ", officerTitle=" + officerTitle + ", officerMobileNO=" + officerMobileNO + ", id=" + id + "]";
	}
 
}
