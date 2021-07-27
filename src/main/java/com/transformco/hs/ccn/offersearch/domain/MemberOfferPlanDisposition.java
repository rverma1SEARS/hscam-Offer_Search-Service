package com.transformco.hs.ccn.offersearch.domain;

public class MemberOfferPlanDisposition {
	
	private int memberOfferDispositionId;
	private int memberOfferPlanId;
	private int offerId;
	private int dispositionId;
	private String createUserId;
	private String createdTimestamp;
	private String updateUserId;
	private String updatedTimestamp;
	
	public int getMemberOfferDispositionId() {
		return memberOfferDispositionId;
	}
	public void setMemberOfferDispositionId(int memberOfferDispositionId) {
		this.memberOfferDispositionId = memberOfferDispositionId;
	}
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
	public int getDispositionId() {
		return dispositionId;
	}
	public void setDispositionId(int dispositionId) {
		this.dispositionId = dispositionId;
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
