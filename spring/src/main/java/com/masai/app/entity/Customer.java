package com.masai.app.entity;

import java.util.Objects;

public class Customer {
	private Contact mCustomerContact;
	private String mCustomerId,mCustomerName;
	
	public Customer() {
		
	}

	public Customer(Contact mCustomerContact, String mCustomerId, String mCustomerName) {
		super();
		this.mCustomerContact = mCustomerContact;
		this.mCustomerId = mCustomerId;
		this.mCustomerName = mCustomerName;
	}

	public Contact getmCustomerContact() {
		return mCustomerContact;
	}

	public void setmCustomerContact(Contact mCustomerContact) {
		this.mCustomerContact = mCustomerContact;
	}

	public String getmCustomerId() {
		return mCustomerId;
	}

	public void setmCustomerId(String mCustomerId) {
		this.mCustomerId = mCustomerId;
	}

	public String getmCustomerName() {
		return mCustomerName;
	}

	public void setmCustomerName(String mCustomerName) {
		this.mCustomerName = mCustomerName;
	}

	@Override
	public String toString() {
		return "Customer [mCustomerContact=" + mCustomerContact + ", mCustomerId=" + mCustomerId + ", mCustomerName="
				+ mCustomerName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(mCustomerContact, mCustomerId, mCustomerName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(mCustomerContact, other.mCustomerContact)
				&& Objects.equals(mCustomerId, other.mCustomerId) && Objects.equals(mCustomerName, other.mCustomerName);
	}
	
}
