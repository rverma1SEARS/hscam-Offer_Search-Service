package com.transformco.hs.ccn.offersearch.request;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.searshc.hs.utils.core.dto.response.BaseResponse;

@EntityScan
@XmlRootElement(name="SearchMemberOfferPlanRequest")
public class SearchMemberOfferPlanRequest extends BaseResponse {
	
	private int offerId;
	private String memberOfferIdIndicatorCode;
	public int getOfferId() {
		return offerId;
	}
	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}
	public String getMemberOfferIdIndicatorCode() {
		return memberOfferIdIndicatorCode;
	}
	public void setMemberOfferIdIndicatorCode(String memberOfferIdIndicatorCode) {
		this.memberOfferIdIndicatorCode = memberOfferIdIndicatorCode;
	}

}
