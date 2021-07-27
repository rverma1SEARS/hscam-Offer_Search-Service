package com.transformco.hs.ccn.offersearch.response;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.searshc.hs.utils.core.dto.response.BaseResponse;
import com.transformco.hs.ccn.offersearch.domain.TriggerAttributesEligibleOfferMethod;

@EntityScan
@XmlRootElement(name = "SearchMemberOfferProgramTypeResponse")
public class SearchTriggerAttributesEligibleOfferMethodResponse extends BaseResponse {
	
	List<TriggerAttributesEligibleOfferMethod> triggerAttributesEligibleOfferMethodList;

	public List<TriggerAttributesEligibleOfferMethod> getTriggerAttributesEligibleOfferMethodList() {
		return triggerAttributesEligibleOfferMethodList;
	}

	public void setTriggerAttributesEligibleOfferMethodList(
			List<TriggerAttributesEligibleOfferMethod> triggerAttributesEligibleOfferMethodList) {
		this.triggerAttributesEligibleOfferMethodList = triggerAttributesEligibleOfferMethodList;
	}
 
}
