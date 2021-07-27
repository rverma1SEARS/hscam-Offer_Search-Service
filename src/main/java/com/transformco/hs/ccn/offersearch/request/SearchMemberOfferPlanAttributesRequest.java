package com.transformco.hs.ccn.offersearch.request;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.searshc.hs.utils.core.dto.response.BaseResponse;

import javax.xml.bind.annotation.XmlRootElement;


@EntityScan
@XmlRootElement(name="SearchMemberOfferPlanAttributesRequest")
public class SearchMemberOfferPlanAttributesRequest extends BaseResponse {
	
	private String attributeName;

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

}
