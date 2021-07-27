package com.transformco.hs.ccn.offersearch.response;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.searshc.hs.utils.core.dto.response.BaseResponse;

@EntityScan
@XmlRootElement(name = "SearchMemberOfferPlanNotificationRequest")
public class SearchMemberOfferPlanNotificationRequest extends BaseResponse {
	private int memberOfferPlanId;

	public int getMemberOfferPlanId() {
		return memberOfferPlanId;
	}

	public void setMemberOfferPlanId(int memberOfferPlanId) {
		this.memberOfferPlanId = memberOfferPlanId;
	}
}
