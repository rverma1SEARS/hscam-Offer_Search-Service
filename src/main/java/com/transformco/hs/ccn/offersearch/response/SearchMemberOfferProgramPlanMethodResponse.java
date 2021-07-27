package com.transformco.hs.ccn.offersearch.response;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.searshc.hs.utils.core.dto.response.BaseResponse;
import com.transformco.hs.ccn.offersearch.domain.MemberOfferProgramPlanMethod;

@EntityScan
@XmlRootElement(name = "SearchMemberOfferProgramPlanMethodResponse")
public class SearchMemberOfferProgramPlanMethodResponse extends BaseResponse {
	
	private List<MemberOfferProgramPlanMethod> memberOfferProgramPlanMethodList;

	public List<MemberOfferProgramPlanMethod> getMemberOfferProgramPlanMethodList() {
		return memberOfferProgramPlanMethodList;
	}

	public void setMemberOfferProgramPlanMethodList(List<MemberOfferProgramPlanMethod> memberOfferProgramPlanMethodList) {
		this.memberOfferProgramPlanMethodList = memberOfferProgramPlanMethodList;
	}
}
