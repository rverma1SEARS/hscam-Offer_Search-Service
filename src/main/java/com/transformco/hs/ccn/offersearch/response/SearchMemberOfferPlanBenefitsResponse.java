package com.transformco.hs.ccn.offersearch.response;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.searshc.hs.utils.core.dto.response.BaseResponse;
import com.transformco.hs.ccn.offersearch.domain.MemberOfferPlanBenefits;

@EntityScan
@XmlRootElement(name = "SearchMemberOfferPlanBenefitsResponse")
public class SearchMemberOfferPlanBenefitsResponse extends BaseResponse {

	private List<MemberOfferPlanBenefits> memberOfferPlanBenefitsList;

	
	public List<MemberOfferPlanBenefits> getMemberOfferPlanBenefitsList() {
		return memberOfferPlanBenefitsList;
	}

	public void setMemberOfferPlanBenefitsList(List<MemberOfferPlanBenefits> memberOfferPlanBenefitsList) {
		this.memberOfferPlanBenefitsList = memberOfferPlanBenefitsList;
	}

}
