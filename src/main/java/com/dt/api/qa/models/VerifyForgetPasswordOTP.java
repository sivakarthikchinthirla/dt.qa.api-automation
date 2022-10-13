
package com.dt.api.qa.models;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "otp", "emailID" })
public class VerifyForgetPasswordOTP {

	@JsonProperty("otp")
	private String otp;
	@JsonProperty("emailID")
	private String emailID;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("otp")
	public String getOtp() {
		return otp;
	}

	@JsonProperty("otp")
	public void setOtp(String otp) {
		this.otp = otp;
	}

	@JsonProperty("emailID")
	public String getEmailID() {
		return emailID;
	}

	@JsonProperty("emailID")
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}