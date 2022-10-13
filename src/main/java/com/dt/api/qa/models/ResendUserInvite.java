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
@JsonPropertyOrder({ "email", "propertyId" })
public class ResendUserInvite {

	@JsonProperty("email")
	private String email;
	@JsonProperty("propertyId")
	private Integer propertyId;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
	}

	@JsonProperty("propertyId")
	public Integer getPropertyId() {
		return propertyId;
	}

	@JsonProperty("propertyId")
	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
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