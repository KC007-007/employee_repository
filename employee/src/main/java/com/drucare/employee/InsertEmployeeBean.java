package com.drucare.employee;

public class InsertEmployeeBean {

	Integer empId;
	String firstNm;
	String middleNm;
	String LastNm;
	String mobileNo;
	String email;
	String addressLine1;
	String addressLine2;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getFirstNm() {
		return firstNm;
	}

	public void setFirstNm(String firstNm) {
		this.firstNm = firstNm;
	}

	public String getMiddleNm() {
		return middleNm;
	}

	public void setMiddleNm(String middleNm) {
		this.middleNm = middleNm;
	}

	public String getLastNm() {
		return LastNm;
	}

	public void setLastNm(String lastNm) {
		LastNm = lastNm;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	@Override
	public String toString() {
		return "InsertEmployeeBean [empId=" + empId + ",firstNm=" + firstNm + ", middleNm=" + middleNm + ", LastNm="
				+ LastNm + ", mobileNo=" + mobileNo + ", email=" + email + ", addressLine1=" + addressLine1
				+ ", addressLine2=" + addressLine2 + "]";
	}

}
