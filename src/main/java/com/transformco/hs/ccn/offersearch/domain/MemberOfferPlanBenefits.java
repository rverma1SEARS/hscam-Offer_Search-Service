package com.transformco.hs.ccn.offersearch.domain;

public class MemberOfferPlanBenefits {
	
	private int offerBenefitId;
	private int memberOfferPlanId;
	private String lineOfBusiness;
	private double discountPercent;
	private double discountAmount;
	private String discountCode;
	private String freeShippingFlag;
	private double minimumOrderAmount;
	private double maxOrderAmount;
	private String applyBenefittoCurrentOrder;
	private String couponCode;
	private String procId;
	private String createUserId;
	private String createdTimestamp;
	private String updateUserId;
	private String updatedTimestamp;
	public int getOfferBenefitId() {
		return offerBenefitId;
	}
	public void setOfferBenefitId(int offerBenefitId) {
		this.offerBenefitId = offerBenefitId;
	}
	public int getMemberOfferPlanId() {
		return memberOfferPlanId;
	}
	public void setMemberOfferPlanId(int memberOfferPlanId) {
		this.memberOfferPlanId = memberOfferPlanId;
	}
	public String getLineOfBusiness() {
		return lineOfBusiness;
	}
	public void setLineOfBusiness(String lineOfBusiness) {
		this.lineOfBusiness = lineOfBusiness;
	}
	public double getDiscountPercent() {
		return discountPercent%5.2;
	}
	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent%5.2;
	}
	public double getDiscountAmount() {
		return discountAmount%9.2;
	}
	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount%9.2;
	}
	public String getDiscountCode() {
		return discountCode;
	}
	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}
	public String getFreeShippingFlag() {
		return freeShippingFlag;
	}
	public void setFreeShippingFlag(String freeShippingFlag) {
		this.freeShippingFlag = freeShippingFlag;
	}
	public double getMinimumOrderAmount() {
		return minimumOrderAmount%9.2;
	}
	public void setMinimumOrderAmount(double minimumOrderAmount) {
		this.minimumOrderAmount = minimumOrderAmount%9.2;
	}
	public double getMaxOrderAmount() {
		return maxOrderAmount%9.2;
	}
	public void setMaxOrderAmount(double maxOrderAmount) {
		this.maxOrderAmount = maxOrderAmount%9.2;
	}
	public String getApplyBenefittoCurrentOrder() {
		return applyBenefittoCurrentOrder;
	}
	public void setApplyBenefittoCurrentOrder(String applyBenefittoCurrentOrder) {
		this.applyBenefittoCurrentOrder = applyBenefittoCurrentOrder;
	}
	public String getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	public String getProcId() {
		return procId;
	}
	public void setProcId(String procId) {
		this.procId = procId;
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
