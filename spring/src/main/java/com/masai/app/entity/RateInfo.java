package com.masai.app.entity;

import java.util.Date;
import java.util.Objects;

public class RateInfo {
	private int mMaxCityForRate;
	private double mRateAmount;
	private Date mRateEndDate;
	private String mRateId;
	private Date mRateStartDate;
	
	public RateInfo() {
		
	}

	public RateInfo(int mMaxCityForRate, double mRateAmount, Date mRateEndDate, String mRateId, Date mRateStartDate) {
		super();
		this.mMaxCityForRate = mMaxCityForRate;
		this.mRateAmount = mRateAmount;
		this.mRateEndDate = mRateEndDate;
		this.mRateId = mRateId;
		this.mRateStartDate = mRateStartDate;
	}

	public int getmMaxCityForRate() {
		return mMaxCityForRate;
	}

	public void setmMaxCityForRate(int mMaxCityForRate) {
		this.mMaxCityForRate = mMaxCityForRate;
	}

	public double getmRateAmount() {
		return mRateAmount;
	}

	public void setmRateAmount(double mRateAmount) {
		this.mRateAmount = mRateAmount;
	}

	public Date getmRateEndDate() {
		return mRateEndDate;
	}

	public void setmRateEndDate(Date mRateEndDate) {
		this.mRateEndDate = mRateEndDate;
	}

	public String getmRateId() {
		return mRateId;
	}

	public void setmRateId(String mRateId) {
		this.mRateId = mRateId;
	}

	public Date getmRateStartDate() {
		return mRateStartDate;
	}

	public void setmRateStartDate(Date mRateStartDate) {
		this.mRateStartDate = mRateStartDate;
	}

	@Override
	public String toString() {
		return "RateInfo [mMaxCityForRate=" + mMaxCityForRate + ", mRateAmount=" + mRateAmount + ", mRateEndDate="
				+ mRateEndDate + ", mRateId=" + mRateId + ", mRateStartDate=" + mRateStartDate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(mMaxCityForRate, mRateAmount, mRateEndDate, mRateId, mRateStartDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RateInfo other = (RateInfo) obj;
		return mMaxCityForRate == other.mMaxCityForRate
				&& Double.doubleToLongBits(mRateAmount) == Double.doubleToLongBits(other.mRateAmount)
				&& Objects.equals(mRateEndDate, other.mRateEndDate) && Objects.equals(mRateId, other.mRateId)
				&& Objects.equals(mRateStartDate, other.mRateStartDate);
	}
}
