package com.transformco.hs.ccn.offersearch.response;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.searshc.hs.utils.core.dto.response.BaseResponse;
import com.transformco.hs.ccn.offersearch.domain.DispositonReasons;

@EntityScan
@XmlRootElement(name = "SearchDispositonReasonsMethodResponse")
public class SearchDispositonReasonsMethodResponse extends BaseResponse {
	
	private List<DispositonReasons> dispositonReasonsList;

	public List<DispositonReasons> getDispositonReasonsList() {
		return dispositonReasonsList;
	}

	public void setDispositonReasonsList(List<DispositonReasons> dispositonReasonsList) {
		this.dispositonReasonsList = dispositonReasonsList;
	}

}
