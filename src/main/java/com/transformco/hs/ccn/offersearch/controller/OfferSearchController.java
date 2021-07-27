package com.transformco.hs.ccn.offersearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.searshc.hs.utils.core.CollectionUtils;
import com.searshc.hs.utils.core.ReturnCode;
import com.transformco.hs.ccn.offersearch.business.OfferSearchBo;
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
import com.transformco.hs.ccn.offersearch.validator.RequestValidator;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author rverma1
 * @Date July 16, 2021
 */


@RestController
@Api(value = "Offer Search Service Controller")
@RequestMapping(path="/services/offersearch")
public class OfferSearchController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OfferSearchController.class);
	
	@Autowired
	OfferSearchBo offerSearchBo;
	
	@Autowired
	@Qualifier("RequestValidator")
	private RequestValidator requestValidator;
	
		
	@GetMapping(path="/searchOffersPrograms", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	@ApiOperation(value = "API to returns all the offer programs that have been set up ")
	public SearchOffersProgramsResponse searchOffersPrograms(@RequestBody SearchOffersProgramsRequest request) {	
		LOGGER.debug("Inside searchOffersPrograms method");
		List<String> errorMessage = requestValidator.validateSearchOffersProgramsRequest(request);
		SearchOffersProgramsResponse response = null;
			
		if (CollectionUtils.isEmpty(errorMessage)) {
			try {
				response =  offerSearchBo.searchOffersPrograms(request);
				if(response.getOfferProgramsList().isEmpty()) {
					response.setCorrelationId(request.getCorrelationId());
					response.setResponseCode(ReturnCode.NO_DATA_FOUND.getReturnCode());
					response.setResponseMessage(ReturnCode.NO_DATA_FOUND.getMessage());
					LOGGER.info("NO Offer Programs Details Found");
				}
			} catch (Exception e) {
				response.setCorrelationId(request.getCorrelationId());
				response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
				response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
				LOGGER.error("Exception in Fetching Offer Programs  : {}", e);
			}

		} else {
			response = new SearchOffersProgramsResponse();
			response.setCorrelationId(request.getCorrelationId());
			response.setResponseCode(ReturnCode.VALIDATION_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.VALIDATION_ERROR.getMessage());
			response.setMessages(errorMessage);
			LOGGER.info("Data Validation Failed |Error messages : {}", errorMessage);
		}

		return response;
	}
	
	@GetMapping(path="/searchMemberOfferTypes", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public SearchMemberOfferTypesResponse searchMemberOfferTypes(@RequestBody SearchMemberOfferTypesRequest request) {
		LOGGER.debug("Inside searchMemberOfferTypes method");
		SearchMemberOfferTypesResponse response = null;
		List<String> errorMessage = requestValidator.validateSearchMemberOfferTypesRequest(request);
		if (CollectionUtils.isEmpty(errorMessage)) {
			try {
				response =  offerSearchBo.searchMemberOfferTypes(request);
				if(response.getMemberOffersList().isEmpty()) {
					response.setCorrelationId(request.getCorrelationId());
					response.setResponseCode(ReturnCode.NO_DATA_FOUND.getReturnCode());
					response.setResponseMessage(ReturnCode.NO_DATA_FOUND.getMessage());
					LOGGER.info("NO Member Offer Types Details Found");
				}
			} catch (Exception e) {
				response.setCorrelationId(request.getCorrelationId());
				response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
				response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
				LOGGER.error("Exception in Fetching Member Offer Types : {}", e);
			}

		} else {
			response = new SearchMemberOfferTypesResponse();
			response.setCorrelationId(request.getCorrelationId());
			response.setResponseCode(ReturnCode.VALIDATION_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.VALIDATION_ERROR.getMessage());
			response.setMessages(errorMessage);
			LOGGER.info("Data Validation Failed |Error messages : {}", errorMessage);
		}

		return response;	
	}
	
	@GetMapping(path="/searchMemberOfferProgramType", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public SearchMemberOfferProgramTypeResponse searchMemberOfferProgramType(@RequestBody SearchMemberOfferProgramTypeRequest request) {
		LOGGER.debug("Inside searchMemberOfferProgramType method");
		List<String> errorMessage = requestValidator.validateSearchMemberOfferProgramTypeRequest(request);
		SearchMemberOfferProgramTypeResponse response = null;
		if (CollectionUtils.isEmpty(errorMessage)) {
			try {
				response =  offerSearchBo.searchMemberOfferProgramType(request);
				if(response.getMemberOfferProgramList().isEmpty()) {
					response.setCorrelationId(request.getCorrelationId());
					response.setResponseCode(ReturnCode.NO_DATA_FOUND.getReturnCode());
					response.setResponseMessage(ReturnCode.NO_DATA_FOUND.getMessage());
					LOGGER.info("NO Member Offer Program Type Details Found : {}");
				}
			} catch (Exception e) {
				response.setCorrelationId(request.getCorrelationId());
				response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
				response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
				LOGGER.error("Exception in Fetching Member Offer Program Types  : {}", e);
			}

		} else {
			response = new SearchMemberOfferProgramTypeResponse();
			response.setCorrelationId(request.getCorrelationId());
			response.setResponseCode(ReturnCode.VALIDATION_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.VALIDATION_ERROR.getMessage());
			response.setMessages(errorMessage);
			LOGGER.info("Data Validation Failed |Error messages : {}", errorMessage);
		}

		return response;	
	}
	
	@GetMapping(path="/searchTriggerMemberOfferProgramType", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public SearchTriggerMemberOfferProgramTypeResponse searchTriggerMemberOfferProgramType(@RequestBody SearchTriggerMemberOfferProgramTypeRequest request) {
		LOGGER.debug("Inside searchTriggerMemberOfferProgramType method");
		List<String> errorMessage = requestValidator.validateSearchTriggerMemberOfferProgramTypeRequest(request);
		SearchTriggerMemberOfferProgramTypeResponse response = null;
		if (CollectionUtils.isEmpty(errorMessage)) {
			try {
				response =  offerSearchBo.searchTriggerMemberOfferProgramType(request);
				if(response.getTriggerMemberOfferProgramTypeList().isEmpty()) {
					response.setCorrelationId(request.getCorrelationId());
					response.setResponseCode(ReturnCode.NO_DATA_FOUND.getReturnCode());
					response.setResponseMessage(ReturnCode.NO_DATA_FOUND.getMessage());
					LOGGER.info("NO Trigger Member Offer Program Type Details Found : {}");
				}
			} catch (Exception e) {
				response.setCorrelationId(request.getCorrelationId());
				response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
				response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
				LOGGER.error("Exception in Fetching Trigger Member Offer Program Type  : {}", e);
			}

		} else {
			response = new SearchTriggerMemberOfferProgramTypeResponse();
			response.setCorrelationId(request.getCorrelationId());
			response.setResponseCode(ReturnCode.VALIDATION_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.VALIDATION_ERROR.getMessage());
			response.setMessages(errorMessage);
			LOGGER.info("Data Validation Failed |Error messages : {}", errorMessage);
		}

		return response;	
	}
	
	@GetMapping(path="/searchTriggerAttributesMethod", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public SearchTriggerAttributesMethodResponse searchTriggerAttributesMethod(@RequestBody SearchTriggerAttributesMethodRequest request) {
		LOGGER.debug("Inside SearchTriggerAttributesMethodRequest method");
		List<String> errorMessage = requestValidator.validateSearchTriggerAttributesMethodRequest(request);
		SearchTriggerAttributesMethodResponse response = null;
		if (CollectionUtils.isEmpty(errorMessage)) {
			try {
				response =  offerSearchBo.searchTriggerAttributesMethod(request);
				if(response.getTriggerAttributesMethodList().isEmpty()) {
					response.setCorrelationId(request.getCorrelationId());
					response.setResponseCode(ReturnCode.NO_DATA_FOUND.getReturnCode());
					response.setResponseMessage(ReturnCode.NO_DATA_FOUND.getMessage());
					LOGGER.info("NO Trigger Attributes Method Type Details Found : {}");
				}
			} catch (Exception e) {
				response.setCorrelationId(request.getCorrelationId());
				response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
				response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
				LOGGER.error("Exception in Fetching Trigger Attributes Method  : {}", e);
			}

		} else {
			response = new SearchTriggerAttributesMethodResponse();
			response.setCorrelationId(request.getCorrelationId());
			response.setResponseCode(ReturnCode.VALIDATION_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.VALIDATION_ERROR.getMessage());
			response.setMessages(errorMessage);
			LOGGER.info("Data Validation Failed |Error messages : {}", errorMessage);
		}

		return response;	
	}
	
	@GetMapping(path="/searchTriggerAttributesEligibleOfferMethod", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public SearchTriggerAttributesEligibleOfferMethodResponse searchTriggerAttributesEligibleOfferMethod(@RequestBody SearchTriggerAttributesEligibleOfferMethodRequest request) {
		LOGGER.debug("Inside searchTriggerAttributesEligibleOfferMethod method");
		List<String> errorMessage = requestValidator.validateSearchTriggerAttributesEligibleOfferMethodRequest(request);
		SearchTriggerAttributesEligibleOfferMethodResponse response = null;
		if (CollectionUtils.isEmpty(errorMessage)) {
			try {
				response =  offerSearchBo.searchTriggerAttributesEligibleOfferMethod(request);
				if(response.getTriggerAttributesEligibleOfferMethodList().isEmpty()) {
					response.setCorrelationId(request.getCorrelationId());
					response.setResponseCode(ReturnCode.NO_DATA_FOUND.getReturnCode());
					response.setResponseMessage(ReturnCode.NO_DATA_FOUND.getMessage());
					LOGGER.info("NO Trigger Attributes Eligible Offer Method Details Found : {}");
				}
			} catch (Exception e) {
				response.setCorrelationId(request.getCorrelationId());
				response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
				response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
				LOGGER.error("Exception in Fetching Trigger Attributes Eligible Offer Method  : {}", e);
			}

		} else {
			response = new SearchTriggerAttributesEligibleOfferMethodResponse();
			response.setCorrelationId(request.getCorrelationId());
			response.setResponseCode(ReturnCode.VALIDATION_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.VALIDATION_ERROR.getMessage());
			response.setMessages(errorMessage);
			LOGGER.info("Data Validation Failed |Error messages : {}", errorMessage);
		}

		return response;
	}
	
	@GetMapping(path="/searchTriggerMemberOfferProgramPlanMethod", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public SearchTriggerMemberOfferProgramPlanMethodResponse searchTriggerMemberOfferProgramPlanMethod(@RequestBody SearchTriggerMemberOfferProgramPlanMethodRequest request) {
		LOGGER.debug("Inside searchTriggerMemberOfferProgramPlanMethod method");
		List<String> errorMessage = requestValidator.validateSearchTriggerMemberOfferProgramPlanMethodRequest(request);
		SearchTriggerMemberOfferProgramPlanMethodResponse response = null;
		if (CollectionUtils.isEmpty(errorMessage)) {
			try {
				response =  offerSearchBo.searchTriggerMemberOfferProgramPlanMethod(request);
				if(response.getTriggerMemberOfferProgramPlanMethodList().isEmpty()) {
					response.setCorrelationId(request.getCorrelationId());
					response.setResponseCode(ReturnCode.NO_DATA_FOUND.getReturnCode());
					response.setResponseMessage(ReturnCode.NO_DATA_FOUND.getMessage());
					LOGGER.info("NO Trigger Member Offer Program Plan Method Details Found : {}");
				}
			} catch (Exception e) {
				response.setCorrelationId(request.getCorrelationId());
				response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
				response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
				LOGGER.error("Exception in Fetching Trigger Member Offer Program Plan Method  : {}", e);
			}

		} else {
			response = new SearchTriggerMemberOfferProgramPlanMethodResponse();
			response.setCorrelationId(request.getCorrelationId());
			response.setResponseCode(ReturnCode.VALIDATION_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.VALIDATION_ERROR.getMessage());
			response.setMessages(errorMessage);
			LOGGER.info("Data Validation Failed |Error messages : {}", errorMessage);
		}

		return response;
	}
	
	@GetMapping(path="/searchMemberOfferProgramPlanMethod", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public SearchMemberOfferProgramPlanMethodResponse searchMemberOfferProgramPlanMethod(@RequestBody SearchMemberOfferProgramPlanMethodRequest request) {
		LOGGER.debug("Inside searchMemberOfferProgramPlanMethod method");
		List<String> errorMessage = requestValidator.validateSearchMemberOfferProgramPlanMethodRequest(request);
		SearchMemberOfferProgramPlanMethodResponse response = null;
		if (CollectionUtils.isEmpty(errorMessage)) {
			try {
				response =  offerSearchBo.searchMemberOfferProgramPlanMethod(request);
				if(response.getMemberOfferProgramPlanMethodList().isEmpty()) {
					response.setCorrelationId(request.getCorrelationId());
					response.setResponseCode(ReturnCode.NO_DATA_FOUND.getReturnCode());
					response.setResponseMessage(ReturnCode.NO_DATA_FOUND.getMessage());
					LOGGER.info("NO Member Offer Program Plan Method Details Found : {}");
				}
			} catch (Exception e) {
				response.setCorrelationId(request.getCorrelationId());
				response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
				response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
				LOGGER.error("Exception in Fetching Member Offer Program Plan Method  : {}", e);
			}

		} else {
			response = new SearchMemberOfferProgramPlanMethodResponse();
			response.setCorrelationId(request.getCorrelationId());
			response.setResponseCode(ReturnCode.VALIDATION_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.VALIDATION_ERROR.getMessage());
			response.setMessages(errorMessage);
			LOGGER.info("Data Validation Failed |Error messages : {}", errorMessage);
		}

		return response;
	}
	
	@GetMapping(path="/searchMemberOfferPlan", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public SearchMemberOfferPlanResponse searchMemberOfferPlan(@RequestBody SearchMemberOfferPlanRequest request) {
		LOGGER.debug("Inside searchMemberOfferPlan method");
		List<String> errorMessage = requestValidator.validateSearchMemberOfferPlanRequest(request);
		SearchMemberOfferPlanResponse response = null;
		if (CollectionUtils.isEmpty(errorMessage)) {
			try {
				response =  offerSearchBo.searchMemberOfferPlan(request);
				if(response.getMemberOfferPlanList().isEmpty()) {
					response.setCorrelationId(request.getCorrelationId());
					response.setResponseCode(ReturnCode.NO_DATA_FOUND.getReturnCode());
					response.setResponseMessage(ReturnCode.NO_DATA_FOUND.getMessage());
					LOGGER.info("NO Member Offer Plan Method Details Found : {}");
				}
			} catch (Exception e) {
				response.setCorrelationId(request.getCorrelationId());
				response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
				response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
				LOGGER.error("Exception in Fetching Member Offer Plan  : {}", e);
			}

		} else {
			response = new SearchMemberOfferPlanResponse();
			response.setCorrelationId(request.getCorrelationId());
			response.setResponseCode(ReturnCode.VALIDATION_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.VALIDATION_ERROR.getMessage());
			response.setMessages(errorMessage);
			LOGGER.info("Data Validation Failed |Error messages : {}", errorMessage);
		}

		return response;
	}
	
	@GetMapping(path="/searchMemberOfferProgramItems", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public SearchMemberOfferProgramItemsResponse searchMemberOfferProgramItems(@RequestBody SearchMemberOfferProgramItemsRequest request) {
		LOGGER.debug("Inside searchMemberOfferProgramItems method");
		List<String> errorMessage = requestValidator.validateSearchMemberOfferProgramItemsRequest(request);
		SearchMemberOfferProgramItemsResponse response = null;
		if (CollectionUtils.isEmpty(errorMessage)) {
			try {
				response =  offerSearchBo.searchMemberOfferProgramItems(request);
				if(response.getMemberOfferProgramItemsList().isEmpty()) {
					response.setCorrelationId(request.getCorrelationId());
					response.setResponseCode(ReturnCode.NO_DATA_FOUND.getReturnCode());
					response.setResponseMessage(ReturnCode.NO_DATA_FOUND.getMessage());
					LOGGER.info("NO Member Offer Program Items Details Found : {}");
				}
			} catch (Exception e) {
				response.setCorrelationId(request.getCorrelationId());
				response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
				response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
				LOGGER.error("Exception in Fetching Member Offer Program Items : {}", e);
			}

		} else {
			response = new SearchMemberOfferProgramItemsResponse();
			response.setCorrelationId(request.getCorrelationId());
			response.setResponseCode(ReturnCode.VALIDATION_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.VALIDATION_ERROR.getMessage());
			response.setMessages(errorMessage);
			LOGGER.info("Data Validation Failed |Error messages : {}", errorMessage);
		}

		return response;
	}
	
	@GetMapping(path="/searchMemberOfferPlanBenefits", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public SearchMemberOfferPlanBenefitsResponse searchMemberOfferPlanBenefits(@RequestBody SearchMemberOfferPlanBenefitsRequest request) {
		LOGGER.debug("Inside searchMemberOfferPlanBenefits method");
		List<String> errorMessage = requestValidator.validateSearchMemberOfferPlanBenefitsRequest(request);
		SearchMemberOfferPlanBenefitsResponse response = null;
		if (CollectionUtils.isEmpty(errorMessage)) {
			try {
				response =  offerSearchBo.searchMemberOfferPlanBenefits(request);
				if(response.getMemberOfferPlanBenefitsList().isEmpty()) {
					response.setCorrelationId(request.getCorrelationId());
					response.setResponseCode(ReturnCode.NO_DATA_FOUND.getReturnCode());
					response.setResponseMessage(ReturnCode.NO_DATA_FOUND.getMessage());
					LOGGER.info("NO Member Offer Plan Benefits Details Found : {}");
				}
			} catch (Exception e) {
				response.setCorrelationId(request.getCorrelationId());
				response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
				response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
				LOGGER.error("Exception in Fetching Member Offer Plan Benefits   : {}", e);
			}

		} else {
			response = new SearchMemberOfferPlanBenefitsResponse();
			response.setCorrelationId(request.getCorrelationId());
			response.setResponseCode(ReturnCode.VALIDATION_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.VALIDATION_ERROR.getMessage());
			response.setMessages(errorMessage);
			LOGGER.info("Data Validation Failed |Error messages : {}", errorMessage);
		}

		return response;
	}
	
	@GetMapping(path="/searchDispositonReasonsMethod", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public SearchDispositonReasonsMethodResponse searchDispositonReasonsMethod(@RequestBody SearchDispositonReasonsMethodRequest request) {
		LOGGER.debug("Inside searchDispositonReasonsMethod method");
		List<String> errorMessage = requestValidator.validateSearchDispositonReasonsMethodRequest(request);
		SearchDispositonReasonsMethodResponse response = null;
		if (CollectionUtils.isEmpty(errorMessage)) {
			try {
				response =  offerSearchBo.searchDispositonReasonsMethod(request);
				if(response.getDispositonReasonsList().isEmpty()) {
					response.setCorrelationId(request.getCorrelationId());
					response.setResponseCode(ReturnCode.NO_DATA_FOUND.getReturnCode());
					response.setResponseMessage(ReturnCode.NO_DATA_FOUND.getMessage());
					LOGGER.info("NO Dispositon Reasons Method Details Found : {}");
				}
			} catch (Exception e) {
				response.setCorrelationId(request.getCorrelationId());
				response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
				response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
				LOGGER.error("Exception in Fetching Dispositon Reasons Method  : {}", e);
			}

		} else {
			response = new SearchDispositonReasonsMethodResponse();
			response.setCorrelationId(request.getCorrelationId());
			response.setResponseCode(ReturnCode.VALIDATION_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.VALIDATION_ERROR.getMessage());
			response.setMessages(errorMessage);
			LOGGER.info("Data Validation Failed |Error messages : {}", errorMessage);
		}

		return response;
	}
	
	@GetMapping(path="/searchMemberOfferPlanDisposition", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public SearchMemberOfferPlanDispositionResponse searchMemberOfferPlanDisposition(@RequestBody SearchMemberOfferPlanDispositionRequest request) {
		LOGGER.debug("Inside searchMemberOfferPlanDisposition method");
		List<String> errorMessage = requestValidator.validateSearchMemberOfferPlanDispositionRequest(request);
		SearchMemberOfferPlanDispositionResponse response = null;
		if (CollectionUtils.isEmpty(errorMessage)) {
			try {
				response =  offerSearchBo.searchMemberOfferPlanDisposition(request);
				if(response.getMemberOfferPlanDispositionList().isEmpty()) {
					response.setCorrelationId(request.getCorrelationId());
					response.setResponseCode(ReturnCode.NO_DATA_FOUND.getReturnCode());
					response.setResponseMessage(ReturnCode.NO_DATA_FOUND.getMessage());
					LOGGER.info("NO Member Offer Plan Disposition Details Found : {}");
				}
			} catch (Exception e) {
				response.setCorrelationId(request.getCorrelationId());
				response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
				response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
				LOGGER.error("Exception in Fetching Member Offer Plan Disposition  : {}", e);
			}

		} else {
			response = new SearchMemberOfferPlanDispositionResponse();
			response.setCorrelationId(request.getCorrelationId());
			response.setResponseCode(ReturnCode.VALIDATION_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.VALIDATION_ERROR.getMessage());
			response.setMessages(errorMessage);
			LOGGER.info("Data Validation Failed |Error messages : {}", errorMessage);
		}

		return response;
	}
	
	@GetMapping(path="/searchMemberOfferPlanNotes", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public SearchMemberOfferPlanNotesResponse searchMemberOfferPlanNotes(@RequestBody SearchMemberOfferPlanNotesRequest request) {
		LOGGER.debug("Inside searchMemberOfferPlanNotes method");
		List<String> errorMessage = requestValidator.validateSearchMemberOfferPlanNotesRequest(request);
		SearchMemberOfferPlanNotesResponse response = null;
		if (CollectionUtils.isEmpty(errorMessage)) {
			try {
				response =  offerSearchBo.searchMemberOfferPlanNotes(request);
				if(response.getMemberOfferPlanNotesList().isEmpty()) {
					response.setCorrelationId(request.getCorrelationId());
					response.setResponseCode(ReturnCode.NO_DATA_FOUND.getReturnCode());
					response.setResponseMessage(ReturnCode.NO_DATA_FOUND.getMessage());
					LOGGER.info("NO Member Offer Plan Notes Details Found : {}");
				}
			} catch (Exception e) {
				response.setCorrelationId(request.getCorrelationId());
				response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
				response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
				LOGGER.error("Exception in Fetching Member Offer Plan Notes : {}", e);
			}

		} else {
			response = new SearchMemberOfferPlanNotesResponse();
			response.setCorrelationId(request.getCorrelationId());
			response.setResponseCode(ReturnCode.VALIDATION_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.VALIDATION_ERROR.getMessage());
			response.setMessages(errorMessage);
			LOGGER.info("Data Validation Failed |Error messages : {}", errorMessage);
		}

		return response;
	}
	
	@GetMapping(path="/searchMemberOfferPlanNotification", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public SearchMemberOfferPlanNotificationResponse searchMemberOfferPlanNotification(@RequestBody SearchMemberOfferPlanNotificationRequest request) {
		LOGGER.debug("Inside searchMemberOfferPlanNotification method");
		List<String> errorMessage = requestValidator.validateSearchMemberOfferPlanNotificationRequest(request);
		SearchMemberOfferPlanNotificationResponse response = null;
		if (CollectionUtils.isEmpty(errorMessage)) {
			try {
				response =  offerSearchBo.searchMemberOfferPlanNotification(request);
				if(response.getMemberOfferPlanNotificationList().isEmpty()) {
					response.setCorrelationId(request.getCorrelationId());
					response.setResponseCode(ReturnCode.NO_DATA_FOUND.getReturnCode());
					response.setResponseMessage(ReturnCode.NO_DATA_FOUND.getMessage());
					LOGGER.info("NO  Member Offer Plan Notification Details Found : {}");
				}
			} catch (Exception e) {
				response.setCorrelationId(request.getCorrelationId());
				response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
				response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
				LOGGER.error("Exception in Fetching Member Offer Plan Notification  : {}", e);
			}

		} else {
			response = new SearchMemberOfferPlanNotificationResponse();
			response.setCorrelationId(request.getCorrelationId());
			response.setResponseCode(ReturnCode.VALIDATION_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.VALIDATION_ERROR.getMessage());
			response.setMessages(errorMessage);
			LOGGER.info("Data Validation Failed |Error messages : {}", errorMessage);
		}

		return response;
	}
	
	@GetMapping(path="/searchMemberOfferPlanAttributes", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public SearchMemberOfferPlanAttributesResponse searchMemberOfferPlanAttributes(@RequestBody SearchMemberOfferPlanAttributesRequest request) {
		LOGGER.debug("Inside searchMemberOfferPlanAttributes method");
		List<String> errorMessage = requestValidator.validateSearchMemberOfferPlanAttributesRequest(request);
		SearchMemberOfferPlanAttributesResponse response = null;
		if (CollectionUtils.isEmpty(errorMessage)) {
			try {
				response =  offerSearchBo.searchMemberOfferPlanAttributes(request);
				if(response.getMemberOfferPlanAttributesList().isEmpty()) {
					response.setCorrelationId(request.getCorrelationId());
					response.setResponseCode(ReturnCode.NO_DATA_FOUND.getReturnCode());
					response.setResponseMessage(ReturnCode.NO_DATA_FOUND.getMessage());
					LOGGER.info("NO Member Offer Plan Attributes Details Found : {}");
				}
			} catch (Exception e) {
				response.setCorrelationId(request.getCorrelationId());
				response.setResponseCode(ReturnCode.SYSTEM_ERROR.getReturnCode());
				response.setResponseMessage(ReturnCode.SYSTEM_ERROR.getMessage());
				LOGGER.error("Exception in Fetching Member Offer Plan Attributes  : {}", e);
			}

		} else {
			response = new SearchMemberOfferPlanAttributesResponse();
			response.setCorrelationId(request.getCorrelationId());
			response.setResponseCode(ReturnCode.VALIDATION_ERROR.getReturnCode());
			response.setResponseMessage(ReturnCode.VALIDATION_ERROR.getMessage());
			response.setMessages(errorMessage);
			LOGGER.info("Data Validation Failed |Error messages : {}", errorMessage);
		}

		return response;
	}

}
