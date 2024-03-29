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
 * RemoteAvailabilityInfoDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T19:09:13.919+01:00")
public class RemoteAvailabilityInfoDTO {
  @SerializedName("publicStation")
  private Boolean publicStation = null;

  @SerializedName("publishToHubject")
  private Boolean publishToHubject = null;

  @SerializedName("freeChargingMode")
  private Boolean freeChargingMode = null;

  @SerializedName("chargeAndPayAvailable")
  private Boolean chargeAndPayAvailable = null;

  @SerializedName("open24Hours")
  private Boolean open24Hours = null;

  /**
   * Gets or Sets accessibility
   */
  @JsonAdapter(AccessibilityEnum.Adapter.class)
  public enum AccessibilityEnum {
    UNSPECIFIED("UNSPECIFIED"),
    
    FREE_PUBLICLY_ACCESSIBLE("FREE_PUBLICLY_ACCESSIBLE"),
    
    RESTRICTED_ACCESS("RESTRICTED_ACCESS"),
    
    PAYING_PUBLICLY_ACCESSIBLE("PAYING_PUBLICLY_ACCESSIBLE"),
    
    TEST_STATION("TEST_STATION");

    private String value;

    AccessibilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccessibilityEnum fromValue(String text) {
      for (AccessibilityEnum b : AccessibilityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AccessibilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessibilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccessibilityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AccessibilityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("accessibility")
  private AccessibilityEnum accessibility = null;

  public RemoteAvailabilityInfoDTO publicStation(Boolean publicStation) {
    this.publicStation = publicStation;
    return this;
  }

   /**
   * Get publicStation
   * @return publicStation
  **/
  @ApiModelProperty(value = "")
  public Boolean isPublicStation() {
    return publicStation;
  }

  public void setPublicStation(Boolean publicStation) {
    this.publicStation = publicStation;
  }

  public RemoteAvailabilityInfoDTO publishToHubject(Boolean publishToHubject) {
    this.publishToHubject = publishToHubject;
    return this;
  }

   /**
   * Get publishToHubject
   * @return publishToHubject
  **/
  @ApiModelProperty(value = "")
  public Boolean isPublishToHubject() {
    return publishToHubject;
  }

  public void setPublishToHubject(Boolean publishToHubject) {
    this.publishToHubject = publishToHubject;
  }

  public RemoteAvailabilityInfoDTO freeChargingMode(Boolean freeChargingMode) {
    this.freeChargingMode = freeChargingMode;
    return this;
  }

   /**
   * Get freeChargingMode
   * @return freeChargingMode
  **/
  @ApiModelProperty(value = "")
  public Boolean isFreeChargingMode() {
    return freeChargingMode;
  }

  public void setFreeChargingMode(Boolean freeChargingMode) {
    this.freeChargingMode = freeChargingMode;
  }

  public RemoteAvailabilityInfoDTO chargeAndPayAvailable(Boolean chargeAndPayAvailable) {
    this.chargeAndPayAvailable = chargeAndPayAvailable;
    return this;
  }

   /**
   * Get chargeAndPayAvailable
   * @return chargeAndPayAvailable
  **/
  @ApiModelProperty(value = "")
  public Boolean isChargeAndPayAvailable() {
    return chargeAndPayAvailable;
  }

  public void setChargeAndPayAvailable(Boolean chargeAndPayAvailable) {
    this.chargeAndPayAvailable = chargeAndPayAvailable;
  }

  public RemoteAvailabilityInfoDTO open24Hours(Boolean open24Hours) {
    this.open24Hours = open24Hours;
    return this;
  }

   /**
   * Get open24Hours
   * @return open24Hours
  **/
  @ApiModelProperty(value = "")
  public Boolean isOpen24Hours() {
    return open24Hours;
  }

  public void setOpen24Hours(Boolean open24Hours) {
    this.open24Hours = open24Hours;
  }

  public RemoteAvailabilityInfoDTO accessibility(AccessibilityEnum accessibility) {
    this.accessibility = accessibility;
    return this;
  }

   /**
   * Get accessibility
   * @return accessibility
  **/
  @ApiModelProperty(required = true, value = "")
  public AccessibilityEnum getAccessibility() {
    return accessibility;
  }

  public void setAccessibility(AccessibilityEnum accessibility) {
    this.accessibility = accessibility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteAvailabilityInfoDTO remoteAvailabilityInfoDTO = (RemoteAvailabilityInfoDTO) o;
    return Objects.equals(this.publicStation, remoteAvailabilityInfoDTO.publicStation) &&
        Objects.equals(this.publishToHubject, remoteAvailabilityInfoDTO.publishToHubject) &&
        Objects.equals(this.freeChargingMode, remoteAvailabilityInfoDTO.freeChargingMode) &&
        Objects.equals(this.chargeAndPayAvailable, remoteAvailabilityInfoDTO.chargeAndPayAvailable) &&
        Objects.equals(this.open24Hours, remoteAvailabilityInfoDTO.open24Hours) &&
        Objects.equals(this.accessibility, remoteAvailabilityInfoDTO.accessibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicStation, publishToHubject, freeChargingMode, chargeAndPayAvailable, open24Hours, accessibility);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteAvailabilityInfoDTO {\n");
    
    sb.append("    publicStation: ").append(toIndentedString(publicStation)).append("\n");
    sb.append("    publishToHubject: ").append(toIndentedString(publishToHubject)).append("\n");
    sb.append("    freeChargingMode: ").append(toIndentedString(freeChargingMode)).append("\n");
    sb.append("    chargeAndPayAvailable: ").append(toIndentedString(chargeAndPayAvailable)).append("\n");
    sb.append("    open24Hours: ").append(toIndentedString(open24Hours)).append("\n");
    sb.append("    accessibility: ").append(toIndentedString(accessibility)).append("\n");
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

