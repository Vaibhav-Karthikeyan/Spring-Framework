package com.masai.app.entity;

import java.util.Date;
import java.util.Objects;

public class SenderInfo {
	private Date mSendDate;
	private Contact mSenderContact;
	private String mSenderDesc;

	public SenderInfo() {

	}

	public SenderInfo(Date mSendDate, Contact mSenderContact, String mSenderDesc) {
		super();
		this.mSendDate = mSendDate;
		this.mSenderContact = mSenderContact;
		this.mSenderDesc = mSenderDesc;
	}

	public Date getmSendDate() {
		return mSendDate;
	}

	public void setmSendDate(Date mSendDate) {
		this.mSendDate = mSendDate;
	}

	public Contact getmSenderContact() {
		return mSenderContact;
	}

	public void setmSenderContact(Contact mSenderContact) {
		this.mSenderContact = mSenderContact;
	}

	public String getmSenderDesc() {
		return mSenderDesc;
	}

	public void setmSenderDesc(String mSenderDesc) {
		this.mSenderDesc = mSenderDesc;
	}

	@Override
	public String toString() {
		return "SenderInfo [mSendDate=" + mSendDate + ", mSenderContact=" + mSenderContact + ", mSenderDesc="
				+ mSenderDesc + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(mSendDate, mSenderContact, mSenderDesc);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SenderInfo other = (SenderInfo) obj;
		return Objects.equals(mSendDate, other.mSendDate) && Objects.equals(mSenderContact, other.mSenderContact)
				&& Objects.equals(mSenderDesc, other.mSenderDesc);
	}
}
