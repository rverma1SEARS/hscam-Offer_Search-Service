package com.transformco.hs.ccn.offersearch.domain;

public class MemberOfferPlan {
	
	private int memberOfferPlanId;
	private int offerId;
	private String planType;
	private String planDescription;
	private String autoRenewalFlag;
	private String renewalPeriodType;
	private int renewalPeriodLength;
	private String effectiveDate;
	private String endDate;
	private int ranking;
	private String promoCode;
	private String createUser;
	private String updateUser;
	private String updateTimestamp;
	
	public int getMemberOfferPlanId() {
		return memberOfferPlanId;
	}
	public void setMemberOfferPlanId(int memberOfferPlanId) {
		this.memberOfferPlanId = memberOfferPlanId;
	}
	public int getOfferId() {
		return offerId;
	}
	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}
	public String getPlanType() {
		return planType;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}
	public String getPlanDescription() {
		return planDescription;
	}
	public void setPlanDescription(String planDescription) {
		this.planDescription = planDescription;
	}
	public String getAutoRenewalFlag() {
		return autoRenewalFlag;
	}
	public void setAutoRenewalFlag(String autoRenewalFlag) {
		this.autoRenewalFlag = autoRenewalFlag;
	}
	public String getRenewalPeriodType() {
		return renewalPeriodType;
	}
	public void setRenewalPeriodType(String renewalPeriodType) {
		this.renewalPeriodType = renewalPeriodType;
	}
	public int getRenewalPeriodLength() {
		return renewalPeriodLength;
	}
	public void setRenewalPeriodLength(int renewalPeriodLength) {
		this.renewalPeriodLength = renewalPeriodLength;
	}
	public String getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public String getPromoCode() {
		return promoCode;
	}
	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateTimestamp() {
		return updateTimestamp;
	}
	public void setUpdateTimestamp(String updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

}
