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
import java.io.IOException;
import java.math.BigDecimal;

/**
 * ChargingSchedulePeriodDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T19:06:01.588+01:00")
public class ChargingSchedulePeriodDTO {
  @SerializedName("startPeriod")
  private Integer startPeriod = null;

  @SerializedName("limit")
  private BigDecimal limit = null;

  @SerializedName("numberPhases")
  private Integer numberPhases = null;

  public ChargingSchedulePeriodDTO startPeriod(Integer startPeriod) {
    this.startPeriod = startPeriod;
    return this;
  }

   /**
   * Get startPeriod
   * @return startPeriod
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getStartPeriod() {
    return startPeriod;
  }

  public void setStartPeriod(Integer startPeriod) {
    this.startPeriod = startPeriod;
  }

  public ChargingSchedulePeriodDTO limit(BigDecimal limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getLimit() {
    return limit;
  }

  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }

  public ChargingSchedulePeriodDTO numberPhases(Integer numberPhases) {
    this.numberPhases = numberPhases;
    return this;
  }

   /**
   * Get numberPhases
   * @return numberPhases
  **/
  @ApiModelProperty(value = "")
  public Integer getNumberPhases() {
    return numberPhases;
  }

  public void setNumberPhases(Integer numberPhases) {
    this.numberPhases = numberPhases;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargingSchedulePeriodDTO chargingSchedulePeriodDTO = (ChargingSchedulePeriodDTO) o;
    return Objects.equals(this.startPeriod, chargingSchedulePeriodDTO.startPeriod) &&
        Objects.equals(this.limit, chargingSchedulePeriodDTO.limit) &&
        Objects.equals(this.numberPhases, chargingSchedulePeriodDTO.numberPhases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startPeriod, limit, numberPhases);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargingSchedulePeriodDTO {\n");
    
    sb.append("    startPeriod: ").append(toIndentedString(startPeriod)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    numberPhases: ").append(toIndentedString(numberPhases)).append("\n");
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
