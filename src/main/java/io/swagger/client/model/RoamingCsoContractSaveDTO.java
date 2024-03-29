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
import io.swagger.client.model.VersionedData;
import java.io.IOException;

/**
 * RoamingCsoContractSaveDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T18:37:18.317+01:00")
public class RoamingCsoContractSaveDTO {
  @SerializedName("versionedData")
  private VersionedData versionedData = null;

  @SerializedName("csoId")
  private Long csoId = null;

  @SerializedName("remoteEmpId")
  private Long remoteEmpId = null;

  @SerializedName("platformTypeId")
  private Long platformTypeId = null;

  @SerializedName("contractNumber")
  private String contractNumber = null;

  public RoamingCsoContractSaveDTO versionedData(VersionedData versionedData) {
    this.versionedData = versionedData;
    return this;
  }

   /**
   * Get versionedData
   * @return versionedData
  **/
  @ApiModelProperty(value = "")
  public VersionedData getVersionedData() {
    return versionedData;
  }

  public void setVersionedData(VersionedData versionedData) {
    this.versionedData = versionedData;
  }

  public RoamingCsoContractSaveDTO csoId(Long csoId) {
    this.csoId = csoId;
    return this;
  }

   /**
   * Get csoId
   * @return csoId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getCsoId() {
    return csoId;
  }

  public void setCsoId(Long csoId) {
    this.csoId = csoId;
  }

  public RoamingCsoContractSaveDTO remoteEmpId(Long remoteEmpId) {
    this.remoteEmpId = remoteEmpId;
    return this;
  }

   /**
   * Get remoteEmpId
   * @return remoteEmpId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getRemoteEmpId() {
    return remoteEmpId;
  }

  public void setRemoteEmpId(Long remoteEmpId) {
    this.remoteEmpId = remoteEmpId;
  }

  public RoamingCsoContractSaveDTO platformTypeId(Long platformTypeId) {
    this.platformTypeId = platformTypeId;
    return this;
  }

   /**
   * Get platformTypeId
   * @return platformTypeId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getPlatformTypeId() {
    return platformTypeId;
  }

  public void setPlatformTypeId(Long platformTypeId) {
    this.platformTypeId = platformTypeId;
  }

  public RoamingCsoContractSaveDTO contractNumber(String contractNumber) {
    this.contractNumber = contractNumber;
    return this;
  }

   /**
   * Get contractNumber
   * @return contractNumber
  **/
  @ApiModelProperty(required = true, value = "")
  public String getContractNumber() {
    return contractNumber;
  }

  public void setContractNumber(String contractNumber) {
    this.contractNumber = contractNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoamingCsoContractSaveDTO roamingCsoContractSaveDTO = (RoamingCsoContractSaveDTO) o;
    return Objects.equals(this.versionedData, roamingCsoContractSaveDTO.versionedData) &&
        Objects.equals(this.csoId, roamingCsoContractSaveDTO.csoId) &&
        Objects.equals(this.remoteEmpId, roamingCsoContractSaveDTO.remoteEmpId) &&
        Objects.equals(this.platformTypeId, roamingCsoContractSaveDTO.platformTypeId) &&
        Objects.equals(this.contractNumber, roamingCsoContractSaveDTO.contractNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionedData, csoId, remoteEmpId, platformTypeId, contractNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoamingCsoContractSaveDTO {\n");
    
    sb.append("    versionedData: ").append(toIndentedString(versionedData)).append("\n");
    sb.append("    csoId: ").append(toIndentedString(csoId)).append("\n");
    sb.append("    remoteEmpId: ").append(toIndentedString(remoteEmpId)).append("\n");
    sb.append("    platformTypeId: ").append(toIndentedString(platformTypeId)).append("\n");
    sb.append("    contractNumber: ").append(toIndentedString(contractNumber)).append("\n");
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

