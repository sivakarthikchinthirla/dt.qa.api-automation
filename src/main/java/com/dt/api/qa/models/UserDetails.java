
package com.dt.api.qa.models;

import java.util.HashMap;
import java.util.Map;
//import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"firstName",
"lastName",
"emailId",
"phoneNumber",
"imageURL"
})
//@Generated("jsonschema2pojo")
public class UserDetails {

@JsonProperty("firstName")
private String firstName;
@JsonProperty("lastName")
private String lastName;
@JsonProperty("emailId")
private String emailId;
@JsonProperty("phoneNumber")
private Object phoneNumber;
@JsonProperty("imageURL")
private Object imageURL;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("firstName")
public String getFirstName() {
return firstName;
}

@JsonProperty("firstName")
public void setFirstName(String firstName) {
this.firstName = firstName;
}

@JsonProperty("lastName")
public String getLastName() {
return lastName;
}

@JsonProperty("lastName")
public void setLastName(String lastName) {
this.lastName = lastName;
}

@JsonProperty("emailId")
public String getEmailId() {
return emailId;
}

@JsonProperty("emailId")
public void setEmailId(String emailId) {
this.emailId = emailId;
}

@JsonProperty("phoneNumber")
public Object getPhoneNumber() {
return phoneNumber;
}

@JsonProperty("phoneNumber")
public void setPhoneNumber(Object phoneNumber) {
this.phoneNumber = phoneNumber;
}

@JsonProperty("imageURL")
public Object getImageURL() {
return imageURL;
}

@JsonProperty("imageURL")
public void setImageURL(Object imageURL) {
this.imageURL = imageURL;
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
