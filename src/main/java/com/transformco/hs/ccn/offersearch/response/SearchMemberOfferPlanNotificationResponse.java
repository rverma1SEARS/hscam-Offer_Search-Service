package com.transformco.hs.ccn.offersearch.response;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.searshc.hs.utils.core.dto.response.BaseResponse;
import com.transformco.hs.ccn.offersearch.domain.MemberOfferPlanNotification;

@EntityScan
@XmlRootElement(name = "SearchMemberOfferPlanNotificationResponse")
public class SearchMemberOfferPlanNotificationResponse extends BaseResponse {

	private List<MemberOfferPlanNotification> memberOfferPlanNotificationList;

	public List<MemberOfferPlanNotification> getMemberOfferPlanNotificationList() {
		return memberOfferPlanNotificationList;
	}

	public void setMemberOfferPlanNotificationList(List<MemberOfferPlanNotification> memberOfferPlanNotificationList) {
		this.memberOfferPlanNotificationList = memberOfferPlanNotificationList;
	}
}
