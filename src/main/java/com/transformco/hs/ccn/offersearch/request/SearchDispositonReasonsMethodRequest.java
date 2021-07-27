package com.transformco.hs.ccn.offersearch.request;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.searshc.hs.utils.core.dto.response.BaseResponse;

@EntityScan
@XmlRootElement(name="SearchDispositonReasonsMethodRequest")
public class SearchDispositonReasonsMethodRequest extends BaseResponse {
	
	private String disposition;

	public String getDisposition() {
		return disposition;
	}

	public void setDisposition(String disposition) {
		this.disposition = disposition;
	}

}
