package com.transformco.hs.ccn.offersearch.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import com.transformco.hs.ccn.offersearch.dao.mapper.provider.OfferSearchMapperProvider;
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


@Mapper
public interface OfferSearchMapper {
	
	@SelectProvider(type = OfferSearchMapperProvider.class, method = "fetchOfferPrograms")
	List<OfferPrograms> fetchOfferPrograms(SearchOffersProgramsRequest request);
	
	@SelectProvider(type = OfferSearchMapperProvider.class, method = "fetchMemberOffers")
	List<MemberOffers> fetchMemberOffers(SearchMemberOfferTypesRequest request);

	@SelectProvider(type = OfferSearchMapperProvider.class, method = "fetchMemberOfferProgram")
	List<MemberOfferProgram> fetchMemberOfferProgram(SearchMemberOfferProgramTypeRequest request);

	@SelectProvider(type = OfferSearchMapperProvider.class, method = "fetchTriggerMemberOfferProgramType")
	List<TriggerMemberOfferProgramType> fetchTriggerMemberOfferProgramType(SearchTriggerMemberOfferProgramTypeRequest request);

	@SelectProvider(type = OfferSearchMapperProvider.class, method = "fetchTriggerAttributesMethod")
	List<TriggerAttributesMethod> fetchTriggerAttributesMethod(SearchTriggerAttributesMethodRequest request);

	@SelectProvider(type = OfferSearchMapperProvider.class, method = "fetchTriggerAttributesEligibleOfferMethod")
	List<TriggerAttributesEligibleOfferMethod> fetchTriggerAttributesEligibleOfferMethod(SearchTriggerAttributesEligibleOfferMethodRequest request);
	
	@SelectProvider(type = OfferSearchMapperProvider.class, method = "fetchTriggerMemberOfferProgramPlanMethod")
	List<TriggerMemberOfferProgramPlanMethod> fetchTriggerMemberOfferProgramPlanMethod(SearchTriggerMemberOfferProgramPlanMethodRequest request);
	
	@SelectProvider(type = OfferSearchMapperProvider.class, method = "fetchMemberOfferProgramPlanMethod")
	List<MemberOfferProgramPlanMethod> fetchMemberOfferProgramPlanMethod(SearchMemberOfferProgramPlanMethodRequest request);

	@SelectProvider(type = OfferSearchMapperProvider.class, method = "fetchMemberOfferPlan")
	List<MemberOfferPlan> fetchMemberOfferPlan(SearchMemberOfferPlanRequest request);

	@SelectProvider(type = OfferSearchMapperProvider.class, method = "fetchMemberOfferProgramItems")
	List<MemberOfferProgramItems> fetchMemberOfferProgramItems(SearchMemberOfferProgramItemsRequest request);

	@SelectProvider(type = OfferSearchMapperProvider.class, method = "fetchMemberOfferPlanBenefits")
	List<MemberOfferPlanBenefits> fetchMemberOfferPlanBenefits(SearchMemberOfferPlanBenefitsRequest request);

	@SelectProvider(type = OfferSearchMapperProvider.class, method = "fetchDispositonReasonsMethod")
	List<DispositonReasons> fetchDispositonReasonsMethod(SearchDispositonReasonsMethodRequest request);

	@SelectProvider(type = OfferSearchMapperProvider.class, method = "fetchMemberOfferPlanDisposition")
	List<MemberOfferPlanDisposition> fetchMemberOfferPlanDisposition(SearchMemberOfferPlanDispositionRequest request);

	@SelectProvider(type = OfferSearchMapperProvider.class, method = "fetchMemberOfferPlanNotes")
	List<MemberOfferPlanNotes> fetchMemberOfferPlanNotes(SearchMemberOfferPlanNotesRequest request);

	@SelectProvider(type = OfferSearchMapperProvider.class, method = "fetchMemberOfferPlanNotification")
	List<MemberOfferPlanNotification> fetchMemberOfferPlanNotification(SearchMemberOfferPlanNotificationRequest request);

	@SelectProvider(type = OfferSearchMapperProvider.class, method = "fetchMemberOfferPlanAttributes")
	List<MemberOfferPlanAttributes> fetchMemberOfferPlanAttributes(SearchMemberOfferPlanAttributesRequest request);

}
