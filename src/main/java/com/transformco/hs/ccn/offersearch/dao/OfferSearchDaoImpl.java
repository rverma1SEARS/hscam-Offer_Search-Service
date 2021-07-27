package com.transformco.hs.ccn.offersearch.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.transformco.hs.ccn.offersearch.dao.mapper.OfferSearchMapper;
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

@Repository("OfferSearchDao")
public class OfferSearchDaoImpl implements OfferSearchDao {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OfferSearchDaoImpl.class);

	
	@Autowired
	OfferSearchMapper offerSearchMapper;
	
	@Override
	public List<OfferPrograms> fetchOfferPrograms(SearchOffersProgramsRequest request) {
		try {
			return offerSearchMapper.fetchOfferPrograms(request);
		}catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return new ArrayList<OfferPrograms>();
	}

	@Override
	public List<MemberOffers> fetchMemberOffers(SearchMemberOfferTypesRequest request) {
		try {
			return offerSearchMapper.fetchMemberOffers(request);
		}catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return new ArrayList<MemberOffers>();
	}

	@Override
	public List<MemberOfferProgram> fetchMemberOfferProgram(SearchMemberOfferProgramTypeRequest request) {
		try {
			return offerSearchMapper.fetchMemberOfferProgram(request);
		}catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return new ArrayList<MemberOfferProgram>();
	}

	@Override
	public List<TriggerMemberOfferProgramType> fetchTriggerMemberOfferProgramType(SearchTriggerMemberOfferProgramTypeRequest request) {
		try {
			return offerSearchMapper.fetchTriggerMemberOfferProgramType(request);
		}catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return new ArrayList<TriggerMemberOfferProgramType>();
	}

	@Override
	public List<TriggerAttributesMethod> fetchTriggerAttributesMethod(SearchTriggerAttributesMethodRequest request) {
		try {
			return offerSearchMapper.fetchTriggerAttributesMethod(request);
		}catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return new ArrayList<TriggerAttributesMethod>();
	}

	@Override
	public List<TriggerAttributesEligibleOfferMethod> fetchTriggerAttributesEligibleOfferMethod(SearchTriggerAttributesEligibleOfferMethodRequest request) {
		try {
			return offerSearchMapper.fetchTriggerAttributesEligibleOfferMethod(request);
		}catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return new ArrayList<TriggerAttributesEligibleOfferMethod>();
	}

	@Override
	public List<TriggerMemberOfferProgramPlanMethod> fetchTriggerMemberOfferProgramPlanMethod(SearchTriggerMemberOfferProgramPlanMethodRequest request) {
		try {
			return offerSearchMapper.fetchTriggerMemberOfferProgramPlanMethod(request);
		}catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return new ArrayList<TriggerMemberOfferProgramPlanMethod>();
	}

	@Override
	public List<MemberOfferProgramPlanMethod> fetchMemberOfferProgramPlanMethod(SearchMemberOfferProgramPlanMethodRequest request) {
		try {
			return offerSearchMapper.fetchMemberOfferProgramPlanMethod(request);
		}catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return new ArrayList<MemberOfferProgramPlanMethod>();
	}

	@Override
	public List<MemberOfferPlan> fetchMemberOfferPlan(SearchMemberOfferPlanRequest request) {
		try {
			return offerSearchMapper.fetchMemberOfferPlan(request);
		}catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return new ArrayList<MemberOfferPlan>();
	}

	@Override
	public List<MemberOfferProgramItems> fetchMemberOfferProgramItems(SearchMemberOfferProgramItemsRequest request) {
		try {
			return offerSearchMapper.fetchMemberOfferProgramItems(request);
		}catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return new ArrayList<MemberOfferProgramItems>();
	}

	@Override
	public List<MemberOfferPlanBenefits> fetchMemberOfferPlanBenefits(SearchMemberOfferPlanBenefitsRequest request) {
		try {
			return offerSearchMapper.fetchMemberOfferPlanBenefits(request);
		}catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return new ArrayList<MemberOfferPlanBenefits>();
	}

	@Override
	public List<DispositonReasons> fetchDispositonReasonsMethod(SearchDispositonReasonsMethodRequest request) {
		try {
			return offerSearchMapper.fetchDispositonReasonsMethod(request);
		}catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return new ArrayList<DispositonReasons>();
	}

	@Override
	public List<MemberOfferPlanDisposition> fetchMemberOfferPlanDisposition(SearchMemberOfferPlanDispositionRequest request) {
		try {
			return offerSearchMapper.fetchMemberOfferPlanDisposition(request);
		}catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return new ArrayList<MemberOfferPlanDisposition>();
	}

	@Override
	public List<MemberOfferPlanNotes> fetchMemberOfferPlanNotes(SearchMemberOfferPlanNotesRequest request) {
		try {
			return offerSearchMapper.fetchMemberOfferPlanNotes(request);
		}catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return new ArrayList<MemberOfferPlanNotes>();
	}

	@Override
	public List<MemberOfferPlanNotification> fetchMemberOfferPlanNotification(SearchMemberOfferPlanNotificationRequest request) {
		try {
			return offerSearchMapper.fetchMemberOfferPlanNotification(request);
		}catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return new ArrayList<MemberOfferPlanNotification>();
	}

	@Override
	public List<MemberOfferPlanAttributes> fetchMemberOfferPlanAttributes(SearchMemberOfferPlanAttributesRequest request) {
		try {
			return offerSearchMapper.fetchMemberOfferPlanAttributes(request);
		}catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return new ArrayList<MemberOfferPlanAttributes>();
	}
	
}
