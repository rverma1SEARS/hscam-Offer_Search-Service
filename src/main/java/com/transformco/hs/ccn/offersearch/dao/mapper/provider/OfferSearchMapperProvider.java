package com.transformco.hs.ccn.offersearch.dao.mapper.provider;

import org.apache.ibatis.jdbc.SQL;

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

public class OfferSearchMapperProvider {
	
	public String fetchOfferPrograms(final SearchOffersProgramsRequest request) {
		
		if(request.getProgramIndicatorCode().equals("A")){
			return new SQL() {
				{
					SELECT("Offer_Program_ID as offerProgramId, Offer_Program as offerProgram, Offer_Program_Description as offerProgramDescription, Effective_Date as startDate, End_Date endDate")
					.FROM("offers_program")
					.WHERE("Effective_Date < now()")
					.AND()
					.WHERE("End_Date > now()");
				}
			}.toString();
			
		}else if(request.getProgramIndicatorCode().equals("B")) {
			return new SQL() {
				{
					SELECT("Offer_Program_ID as offerProgramId, Offer_Program as offerProgram, Offer_Program_Description as offerProgramDescription, Effective_Date as startDate, End_Date endDate")
					.FROM("offers_program");
				}
			}.toString();
			
		}else {
			return new SQL() {
				{
					SELECT("Offer_Program_ID as offerProgramId, Offer_Program as offerProgram, Offer_Program_Description as offerProgramDescription, Effective_Date as startDate, End_Date endDate")
					.FROM("offers_program")
					.WHERE("End_Date < now()");
				}
			}.toString();
		}
	}
	
	public String fetchMemberOffers(final SearchMemberOfferTypesRequest request) {
		if(request.getProgramTypeIndicatorCode().equals("A")){
			return new SQL() {
				{
					SELECT("Offer_ID as offerId, Offer_Program as offerProgram, Offer_Type as offerType, Offer_Description as offerDescription, Effect_Date as effectiveDate, End_Date as endDate, Ranking as ranking, Created_User_ID as createdUser, Updated_User_ID as updateUser, Updated_Timestamp as updateTimeStamp")
					.FROM("member_offer_types")
					.WHERE("Effect_Date < now()")
					.AND()
					.WHERE("End_Date > now()")
					.AND()
					.WHERE(String.format("Offer_Program_ID = %s", request.getOfferProgramId()));
				}
			}.toString();
			
		}else if(request.getProgramTypeIndicatorCode().equals("B")) {
			return new SQL() {
				{
					SELECT("Offer_ID as offerId, Offer_Program as offerProgram, Offer_Type as offerType, Offer_Description as offerDescription, Effect_Date as effectiveDate, End_Date as endDate, Ranking as ranking, Created_User_ID as createdUser, Updated_User_ID as updateUser, Updated_Timestamp as updateTimeStamp")
					.FROM("member_offer_types")
					.WHERE(String.format("Offer_Program_ID = %s", request.getOfferProgramId()));
				}
			}.toString();
			
		}else {
			return new SQL() {
				{
					SELECT("Offer_ID as offerId, Offer_Program as offerProgram, Offer_Type as offerType, Offer_Description as offerDescription, Effect_Date as effectiveDate, End_Date as endDate, Ranking as ranking, Created_User_ID as createdUser, Updated_User_ID as updateUser, Updated_Timestamp as updateTimeStamp")
					.FROM("member_offer_types")
					.WHERE("End_Date < now()")
					.AND()
					.WHERE(String.format("Offer_Program_ID = %s", request.getOfferProgramId()));
				}
			}.toString();
		}
	}
	
