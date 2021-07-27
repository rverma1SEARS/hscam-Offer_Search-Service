package com.transformco.hs.ccn.offersearch.constant;

import com.searshc.hs.utils.core.IRequestInput;

public enum SearchOffersProgramsRequestFields implements IRequestInput{
	
	PROGRAM_INDICATOR_CODE("Indicates the Program active/inactive", 1);
	

	SearchOffersProgramsRequestFields(String string, int i) {}
	
	private int maxLength;
	private int minLength;
	public int getMaxLength() {
		return maxLength;
	}
	public void setMaxLength(int maxLength) {
		this.maxLength = maxLength;
	}
	public int getMinLength() {
		return minLength;
	}
	public void setMinLength(int minLength) {
		this.minLength = minLength;
	}
	
	
}
