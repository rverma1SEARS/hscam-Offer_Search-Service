package com.transformco.hs.ccn.offersearch.response;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.searshc.hs.utils.core.dto.response.BaseResponse;
import com.transformco.hs.ccn.offersearch.domain.TriggerMemberOfferProgramPlanMethod;

@EntityScan
@XmlRootElement(name = "SearchTriggerMemberOfferProgramPlanMethodResponse")
public class SearchTriggerMemberOfferProgramPlanMethodResponse extends BaseResponse {
	
	List<TriggerMemberOfferProgramPlanMethod> triggerMemberOfferProgramPlanMethodList;

	public List<TriggerMemberOfferProgramPlanMethod> getTriggerMemberOfferProgramPlanMethodList() {
		return triggerMemberOfferProgramPlanMethodList;
	}

	public void setTriggerMemberOfferProgramPlanMethodList(
			List<TriggerMemberOfferProgramPlanMethod> triggerMemberOfferProgramPlanMethodList) {
		this.triggerMemberOfferProgramPlanMethodList = triggerMemberOfferProgramPlanMethodList;
	}

	

}
