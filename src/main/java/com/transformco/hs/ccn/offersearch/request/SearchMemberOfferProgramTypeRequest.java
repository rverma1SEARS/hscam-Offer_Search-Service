package com.transformco.hs.ccn.offersearch.request;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.searshc.hs.utils.core.dto.response.BaseResponse;

@EntityScan
@XmlRootElement(name="SearchMemberOfferProgramTypeRequest")
public class SearchMemberOfferProgramTypeRequest extends BaseResponse {
	
	private int offerId;
	private String memberOfferIndicatorCode;
	public int getOfferId() {
		return offerId;
	}
	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}
	public String getMemberOfferIndicatorCode() {
		return memberOfferIndicatorCode;
	}
	public void setMemberOfferIndicatorCode(String memberOfferIndicatorCode) {
		this.memberOfferIndicatorCode = memberOfferIndicatorCode;
	}

}
