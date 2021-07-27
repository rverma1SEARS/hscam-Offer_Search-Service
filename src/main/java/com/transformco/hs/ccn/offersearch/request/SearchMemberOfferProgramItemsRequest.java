package com.transformco.hs.ccn.offersearch.request;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.searshc.hs.utils.core.dto.response.BaseResponse;

@EntityScan
@XmlRootElement(name="SearchMemberOfferProgramItemsRequest")
public class SearchMemberOfferProgramItemsRequest extends BaseResponse {
	
	private int memberOfferId;

	public int getMemberOfferId() {
		return memberOfferId;
	}

	public void setMemberOfferId(int memberOfferId) {
		this.memberOfferId = memberOfferId;
	}

}
