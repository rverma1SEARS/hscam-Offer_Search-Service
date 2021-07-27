package com.transformco.hs.ccn.offersearch.response;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.searshc.hs.utils.core.dto.response.BaseResponse;
import com.transformco.hs.ccn.offersearch.domain.MemberOfferProgram;

@EntityScan
@XmlRootElement(name = "SearchMemberOfferProgramTypeResponse")
public class SearchMemberOfferProgramTypeResponse extends BaseResponse {
	
	List<MemberOfferProgram> memberOfferProgramList;

	public List<MemberOfferProgram> getMemberOfferProgramList() {
		return memberOfferProgramList;
	}

	public void setMemberOfferProgramList(List<MemberOfferProgram> memberOfferProgramList) {
		this.memberOfferProgramList = memberOfferProgramList;
	}

}
