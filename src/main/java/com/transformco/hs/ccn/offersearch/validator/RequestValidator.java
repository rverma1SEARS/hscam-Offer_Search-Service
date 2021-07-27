package com.transformco.hs.ccn.offersearch.validator;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.searshc.hs.utils.core.validation.AbstractValidator;
import com.transformco.hs.ccn.offersearch.constant.OfferSearchConstants;
import com.transformco.hs.ccn.offersearch.constant.RequestFields;
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


@Component("RequestValidator")
public class RequestValidator {
		
	private static final Logger LOGGER = LoggerFactory.getLogger(RequestValidator.class);
		
	public List<String> validateSearchOffersProgramsRequest(SearchOffersProgramsRequest request) {
		
		List<String> errorMessages = new ArrayList<String>();
		
		if(request.getProgramIndicatorCode().isEmpty() || request.getProgramIndicatorCode().length() != RequestFields.PROGRAM_INDICATOR_CODE.getMaxLength() || !OfferSearchConstants.INDICATOR_VALUES.contains(request.getProgramIndicatorCode())) {
			errorMessages.add(OfferSearchConstants.VALIDATION_ERROR);
			errorMessages.add("EXPECTED VALUES : "+OfferSearchConstants.INDICATOR_VALUES);
		}
		return errorMessages;
	}

	public List<String> validateSearchMemberOfferTypesRequest(SearchMemberOfferTypesRequest request) {

		List<String> errorMessages = new ArrayList<String>();
		if(request.getOfferProgramId() == 0 || countDigit(request.getOfferProgramId()) > RequestFields.ID_VALUE.getMaxLength()) {
			errorMessages.add(OfferSearchConstants.VALIDATION_ERROR);
			errorMessages.add("EXPECTED VALUES : "+OfferSearchConstants.INTEGER_VALUES);
		}
		if(request.getProgramTypeIndicatorCode().isEmpty() || request.getProgramTypeIndicatorCode().length() != RequestFields.PROGRAM_INDICATOR_CODE.getMaxLength() || !OfferSearchConstants.INDICATOR_VALUES.contains(request.getProgramTypeIndicatorCode())) {
			if(errorMessages.isEmpty())	errorMessages.add(OfferSearchConstants.VALIDATION_ERROR);
			errorMessages.add("EXPECTED VALUES : "+OfferSearchConstants.INDICATOR_VALUES);
		}
		return errorMessages;
	}

	public List<String> validateSearchMemberOfferProgramTypeRequest(SearchMemberOfferProgramTypeRequest request) {
		
		List<String> errorMessages = new ArrayList<String>();
		if(request.getOfferId() == 0 || countDigit(request.getOfferId()) > RequestFields.ID_VALUE.getMaxLength()) {
			errorMessages.add(OfferSearchConstants.VALIDATION_ERROR);
			errorMessages.add("EXPECTED VALUES :"+OfferSearchConstants.INTEGER_VALUES);
		}
		if(request.getMemberOfferIndicatorCode().isEmpty() || request.getMemberOfferIndicatorCode().length() != RequestFields.PROGRAM_INDICATOR_CODE.getMaxLength() || !OfferSearchConstants.INDICATOR_VALUES.contains(request.getMemberOfferIndicatorCode())) {
			if(errorMessages.isEmpty())	errorMessages.add(OfferSearchConstants.VALIDATION_ERROR);
			errorMessages.add("EXPECTED VALUES : "+OfferSearchConstants.INDICATOR_VALUES);
		}
		return errorMessages;
	}

	public List<String> validateSearchTriggerMemberOfferProgramTypeRequest(SearchTriggerMemberOfferProgramTypeRequest request) {
		List<String> errorMessages = new ArrayList<String>();
		if(request.getMemberOfferId() == 0 || countDigit(request.getMemberOfferId()) > RequestFields.ID_VALUE.getMaxLength()) {
			errorMessages.add(OfferSearchConstants.VALIDATION_ERROR);
			errorMessages.add("EXPECTED VALUES : "+OfferSearchConstants.INTEGER_VALUES);
		}
		return errorMessages;
	}

