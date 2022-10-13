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
@JsonPropertyOrder({ "roleId", "propertyId", "isAccepted" })
public class AcceptInvite {

	@JsonProperty("roleId")
	private String roleId;
	@JsonProperty("propertyId")
	private String propertyId;
	@JsonProperty("isAccepted")
	private Boolean isAccepted;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("roleId")
	public String getRoleId() {
		return roleId;
	}

	@JsonProperty("roleId")
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	@JsonProperty("propertyId")
	public String getPropertyId() {
		return propertyId;
	}

	@JsonProperty("propertyId")
	public void setPropertyId(String propertyId) {
		this.propertyId = propertyId;
	}

	@JsonProperty("isAccepted")
	public Boolean getIsAccepted() {
		return isAccepted;
	}

	@JsonProperty("isAccepted")
	public void setIsAccepted(Boolean isAccepted) {
		this.isAccepted = isAccepted;
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