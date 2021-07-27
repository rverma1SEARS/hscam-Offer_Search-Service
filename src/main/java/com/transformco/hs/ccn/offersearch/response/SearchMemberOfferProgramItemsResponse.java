package com.transformco.hs.ccn.offersearch.response;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.searshc.hs.utils.core.dto.response.BaseResponse;
import com.transformco.hs.ccn.offersearch.domain.MemberOfferProgramItems;

@EntityScan
@XmlRootElement(name = "SearchMemberOfferProgramItemsResponse")
public class SearchMemberOfferProgramItemsResponse extends BaseResponse {
	
	private List<MemberOfferProgramItems> memberOfferProgramItemsList;

	public List<MemberOfferProgramItems> getMemberOfferProgramItemsList() {
		return memberOfferProgramItemsList;
	}

	public void setMemberOfferProgramItemsList(List<MemberOfferProgramItems> memberOfferProgramItemsList) {
		this.memberOfferProgramItemsList = memberOfferProgramItemsList;
	}

}