	public List<String> validateSearchTriggerAttributesMethodRequest(SearchTriggerAttributesMethodRequest request) {
		List<String> errorMessages = new ArrayList<String>();
		if(request.getAttributeName().isEmpty() || request.getAttributeName().length() > RequestFields.ATTRIBUTE_NAME.getMaxLength()) {
			errorMessages.add(OfferSearchConstants.VALIDATION_ERROR);
			errorMessages.add("EXPECTED LENGTH : "+RequestFields.ATTRIBUTE_NAME.getMaxLength());
		}
		return errorMessages;
	}

	public List<String> validateSearchTriggerAttributesEligibleOfferMethodRequest(SearchTriggerAttributesEligibleOfferMethodRequest request) {
		List<String> errorMessages = new ArrayList<String>();
		if(request.getAttributeName().isEmpty() || request.getAttributeName().length() > RequestFields.ATTRIBUTE_NAME.getMaxLength()) {
			errorMessages.add(OfferSearchConstants.VALIDATION_ERROR);
			errorMessages.add("EXPECTED LENGTH : "+RequestFields.ATTRIBUTE_NAME.getMaxLength());

		}
		return errorMessages;
	}

	public List<String> validateSearchTriggerMemberOfferProgramPlanMethodRequest(SearchTriggerMemberOfferProgramPlanMethodRequest request) {
		List<String> errorMessages = new ArrayList<String>();
		if(request.getMemberOfferId() == 0 || countDigit(request.getMemberOfferId()) > RequestFields.ID_VALUE.getMaxLength()) {
			errorMessages.add(OfferSearchConstants.VALIDATION_ERROR);
			errorMessages.add("EXPECTED VALUES : "+OfferSearchConstants.INTEGER_VALUES);
		}
		return errorMessages;
	}

	public List<String> validateSearchMemberOfferProgramPlanMethodRequest(SearchMemberOfferProgramPlanMethodRequest request) {
		
		List<String> errorMessages = new ArrayList<String>();
		if(request.getMemberOfferId() == 0 || countDigit(request.getMemberOfferId()) > RequestFields.ID_VALUE.getMaxLength()) {
			errorMessages.add(OfferSearchConstants.VALIDATION_ERROR);
			errorMessages.add("EXPECTED VALUES : "+OfferSearchConstants.INTEGER_VALUES);
		}
		if(request.getMemberOfferIdIndicatorCode().isEmpty() || request.getMemberOfferIdIndicatorCode().length() != RequestFields.PROGRAM_INDICATOR_CODE.getMaxLength() || !OfferSearchConstants.INDICATOR_VALUES.contains(request.getMemberOfferIdIndicatorCode())) {
			if(errorMessages.isEmpty())	errorMessages.add(OfferSearchConstants.VALIDATION_ERROR);
			errorMessages.add("EXPECTED VALUES : "+OfferSearchConstants.INDICATOR_VALUES);
		}
		return errorMessages;
	}

	public List<String> validateSearchMemberOfferPlanRequest(SearchMemberOfferPlanRequest request) {
		List<String> errorMessages = new ArrayList<String>();
		if(request.getOfferId() == 0 || countDigit(request.getOfferId()) > RequestFields.ID_VALUE.getMaxLength()) {
			errorMessages.add(OfferSearchConstants.VALIDATION_ERROR);
			errorMessages.add("EXPECTED VALUES : "+OfferSearchConstants.INTEGER_VALUES);
		}
		if(request.getMemberOfferIdIndicatorCode().isEmpty() || request.getMemberOfferIdIndicatorCode().length() != RequestFields.PROGRAM_INDICATOR_CODE.getMaxLength() || !OfferSearchConstants.INDICATOR_VALUES.contains(request.getMemberOfferIdIndicatorCode())) {
			if(errorMessages.isEmpty())	errorMessages.add(OfferSearchConstants.VALIDATION_ERROR);
			errorMessages.add("EXPECTED VALUES : "+OfferSearchConstants.INDICATOR_VALUES);
		}
		return errorMessages;
	}

