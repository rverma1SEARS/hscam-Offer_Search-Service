package com.transformco.hs.ccn.offersearch.domain;

public class TriggerAttributesMethod {
	
	private int triggerAttributeId;
	private String attributeName;
	private String attributeDescription;
	private String createUser;
	private String updateUser;
	private String updateTimestamp;
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
	public String getAttributeDescription() {
		return attributeDescription;
	}
	public void setAttributeDescription(String attributeDescription) {
		this.attributeDescription = attributeDescription;
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
