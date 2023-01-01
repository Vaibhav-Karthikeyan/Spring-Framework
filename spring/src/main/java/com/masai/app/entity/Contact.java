package com.masai.app.entity;

import java.util.Objects;

public class Contact {
	private String mContactEmail,mContactFN,mContactId,mContactLN;
	
	public Contact(){
		
	}

	public Contact(String mContactEmail, String mContactFN, String mContactId, String mContactLN) {
		super();
		this.mContactEmail = mContactEmail;
		this.mContactFN = mContactFN;
		this.mContactId = mContactId;
		this.mContactLN = mContactLN;
	}

	public String getmContactEmail() {
		return mContactEmail;
	}

	public void setmContactEmail(String mContactEmail) {
		this.mContactEmail = mContactEmail;
	}

	public String getmContactFN() {
		return mContactFN;
	}

	public void setmContactFN(String mContactFN) {
		this.mContactFN = mContactFN;
	}

	public String getmContactId() {
		return mContactId;
	}

	public void setmContactId(String mContactId) {
		this.mContactId = mContactId;
	}

	public String getmContactLN() {
		return mContactLN;
	}

	public void setmContactLN(String mContactLN) {
		this.mContactLN = mContactLN;
	}

	@Override
	public String toString() {
		return "Contact [mContactEmail=" + mContactEmail + ", mContactFN=" + mContactFN + ", mContactId=" + mContactId
				+ ", mContactLN=" + mContactLN + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(mContactEmail, mContactFN, mContactId, mContactLN);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return Objects.equals(mContactEmail, other.mContactEmail) && Objects.equals(mContactFN, other.mContactFN)
				&& Objects.equals(mContactId, other.mContactId) && Objects.equals(mContactLN, other.mContactLN);
	}
}
