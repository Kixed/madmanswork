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
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * ChargingInfoDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T19:08:37.674+01:00")
public class ChargingInfoDTO {
  @SerializedName("start")
  private OffsetDateTime start = null;

  @SerializedName("end")
  private OffsetDateTime end = null;

  @SerializedName("meterStart")
  private Double meterStart = null;

  @SerializedName("meterEnd")
  private Double meterEnd = null;

  @SerializedName("consumedEnergy")
  private Double consumedEnergy = null;

  public ChargingInfoDTO start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public ChargingInfoDTO end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }

  public ChargingInfoDTO meterStart(Double meterStart) {
    this.meterStart = meterStart;
    return this;
  }

   /**
   * Get meterStart
   * @return meterStart
  **/
  @ApiModelProperty(value = "")
  public Double getMeterStart() {
    return meterStart;
  }

  public void setMeterStart(Double meterStart) {
    this.meterStart = meterStart;
  }

  public ChargingInfoDTO meterEnd(Double meterEnd) {
    this.meterEnd = meterEnd;
    return this;
  }

   /**
   * Get meterEnd
   * @return meterEnd
  **/
  @ApiModelProperty(value = "")
  public Double getMeterEnd() {
    return meterEnd;
  }

  public void setMeterEnd(Double meterEnd) {
    this.meterEnd = meterEnd;
  }

   /**
   * Get consumedEnergy
   * @return consumedEnergy
  **/
  @ApiModelProperty(value = "")
  public Double getConsumedEnergy() {
    return consumedEnergy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargingInfoDTO chargingInfoDTO = (ChargingInfoDTO) o;
    return Objects.equals(this.start, chargingInfoDTO.start) &&
        Objects.equals(this.end, chargingInfoDTO.end) &&
        Objects.equals(this.meterStart, chargingInfoDTO.meterStart) &&
        Objects.equals(this.meterEnd, chargingInfoDTO.meterEnd) &&
        Objects.equals(this.consumedEnergy, chargingInfoDTO.consumedEnergy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, meterStart, meterEnd, consumedEnergy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargingInfoDTO {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    meterStart: ").append(toIndentedString(meterStart)).append("\n");
    sb.append("    meterEnd: ").append(toIndentedString(meterEnd)).append("\n");
    sb.append("    consumedEnergy: ").append(toIndentedString(consumedEnergy)).append("\n");
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

