package com.masai.app.entity;

import java.util.List;
import java.util.Objects;

public class RateUpdate {
	private String mRateUpdateId;
	SenderInfo mSenderInfo;
	List<RateUpdateDetails> mUpdateDetails;
	
	public RateUpdate() {
		
	}

	public RateUpdate(String mRateUpdateId, SenderInfo mSenderInfo, List<RateUpdateDetails> mUpdateDetails) {
		super();
		this.mRateUpdateId = mRateUpdateId;
		this.mSenderInfo = mSenderInfo;
		this.mUpdateDetails = mUpdateDetails;
	}

	public String getmRateUpdateId() {
		return mRateUpdateId;
	}

	public void setmRateUpdateId(String mRateUpdateId) {
		this.mRateUpdateId = mRateUpdateId;
	}

	public SenderInfo getmSenderInfo() {
		return mSenderInfo;
	}

	public void setmSenderInfo(SenderInfo mSenderInfo) {
		this.mSenderInfo = mSenderInfo;
	}

	public List<RateUpdateDetails> getmUpdateDetails() {
		return mUpdateDetails;
	}

	public void setmUpdateDetails(List<RateUpdateDetails> mUpdateDetails) {
		this.mUpdateDetails = mUpdateDetails;
	}

	@Override
	public String toString() {
		return "RateUpdate [mRateUpdateId=" + mRateUpdateId + ", mSenderInfo=" + mSenderInfo + ", mUpdateDetails="
				+ mUpdateDetails + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(mRateUpdateId, mSenderInfo, mUpdateDetails);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RateUpdate other = (RateUpdate) obj;
		return Objects.equals(mRateUpdateId, other.mRateUpdateId) && Objects.equals(mSenderInfo, other.mSenderInfo)
				&& Objects.equals(mUpdateDetails, other.mUpdateDetails);
	}
}
