package com.transformco.hs.ccn.offersearch.request;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.searshc.hs.utils.core.dto.response.BaseResponse;

@EntityScan
@XmlRootElement(name="SearchMemberOfferPlanBenefitsRequest")
public class SearchMemberOfferPlanBenefitsRequest extends BaseResponse {

	private int memberOfferPlanId;

	public int getMemberOfferPlanId() {
		return memberOfferPlanId;
	}

	public void setMemberOfferPlanId(int memberOfferPlanId) {
		this.memberOfferPlanId = memberOfferPlanId;
	}
}
