package com.transformco.hs.ccn.offersearch.domain;

public class TriggerMemberOfferProgramType {
	
	private int triggerOfferId;
	private int memberOfferId;
	private int triggerAttributeId;
	private String attributeName;
	private String attributeValue;
	private String attributeEquation;
	private String createUser;
	private String updateUser;
	private String updateTimestamp;
	
	public int getTriggerOfferId() {
		return triggerOfferId;
	}
	public void setTriggerOfferId(int triggerOfferId) {
		this.triggerOfferId = triggerOfferId;
	}
	public int getMemberOfferId() {
		return memberOfferId;
	}
	public void setMemberOfferId(int memberOfferId) {
		this.memberOfferId = memberOfferId;
	}
	public int getTriggerAttributeId() {
		return triggerAttributeId;
	}
	public void setTriggerAttributeId(int triggerAttributeId) {
		this.triggerAttributeId = triggerAttributeId;
	}
	public String getAttributeName() {
		return attributeName;
	}
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
	public String getAttributeValue() {
		return attributeValue;
	}
	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}
	public String getAttributeEquation() {
		return attributeEquation;
	}
	public void setAttributeEquation(String attributeEquation) {
		this.attributeEquation = attributeEquation;
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