	public List<String> validateSearchMemberOfferProgramItemsRequest(SearchMemberOfferProgramItemsRequest request) {
		List<String> errorMessages = new ArrayList<String>();
		if(request.getMemberOfferId() == 0 || countDigit(request.getMemberOfferId()) > RequestFields.ID_VALUE.getMaxLength()) {
			errorMessages.add(OfferSearchConstants.VALIDATION_ERROR);
			errorMessages.add("EXPECTED VALUES : "+OfferSearchConstants.INTEGER_VALUES);
		}
		return errorMessages;
	}

	public List<String> validateSearchMemberOfferPlanBenefitsRequest(SearchMemberOfferPlanBenefitsRequest request) {
		List<String> errorMessages = new ArrayList<String>();
		if(request.getMemberOfferPlanId() == 0 || countDigit(request.getMemberOfferPlanId()) > RequestFields.ID_VALUE.getMaxLength()) {
			errorMessages.add(OfferSearchConstants.VALIDATION_ERROR);
			errorMessages.add("EXPECTED VALUES : "+OfferSearchConstants.INTEGER_VALUES);
		}
		return errorMessages;
	}

	public List<String> validateSearchDispositonReasonsMethodRequest(SearchDispositonReasonsMethodRequest request) {
		List<String> errorMessages = new ArrayList<String>();
		if(request.getDisposition().isEmpty() || request.getDisposition().length() > RequestFields.DISPOSITION.getMaxLength()) {
			if(errorMessages.isEmpty())	errorMessages.add(OfferSearchConstants.VALIDATION_ERROR);
			errorMessages.add("EXPECTED VALUES : "+OfferSearchConstants.DISPOSITION_VALUES);
		}
		return errorMessages;	
	}
	
	public List<String> validateSearchMemberOfferPlanDispositionRequest(SearchMemberOfferPlanDispositionRequest request) {
		List<String> errorMessages = new ArrayList<String>();
		if(request.getMemberOfferPlanId() == 0 || countDigit(request.getMemberOfferPlanId()) > RequestFields.ID_VALUE.getMaxLength()) {
			errorMessages.add(OfferSearchConstants.VALIDATION_ERROR);
			errorMessages.add("EXPECTED VALUES : "+OfferSearchConstants.INTEGER_VALUES);
		}
		return errorMessages;
	}

	public List<String> validateSearchMemberOfferPlanNotesRequest(SearchMemberOfferPlanNotesRequest request) {
		List<String> errorMessages = new ArrayList<String>();
		if(request.getMemberOfferPlanId() == 0 || countDigit(request.getMemberOfferPlanId()) > RequestFields.ID_VALUE.getMaxLength()) {
			errorMessages.add(OfferSearchConstants.VALIDATION_ERROR);
			errorMessages.add("EXPECTED VALUES : "+OfferSearchConstants.INTEGER_VALUES);
		}
		return errorMessages;
	}

	public List<String> validateSearchMemberOfferPlanNotificationRequest(SearchMemberOfferPlanNotificationRequest request) {
		List<String> errorMessages = new ArrayList<String>();
		if(request.getMemberOfferPlanId() == 0 || countDigit(request.getMemberOfferPlanId()) > RequestFields.ID_VALUE.getMaxLength()) {
			errorMessages.add(OfferSearchConstants.VALIDATION_ERROR);
			errorMessages.add("EXPECTED VALUES : "+OfferSearchConstants.INTEGER_VALUES);
		}
		return errorMessages;
	}

	public List<String> validateSearchMemberOfferPlanAttributesRequest(SearchMemberOfferPlanAttributesRequest request) {
		List<String> errorMessages = new ArrayList<String>();
		if(request.getAttributeName().isEmpty() || request.getAttributeName().length() > RequestFields.ATTRIBUTE_NAME.getMaxLength()) {
			errorMessages.add(OfferSearchConstants.VALIDATION_ERROR);
			errorMessages.add("EXPECTED LENGTH : "+RequestFields.ATTRIBUTE_NAME.getMaxLength());
		}
		return errorMessages;
	}
	
	private int countDigit(int offerProgramId) {
		if (offerProgramId/10 == 0)
	        return 1;
	    return 1 + countDigit(offerProgramId / 10);
	}
}
