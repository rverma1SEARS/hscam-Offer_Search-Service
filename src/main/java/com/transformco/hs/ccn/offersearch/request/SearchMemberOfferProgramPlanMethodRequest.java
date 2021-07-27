package com.transformco.hs.ccn.offersearch.request;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.searshc.hs.utils.core.dto.response.BaseResponse;

@EntityScan
@XmlRootElement(name="SearchMemberOfferProgramPlanMethodRequest")
public class SearchMemberOfferProgramPlanMethodRequest extends BaseResponse {
	
	private int memberOfferId;
	private String memberOfferIdIndicatorCode;
	public int getMemberOfferId() {
		return memberOfferId;
	}
	public void setMemberOfferId(int memberOfferId) {
		this.memberOfferId = memberOfferId;
	}
	public String getMemberOfferIdIndicatorCode() {
		return memberOfferIdIndicatorCode;
	}
	public void setMemberOfferIdIndicatorCode(String memberOfferIdIndicatorCode) {
		this.memberOfferIdIndicatorCode = memberOfferIdIndicatorCode;
	}

}
