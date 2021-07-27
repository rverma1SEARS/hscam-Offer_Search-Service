package com.transformco.hs.ccn.offersearch.response;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.searshc.hs.utils.core.dto.response.BaseResponse;
import com.transformco.hs.ccn.offersearch.domain.OfferPrograms;

@EntityScan
@XmlRootElement(name = "SearchOffersProgramsResponse")
public class SearchOffersProgramsResponse extends BaseResponse {
	
	private List<OfferPrograms> offerProgramsList;

	public List<OfferPrograms> getOfferProgramsList() {
		return offerProgramsList;
	}

	public void setOfferProgramsList(List<OfferPrograms> offerProgramsList) {
		this.offerProgramsList = offerProgramsList;
	}

	
	
}
