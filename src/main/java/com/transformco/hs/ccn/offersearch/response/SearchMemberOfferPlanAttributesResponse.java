package com.transformco.hs.ccn.offersearch.response;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.searshc.hs.utils.core.dto.response.BaseResponse;
import com.transformco.hs.ccn.offersearch.domain.MemberOfferPlanAttributes;

@EntityScan
@XmlRootElement(name = "SearchMemberOfferPlanAttributesResponse")
public class SearchMemberOfferPlanAttributesResponse extends BaseResponse {
	
	private List<MemberOfferPlanAttributes> memberOfferPlanAttributesList;

	public List<MemberOfferPlanAttributes> getMemberOfferPlanAttributesList() {
		return memberOfferPlanAttributesList;
	}

	public void setMemberOfferPlanAttributesList(List<MemberOfferPlanAttributes> memberOfferPlanAttributesList) {
		this.memberOfferPlanAttributesList = memberOfferPlanAttributesList;
	}

}
