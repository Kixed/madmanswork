/*
 * Roaming REST API
 * ## Authentication options  ### OAuth2 / OpenID Connect  The supported authentication method is OpenID Connect via Keycloak. For testing APIs via Swaggerhub or Swagger UI, please use **client_id** `swagger`.  When developing applications against this API, a separate client application must be registered in Keycloak.  ### X-Token header authentication  Internal use only, deprecated. The core services use these authentication headers for system account based requests.  
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.StatusCode;
import java.io.IOException;

/**
 * ERoamingAcknowledgement
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T18:37:18.317+01:00")
public class ERoamingAcknowledgement {
  @SerializedName("cpopartnerSessionID")
  private String cpopartnerSessionID = null;

  @SerializedName("emppartnerSessionID")
  private String emppartnerSessionID = null;

  @SerializedName("CPOPartnerSessionID")
  private String cpOPartnerSessionID = null;

  @SerializedName("EMPPartnerSessionID")
  private String emPPartnerSessionID = null;

  @SerializedName("Result")
  private Boolean result = null;

  @SerializedName("SessionID")
  private String sessionID = null;

  @SerializedName("StatusCode")
  private StatusCode statusCode = null;

  public ERoamingAcknowledgement cpopartnerSessionID(String cpopartnerSessionID) {
    this.cpopartnerSessionID = cpopartnerSessionID;
    return this;
  }

   /**
   * Get cpopartnerSessionID
   * @return cpopartnerSessionID
  **/
  @ApiModelProperty(value = "")
  public String getCpopartnerSessionID() {
    return cpopartnerSessionID;
  }

  public void setCpopartnerSessionID(String cpopartnerSessionID) {
    this.cpopartnerSessionID = cpopartnerSessionID;
  }

  public ERoamingAcknowledgement emppartnerSessionID(String emppartnerSessionID) {
    this.emppartnerSessionID = emppartnerSessionID;
    return this;
  }

   /**
   * Get emppartnerSessionID
   * @return emppartnerSessionID
  **/
  @ApiModelProperty(value = "")
  public String getEmppartnerSessionID() {
    return emppartnerSessionID;
  }

  public void setEmppartnerSessionID(String emppartnerSessionID) {
    this.emppartnerSessionID = emppartnerSessionID;
  }

  public ERoamingAcknowledgement cpOPartnerSessionID(String cpOPartnerSessionID) {
    this.cpOPartnerSessionID = cpOPartnerSessionID;
    return this;
  }

   /**
   * Get cpOPartnerSessionID
   * @return cpOPartnerSessionID
  **/
  @ApiModelProperty(value = "")
  public String getCpOPartnerSessionID() {
    return cpOPartnerSessionID;
  }

  public void setCpOPartnerSessionID(String cpOPartnerSessionID) {
    this.cpOPartnerSessionID = cpOPartnerSessionID;
  }

  public ERoamingAcknowledgement emPPartnerSessionID(String emPPartnerSessionID) {
    this.emPPartnerSessionID = emPPartnerSessionID;
    return this;
  }

   /**
   * Get emPPartnerSessionID
   * @return emPPartnerSessionID
  **/
  @ApiModelProperty(value = "")
  public String getEmPPartnerSessionID() {
    return emPPartnerSessionID;
  }

  public void setEmPPartnerSessionID(String emPPartnerSessionID) {
    this.emPPartnerSessionID = emPPartnerSessionID;
  }

  public ERoamingAcknowledgement result(Boolean result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public Boolean isResult() {
    return result;
  }

  public void setResult(Boolean result) {
    this.result = result;
  }

  public ERoamingAcknowledgement sessionID(String sessionID) {
    this.sessionID = sessionID;
    return this;
  }

   /**
   * Get sessionID
   * @return sessionID
  **/
  @ApiModelProperty(value = "")
  public String getSessionID() {
    return sessionID;
  }

  public void setSessionID(String sessionID) {
    this.sessionID = sessionID;
  }

  public ERoamingAcknowledgement statusCode(StatusCode statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @ApiModelProperty(required = true, value = "")
  public StatusCode getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(StatusCode statusCode) {
    this.statusCode = statusCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ERoamingAcknowledgement eroamingAcknowledgement = (ERoamingAcknowledgement) o;
    return Objects.equals(this.cpopartnerSessionID, eroamingAcknowledgement.cpopartnerSessionID) &&
        Objects.equals(this.emppartnerSessionID, eroamingAcknowledgement.emppartnerSessionID) &&
        Objects.equals(this.cpOPartnerSessionID, eroamingAcknowledgement.cpOPartnerSessionID) &&
        Objects.equals(this.emPPartnerSessionID, eroamingAcknowledgement.emPPartnerSessionID) &&
        Objects.equals(this.result, eroamingAcknowledgement.result) &&
        Objects.equals(this.sessionID, eroamingAcknowledgement.sessionID) &&
        Objects.equals(this.statusCode, eroamingAcknowledgement.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpopartnerSessionID, emppartnerSessionID, cpOPartnerSessionID, emPPartnerSessionID, result, sessionID, statusCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ERoamingAcknowledgement {\n");
    
    sb.append("    cpopartnerSessionID: ").append(toIndentedString(cpopartnerSessionID)).append("\n");
    sb.append("    emppartnerSessionID: ").append(toIndentedString(emppartnerSessionID)).append("\n");
    sb.append("    cpOPartnerSessionID: ").append(toIndentedString(cpOPartnerSessionID)).append("\n");
    sb.append("    emPPartnerSessionID: ").append(toIndentedString(emPPartnerSessionID)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    sessionID: ").append(toIndentedString(sessionID)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

