package com.transformco.hs.ccn.offersearch.domain;

public class MemberOfferPlanNotification {
	
	private int memberOffersNotificationId;
	private int memberOfferPlanId;
	private String emailFlag;
	private String phoneFlag;
	private String textFlag;
	private String mailFlag;
	private String createUserId;
	private String createdTimestamp;
	private String updateUserId;
	private String updatedTimestamp;
	
	public int getMemberOffersNotificationId() {
		return memberOffersNotificationId;
	}
	public void setMemberOffersNotificationId(int memberOffersNotificationId) {
		this.memberOffersNotificationId = memberOffersNotificationId;
	}
	public int getMemberOfferPlanId() {
		return memberOfferPlanId;
	}
	public void setMemberOfferPlanId(int memberOfferPlanId) {
		this.memberOfferPlanId = memberOfferPlanId;
	}
	public String getEmailFlag() {
		return emailFlag;
	}
	public void setEmailFlag(String emailFlag) {
		this.emailFlag = emailFlag;
	}
	public String getPhoneFlag() {
		return phoneFlag;
	}
	public void setPhoneFlag(String phoneFlag) {
		this.phoneFlag = phoneFlag;
	}
	public String getTextFlag() {
		return textFlag;
	}
	public void setTextFlag(String textFlag) {
		this.textFlag = textFlag;
	}
	public String getMailFlag() {
		return mailFlag;
	}
	public void setMailFlag(String mailFlag) {
		this.mailFlag = mailFlag;
	}
	public String getCreateUserId() {
		return createUserId;
	}
	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}
	public String getCreatedTimestamp() {
		return createdTimestamp;
	}
	public void setCreatedTimestamp(String createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}
	public String getUpdateUserId() {
		return updateUserId;
	}
	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}
	public String getUpdatedTimestamp() {
		return updatedTimestamp;
	}
	public void setUpdatedTimestamp(String updatedTimestamp) {
		this.updatedTimestamp = updatedTimestamp;
	}

}
