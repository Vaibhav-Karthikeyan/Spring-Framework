package com.masai.app.entity;

import java.util.Objects;

public class RateUpdateDetails {
	private Customer mCustomerDetails;
	private String mRateId;
	private RateInfo mRateInfo;
	
	public RateUpdateDetails() {
		
	}

	public RateUpdateDetails(Customer mCustomerDetails, String mRateId, RateInfo mRateInfo) {
		super();
		this.mCustomerDetails = mCustomerDetails;
		this.mRateId = mRateId;
		this.mRateInfo = mRateInfo;
	}

	public Customer getmCustomerDetails() {
		return mCustomerDetails;
	}

	public void setmCustomerDetails(Customer mCustomerDetails) {
		this.mCustomerDetails = mCustomerDetails;
	}

	public String getmRateId() {
		return mRateId;
	}

	public void setmRateId(String mRateId) {
		this.mRateId = mRateId;
	}

	public RateInfo getmRateInfo() {
		return mRateInfo;
	}

	public void setmRateInfo(RateInfo mRateInfo) {
		this.mRateInfo = mRateInfo;
	}

	@Override
	public String toString() {
		return "RateUpdateDetails [mCustomerDetails=" + mCustomerDetails + ", mRateId=" + mRateId + ", mRateInfo="
				+ mRateInfo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(mCustomerDetails, mRateId, mRateInfo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RateUpdateDetails other = (RateUpdateDetails) obj;
		return Objects.equals(mCustomerDetails, other.mCustomerDetails) && Objects.equals(mRateId, other.mRateId)
				&& Objects.equals(mRateInfo, other.mRateInfo);
	}
}
