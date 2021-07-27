package com.transformco.hs.ccn.offersearch.response;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.searshc.hs.utils.core.dto.response.BaseResponse;
import com.transformco.hs.ccn.offersearch.domain.TriggerAttributesMethod;

@EntityScan
@XmlRootElement(name = "SearchTriggerAttributesMethodResponse")
public class SearchTriggerAttributesMethodResponse extends BaseResponse {
	
	List<TriggerAttributesMethod> triggerAttributesMethodList;

	public List<TriggerAttributesMethod> getTriggerAttributesMethodList() {
		return triggerAttributesMethodList;
	}

	public void setTriggerAttributesMethodList(List<TriggerAttributesMethod> triggerAttributesMethodList) {
		this.triggerAttributesMethodList = triggerAttributesMethodList;
	}

}
