package com.transformco.hs.ccn.offersearch.response;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.searshc.hs.utils.core.dto.response.BaseResponse;
import com.transformco.hs.ccn.offersearch.domain.TriggerMemberOfferProgramType;

@EntityScan
@XmlRootElement(name = "SearchTriggerMemberOfferProgramTypeResponse")
public class SearchTriggerMemberOfferProgramTypeResponse extends BaseResponse{
	
	public List<TriggerMemberOfferProgramType> getTriggerMemberOfferProgramTypeList() {
		return triggerMemberOfferProgramTypeList;
	}

	public void setTriggerMemberOfferProgramTypeList(
			List<TriggerMemberOfferProgramType> triggerMemberOfferProgramTypeList) {
		this.triggerMemberOfferProgramTypeList = triggerMemberOfferProgramTypeList;
	}

	List<TriggerMemberOfferProgramType> triggerMemberOfferProgramTypeList;

}
