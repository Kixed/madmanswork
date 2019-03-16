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
import java.io.IOException;

/**
 * RemoteChargingStationInfoListDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T19:09:13.919+01:00")
public class RemoteChargingStationInfoListDTO {
  @SerializedName("chargePointVendor")
  private String chargePointVendor = null;

  @SerializedName("chargePointModel")
  private String chargePointModel = null;

  public RemoteChargingStationInfoListDTO chargePointVendor(String chargePointVendor) {
    this.chargePointVendor = chargePointVendor;
    return this;
  }

   /**
   * Get chargePointVendor
   * @return chargePointVendor
  **/
  @ApiModelProperty(value = "")
  public String getChargePointVendor() {
    return chargePointVendor;
  }

  public void setChargePointVendor(String chargePointVendor) {
    this.chargePointVendor = chargePointVendor;
  }

  public RemoteChargingStationInfoListDTO chargePointModel(String chargePointModel) {
    this.chargePointModel = chargePointModel;
    return this;
  }

   /**
   * Get chargePointModel
   * @return chargePointModel
  **/
  @ApiModelProperty(value = "")
  public String getChargePointModel() {
    return chargePointModel;
  }

  public void setChargePointModel(String chargePointModel) {
    this.chargePointModel = chargePointModel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteChargingStationInfoListDTO remoteChargingStationInfoListDTO = (RemoteChargingStationInfoListDTO) o;
    return Objects.equals(this.chargePointVendor, remoteChargingStationInfoListDTO.chargePointVendor) &&
        Objects.equals(this.chargePointModel, remoteChargingStationInfoListDTO.chargePointModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargePointVendor, chargePointModel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteChargingStationInfoListDTO {\n");
    
    sb.append("    chargePointVendor: ").append(toIndentedString(chargePointVendor)).append("\n");
    sb.append("    chargePointModel: ").append(toIndentedString(chargePointModel)).append("\n");
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