	public String fetchMemberOfferProgram(final SearchMemberOfferProgramTypeRequest request) {
		if(request.getMemberOfferIndicatorCode().equals("A")){
			return new SQL() {
				{
					SELECT("Member_Offer_ID as memberOfferId, Offer_Name as offerName, Offer_ID as offerId, Client_ID as clientId, Line_of_Business as lineOfBuisness, Line_of_Business_Type as lineOfBuisnessType, Effective_Date as effectiveDate, End_Date as endDate, Member_Offer_Rank as memberOfferRank, Number_Of_Days_Between_Offer as numberOfDaysBetweenOffer, Item_Div_Offer_Code as itemDivOfferCode, Created_User_ID as createUser, Updated_User_ID as updateUser, Updated_Timestamp as updateTimestamp")
					.FROM("member_offer_program_types")
					.WHERE("Effective_Date < now()")
					.AND()
					.WHERE("End_Date > now()")
					.AND()
					.WHERE(String.format("Offer_ID = %s", request.getOfferId()));
				}
			}.toString();
			
		}else if(request.getMemberOfferIndicatorCode().equals("B")) {
			return new SQL() {
				{
					SELECT("Member_Offer_ID as memberOfferId, Offer_Name as offerName, Offer_ID as offerId, Client_ID as clientId, Line_of_Business as lineOfBuisness, Line_of_Business_Type as lineOfBuisnessType, Effective_Date as effectiveDate, End_Date as endDate, Member_Offer_Rank as memberOfferRank, Number_Of_Days_Between_Offer as numberOfDaysBetweenOffer, Item_Div_Offer_Code as itemDivOfferCode, Created_User_ID as createUser, Updated_User_ID as updateUser, Updated_Timestamp as updateTimestamp")
					.FROM("member_offer_program_types")
					.WHERE(String.format("Offer_ID = %s", request.getOfferId()));
				}
			}.toString();
			
		}else {
			return new SQL() {
				{
					SELECT("Member_Offer_ID as memberOfferId, Offer_Name as offerName, Offer_ID as offerId, Client_ID as clientId, Line_of_Business as lineOfBuisness, Line_of_Business_Type as lineOfBuisnessType, Effective_Date as effectiveDate, End_Date as endDate, Member_Offer_Rank as memberOfferRank, Number_Of_Days_Between_Offer as numberOfDaysBetweenOffer, Item_Div_Offer_Code as itemDivOfferCode, Created_User_ID as createUser, Updated_User_ID as updateUser, Updated_Timestamp as updateTimestamp")
					.FROM("member_offer_program_types")
					.WHERE("End_Date < now()")
					.AND()
					.WHERE(String.format("Offer_ID = %s", request.getOfferId()));
				}
			}.toString();
		}
		
	}

	public String fetchTriggerMemberOfferProgramType(final SearchTriggerMemberOfferProgramTypeRequest request) {
		return new SQL() {
			{
				SELECT("Trigger_Offer_ID as triggerOfferId, Member_Offer_ID as memberOfferId, Trigger_Attribute_ID as triggerAttributeId, Attribute_Name as attributeName, Attribute_Value as attributeValue, Attribute_Equation as attributeEquation, Created_User_ID as createUser, Updated_User_ID as updateUser, Updated_Timestamp as updateTimestamp")
				.FROM("trigger_member_offer_program_types")
				.WHERE(String.format("Member_Offer_ID = %s", request.getMemberOfferId()));
			}
		}.toString();
	}

	public String fetchTriggerAttributesMethod(final SearchTriggerAttributesMethodRequest request) {
		return new SQL() {
			{
				SELECT("Trigger_Attribute_ID as triggerAttributeId, Attribute_Name as attributeName, Attribute_Description as attributeDescription, Created_User_ID as createUser, Updated_User_ID as updateUser,  Updated_Timestamp as updateTimestamp")
				.FROM("trigger_attributes")
				.WHERE(String.format("Attribute_Name ='%s'", request.getAttributeName()));
			}
		}.toString();
	}
	
	public String fetchTriggerAttributesEligibleOfferMethod(final SearchTriggerAttributesEligibleOfferMethodRequest request) {
		return new SQL() {
			{
				SELECT("Trigger_Attribute_Eligible_Offer_ID as triggerAttributeEligibleOfferId, Trigger_Attribute_ID as triggerAttributeId, Attribute_Name as attributeName, Offer_ID as offerId, Created_User_ID as createUser, Updated_User_ID as updateUser, Updated_Timestamp as updateTimestamp")
				.FROM("trigger_attribute_eligible_offer")
				.WHERE(String.format("Attribute_Name ='%s'", request.getAttributeName()));
			}
		}.toString();
	}

	public String fetchTriggerMemberOfferProgramPlanMethod(final SearchTriggerMemberOfferProgramPlanMethodRequest request) {
		return new SQL() {
			{
				SELECT("Trigger_Attribute_Plan_ID as triggerAttributePlanId, Member_Offer_ID as memberOfferId, Plan_Name_ID as planNameId, Trigger_Attribute_ID as triggerAttributeId, Attribute_Name as attributeName, Attribute_Equation as attributeEquation, Attribute_Value as attributeValue, Created_User_ID as createUser, Updated_User_ID as updateUser, Updated_Timestamp as updateTimestamp")
				.FROM("trigger_member_offer_program_plan")
				.WHERE(String.format("Member_Offer_ID =%s", request.getMemberOfferId()));
			}
		}.toString();
	}
	
