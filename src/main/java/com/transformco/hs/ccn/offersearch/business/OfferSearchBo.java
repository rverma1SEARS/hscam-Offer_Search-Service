package com.transformco.hs.ccn.offersearch.business;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;


import com.transformco.hs.ccn.offersearch.request.SearchDispositonReasonsMethodRequest;
import com.transformco.hs.ccn.offersearch.request.SearchMemberOfferPlanAttributesRequest;
import com.transformco.hs.ccn.offersearch.request.SearchMemberOfferPlanBenefitsRequest;
import com.transformco.hs.ccn.offersearch.request.SearchMemberOfferPlanDispositionRequest;
import com.transformco.hs.ccn.offersearch.request.SearchMemberOfferPlanNotesRequest;
import com.transformco.hs.ccn.offersearch.request.SearchMemberOfferPlanRequest;
import com.transformco.hs.ccn.offersearch.request.SearchMemberOfferProgramItemsRequest;
import com.transformco.hs.ccn.offersearch.request.SearchMemberOfferProgramPlanMethodRequest;
import com.transformco.hs.ccn.offersearch.request.SearchMemberOfferProgramTypeRequest;
import com.transformco.hs.ccn.offersearch.request.SearchMemberOfferTypesRequest;
import com.transformco.hs.ccn.offersearch.request.SearchOffersProgramsRequest;
import com.transformco.hs.ccn.offersearch.request.SearchTriggerAttributesEligibleOfferMethodRequest;
import com.transformco.hs.ccn.offersearch.request.SearchTriggerAttributesMethodRequest;
import com.transformco.hs.ccn.offersearch.request.SearchTriggerMemberOfferProgramPlanMethodRequest;
import com.transformco.hs.ccn.offersearch.request.SearchTriggerMemberOfferProgramTypeRequest;
import com.transformco.hs.ccn.offersearch.response.SearchDispositonReasonsMethodResponse;
import com.transformco.hs.ccn.offersearch.response.SearchMemberOfferPlanAttributesResponse;
import com.transformco.hs.ccn.offersearch.response.SearchMemberOfferPlanBenefitsResponse;
import com.transformco.hs.ccn.offersearch.response.SearchMemberOfferPlanDispositionResponse;
import com.transformco.hs.ccn.offersearch.response.SearchMemberOfferPlanNotesResponse;
import com.transformco.hs.ccn.offersearch.response.SearchMemberOfferPlanNotificationRequest;
import com.transformco.hs.ccn.offersearch.response.SearchMemberOfferPlanNotificationResponse;
import com.transformco.hs.ccn.offersearch.response.SearchMemberOfferPlanResponse;
import com.transformco.hs.ccn.offersearch.response.SearchMemberOfferProgramItemsResponse;
import com.transformco.hs.ccn.offersearch.response.SearchMemberOfferProgramPlanMethodResponse;
import com.transformco.hs.ccn.offersearch.response.SearchMemberOfferProgramTypeResponse;
import com.transformco.hs.ccn.offersearch.response.SearchMemberOfferTypesResponse;
import com.transformco.hs.ccn.offersearch.response.SearchOffersProgramsResponse;
import com.transformco.hs.ccn.offersearch.response.SearchTriggerAttributesEligibleOfferMethodResponse;
import com.transformco.hs.ccn.offersearch.response.SearchTriggerAttributesMethodResponse;
import com.transformco.hs.ccn.offersearch.response.SearchTriggerMemberOfferProgramPlanMethodResponse;
import com.transformco.hs.ccn.offersearch.response.SearchTriggerMemberOfferProgramTypeResponse;

@Component
public interface OfferSearchBo {
	
	public SearchOffersProgramsResponse searchOffersPrograms(@RequestBody SearchOffersProgramsRequest requestData);

	public SearchMemberOfferTypesResponse searchMemberOfferTypes(SearchMemberOfferTypesRequest request);

	public SearchMemberOfferProgramTypeResponse searchMemberOfferProgramType(SearchMemberOfferProgramTypeRequest request);

	public SearchTriggerMemberOfferProgramTypeResponse searchTriggerMemberOfferProgramType(SearchTriggerMemberOfferProgramTypeRequest request);

	public SearchTriggerAttributesMethodResponse searchTriggerAttributesMethod(SearchTriggerAttributesMethodRequest request);

	public SearchTriggerAttributesEligibleOfferMethodResponse searchTriggerAttributesEligibleOfferMethod(SearchTriggerAttributesEligibleOfferMethodRequest request);

	public SearchTriggerMemberOfferProgramPlanMethodResponse searchTriggerMemberOfferProgramPlanMethod(SearchTriggerMemberOfferProgramPlanMethodRequest request);

	public SearchMemberOfferProgramPlanMethodResponse searchMemberOfferProgramPlanMethod(SearchMemberOfferProgramPlanMethodRequest request);

	public SearchMemberOfferPlanResponse searchMemberOfferPlan(SearchMemberOfferPlanRequest request);

	public SearchMemberOfferProgramItemsResponse searchMemberOfferProgramItems(SearchMemberOfferProgramItemsRequest request);

	public SearchMemberOfferPlanBenefitsResponse searchMemberOfferPlanBenefits(SearchMemberOfferPlanBenefitsRequest request);

	public SearchDispositonReasonsMethodResponse searchDispositonReasonsMethod(SearchDispositonReasonsMethodRequest request);

	public SearchMemberOfferPlanDispositionResponse searchMemberOfferPlanDisposition(SearchMemberOfferPlanDispositionRequest request);

	public SearchMemberOfferPlanNotesResponse searchMemberOfferPlanNotes(SearchMemberOfferPlanNotesRequest request);

	public SearchMemberOfferPlanNotificationResponse searchMemberOfferPlanNotification(SearchMemberOfferPlanNotificationRequest request);

	public SearchMemberOfferPlanAttributesResponse searchMemberOfferPlanAttributes(SearchMemberOfferPlanAttributesRequest request);

}
