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
import io.swagger.client.model.EvseDataDto;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * EvseCreationDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T19:08:37.674+01:00")
public class EvseCreationDTO {
  @SerializedName("chargingStationId")
  private Long chargingStationId = null;

  @SerializedName("info")
  private String info = null;

  @SerializedName("lastStatusNotificationTimestamp")
  private OffsetDateTime lastStatusNotificationTimestamp = null;

  @SerializedName("vendorId")
  private String vendorId = null;

  @SerializedName("vendorErrorCode")
  private String vendorErrorCode = null;

  @SerializedName("lastUpdate")
  private OffsetDateTime lastUpdate = null;

  @SerializedName("evseData")
  private EvseDataDto evseData = null;

  public EvseCreationDTO chargingStationId(Long chargingStationId) {
    this.chargingStationId = chargingStationId;
    return this;
  }

   /**
   * Internal charging station ID
   * @return chargingStationId
  **/
  @ApiModelProperty(required = true, value = "Internal charging station ID")
  public Long getChargingStationId() {
    return chargingStationId;
  }

  public void setChargingStationId(Long chargingStationId) {
    this.chargingStationId = chargingStationId;
  }

  public EvseCreationDTO info(String info) {
    this.info = info;
    return this;
  }

   /**
   * Status info
   * @return info
  **/
  @ApiModelProperty(value = "Status info")
  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

   /**
   * Timestamp of the last StatusNotification from the charging station. This field contains the optional timestamp as given by the charging station&#39;s internal clock. For most use cases the lastUpdate property is a better fit.
   * @return lastStatusNotificationTimestamp
  **/
  @ApiModelProperty(value = "Timestamp of the last StatusNotification from the charging station. This field contains the optional timestamp as given by the charging station's internal clock. For most use cases the lastUpdate property is a better fit.")
  public OffsetDateTime getLastStatusNotificationTimestamp() {
    return lastStatusNotificationTimestamp;
  }

  public EvseCreationDTO vendorId(String vendorId) {
    this.vendorId = vendorId;
    return this;
  }

   /**
   * Vendor specific status code
   * @return vendorId
  **/
  @ApiModelProperty(value = "Vendor specific status code")
  public String getVendorId() {
    return vendorId;
  }

  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }

  public EvseCreationDTO vendorErrorCode(String vendorErrorCode) {
    this.vendorErrorCode = vendorErrorCode;
    return this;
  }

   /**
   * Vendor specific error code
   * @return vendorErrorCode
  **/
  @ApiModelProperty(value = "Vendor specific error code")
  public String getVendorErrorCode() {
    return vendorErrorCode;
  }

  public void setVendorErrorCode(String vendorErrorCode) {
    this.vendorErrorCode = vendorErrorCode;
  }

   /**
   * Last update of the EVSE static or dynamic data including the status. This field is updated for Evse, EvseData and the status
   * @return lastUpdate
  **/
  @ApiModelProperty(value = "Last update of the EVSE static or dynamic data including the status. This field is updated for Evse, EvseData and the status")
  public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public EvseCreationDTO evseData(EvseDataDto evseData) {
    this.evseData = evseData;
    return this;
  }

   /**
   * Get evseData
   * @return evseData
  **/
  @ApiModelProperty(value = "")
  public EvseDataDto getEvseData() {
    return evseData;
  }

  public void setEvseData(EvseDataDto evseData) {
    this.evseData = evseData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvseCreationDTO evseCreationDTO = (EvseCreationDTO) o;
    return Objects.equals(this.chargingStationId, evseCreationDTO.chargingStationId) &&
        Objects.equals(this.info, evseCreationDTO.info) &&
        Objects.equals(this.lastStatusNotificationTimestamp, evseCreationDTO.lastStatusNotificationTimestamp) &&
        Objects.equals(this.vendorId, evseCreationDTO.vendorId) &&
        Objects.equals(this.vendorErrorCode, evseCreationDTO.vendorErrorCode) &&
        Objects.equals(this.lastUpdate, evseCreationDTO.lastUpdate) &&
        Objects.equals(this.evseData, evseCreationDTO.evseData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargingStationId, info, lastStatusNotificationTimestamp, vendorId, vendorErrorCode, lastUpdate, evseData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvseCreationDTO {\n");
    
    sb.append("    chargingStationId: ").append(toIndentedString(chargingStationId)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    lastStatusNotificationTimestamp: ").append(toIndentedString(lastStatusNotificationTimestamp)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    vendorErrorCode: ").append(toIndentedString(vendorErrorCode)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    evseData: ").append(toIndentedString(evseData)).append("\n");
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

