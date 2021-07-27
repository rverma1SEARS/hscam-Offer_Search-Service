package com.transformco.hs.ccn.offersearch.response;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.searshc.hs.utils.core.dto.response.BaseResponse;
import com.transformco.hs.ccn.offersearch.domain.MemberOfferPlan;

@EntityScan
@XmlRootElement(name = "SearchMemberOfferPlanResponse")
public class SearchMemberOfferPlanResponse extends BaseResponse {

	private List<MemberOfferPlan> memberOfferPlanList;

	public List<MemberOfferPlan> getMemberOfferPlanList() {
		return memberOfferPlanList;
	}

	public void setMemberOfferPlanList(List<MemberOfferPlan> memberOfferPlanList) {
		this.memberOfferPlanList = memberOfferPlanList;
	}
}