	public String fetchMemberOfferProgramPlanMethod(final SearchMemberOfferProgramPlanMethodRequest request) {
		if(request.getMemberOfferIdIndicatorCode().equals("A")){
			return new SQL() {
				{
					SELECT("Plan_Name_ID as planNameId, Plan_Name as planName, Member_Offer_ID as memberOfferId, Member_Offer_Plan_ID as memberOfferPlanId, Effective_Date as effectiveDate, End_Date as endDate,  Number_Of_Days_Between_Plan as numberOfDaysBetweenPlan, Created_User_ID as createUser, Updated_User_ID as updateUser, Updated_Timestamp as updateTimestamp")
					.FROM("member_offer_program_plan")
					.WHERE(String.format(" Member_Offer_ID =%s", request.getMemberOfferId()))
					.AND()
					.WHERE("Effective_Date < now()")
					.AND()
					.WHERE("End_Date > now()");
				}
			}.toString();
			
		}else if(request.getMemberOfferIdIndicatorCode().equals("B")) {
			return new SQL() {
				{
					SELECT("Plan_Name_ID as planNameId, Plan_Name as planName, Member_Offer_ID as memberOfferId, Member_Offer_Plan_ID as memberOfferPlanId, Effective_Date as effectiveDate, End_Date as endDate,  Number_Of_Days_Between_Plan as numberOfDaysBetweenPlan, Created_User_ID as createUser, Updated_User_ID as updateUser, Updated_Timestamp as updateTimestamp")
					.FROM("member_offer_program_plan")
					.WHERE(String.format(" Member_Offer_ID =%s", request.getMemberOfferId()));
				}
			}.toString();
			
		}else {
			return new SQL() {
				{
					SELECT("Plan_Name_ID as planNameId, Plan_Name as planName, Member_Offer_ID as memberOfferId, Member_Offer_Plan_ID as memberOfferPlanId, Effective_Date as effectiveDate, End_Date as endDate,  Number_Of_Days_Between_Plan as numberOfDaysBetweenPlan, Created_User_ID as createUser, Updated_User_ID as updateUser, Updated_Timestamp as updateTimestamp")
					.FROM("member_offer_program_plan")
					.WHERE(String.format(" Member_Offer_ID =%s", request.getMemberOfferId()))
					.AND()
					.WHERE("End_Date < now()");
				}
			}.toString();
		}
	}
	
	public String fetchMemberOfferPlan(final SearchMemberOfferPlanRequest request) {
		
		if(request.getMemberOfferIdIndicatorCode().equals("A")){
			return new SQL() {
				{
					SELECT("Member_Offer_Plan_ID as memberOfferPlanId, Offer_ID as offerId, Plan_Type as planType, Plan_Description as planDescription, Auto_Renewal_Flag as autoRenewalFlag, Renewal_Period_Type as renewalPeriodType, Renewal_Period_Length as renewalPeriodLength, Effective_Date as effectiveDate, End_Date as endDate, Ranking as ranking, Promo_Code as promoCode, Created_User_ID as createUser, Updated_User_ID as updateUser, Updated_Timestamp as updateTimestamp")
					.FROM("member_offer_plan")
					.WHERE(String.format(" Offer_ID =%s", request.getOfferId()))
					.AND()
					.WHERE("Effective_Date < now()")
					.AND()
					.WHERE("End_Date > now()");
				}
			}.toString();
			
		}else if(request.getMemberOfferIdIndicatorCode().equals("B")) {
			return new SQL() {
				{
					SELECT("Member_Offer_Plan_ID as memberOfferPlanId, Offer_ID as offerId, Plan_Type as planType, Plan_Description as planDescription, Auto_Renewal_Flag as autoRenewalFlag, Renewal_Period_Type as renewalPeriodType, Renewal_Period_Length as renewalPeriodLength, Effective_Date as effectiveDate, End_Date as endDate, Ranking as ranking, Promo_Code as promoCode, Created_User_ID as createUser, Updated_User_ID as updateUser, Updated_Timestamp as updateTimestamp")
					.FROM("member_offer_plan")
					.WHERE(String.format(" Offer_ID =%s", request.getOfferId()));
				}
			}.toString();
			
		}else {
			return new SQL() {
				{
					SELECT("Member_Offer_Plan_ID as memberOfferPlanId, Offer_ID as offerId, Plan_Type as planType, Plan_Description as planDescription, Auto_Renewal_Flag as autoRenewalFlag, Renewal_Period_Type as renewalPeriodType, Renewal_Period_Length as renewalPeriodLength, Effective_Date as effectiveDate, End_Date as endDate, Ranking as ranking, Promo_Code as promoCode, Created_User_ID as createUser, Updated_User_ID as updateUser, Updated_Timestamp as updateTimestamp")
					.FROM("member_offer_plan")
					.WHERE(String.format(" Offer_ID =%s", request.getOfferId()))
					.AND()
					.WHERE("End_Date < now()");
				}
			}.toString();
		}
	}
	
	public String fetchMemberOfferProgramItems(final SearchMemberOfferProgramItemsRequest request) {
		
		return new SQL() {
			{
				SELECT("Member_Offer_Item_ID as memberOfferItemId, Member_Offer_ID as memberOfferId, Item_Div_Offer_Code as itemDivOfferCode, Division_No as divisionNo, Item_No as itemNo, Item_Equation as itemEquation, Created_User_ID as createUser, Updated_User_ID as updateUser, Updated_Timestamp as updateTimestamp")
				.FROM("member_offer_program_items")
				.WHERE(String.format("Member_Offer_ID =%s", request.getMemberOfferId()));
			}
		}.toString();
	}
	
