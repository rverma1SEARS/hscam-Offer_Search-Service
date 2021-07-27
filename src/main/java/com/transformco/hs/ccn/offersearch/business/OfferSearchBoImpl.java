package com.transformco.hs.ccn.offersearch.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.searshc.hs.utils.core.ReturnCode;
import com.transformco.hs.ccn.offersearch.dao.OfferSearchDao;
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
public class OfferSearchBoImpl implements OfferSearchBo {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OfferSearchBoImpl.class);
	
	@Autowired
	OfferSearchDao offerSearchDao;

	@Override
	public SearchOffersProgramsResponse searchOffersPrograms(SearchOffersProgramsRequest request) {
		
		SearchOffersProgramsResponse response = new SearchOffersProgramsResponse();
		try {
			response.setOfferProgramsList(offerSearchDao.fetchOfferPrograms(request));
			response.setResponseCode(ReturnCode.SUCCESS.getReturnCode());
			response.setResponseMessage(ReturnCode.SUCCESS.getMessage());
		}catch(Exception e){
			response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
			LOGGER.error("Exception in Fecth Offer Outcome Details : {}", e.getMessage());
		}
		LOGGER.info("Fetched Offer Programs Details : {}", response);
		return response;
	}

	@Override
	public SearchMemberOfferTypesResponse searchMemberOfferTypes(SearchMemberOfferTypesRequest request) {
		SearchMemberOfferTypesResponse response = new SearchMemberOfferTypesResponse();
		try {
			response.setMemberOffersList(offerSearchDao.fetchMemberOffers(request));
			response.setResponseCode(ReturnCode.SUCCESS.getReturnCode());
			response.setResponseMessage(ReturnCode.SUCCESS.getMessage());
		}catch(Exception e){
			response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
			LOGGER.error("Exception in Fetch Member Offer Types Details : {}", e.getMessage());
		}
		LOGGER.info("Fetched Member Offer Types Details : {}", response);
		return response;
	}

	@Override
	public SearchMemberOfferProgramTypeResponse searchMemberOfferProgramType(SearchMemberOfferProgramTypeRequest request) {
		SearchMemberOfferProgramTypeResponse response = new SearchMemberOfferProgramTypeResponse();
		try {
			response.setMemberOfferProgramList(offerSearchDao.fetchMemberOfferProgram(request));
			response.setResponseCode(ReturnCode.SUCCESS.getReturnCode());
			response.setResponseMessage(ReturnCode.SUCCESS.getMessage());
		}catch(Exception e){
			response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
			LOGGER.error("Exception in Fetch Member Offer Program Details : {}", e.getMessage());
		}
		LOGGER.info("Fetched Member Offer Program Details : {}", response);
		return response;
	}

	@Override
	public SearchTriggerMemberOfferProgramTypeResponse searchTriggerMemberOfferProgramType(SearchTriggerMemberOfferProgramTypeRequest request) {
		SearchTriggerMemberOfferProgramTypeResponse response = new SearchTriggerMemberOfferProgramTypeResponse();
		try {
			response.setTriggerMemberOfferProgramTypeList(offerSearchDao.fetchTriggerMemberOfferProgramType(request));
			response.setResponseCode(ReturnCode.SUCCESS.getReturnCode());
			response.setResponseMessage(ReturnCode.SUCCESS.getMessage());
		}catch(Exception e){
			response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
			LOGGER.error("Exception in Fetch Trigger Member Offer Program Type Details : {}", e.getMessage());
		}
		LOGGER.info("Fetched Trigger Member Offer Program Type Details : {}", response);
		return response;
	}

	@Override
	public SearchTriggerAttributesMethodResponse searchTriggerAttributesMethod(SearchTriggerAttributesMethodRequest request) {
		SearchTriggerAttributesMethodResponse response = new SearchTriggerAttributesMethodResponse();
		try {
			response.setTriggerAttributesMethodList(offerSearchDao.fetchTriggerAttributesMethod(request));
			response.setResponseCode(ReturnCode.SUCCESS.getReturnCode());
			response.setResponseMessage(ReturnCode.SUCCESS.getMessage());
		}catch(Exception e){
			response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
			LOGGER.error("Exception in Fetch Trigger Attributes Method Details : {}", e.getMessage());
		}
		LOGGER.info("Fetched Trigger Attributes Method Details : {}", response);
		return response;
	}

	@Override
	public SearchTriggerAttributesEligibleOfferMethodResponse searchTriggerAttributesEligibleOfferMethod(SearchTriggerAttributesEligibleOfferMethodRequest request) {
		SearchTriggerAttributesEligibleOfferMethodResponse response = new SearchTriggerAttributesEligibleOfferMethodResponse();
		try {
			response.setTriggerAttributesEligibleOfferMethodList(offerSearchDao.fetchTriggerAttributesEligibleOfferMethod(request));
			response.setResponseCode(ReturnCode.SUCCESS.getReturnCode());
			response.setResponseMessage(ReturnCode.SUCCESS.getMessage());
		}catch(Exception e){
			response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
			LOGGER.error("Exception in Fetch Trigger Attributes Eligible Offer Method Details : {}", e.getMessage());
		}
		LOGGER.info("Fetched Trigger Attributes Eligible Offer Method Details : {}", response);
		return response;
	}

	@Override
	public SearchTriggerMemberOfferProgramPlanMethodResponse searchTriggerMemberOfferProgramPlanMethod(SearchTriggerMemberOfferProgramPlanMethodRequest request) {
		SearchTriggerMemberOfferProgramPlanMethodResponse response = new SearchTriggerMemberOfferProgramPlanMethodResponse();
		try {
			response.setTriggerMemberOfferProgramPlanMethodList(offerSearchDao.fetchTriggerMemberOfferProgramPlanMethod(request));
			response.setResponseCode(ReturnCode.SUCCESS.getReturnCode());
			response.setResponseMessage(ReturnCode.SUCCESS.getMessage());
		}catch(Exception e){
			response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
			LOGGER.error("Exception in Fetch Trigger Member Offer Program Plan Details : {}", e.getMessage());
		}
		LOGGER.info("Fetched Trigger Member Offer Program Plan Details : {}", response);
		return response;
	}

	@Override
	public SearchMemberOfferProgramPlanMethodResponse searchMemberOfferProgramPlanMethod(SearchMemberOfferProgramPlanMethodRequest request) {
		SearchMemberOfferProgramPlanMethodResponse response = new SearchMemberOfferProgramPlanMethodResponse();
		try {
			response.setMemberOfferProgramPlanMethodList(offerSearchDao.fetchMemberOfferProgramPlanMethod(request));
			response.setResponseCode(ReturnCode.SUCCESS.getReturnCode());
			response.setResponseMessage(ReturnCode.SUCCESS.getMessage());
		}catch(Exception e){
			response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
			LOGGER.error("Exception in Fetch Member Offer Program Plan Details : {}", e.getMessage());
		}
		LOGGER.info("Fetched Member Offer Program Plan Details : {}", response);
		return response;
	}

	@Override
	public SearchMemberOfferPlanResponse searchMemberOfferPlan(SearchMemberOfferPlanRequest request) {
		SearchMemberOfferPlanResponse response = new SearchMemberOfferPlanResponse();
		try {
			response.setMemberOfferPlanList(offerSearchDao.fetchMemberOfferPlan(request));
			response.setResponseCode(ReturnCode.SUCCESS.getReturnCode());
			response.setResponseMessage(ReturnCode.SUCCESS.getMessage());
		}catch(Exception e){
			response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
			LOGGER.error("Exception in Fetch Member Offer Plan Details : {}", e.getMessage());
		}
		LOGGER.info("Fetched Member Offer Plan Details : {}", response);
		return response;
	}

	@Override
	public SearchMemberOfferProgramItemsResponse searchMemberOfferProgramItems(SearchMemberOfferProgramItemsRequest request) {

		SearchMemberOfferProgramItemsResponse response = new SearchMemberOfferProgramItemsResponse();
		try {
			response.setMemberOfferProgramItemsList(offerSearchDao.fetchMemberOfferProgramItems(request));
			response.setResponseCode(ReturnCode.SUCCESS.getReturnCode());
			response.setResponseMessage(ReturnCode.SUCCESS.getMessage());
		}catch(Exception e){
			response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
			LOGGER.error("Exception in Fecth Member Offer Program Items Details : {}", e.getMessage());
		}
		LOGGER.info("Fetched Member Offer Program Items Details : {}", response);
		return response;
	}

	@Override
	public SearchMemberOfferPlanBenefitsResponse searchMemberOfferPlanBenefits(SearchMemberOfferPlanBenefitsRequest request) {
		SearchMemberOfferPlanBenefitsResponse response = new SearchMemberOfferPlanBenefitsResponse();
		try {
			response.setMemberOfferPlanBenefitsList(offerSearchDao.fetchMemberOfferPlanBenefits(request));
			response.setResponseCode(ReturnCode.SUCCESS.getReturnCode());
			response.setResponseMessage(ReturnCode.SUCCESS.getMessage());
		}catch(Exception e){
			response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
			LOGGER.error("Exception in Fetch Member Offer Plan Benefits Details : {}", e.getMessage());
		}
		LOGGER.info("Fetched Member Offer Plan Benefits Details : {}", response);
		return response;
	}

	@Override
	public SearchDispositonReasonsMethodResponse searchDispositonReasonsMethod(SearchDispositonReasonsMethodRequest request) {
		SearchDispositonReasonsMethodResponse response = new SearchDispositonReasonsMethodResponse();
		try {
			response.setDispositonReasonsList(offerSearchDao.fetchDispositonReasonsMethod(request));
			response.setResponseCode(ReturnCode.SUCCESS.getReturnCode());
			response.setResponseMessage(ReturnCode.SUCCESS.getMessage());
		}catch(Exception e){
			response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
			LOGGER.error("Exception in Fetch Dispositon Reasons Method Details : {}", e.getMessage());
		}
		LOGGER.info("Fetched Dispositon Reasons Method Details : {}", response);
		return response;
	}

	@Override
	public SearchMemberOfferPlanDispositionResponse searchMemberOfferPlanDisposition(SearchMemberOfferPlanDispositionRequest request) {
		SearchMemberOfferPlanDispositionResponse response = new SearchMemberOfferPlanDispositionResponse();
		try {
			response.setMemberOfferPlanDispositionList(offerSearchDao.fetchMemberOfferPlanDisposition(request));
			response.setResponseCode(ReturnCode.SUCCESS.getReturnCode());
			response.setResponseMessage(ReturnCode.SUCCESS.getMessage());
		}catch(Exception e){
			response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
			LOGGER.error("Exception in Fetch Member Offer Plan Disposition Details : {}", e.getMessage());
		}
		LOGGER.info("Fetched Member Offer Plan Disposition Details : {}", response);
		return response;
	}

	@Override
	public SearchMemberOfferPlanNotesResponse searchMemberOfferPlanNotes(SearchMemberOfferPlanNotesRequest request) {
		SearchMemberOfferPlanNotesResponse response = new SearchMemberOfferPlanNotesResponse();
		try {
			response.setMemberOfferPlanNotesList(offerSearchDao.fetchMemberOfferPlanNotes(request));
			response.setResponseCode(ReturnCode.SUCCESS.getReturnCode());
			response.setResponseMessage(ReturnCode.SUCCESS.getMessage());
		}catch(Exception e){
			response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
			LOGGER.error("Exception in Fetch Member Offer Plan Notes Details : {}", e.getMessage());
		}
		LOGGER.info("Fetched Member Offer Plan Notes Details : {}", response);
		return response;
	}

	@Override
	public SearchMemberOfferPlanNotificationResponse searchMemberOfferPlanNotification(SearchMemberOfferPlanNotificationRequest request) {
		SearchMemberOfferPlanNotificationResponse response = new SearchMemberOfferPlanNotificationResponse();
		try {
			response.setMemberOfferPlanNotificationList(offerSearchDao.fetchMemberOfferPlanNotification(request));
			response.setResponseCode(ReturnCode.SUCCESS.getReturnCode());
			response.setResponseMessage(ReturnCode.SUCCESS.getMessage());
		}catch(Exception e){
			response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
			LOGGER.error("Exception in Fetch Member Offer Plan Notification Details : {}", e.getMessage());
		}
		LOGGER.info("Fetched Member Offer Plan Notification Details : {}", response);
		return response;
	}

	@Override
	public SearchMemberOfferPlanAttributesResponse searchMemberOfferPlanAttributes(SearchMemberOfferPlanAttributesRequest request) {
		SearchMemberOfferPlanAttributesResponse response = new SearchMemberOfferPlanAttributesResponse();
		try {
			response.setMemberOfferPlanAttributesList(offerSearchDao.fetchMemberOfferPlanAttributes(request));
			response.setResponseCode(ReturnCode.SUCCESS.getReturnCode());
			response.setResponseMessage(ReturnCode.SUCCESS.getMessage());
		}catch(Exception e){
			response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
			LOGGER.error("Exception in Fetch Member Offer Plan Attributes Details : {}", e.getMessage());
		}
		LOGGER.info("Fetched Member Offer Plan Attributes Details : {}", response);
		return response;
	}

}
