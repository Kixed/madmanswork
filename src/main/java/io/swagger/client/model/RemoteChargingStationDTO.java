/*
 * CS Management EMP REST API
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
import io.swagger.client.model.RemoteChargingStationDataDTO;
import io.swagger.client.model.RemoteChargingStationInfoDTO;
import io.swagger.client.model.VersionedData;
import java.io.IOException;

/**
 * RemoteChargingStationDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T19:09:13.919+01:00")
public class RemoteChargingStationDTO {
  @SerializedName("operatorId")
  private String operatorId = null;

  @SerializedName("operatorName")
  private String operatorName = null;

  @SerializedName("chargingStationData")
  private RemoteChargingStationDataDTO chargingStationData = null;

  @SerializedName("versionedData")
  private VersionedData versionedData = null;

  @SerializedName("externalChargingStationId")
  private String externalChargingStationId = null;

  /**
   * Gets or Sets source
   */
  @JsonAdapter(SourceEnum.Adapter.class)
  public enum SourceEnum {
    DIRECT("DIRECT"),
    
    DIRECT_LOCAL("DIRECT_LOCAL"),
    
    HUBJECT("HUBJECT");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SourceEnum fromValue(String text) {
      for (SourceEnum b : SourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SourceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SourceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("source")
  private SourceEnum source = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    AVAILABLE("AVAILABLE"),
    
    FAULTED("FAULTED"),
    
    OCCUPIED("OCCUPIED"),
    
    RESERVED("RESERVED"),
    
    UNAVAILABLE("UNAVAILABLE"),
    
    EVSE_STATUS_UNKNOWN("EVSE_STATUS_UNKNOWN"),
    
    NO_EVSES("NO_EVSES"),
    
    OFFLINE("OFFLINE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("empId")
  private Long empId = null;

  @SerializedName("chargingStationInfo")
  private RemoteChargingStationInfoDTO chargingStationInfo = null;

  @SerializedName("bpRoamingContractId")
  private Long bpRoamingContractId = null;

  public RemoteChargingStationDTO operatorId(String operatorId) {
    this.operatorId = operatorId;
    return this;
  }

   /**
   * Get operatorId
   * @return operatorId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getOperatorId() {
    return operatorId;
  }

  public void setOperatorId(String operatorId) {
    this.operatorId = operatorId;
  }

  public RemoteChargingStationDTO operatorName(String operatorName) {
    this.operatorName = operatorName;
    return this;
  }

   /**
   * Get operatorName
   * @return operatorName
  **/
  @ApiModelProperty(value = "")
  public String getOperatorName() {
    return operatorName;
  }

  public void setOperatorName(String operatorName) {
    this.operatorName = operatorName;
  }

  public RemoteChargingStationDTO chargingStationData(RemoteChargingStationDataDTO chargingStationData) {
    this.chargingStationData = chargingStationData;
    return this;
  }

   /**
   * Get chargingStationData
   * @return chargingStationData
  **/
  @ApiModelProperty(required = true, value = "")
  public RemoteChargingStationDataDTO getChargingStationData() {
    return chargingStationData;
  }

  public void setChargingStationData(RemoteChargingStationDataDTO chargingStationData) {
    this.chargingStationData = chargingStationData;
  }

  public RemoteChargingStationDTO versionedData(VersionedData versionedData) {
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

  public RemoteChargingStationDTO externalChargingStationId(String externalChargingStationId) {
    this.externalChargingStationId = externalChargingStationId;
    return this;
  }

   /**
   * Get externalChargingStationId
   * @return externalChargingStationId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getExternalChargingStationId() {
    return externalChargingStationId;
  }

  public void setExternalChargingStationId(String externalChargingStationId) {
    this.externalChargingStationId = externalChargingStationId;
  }

  public RemoteChargingStationDTO source(SourceEnum source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(required = true, value = "")
  public SourceEnum getSource() {
    return source;
  }

  public void setSource(SourceEnum source) {
    this.source = source;
  }

  public RemoteChargingStationDTO status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public RemoteChargingStationDTO empId(Long empId) {
    this.empId = empId;
    return this;
  }

   /**
   * Get empId
   * @return empId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getEmpId() {
    return empId;
  }

  public void setEmpId(Long empId) {
    this.empId = empId;
  }

  public RemoteChargingStationDTO chargingStationInfo(RemoteChargingStationInfoDTO chargingStationInfo) {
    this.chargingStationInfo = chargingStationInfo;
    return this;
  }

   /**
   * Get chargingStationInfo
   * @return chargingStationInfo
  **/
  @ApiModelProperty(required = true, value = "")
  public RemoteChargingStationInfoDTO getChargingStationInfo() {
    return chargingStationInfo;
  }

  public void setChargingStationInfo(RemoteChargingStationInfoDTO chargingStationInfo) {
    this.chargingStationInfo = chargingStationInfo;
  }

  public RemoteChargingStationDTO bpRoamingContractId(Long bpRoamingContractId) {
    this.bpRoamingContractId = bpRoamingContractId;
    return this;
  }

   /**
   * Get bpRoamingContractId
   * @return bpRoamingContractId
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getBpRoamingContractId() {
    return bpRoamingContractId;
  }

  public void setBpRoamingContractId(Long bpRoamingContractId) {
    this.bpRoamingContractId = bpRoamingContractId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteChargingStationDTO remoteChargingStationDTO = (RemoteChargingStationDTO) o;
    return Objects.equals(this.operatorId, remoteChargingStationDTO.operatorId) &&
        Objects.equals(this.operatorName, remoteChargingStationDTO.operatorName) &&
        Objects.equals(this.chargingStationData, remoteChargingStationDTO.chargingStationData) &&
        Objects.equals(this.versionedData, remoteChargingStationDTO.versionedData) &&
        Objects.equals(this.externalChargingStationId, remoteChargingStationDTO.externalChargingStationId) &&
        Objects.equals(this.source, remoteChargingStationDTO.source) &&
        Objects.equals(this.status, remoteChargingStationDTO.status) &&
        Objects.equals(this.empId, remoteChargingStationDTO.empId) &&
        Objects.equals(this.chargingStationInfo, remoteChargingStationDTO.chargingStationInfo) &&
        Objects.equals(this.bpRoamingContractId, remoteChargingStationDTO.bpRoamingContractId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatorId, operatorName, chargingStationData, versionedData, externalChargingStationId, source, status, empId, chargingStationInfo, bpRoamingContractId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteChargingStationDTO {\n");
    
    sb.append("    operatorId: ").append(toIndentedString(operatorId)).append("\n");
    sb.append("    operatorName: ").append(toIndentedString(operatorName)).append("\n");
    sb.append("    chargingStationData: ").append(toIndentedString(chargingStationData)).append("\n");
    sb.append("    versionedData: ").append(toIndentedString(versionedData)).append("\n");
    sb.append("    externalChargingStationId: ").append(toIndentedString(externalChargingStationId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    empId: ").append(toIndentedString(empId)).append("\n");
    sb.append("    chargingStationInfo: ").append(toIndentedString(chargingStationInfo)).append("\n");
    sb.append("    bpRoamingContractId: ").append(toIndentedString(bpRoamingContractId)).append("\n");
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

