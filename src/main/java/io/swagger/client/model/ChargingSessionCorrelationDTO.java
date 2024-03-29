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
import java.io.IOException;

/**
 * ChargingSessionCorrelationDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T18:37:18.317+01:00")
public class ChargingSessionCorrelationDTO {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("empSessionId")
  private String empSessionId = null;

  @SerializedName("csoSessionId")
  private String csoSessionId = null;

  @SerializedName("csoContractId")
  private Long csoContractId = null;

  @SerializedName("externalSessionId")
  private String externalSessionId = null;

  @SerializedName("externalProviderId")
  private String externalProviderId = null;

  public ChargingSessionCorrelationDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ChargingSessionCorrelationDTO empSessionId(String empSessionId) {
    this.empSessionId = empSessionId;
    return this;
  }

   /**
   * Get empSessionId
   * @return empSessionId
  **/
  @ApiModelProperty(value = "")
  public String getEmpSessionId() {
    return empSessionId;
  }

  public void setEmpSessionId(String empSessionId) {
    this.empSessionId = empSessionId;
  }

  public ChargingSessionCorrelationDTO csoSessionId(String csoSessionId) {
    this.csoSessionId = csoSessionId;
    return this;
  }

   /**
   * Get csoSessionId
   * @return csoSessionId
  **/
  @ApiModelProperty(value = "")
  public String getCsoSessionId() {
    return csoSessionId;
  }

  public void setCsoSessionId(String csoSessionId) {
    this.csoSessionId = csoSessionId;
  }

  public ChargingSessionCorrelationDTO csoContractId(Long csoContractId) {
    this.csoContractId = csoContractId;
    return this;
  }

   /**
   * Get csoContractId
   * @return csoContractId
  **/
  @ApiModelProperty(value = "")
  public Long getCsoContractId() {
    return csoContractId;
  }

  public void setCsoContractId(Long csoContractId) {
    this.csoContractId = csoContractId;
  }

  public ChargingSessionCorrelationDTO externalSessionId(String externalSessionId) {
    this.externalSessionId = externalSessionId;
    return this;
  }

   /**
   * Get externalSessionId
   * @return externalSessionId
  **/
  @ApiModelProperty(value = "")
  public String getExternalSessionId() {
    return externalSessionId;
  }

  public void setExternalSessionId(String externalSessionId) {
    this.externalSessionId = externalSessionId;
  }

  public ChargingSessionCorrelationDTO externalProviderId(String externalProviderId) {
    this.externalProviderId = externalProviderId;
    return this;
  }

   /**
   * Get externalProviderId
   * @return externalProviderId
  **/
  @ApiModelProperty(value = "")
  public String getExternalProviderId() {
    return externalProviderId;
  }

  public void setExternalProviderId(String externalProviderId) {
    this.externalProviderId = externalProviderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargingSessionCorrelationDTO chargingSessionCorrelationDTO = (ChargingSessionCorrelationDTO) o;
    return Objects.equals(this.id, chargingSessionCorrelationDTO.id) &&
        Objects.equals(this.empSessionId, chargingSessionCorrelationDTO.empSessionId) &&
        Objects.equals(this.csoSessionId, chargingSessionCorrelationDTO.csoSessionId) &&
        Objects.equals(this.csoContractId, chargingSessionCorrelationDTO.csoContractId) &&
        Objects.equals(this.externalSessionId, chargingSessionCorrelationDTO.externalSessionId) &&
        Objects.equals(this.externalProviderId, chargingSessionCorrelationDTO.externalProviderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, empSessionId, csoSessionId, csoContractId, externalSessionId, externalProviderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargingSessionCorrelationDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    empSessionId: ").append(toIndentedString(empSessionId)).append("\n");
    sb.append("    csoSessionId: ").append(toIndentedString(csoSessionId)).append("\n");
    sb.append("    csoContractId: ").append(toIndentedString(csoContractId)).append("\n");
    sb.append("    externalSessionId: ").append(toIndentedString(externalSessionId)).append("\n");
    sb.append("    externalProviderId: ").append(toIndentedString(externalProviderId)).append("\n");
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

