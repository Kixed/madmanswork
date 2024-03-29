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
import io.swagger.client.model.AbstractMessageDTO;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * BootNotificationRequestDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T19:06:01.588+01:00")
public class BootNotificationRequestDTO extends AbstractMessageDTO {
  @SerializedName("remoteAddress")
  private String remoteAddress = null;

  @SerializedName("centralSystemRequestedAt")
  private OffsetDateTime centralSystemRequestedAt = null;

  @SerializedName("chargePointVendor")
  private String chargePointVendor = null;

  @SerializedName("chargePointModel")
  private String chargePointModel = null;

  @SerializedName("chargePointSerialNumber")
  private String chargePointSerialNumber = null;

  @SerializedName("chargeBoxSerialNumber")
  private String chargeBoxSerialNumber = null;

  @SerializedName("firmwareVersion")
  private String firmwareVersion = null;

  @SerializedName("iccid")
  private String iccid = null;

  @SerializedName("imsi")
  private String imsi = null;

  @SerializedName("meterType")
  private String meterType = null;

  @SerializedName("meterSerialNumber")
  private String meterSerialNumber = null;

  public BootNotificationRequestDTO remoteAddress(String remoteAddress) {
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

  public BootNotificationRequestDTO centralSystemRequestedAt(OffsetDateTime centralSystemRequestedAt) {
    this.centralSystemRequestedAt = centralSystemRequestedAt;
    return this;
  }

   /**
   * Get centralSystemRequestedAt
   * @return centralSystemRequestedAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCentralSystemRequestedAt() {
    return centralSystemRequestedAt;
  }

  public void setCentralSystemRequestedAt(OffsetDateTime centralSystemRequestedAt) {
    this.centralSystemRequestedAt = centralSystemRequestedAt;
  }

  public BootNotificationRequestDTO chargePointVendor(String chargePointVendor) {
    this.chargePointVendor = chargePointVendor;
    return this;
  }

   /**
   * Get chargePointVendor
   * @return chargePointVendor
  **/
  @ApiModelProperty(required = true, value = "")
  public String getChargePointVendor() {
    return chargePointVendor;
  }

  public void setChargePointVendor(String chargePointVendor) {
    this.chargePointVendor = chargePointVendor;
  }

  public BootNotificationRequestDTO chargePointModel(String chargePointModel) {
    this.chargePointModel = chargePointModel;
    return this;
  }

   /**
   * Get chargePointModel
   * @return chargePointModel
  **/
  @ApiModelProperty(required = true, value = "")
  public String getChargePointModel() {
    return chargePointModel;
  }

  public void setChargePointModel(String chargePointModel) {
    this.chargePointModel = chargePointModel;
  }

  public BootNotificationRequestDTO chargePointSerialNumber(String chargePointSerialNumber) {
    this.chargePointSerialNumber = chargePointSerialNumber;
    return this;
  }

   /**
   * Get chargePointSerialNumber
   * @return chargePointSerialNumber
  **/
  @ApiModelProperty(value = "")
  public String getChargePointSerialNumber() {
    return chargePointSerialNumber;
  }

  public void setChargePointSerialNumber(String chargePointSerialNumber) {
    this.chargePointSerialNumber = chargePointSerialNumber;
  }

  public BootNotificationRequestDTO chargeBoxSerialNumber(String chargeBoxSerialNumber) {
    this.chargeBoxSerialNumber = chargeBoxSerialNumber;
    return this;
  }

   /**
   * Get chargeBoxSerialNumber
   * @return chargeBoxSerialNumber
  **/
  @ApiModelProperty(value = "")
  public String getChargeBoxSerialNumber() {
    return chargeBoxSerialNumber;
  }

  public void setChargeBoxSerialNumber(String chargeBoxSerialNumber) {
    this.chargeBoxSerialNumber = chargeBoxSerialNumber;
  }

  public BootNotificationRequestDTO firmwareVersion(String firmwareVersion) {
    this.firmwareVersion = firmwareVersion;
    return this;
  }

   /**
   * Get firmwareVersion
   * @return firmwareVersion
  **/
  @ApiModelProperty(value = "")
  public String getFirmwareVersion() {
    return firmwareVersion;
  }

  public void setFirmwareVersion(String firmwareVersion) {
    this.firmwareVersion = firmwareVersion;
  }

  public BootNotificationRequestDTO iccid(String iccid) {
    this.iccid = iccid;
    return this;
  }

   /**
   * Get iccid
   * @return iccid
  **/
  @ApiModelProperty(value = "")
  public String getIccid() {
    return iccid;
  }

  public void setIccid(String iccid) {
    this.iccid = iccid;
  }

  public BootNotificationRequestDTO imsi(String imsi) {
    this.imsi = imsi;
    return this;
  }

   /**
   * Get imsi
   * @return imsi
  **/
  @ApiModelProperty(value = "")
  public String getImsi() {
    return imsi;
  }

  public void setImsi(String imsi) {
    this.imsi = imsi;
  }

  public BootNotificationRequestDTO meterType(String meterType) {
    this.meterType = meterType;
    return this;
  }

   /**
   * Get meterType
   * @return meterType
  **/
  @ApiModelProperty(value = "")
  public String getMeterType() {
    return meterType;
  }

  public void setMeterType(String meterType) {
    this.meterType = meterType;
  }

  public BootNotificationRequestDTO meterSerialNumber(String meterSerialNumber) {
    this.meterSerialNumber = meterSerialNumber;
    return this;
  }

   /**
   * Get meterSerialNumber
   * @return meterSerialNumber
  **/
  @ApiModelProperty(value = "")
  public String getMeterSerialNumber() {
    return meterSerialNumber;
  }

  public void setMeterSerialNumber(String meterSerialNumber) {
    this.meterSerialNumber = meterSerialNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BootNotificationRequestDTO bootNotificationRequestDTO = (BootNotificationRequestDTO) o;
    return Objects.equals(this.remoteAddress, bootNotificationRequestDTO.remoteAddress) &&
        Objects.equals(this.centralSystemRequestedAt, bootNotificationRequestDTO.centralSystemRequestedAt) &&
        Objects.equals(this.chargePointVendor, bootNotificationRequestDTO.chargePointVendor) &&
        Objects.equals(this.chargePointModel, bootNotificationRequestDTO.chargePointModel) &&
        Objects.equals(this.chargePointSerialNumber, bootNotificationRequestDTO.chargePointSerialNumber) &&
        Objects.equals(this.chargeBoxSerialNumber, bootNotificationRequestDTO.chargeBoxSerialNumber) &&
        Objects.equals(this.firmwareVersion, bootNotificationRequestDTO.firmwareVersion) &&
        Objects.equals(this.iccid, bootNotificationRequestDTO.iccid) &&
        Objects.equals(this.imsi, bootNotificationRequestDTO.imsi) &&
        Objects.equals(this.meterType, bootNotificationRequestDTO.meterType) &&
        Objects.equals(this.meterSerialNumber, bootNotificationRequestDTO.meterSerialNumber) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remoteAddress, centralSystemRequestedAt, chargePointVendor, chargePointModel, chargePointSerialNumber, chargeBoxSerialNumber, firmwareVersion, iccid, imsi, meterType, meterSerialNumber, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BootNotificationRequestDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    remoteAddress: ").append(toIndentedString(remoteAddress)).append("\n");
    sb.append("    centralSystemRequestedAt: ").append(toIndentedString(centralSystemRequestedAt)).append("\n");
    sb.append("    chargePointVendor: ").append(toIndentedString(chargePointVendor)).append("\n");
    sb.append("    chargePointModel: ").append(toIndentedString(chargePointModel)).append("\n");
    sb.append("    chargePointSerialNumber: ").append(toIndentedString(chargePointSerialNumber)).append("\n");
    sb.append("    chargeBoxSerialNumber: ").append(toIndentedString(chargeBoxSerialNumber)).append("\n");
    sb.append("    firmwareVersion: ").append(toIndentedString(firmwareVersion)).append("\n");
    sb.append("    iccid: ").append(toIndentedString(iccid)).append("\n");
    sb.append("    imsi: ").append(toIndentedString(imsi)).append("\n");
    sb.append("    meterType: ").append(toIndentedString(meterType)).append("\n");
    sb.append("    meterSerialNumber: ").append(toIndentedString(meterSerialNumber)).append("\n");
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

