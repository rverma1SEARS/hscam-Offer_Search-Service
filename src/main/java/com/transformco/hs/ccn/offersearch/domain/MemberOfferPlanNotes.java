package com.transformco.hs.ccn.offersearch.domain;

public class MemberOfferPlanNotes {
	
	private int memberOfferNoteId;
	private int memberOfferPlanId;
	private String offerNoteIdType;
	private String note;
	private String createUserId;
	private String createdTimestamp;
	private String updateUserId;
	private String updatedTimestamp;
	
	public int getMemberOfferNoteId() {
		return memberOfferNoteId;
	}
	public void setMemberOfferNoteId(int memberOfferNoteId) {
		this.memberOfferNoteId = memberOfferNoteId;
	}
	public int getMemberOfferPlanId() {
		return memberOfferPlanId;
	}
	public void setMemberOfferPlanId(int memberOfferPlanId) {
		this.memberOfferPlanId = memberOfferPlanId;
	}
	public String getOfferNoteIdType() {
		return offerNoteIdType;
	}
	public void setOfferNoteIdType(String offerNoteIdType) {
		this.offerNoteIdType = offerNoteIdType;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
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
