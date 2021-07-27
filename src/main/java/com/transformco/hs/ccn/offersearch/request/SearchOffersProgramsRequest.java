package com.transformco.hs.ccn.offersearch.request;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.searshc.hs.utils.core.dto.request.BaseRequest;



@EntityScan
@XmlRootElement(name="SearchOffersProgramsRequest")
public class SearchOffersProgramsRequest extends BaseRequest{
	
	private String programIndicatorCode;

	public String getProgramIndicatorCode() {
		return programIndicatorCode;
	}

	public void setProgramIndicatorCode(String programIndicatorCode) {
		this.programIndicatorCode = programIndicatorCode;
	}

}
