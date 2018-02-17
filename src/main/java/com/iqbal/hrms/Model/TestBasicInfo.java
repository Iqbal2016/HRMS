package com.iqbal.hrms.Model;

public class TestBasicInfo {
	private String Id;
	private String Name;
	private String Address;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	@Override
	public String toString() {
		return "TestBasicInfo [Id=" + Id + ", Name=" + Name + ", Address="
				+ Address + "]";
	}
	
	
	
}
