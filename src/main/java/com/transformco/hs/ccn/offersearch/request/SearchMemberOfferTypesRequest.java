package com.transformco.hs.ccn.offersearch.request;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.searshc.hs.utils.core.dto.request.BaseRequest;

@EntityScan
@XmlRootElement(name="SearchMemberOfferTypesRequest")
public class SearchMemberOfferTypesRequest  extends BaseRequest {
	
	private int offerProgramId;
	private String programTypeIndicatorCode;
	
	public int getOfferProgramId() {
		return offerProgramId;
	}
	public void setOfferProgramId(int offerProgramId) {
		this.offerProgramId = offerProgramId;
	}
	public String getProgramTypeIndicatorCode() {
		return programTypeIndicatorCode;
	}
	public void setProgramTypeIndicatorCode(String programTypeIndicatorCode) {
		this.programTypeIndicatorCode = programTypeIndicatorCode;
	}

}

