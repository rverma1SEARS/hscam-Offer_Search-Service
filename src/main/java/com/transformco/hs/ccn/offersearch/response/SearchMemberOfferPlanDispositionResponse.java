package com.transformco.hs.ccn.offersearch.response;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.searshc.hs.utils.core.dto.response.BaseResponse;
import com.transformco.hs.ccn.offersearch.domain.MemberOfferPlanDisposition;

@EntityScan
@XmlRootElement(name = "SearchMemberOfferPlanDispositionResponse")
public class SearchMemberOfferPlanDispositionResponse extends BaseResponse {

	private List<MemberOfferPlanDisposition> memberOfferPlanDispositionList;

	public List<MemberOfferPlanDisposition> getMemberOfferPlanDispositionList() {
		return memberOfferPlanDispositionList;
	}

	public void setMemberOfferPlanDispositionList(List<MemberOfferPlanDisposition> memberOfferPlanDispositionList) {
		this.memberOfferPlanDispositionList = memberOfferPlanDispositionList;
	}

}