	public String fetchMemberOfferPlanBenefits(final SearchMemberOfferPlanBenefitsRequest request) {
		
		return new SQL() {
			{
				SELECT("Member_Offer_Plan_ID as offerBenefitId, Member_Offer_Plan_ID as memberOfferPlanId, Line_of_Business as lineOfBusiness, Discount_Percent as discountPercent, Discount_Amount as discountAmount, Discount_Code as discountCode, Free_Shipping_Flag as freeShippingFlag, Minimum_Order_Amount as minimumOrderAmount, Max_Order_Amount as maxOrderAmount, Apply_Benefit_to_Current_Order as applyBenefittoCurrentOrder, Coupon_Code as couponCode, Proc_ID as procId, Created_User_ID as createUserId, Created_Timestamp as createdTimestamp, Updated_User_ID as updateUserId, Updated_Timestamp as updatedTimestamp")
				.FROM("member_offer_plan_benefits")
				.WHERE(String.format("Member_Offer_Plan_ID =%s", request.getMemberOfferPlanId()));
			}
		}.toString();
	}
	
	public String fetchDispositonReasonsMethod(final SearchDispositonReasonsMethodRequest request) {

		return new SQL() {
			{
				SELECT("Disposition as disposition, Disposition_Description as dispostionDescription, Created_User_ID as createUserId, Created_Timestamp as createdTimestamp, Updated_User_ID as updateUserId, Upaded_Timestamp as updatedTimestamp")
				.FROM("disposition_reasons")
				.WHERE(String.format("Disposition ='%s'", request.getDisposition()));
			}
		}.toString();
	}
	
	public String fetchMemberOfferPlanDisposition(final SearchMemberOfferPlanDispositionRequest request) {
		
		return new SQL() {
			{
				SELECT("Member_Offer_Disposition_ID as memberOfferDispositionId, Member_Offer_Plan_ID as memberOfferPlanId, Offer_ID as offerId, Disposition as dispositionId, Created_User_ID as createUserId, Created_Timestamp as createdTimestamp, Updated_User_ID as updateUserId, Updated_Timestamp as updatedTimestamp")
				.FROM("member_offer_plan_dispositions_reasons")
				.WHERE(String.format("Member_Offer_Plan_ID=%s", request.getMemberOfferPlanId()));
			}
		}.toString();
	}
	
	public String fetchMemberOfferPlanNotes(final SearchMemberOfferPlanNotesRequest request) {
		
		return new SQL() {
			{
				SELECT("Member_Offer_Note_ID as memberOfferNoteId, Member_Offer_Plan_ID as memberOfferPlanId, Offer_Note_ID_Type as offerNoteIdType, Note as note, Created_User_ID as createUserId, Created_Timestamp as createdTimestamp, Updated_User_ID as updateUserId, Updated_Timestamp as updatedTimestamp")
				.FROM("member_offer_plan_notes")
				.WHERE(String.format("Member_Offer_Plan_ID=%s", request.getMemberOfferPlanId()));
			}
		}.toString();
	}
	
	public String fetchMemberOfferPlanNotification(final SearchMemberOfferPlanNotificationRequest request) {
		
		return new SQL() {
			{
				SELECT("Member_Offers_Notification_ID as memberOffersNotificationId, Member_Offer_Plan_ID as memberOfferPlanId, Email_Flag as emailFlag, Phone_Flag as phoneFlag, Text_Flag as textFlag, Mail_Flag as mailFlag, Created_User_ID as createUserId, Created_Timestamp as createdTimestamp, Updated_User_ID as updateUserId, Updated_Timestamp as updatedTimestamp")
				.FROM("member_offer_plan_notification")
				.WHERE(String.format("Member_Offer_Plan_ID=%s", request.getMemberOfferPlanId()));
			}
		}.toString();
	}
	
	public String fetchMemberOfferPlanAttributes(final SearchMemberOfferPlanAttributesRequest request) {

		return new SQL() {
			{
				SELECT("Member_Offer_Plan_ID as memberOfferPlanId, Attribute_Name as attributeName, Attribute_Value as attribueValue, Display_Flag as displayFlag, Display_Order_On_Screen as displayOrderOnScreen, Created_User_ID as createUserId, Created_Date as createdTimestamp, Updated_User_ID as updateUserId, Updated_User_ID as updatedTimestamp")
				.FROM("member_offer_plan_attributes")
				.WHERE(String.format("Attribute_Name='%s'", request.getAttributeName()));
			}
		}.toString();
	}
}
