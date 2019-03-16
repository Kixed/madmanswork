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
import io.swagger.client.model.Identification;
import io.swagger.client.model.MeterValueInBetween;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

/**
 * ERoamingChargeDetailRecord
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T18:37:18.317+01:00")
public class ERoamingChargeDetailRecord {
  @SerializedName("CPOPartnerSessionID")
  private String cpOPartnerSessionID = null;

  @SerializedName("EMPPartnerSessionID")
  private String emPPartnerSessionID = null;

  @SerializedName("ChargingStart")
  private OffsetDateTime chargingStart = null;

  @SerializedName("ChargingEnd")
  private OffsetDateTime chargingEnd = null;

  @SerializedName("ConsumedEnergy")
  private BigDecimal consumedEnergy = null;

  @SerializedName("EvseID")
  private String evseID = null;

  @SerializedName("HubOperatorID")
  private String hubOperatorID = null;

  @SerializedName("HubProviderID")
  private String hubProviderID = null;

  @SerializedName("Identification")
  private Identification identification = null;

  @SerializedName("MeterValueStart")
  private BigDecimal meterValueStart = null;

  @SerializedName("MeterValueEnd")
  private BigDecimal meterValueEnd = null;

  @SerializedName("MeterValueInBetween")
  private MeterValueInBetween meterValueInBetween = null;

  @SerializedName("MeteringSignature")
  private String meteringSignature = null;

  @SerializedName("PartnerProductID")
  private String partnerProductID = null;

  @SerializedName("SessionStart")
  private OffsetDateTime sessionStart = null;

  @SerializedName("SessionEnd")
  private OffsetDateTime sessionEnd = null;

  @SerializedName("SessionID")
  private String sessionID = null;

  public ERoamingChargeDetailRecord cpOPartnerSessionID(String cpOPartnerSessionID) {
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

  public ERoamingChargeDetailRecord emPPartnerSessionID(String emPPartnerSessionID) {
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

  public ERoamingChargeDetailRecord chargingStart(OffsetDateTime chargingStart) {
    this.chargingStart = chargingStart;
    return this;
  }

   /**
   * Get chargingStart
   * @return chargingStart
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getChargingStart() {
    return chargingStart;
  }

  public void setChargingStart(OffsetDateTime chargingStart) {
    this.chargingStart = chargingStart;
  }

  public ERoamingChargeDetailRecord chargingEnd(OffsetDateTime chargingEnd) {
    this.chargingEnd = chargingEnd;
    return this;
  }

   /**
   * Get chargingEnd
   * @return chargingEnd
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getChargingEnd() {
    return chargingEnd;
  }

  public void setChargingEnd(OffsetDateTime chargingEnd) {
    this.chargingEnd = chargingEnd;
  }

  public ERoamingChargeDetailRecord consumedEnergy(BigDecimal consumedEnergy) {
    this.consumedEnergy = consumedEnergy;
    return this;
  }

   /**
   * Get consumedEnergy
   * @return consumedEnergy
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getConsumedEnergy() {
    return consumedEnergy;
  }

  public void setConsumedEnergy(BigDecimal consumedEnergy) {
    this.consumedEnergy = consumedEnergy;
  }

  public ERoamingChargeDetailRecord evseID(String evseID) {
    this.evseID = evseID;
    return this;
  }

   /**
   * Get evseID
   * @return evseID
  **/
  @ApiModelProperty(required = true, value = "")
  public String getEvseID() {
    return evseID;
  }

  public void setEvseID(String evseID) {
    this.evseID = evseID;
  }

  public ERoamingChargeDetailRecord hubOperatorID(String hubOperatorID) {
    this.hubOperatorID = hubOperatorID;
    return this;
  }

   /**
   * Get hubOperatorID
   * @return hubOperatorID
  **/
  @ApiModelProperty(value = "")
  public String getHubOperatorID() {
    return hubOperatorID;
  }

  public void setHubOperatorID(String hubOperatorID) {
    this.hubOperatorID = hubOperatorID;
  }

  public ERoamingChargeDetailRecord hubProviderID(String hubProviderID) {
    this.hubProviderID = hubProviderID;
    return this;
  }

   /**
   * Get hubProviderID
   * @return hubProviderID
  **/
  @ApiModelProperty(required = true, value = "")
  public String getHubProviderID() {
    return hubProviderID;
  }

  public void setHubProviderID(String hubProviderID) {
    this.hubProviderID = hubProviderID;
  }

  public ERoamingChargeDetailRecord identification(Identification identification) {
    this.identification = identification;
    return this;
  }

   /**
   * Get identification
   * @return identification
  **/
  @ApiModelProperty(required = true, value = "")
  public Identification getIdentification() {
    return identification;
  }

  public void setIdentification(Identification identification) {
    this.identification = identification;
  }

  public ERoamingChargeDetailRecord meterValueStart(BigDecimal meterValueStart) {
    this.meterValueStart = meterValueStart;
    return this;
  }

   /**
   * Get meterValueStart
   * @return meterValueStart
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getMeterValueStart() {
    return meterValueStart;
  }

  public void setMeterValueStart(BigDecimal meterValueStart) {
    this.meterValueStart = meterValueStart;
  }

  public ERoamingChargeDetailRecord meterValueEnd(BigDecimal meterValueEnd) {
    this.meterValueEnd = meterValueEnd;
    return this;
  }

   /**
   * Get meterValueEnd
   * @return meterValueEnd
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getMeterValueEnd() {
    return meterValueEnd;
  }

  public void setMeterValueEnd(BigDecimal meterValueEnd) {
    this.meterValueEnd = meterValueEnd;
  }

  public ERoamingChargeDetailRecord meterValueInBetween(MeterValueInBetween meterValueInBetween) {
    this.meterValueInBetween = meterValueInBetween;
    return this;
  }

   /**
   * Get meterValueInBetween
   * @return meterValueInBetween
  **/
  @ApiModelProperty(value = "")
  public MeterValueInBetween getMeterValueInBetween() {
    return meterValueInBetween;
  }

  public void setMeterValueInBetween(MeterValueInBetween meterValueInBetween) {
    this.meterValueInBetween = meterValueInBetween;
  }

  public ERoamingChargeDetailRecord meteringSignature(String meteringSignature) {
    this.meteringSignature = meteringSignature;
    return this;
  }

   /**
   * Get meteringSignature
   * @return meteringSignature
  **/
  @ApiModelProperty(value = "")
  public String getMeteringSignature() {
    return meteringSignature;
  }

  public void setMeteringSignature(String meteringSignature) {
    this.meteringSignature = meteringSignature;
  }

  public ERoamingChargeDetailRecord partnerProductID(String partnerProductID) {
    this.partnerProductID = partnerProductID;
    return this;
  }

   /**
   * Get partnerProductID
   * @return partnerProductID
  **/
  @ApiModelProperty(value = "")
  public String getPartnerProductID() {
    return partnerProductID;
  }

  public void setPartnerProductID(String partnerProductID) {
    this.partnerProductID = partnerProductID;
  }

  public ERoamingChargeDetailRecord sessionStart(OffsetDateTime sessionStart) {
    this.sessionStart = sessionStart;
    return this;
  }

   /**
   * Get sessionStart
   * @return sessionStart
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getSessionStart() {
    return sessionStart;
  }

  public void setSessionStart(OffsetDateTime sessionStart) {
    this.sessionStart = sessionStart;
  }

  public ERoamingChargeDetailRecord sessionEnd(OffsetDateTime sessionEnd) {
    this.sessionEnd = sessionEnd;
    return this;
  }

   /**
   * Get sessionEnd
   * @return sessionEnd
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getSessionEnd() {
    return sessionEnd;
  }

  public void setSessionEnd(OffsetDateTime sessionEnd) {
    this.sessionEnd = sessionEnd;
  }

  public ERoamingChargeDetailRecord sessionID(String sessionID) {
    this.sessionID = sessionID;
    return this;
  }

   /**
   * Get sessionID
   * @return sessionID
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSessionID() {
    return sessionID;
  }

  public void setSessionID(String sessionID) {
    this.sessionID = sessionID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ERoamingChargeDetailRecord eroamingChargeDetailRecord = (ERoamingChargeDetailRecord) o;
    return Objects.equals(this.cpOPartnerSessionID, eroamingChargeDetailRecord.cpOPartnerSessionID) &&
        Objects.equals(this.emPPartnerSessionID, eroamingChargeDetailRecord.emPPartnerSessionID) &&
        Objects.equals(this.chargingStart, eroamingChargeDetailRecord.chargingStart) &&
        Objects.equals(this.chargingEnd, eroamingChargeDetailRecord.chargingEnd) &&
        Objects.equals(this.consumedEnergy, eroamingChargeDetailRecord.consumedEnergy) &&
        Objects.equals(this.evseID, eroamingChargeDetailRecord.evseID) &&
        Objects.equals(this.hubOperatorID, eroamingChargeDetailRecord.hubOperatorID) &&
        Objects.equals(this.hubProviderID, eroamingChargeDetailRecord.hubProviderID) &&
        Objects.equals(this.identification, eroamingChargeDetailRecord.identification) &&
        Objects.equals(this.meterValueStart, eroamingChargeDetailRecord.meterValueStart) &&
        Objects.equals(this.meterValueEnd, eroamingChargeDetailRecord.meterValueEnd) &&
        Objects.equals(this.meterValueInBetween, eroamingChargeDetailRecord.meterValueInBetween) &&
        Objects.equals(this.meteringSignature, eroamingChargeDetailRecord.meteringSignature) &&
        Objects.equals(this.partnerProductID, eroamingChargeDetailRecord.partnerProductID) &&
        Objects.equals(this.sessionStart, eroamingChargeDetailRecord.sessionStart) &&
        Objects.equals(this.sessionEnd, eroamingChargeDetailRecord.sessionEnd) &&
        Objects.equals(this.sessionID, eroamingChargeDetailRecord.sessionID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpOPartnerSessionID, emPPartnerSessionID, chargingStart, chargingEnd, consumedEnergy, evseID, hubOperatorID, hubProviderID, identification, meterValueStart, meterValueEnd, meterValueInBetween, meteringSignature, partnerProductID, sessionStart, sessionEnd, sessionID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ERoamingChargeDetailRecord {\n");
    
    sb.append("    cpOPartnerSessionID: ").append(toIndentedString(cpOPartnerSessionID)).append("\n");
    sb.append("    emPPartnerSessionID: ").append(toIndentedString(emPPartnerSessionID)).append("\n");
    sb.append("    chargingStart: ").append(toIndentedString(chargingStart)).append("\n");
    sb.append("    chargingEnd: ").append(toIndentedString(chargingEnd)).append("\n");
    sb.append("    consumedEnergy: ").append(toIndentedString(consumedEnergy)).append("\n");
    sb.append("    evseID: ").append(toIndentedString(evseID)).append("\n");
    sb.append("    hubOperatorID: ").append(toIndentedString(hubOperatorID)).append("\n");
    sb.append("    hubProviderID: ").append(toIndentedString(hubProviderID)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    meterValueStart: ").append(toIndentedString(meterValueStart)).append("\n");
    sb.append("    meterValueEnd: ").append(toIndentedString(meterValueEnd)).append("\n");
    sb.append("    meterValueInBetween: ").append(toIndentedString(meterValueInBetween)).append("\n");
    sb.append("    meteringSignature: ").append(toIndentedString(meteringSignature)).append("\n");
    sb.append("    partnerProductID: ").append(toIndentedString(partnerProductID)).append("\n");
    sb.append("    sessionStart: ").append(toIndentedString(sessionStart)).append("\n");
    sb.append("    sessionEnd: ").append(toIndentedString(sessionEnd)).append("\n");
    sb.append("    sessionID: ").append(toIndentedString(sessionID)).append("\n");
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
