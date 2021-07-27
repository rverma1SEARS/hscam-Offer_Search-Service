package com.transformco.hs.ccn.offersearch.constant;

public enum RequestFields {
	
	PROGRAM_INDICATOR_CODE("Indicates the Program active/inactive", 1),
	ID_VALUE("Maximum length of ID value", 10), ATTRIBUTE_NAME("Provides the attribute length", 20),DISPOSITION("Tells about the disposition", 10);
	
	private String description;
	private int maxLength;
	private int minLength;

	RequestFields(String string, int i) {
		this.description = string;
		this.maxLength = i;
	}
	
	RequestFields(String string, int i, int j) {
		this.description = string;
		this.maxLength = i;
		this.minLength = j;
	}
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

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
