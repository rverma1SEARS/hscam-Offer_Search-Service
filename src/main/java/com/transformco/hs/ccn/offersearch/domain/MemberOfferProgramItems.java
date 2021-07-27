package com.transformco.hs.ccn.offersearch.domain;

public class MemberOfferProgramItems {
	
	private int memberOfferItemId;
	private int memberOfferId;
	private String itemDivOfferCode;
	private String divisionNo;
	private String itemNo;
	private String itemEquation;
	private String createUser;
	private String updateUser;
	private String updateTimestamp;
	
	public int getMemberOfferItemId() {
		return memberOfferItemId;
	}
	public void setMemberOfferItemId(int memberOfferItemId) {
		this.memberOfferItemId = memberOfferItemId;
	}
	public int getMemberOfferId() {
		return memberOfferId;
	}
	public void setMemberOfferId(int memberOfferId) {
		this.memberOfferId = memberOfferId;
	}
	public String getItemDivOfferCode() {
		return itemDivOfferCode;
	}
	public void setItemDivOfferCode(String itemDivOfferCode) {
		this.itemDivOfferCode = itemDivOfferCode;
	}
	public String getDivisionNo() {
		return divisionNo;
	}
	public void setDivisionNo(String divisionNo) {
		this.divisionNo = divisionNo;
	}
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemEquation() {
		return itemEquation;
	}
	public void setItemEquation(String itemEquation) {
		this.itemEquation = itemEquation;
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
