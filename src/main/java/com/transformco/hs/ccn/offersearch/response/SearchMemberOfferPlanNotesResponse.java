package com.transformco.hs.ccn.offersearch.response;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.searshc.hs.utils.core.dto.response.BaseResponse;
import com.transformco.hs.ccn.offersearch.domain.MemberOfferPlanNotes;

@EntityScan
@XmlRootElement(name = "SearchMemberOfferPlanNotesResponse")
public class SearchMemberOfferPlanNotesResponse extends BaseResponse {

	private List<MemberOfferPlanNotes> memberOfferPlanNotesList;

	public List<MemberOfferPlanNotes> getMemberOfferPlanNotesList() {
		return memberOfferPlanNotesList;
	}

	public void setMemberOfferPlanNotesList(List<MemberOfferPlanNotes> memberOfferPlanNotesList) {
		this.memberOfferPlanNotesList = memberOfferPlanNotesList;
	}
}
