/*
 * CS Communicator REST API
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
import io.swagger.client.model.RemoteStartInfoDTO;
import io.swagger.client.model.RemoteStopInfoDTO;
import io.swagger.client.model.StartInfoDTO;
import io.swagger.client.model.StopInfoDTO;
import io.swagger.client.model.VersionedData;
import java.io.IOException;

/**
 * ChargingTransactionDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T19:06:01.588+01:00")
public class ChargingTransactionDTO {
  @SerializedName("versionedData")
  private VersionedData versionedData = null;

  @SerializedName("csoSessionId")
  private String csoSessionId = null;

  @SerializedName("empSessionId")
  private String empSessionId = null;

  @SerializedName("csoId")
  private Long csoId = null;

  @SerializedName("evseId")
  private String evseId = null;

  @SerializedName("idTag")
  private String idTag = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING_REMOTE_START_REQUEST("PENDING_REMOTE_START_REQUEST"),
    
    PENDING_REMOTE_START_RESPONSE("PENDING_REMOTE_START_RESPONSE"),
    
    REJECTED_BY_CHARGING_STATION("REJECTED_BY_CHARGING_STATION"),
    
    REJECTED_BY_CENTRAL_SYSTEM("REJECTED_BY_CENTRAL_SYSTEM"),
    
    PENDING_START_TRANSACTION("PENDING_START_TRANSACTION"),
    
    CHARGING("CHARGING"),
    
    PENDING_STOP_TRANSACTION("PENDING_STOP_TRANSACTION"),
    
    FINISHED("FINISHED"),
    
    FAILURE("FAILURE");

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

  /**
   * Gets or Sets authorizationStatus
   */
  @JsonAdapter(AuthorizationStatusEnum.Adapter.class)
  public enum AuthorizationStatusEnum {
    ACCEPTED("ACCEPTED"),
    
    BLOCKED("BLOCKED"),
    
    EXPIRED("EXPIRED"),
    
    INVALID("INVALID"),
    
    CONCURRENT_TX("CONCURRENT_TX");

    private String value;

    AuthorizationStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthorizationStatusEnum fromValue(String text) {
      for (AuthorizationStatusEnum b : AuthorizationStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AuthorizationStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthorizationStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthorizationStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AuthorizationStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("authorizationStatus")
  private AuthorizationStatusEnum authorizationStatus = null;

  @SerializedName("externalChargingStationId")
  private String externalChargingStationId = null;

  @SerializedName("externalConnectorId")
  private Integer externalConnectorId = null;

  @SerializedName("externalTransactionId")
  private Integer externalTransactionId = null;

  @SerializedName("startInfo")
  private StartInfoDTO startInfo = null;

  @SerializedName("stopInfo")
  private StopInfoDTO stopInfo = null;

  @SerializedName("remoteStartInfo")
  private RemoteStartInfoDTO remoteStartInfo = null;

  @SerializedName("remoteStopInfo")
  private RemoteStopInfoDTO remoteStopInfo = null;

  public ChargingTransactionDTO versionedData(VersionedData versionedData) {
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

  public ChargingTransactionDTO csoSessionId(String csoSessionId) {
    this.csoSessionId = csoSessionId;
    return this;
  }

   /**
   * Get csoSessionId
   * @return csoSessionId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCsoSessionId() {
    return csoSessionId;
  }

  public void setCsoSessionId(String csoSessionId) {
    this.csoSessionId = csoSessionId;
  }

  public ChargingTransactionDTO empSessionId(String empSessionId) {
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

  public ChargingTransactionDTO csoId(Long csoId) {
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

  public ChargingTransactionDTO evseId(String evseId) {
    this.evseId = evseId;
    return this;
  }

   /**
   * EVSE-ID - optional for a transaction only authorized but not yet started.
   * @return evseId
  **/
  @ApiModelProperty(value = "EVSE-ID - optional for a transaction only authorized but not yet started.")
  public String getEvseId() {
    return evseId;
  }

  public void setEvseId(String evseId) {
    this.evseId = evseId;
  }

  public ChargingTransactionDTO idTag(String idTag) {
    this.idTag = idTag;
    return this;
  }

   /**
   * Get idTag
   * @return idTag
  **/
  @ApiModelProperty(required = true, value = "")
  public String getIdTag() {
    return idTag;
  }

  public void setIdTag(String idTag) {
    this.idTag = idTag;
  }

  public ChargingTransactionDTO status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ChargingTransactionDTO authorizationStatus(AuthorizationStatusEnum authorizationStatus) {
    this.authorizationStatus = authorizationStatus;
    return this;
  }

   /**
   * Get authorizationStatus
   * @return authorizationStatus
  **/
  @ApiModelProperty(required = true, value = "")
  public AuthorizationStatusEnum getAuthorizationStatus() {
    return authorizationStatus;
  }

  public void setAuthorizationStatus(AuthorizationStatusEnum authorizationStatus) {
    this.authorizationStatus = authorizationStatus;
  }

  public ChargingTransactionDTO externalChargingStationId(String externalChargingStationId) {
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

  public ChargingTransactionDTO externalConnectorId(Integer externalConnectorId) {
    this.externalConnectorId = externalConnectorId;
    return this;
  }

   /**
   * Get externalConnectorId
   * @return externalConnectorId
  **/
  @ApiModelProperty(value = "")
  public Integer getExternalConnectorId() {
    return externalConnectorId;
  }

  public void setExternalConnectorId(Integer externalConnectorId) {
    this.externalConnectorId = externalConnectorId;
  }

  public ChargingTransactionDTO externalTransactionId(Integer externalTransactionId) {
    this.externalTransactionId = externalTransactionId;
    return this;
  }

   /**
   * Get externalTransactionId
   * @return externalTransactionId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getExternalTransactionId() {
    return externalTransactionId;
  }

  public void setExternalTransactionId(Integer externalTransactionId) {
    this.externalTransactionId = externalTransactionId;
  }

  public ChargingTransactionDTO startInfo(StartInfoDTO startInfo) {
    this.startInfo = startInfo;
    return this;
  }

   /**
   * Get startInfo
   * @return startInfo
  **/
  @ApiModelProperty(value = "")
  public StartInfoDTO getStartInfo() {
    return startInfo;
  }

  public void setStartInfo(StartInfoDTO startInfo) {
    this.startInfo = startInfo;
  }

  public ChargingTransactionDTO stopInfo(StopInfoDTO stopInfo) {
    this.stopInfo = stopInfo;
    return this;
  }

   /**
   * Get stopInfo
   * @return stopInfo
  **/
  @ApiModelProperty(value = "")
  public StopInfoDTO getStopInfo() {
    return stopInfo;
  }

  public void setStopInfo(StopInfoDTO stopInfo) {
    this.stopInfo = stopInfo;
  }

  public ChargingTransactionDTO remoteStartInfo(RemoteStartInfoDTO remoteStartInfo) {
    this.remoteStartInfo = remoteStartInfo;
    return this;
  }

   /**
   * Get remoteStartInfo
   * @return remoteStartInfo
  **/
  @ApiModelProperty(value = "")
  public RemoteStartInfoDTO getRemoteStartInfo() {
    return remoteStartInfo;
  }

  public void setRemoteStartInfo(RemoteStartInfoDTO remoteStartInfo) {
    this.remoteStartInfo = remoteStartInfo;
  }

  public ChargingTransactionDTO remoteStopInfo(RemoteStopInfoDTO remoteStopInfo) {
    this.remoteStopInfo = remoteStopInfo;
    return this;
  }

   /**
   * Get remoteStopInfo
   * @return remoteStopInfo
  **/
  @ApiModelProperty(value = "")
  public RemoteStopInfoDTO getRemoteStopInfo() {
    return remoteStopInfo;
  }

  public void setRemoteStopInfo(RemoteStopInfoDTO remoteStopInfo) {
    this.remoteStopInfo = remoteStopInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargingTransactionDTO chargingTransactionDTO = (ChargingTransactionDTO) o;
    return Objects.equals(this.versionedData, chargingTransactionDTO.versionedData) &&
        Objects.equals(this.csoSessionId, chargingTransactionDTO.csoSessionId) &&
        Objects.equals(this.empSessionId, chargingTransactionDTO.empSessionId) &&
        Objects.equals(this.csoId, chargingTransactionDTO.csoId) &&
        Objects.equals(this.evseId, chargingTransactionDTO.evseId) &&
        Objects.equals(this.idTag, chargingTransactionDTO.idTag) &&
        Objects.equals(this.status, chargingTransactionDTO.status) &&
        Objects.equals(this.authorizationStatus, chargingTransactionDTO.authorizationStatus) &&
        Objects.equals(this.externalChargingStationId, chargingTransactionDTO.externalChargingStationId) &&
        Objects.equals(this.externalConnectorId, chargingTransactionDTO.externalConnectorId) &&
        Objects.equals(this.externalTransactionId, chargingTransactionDTO.externalTransactionId) &&
        Objects.equals(this.startInfo, chargingTransactionDTO.startInfo) &&
        Objects.equals(this.stopInfo, chargingTransactionDTO.stopInfo) &&
        Objects.equals(this.remoteStartInfo, chargingTransactionDTO.remoteStartInfo) &&
        Objects.equals(this.remoteStopInfo, chargingTransactionDTO.remoteStopInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionedData, csoSessionId, empSessionId, csoId, evseId, idTag, status, authorizationStatus, externalChargingStationId, externalConnectorId, externalTransactionId, startInfo, stopInfo, remoteStartInfo, remoteStopInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargingTransactionDTO {\n");
    
    sb.append("    versionedData: ").append(toIndentedString(versionedData)).append("\n");
    sb.append("    csoSessionId: ").append(toIndentedString(csoSessionId)).append("\n");
    sb.append("    empSessionId: ").append(toIndentedString(empSessionId)).append("\n");
    sb.append("    csoId: ").append(toIndentedString(csoId)).append("\n");
    sb.append("    evseId: ").append(toIndentedString(evseId)).append("\n");
    sb.append("    idTag: ").append(toIndentedString(idTag)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    authorizationStatus: ").append(toIndentedString(authorizationStatus)).append("\n");
    sb.append("    externalChargingStationId: ").append(toIndentedString(externalChargingStationId)).append("\n");
    sb.append("    externalConnectorId: ").append(toIndentedString(externalConnectorId)).append("\n");
    sb.append("    externalTransactionId: ").append(toIndentedString(externalTransactionId)).append("\n");
    sb.append("    startInfo: ").append(toIndentedString(startInfo)).append("\n");
    sb.append("    stopInfo: ").append(toIndentedString(stopInfo)).append("\n");
    sb.append("    remoteStartInfo: ").append(toIndentedString(remoteStartInfo)).append("\n");
    sb.append("    remoteStopInfo: ").append(toIndentedString(remoteStopInfo)).append("\n");
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
