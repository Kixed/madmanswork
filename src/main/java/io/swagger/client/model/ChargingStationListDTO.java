/*
 * CS Management CSO REST API
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
import io.swagger.client.model.ChargingStationDataListDTO;
import io.swagger.client.model.ChargingStationInfoDTO;
import io.swagger.client.model.ChargingStationStatusDataListDTO;
import io.swagger.client.model.VersionedData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * ChargingStationListDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T19:08:37.674+01:00")
public class ChargingStationListDTO {
  @SerializedName("versionedData")
  private VersionedData versionedData = null;

  /**
   * Gets or Sets protocol
   */
  @JsonAdapter(ProtocolEnum.Adapter.class)
  public enum ProtocolEnum {
    OCPP15("OCPP15"),
    
    OCPP16J("OCPP16J");

    private String value;

    ProtocolEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProtocolEnum fromValue(String text) {
      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ProtocolEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProtocolEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProtocolEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ProtocolEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("protocol")
  private ProtocolEnum protocol = null;

  @SerializedName("externalChargingStationId")
  private String externalChargingStationId = null;

  @SerializedName("remoteAddress")
  private String remoteAddress = null;

  @SerializedName("chargingStationInfo")
  private ChargingStationInfoDTO chargingStationInfo = null;

  /**
   * Gets or Sets registrationStatus
   */
  @JsonAdapter(RegistrationStatusEnum.Adapter.class)
  public enum RegistrationStatusEnum {
    ACCEPTED("ACCEPTED"),
    
    PENDING("PENDING"),
    
    REJECTED("REJECTED"),
    
    PLANNED("PLANNED");

    private String value;

    RegistrationStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RegistrationStatusEnum fromValue(String text) {
      for (RegistrationStatusEnum b : RegistrationStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RegistrationStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RegistrationStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RegistrationStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RegistrationStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("registrationStatus")
  private RegistrationStatusEnum registrationStatus = null;

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

  @SerializedName("chargingStationOperatorId")
  private Long chargingStationOperatorId = null;

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("chargingStationData")
  private ChargingStationDataListDTO chargingStationData = null;

  @SerializedName("statusData")
  private ChargingStationStatusDataListDTO statusData = null;

  @SerializedName("lastCommunication")
  private OffsetDateTime lastCommunication = null;

  public ChargingStationListDTO versionedData(VersionedData versionedData) {
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

  public ChargingStationListDTO protocol(ProtocolEnum protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @ApiModelProperty(value = "")
  public ProtocolEnum getProtocol() {
    return protocol;
  }

  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }

  public ChargingStationListDTO externalChargingStationId(String externalChargingStationId) {
    this.externalChargingStationId = externalChargingStationId;
    return this;
  }

   /**
   * Get externalChargingStationId
   * @return externalChargingStationId
  **/
  @ApiModelProperty(value = "")
  public String getExternalChargingStationId() {
    return externalChargingStationId;
  }

  public void setExternalChargingStationId(String externalChargingStationId) {
    this.externalChargingStationId = externalChargingStationId;
  }

  public ChargingStationListDTO remoteAddress(String remoteAddress) {
    this.remoteAddress = remoteAddress;
    return this;
  }

   /**
   * Get remoteAddress
   * @return remoteAddress
  **/
  @ApiModelProperty(value = "")
  public String getRemoteAddress() {
    return remoteAddress;
  }

  public void setRemoteAddress(String remoteAddress) {
    this.remoteAddress = remoteAddress;
  }

  public ChargingStationListDTO chargingStationInfo(ChargingStationInfoDTO chargingStationInfo) {
    this.chargingStationInfo = chargingStationInfo;
    return this;
  }

   /**
   * Get chargingStationInfo
   * @return chargingStationInfo
  **/
  @ApiModelProperty(value = "")
  public ChargingStationInfoDTO getChargingStationInfo() {
    return chargingStationInfo;
  }

  public void setChargingStationInfo(ChargingStationInfoDTO chargingStationInfo) {
    this.chargingStationInfo = chargingStationInfo;
  }

  public ChargingStationListDTO registrationStatus(RegistrationStatusEnum registrationStatus) {
    this.registrationStatus = registrationStatus;
    return this;
  }

   /**
   * Get registrationStatus
   * @return registrationStatus
  **/
  @ApiModelProperty(value = "")
  public RegistrationStatusEnum getRegistrationStatus() {
    return registrationStatus;
  }

  public void setRegistrationStatus(RegistrationStatusEnum registrationStatus) {
    this.registrationStatus = registrationStatus;
  }

  public ChargingStationListDTO status(StatusEnum status) {
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

  public ChargingStationListDTO chargingStationOperatorId(Long chargingStationOperatorId) {
    this.chargingStationOperatorId = chargingStationOperatorId;
    return this;
  }

   /**
   * Get chargingStationOperatorId
   * @return chargingStationOperatorId
  **/
  @ApiModelProperty(value = "")
  public Long getChargingStationOperatorId() {
    return chargingStationOperatorId;
  }

  public void setChargingStationOperatorId(Long chargingStationOperatorId) {
    this.chargingStationOperatorId = chargingStationOperatorId;
  }

  public ChargingStationListDTO tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ChargingStationListDTO addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public ChargingStationListDTO chargingStationData(ChargingStationDataListDTO chargingStationData) {
    this.chargingStationData = chargingStationData;
    return this;
  }

   /**
   * Get chargingStationData
   * @return chargingStationData
  **/
  @ApiModelProperty(value = "")
  public ChargingStationDataListDTO getChargingStationData() {
    return chargingStationData;
  }

  public void setChargingStationData(ChargingStationDataListDTO chargingStationData) {
    this.chargingStationData = chargingStationData;
  }

  public ChargingStationListDTO statusData(ChargingStationStatusDataListDTO statusData) {
    this.statusData = statusData;
    return this;
  }

   /**
   * Get statusData
   * @return statusData
  **/
  @ApiModelProperty(value = "")
  public ChargingStationStatusDataListDTO getStatusData() {
    return statusData;
  }

  public void setStatusData(ChargingStationStatusDataListDTO statusData) {
    this.statusData = statusData;
  }

  public ChargingStationListDTO lastCommunication(OffsetDateTime lastCommunication) {
    this.lastCommunication = lastCommunication;
    return this;
  }

   /**
   * Get lastCommunication
   * @return lastCommunication
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastCommunication() {
    return lastCommunication;
  }

  public void setLastCommunication(OffsetDateTime lastCommunication) {
    this.lastCommunication = lastCommunication;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargingStationListDTO chargingStationListDTO = (ChargingStationListDTO) o;
    return Objects.equals(this.versionedData, chargingStationListDTO.versionedData) &&
        Objects.equals(this.protocol, chargingStationListDTO.protocol) &&
        Objects.equals(this.externalChargingStationId, chargingStationListDTO.externalChargingStationId) &&
        Objects.equals(this.remoteAddress, chargingStationListDTO.remoteAddress) &&
        Objects.equals(this.chargingStationInfo, chargingStationListDTO.chargingStationInfo) &&
        Objects.equals(this.registrationStatus, chargingStationListDTO.registrationStatus) &&
        Objects.equals(this.status, chargingStationListDTO.status) &&
        Objects.equals(this.chargingStationOperatorId, chargingStationListDTO.chargingStationOperatorId) &&
        Objects.equals(this.tags, chargingStationListDTO.tags) &&
        Objects.equals(this.chargingStationData, chargingStationListDTO.chargingStationData) &&
        Objects.equals(this.statusData, chargingStationListDTO.statusData) &&
        Objects.equals(this.lastCommunication, chargingStationListDTO.lastCommunication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionedData, protocol, externalChargingStationId, remoteAddress, chargingStationInfo, registrationStatus, status, chargingStationOperatorId, tags, chargingStationData, statusData, lastCommunication);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargingStationListDTO {\n");
    
    sb.append("    versionedData: ").append(toIndentedString(versionedData)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    externalChargingStationId: ").append(toIndentedString(externalChargingStationId)).append("\n");
    sb.append("    remoteAddress: ").append(toIndentedString(remoteAddress)).append("\n");
    sb.append("    chargingStationInfo: ").append(toIndentedString(chargingStationInfo)).append("\n");
    sb.append("    registrationStatus: ").append(toIndentedString(registrationStatus)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    chargingStationOperatorId: ").append(toIndentedString(chargingStationOperatorId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    chargingStationData: ").append(toIndentedString(chargingStationData)).append("\n");
    sb.append("    statusData: ").append(toIndentedString(statusData)).append("\n");
    sb.append("    lastCommunication: ").append(toIndentedString(lastCommunication)).append("\n");
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

