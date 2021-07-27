package com.transformco.hs.ccn.offersearch.dao;

import java.util.List;

import com.transformco.hs.ccn.offersearch.domain.DispositonReasons;
import com.transformco.hs.ccn.offersearch.domain.MemberOfferPlan;
import com.transformco.hs.ccn.offersearch.domain.MemberOfferPlanAttributes;
import com.transformco.hs.ccn.offersearch.domain.MemberOfferPlanBenefits;
import com.transformco.hs.ccn.offersearch.domain.MemberOfferPlanDisposition;
import com.transformco.hs.ccn.offersearch.domain.MemberOfferPlanNotes;
import com.transformco.hs.ccn.offersearch.domain.MemberOfferPlanNotification;
import com.transformco.hs.ccn.offersearch.domain.MemberOfferProgram;
import com.transformco.hs.ccn.offersearch.domain.MemberOfferProgramItems;
import com.transformco.hs.ccn.offersearch.domain.MemberOfferProgramPlanMethod;
import com.transformco.hs.ccn.offersearch.domain.MemberOffers;
import com.transformco.hs.ccn.offersearch.domain.OfferPrograms;
import com.transformco.hs.ccn.offersearch.domain.TriggerAttributesEligibleOfferMethod;
import com.transformco.hs.ccn.offersearch.domain.TriggerAttributesMethod;
import com.transformco.hs.ccn.offersearch.domain.TriggerMemberOfferProgramPlanMethod;
import com.transformco.hs.ccn.offersearch.domain.TriggerMemberOfferProgramType;
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
import com.transformco.hs.ccn.offersearch.response.SearchMemberOfferPlanNotificationRequest;

public interface OfferSearchDao {
	
	List<OfferPrograms> fetchOfferPrograms(SearchOffersProgramsRequest request);

	List<MemberOffers> fetchMemberOffers(SearchMemberOfferTypesRequest request);

	List<MemberOfferProgram> fetchMemberOfferProgram(SearchMemberOfferProgramTypeRequest request);

	List<TriggerMemberOfferProgramType> fetchTriggerMemberOfferProgramType(SearchTriggerMemberOfferProgramTypeRequest request);

	List<TriggerAttributesMethod> fetchTriggerAttributesMethod(SearchTriggerAttributesMethodRequest request);

	List<TriggerAttributesEligibleOfferMethod> fetchTriggerAttributesEligibleOfferMethod(SearchTriggerAttributesEligibleOfferMethodRequest request);

	List<TriggerMemberOfferProgramPlanMethod> fetchTriggerMemberOfferProgramPlanMethod(SearchTriggerMemberOfferProgramPlanMethodRequest request);

	List<MemberOfferProgramPlanMethod> fetchMemberOfferProgramPlanMethod(SearchMemberOfferProgramPlanMethodRequest request);

	List<MemberOfferPlan> fetchMemberOfferPlan(SearchMemberOfferPlanRequest request);

	List<MemberOfferProgramItems> fetchMemberOfferProgramItems(SearchMemberOfferProgramItemsRequest request);

	List<MemberOfferPlanBenefits> fetchMemberOfferPlanBenefits(SearchMemberOfferPlanBenefitsRequest request);

	List<DispositonReasons> fetchDispositonReasonsMethod(SearchDispositonReasonsMethodRequest request);

	List<MemberOfferPlanDisposition> fetchMemberOfferPlanDisposition(SearchMemberOfferPlanDispositionRequest request);

	List<MemberOfferPlanNotes> fetchMemberOfferPlanNotes(SearchMemberOfferPlanNotesRequest request);

	List<MemberOfferPlanNotification> fetchMemberOfferPlanNotification(SearchMemberOfferPlanNotificationRequest request);

	List<MemberOfferPlanAttributes> fetchMemberOfferPlanAttributes(SearchMemberOfferPlanAttributesRequest request);

}
