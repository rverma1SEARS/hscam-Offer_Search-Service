package com.transformco.hs.ccn.offersearch.response;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.searshc.hs.utils.core.dto.response.BaseResponse;
import com.transformco.hs.ccn.offersearch.domain.MemberOffers;

@EntityScan
@XmlRootElement(name = "SearchMemberOfferTypesResponse")
public class SearchMemberOfferTypesResponse extends BaseResponse {
	
	List<MemberOffers> memberOffersList;

	public List<MemberOffers> getMemberOffersList() {
		return memberOffersList;
	}

	public void setMemberOffersList(List<MemberOffers> memberOffersList) {
		this.memberOffersList = memberOffersList;
	}
	
	
	
}
