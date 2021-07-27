package com.transformco.hs.ccn.offersearch.domain;

public class MemberOfferProgramPlanMethod {
	
	private int planNameId;
	private String planName;
	private int memberOfferId;
	private int memberOfferPlanId;
	private String effectiveDate;
	private String endDate;
	private int numberOfDaysBetweenPlan;
	private String createUser;
	private String updateUser;
	private String updateTimestamp;
	
	public int getPlanNameId() {
		return planNameId;
	}
	public void setPlanNameId(int planNameId) {
		this.planNameId = planNameId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public int getMemberOfferId() {
		return memberOfferId;
	}
	public void setMemberOfferId(int memberOfferId) {
		this.memberOfferId = memberOfferId;
	}
	public int getMemberOfferPlanId() {
		return memberOfferPlanId;
	}
	public void setMemberOfferPlanId(int memberOfferPlanId) {
		this.memberOfferPlanId = memberOfferPlanId;
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
	public int getNumberOfDaysBetweenPlan() {
		return numberOfDaysBetweenPlan;
	}
	public void setNumberOfDaysBetweenPlan(int numberOfDaysBetweenPlan) {
		this.numberOfDaysBetweenPlan = numberOfDaysBetweenPlan;
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
