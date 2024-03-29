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
 * RoamingInfoDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T19:08:37.674+01:00")
public class RoamingInfoDTO {
  /**
   * Gets or Sets roamingPlatform
   */
  @JsonAdapter(RoamingPlatformEnum.Adapter.class)
  public enum RoamingPlatformEnum {
    DIRECT("DIRECT"),
    
    DIRECT_LOCAL("DIRECT_LOCAL"),
    
    HUBJECT("HUBJECT");

    private String value;

    RoamingPlatformEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RoamingPlatformEnum fromValue(String text) {
      for (RoamingPlatformEnum b : RoamingPlatformEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RoamingPlatformEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoamingPlatformEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RoamingPlatformEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RoamingPlatformEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("roamingPlatform")
  private RoamingPlatformEnum roamingPlatform = null;

  @SerializedName("roamingPartnerId")
  private Long roamingPartnerId = null;

  @SerializedName("roamingTransmissionOn")
  private OffsetDateTime roamingTransmissionOn = null;

  @SerializedName("roamingSessionId")
  private String roamingSessionId = null;

  public RoamingInfoDTO roamingPlatform(RoamingPlatformEnum roamingPlatform) {
    this.roamingPlatform = roamingPlatform;
    return this;
  }

   /**
   * Get roamingPlatform
   * @return roamingPlatform
  **/
  @ApiModelProperty(value = "")
  public RoamingPlatformEnum getRoamingPlatform() {
    return roamingPlatform;
  }

  public void setRoamingPlatform(RoamingPlatformEnum roamingPlatform) {
    this.roamingPlatform = roamingPlatform;
  }

  public RoamingInfoDTO roamingPartnerId(Long roamingPartnerId) {
    this.roamingPartnerId = roamingPartnerId;
    return this;
  }

   /**
   * Get roamingPartnerId
   * @return roamingPartnerId
  **/
  @ApiModelProperty(value = "")
  public Long getRoamingPartnerId() {
    return roamingPartnerId;
  }

  public void setRoamingPartnerId(Long roamingPartnerId) {
    this.roamingPartnerId = roamingPartnerId;
  }

  public RoamingInfoDTO roamingTransmissionOn(OffsetDateTime roamingTransmissionOn) {
    this.roamingTransmissionOn = roamingTransmissionOn;
    return this;
  }

   /**
   * Get roamingTransmissionOn
   * @return roamingTransmissionOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getRoamingTransmissionOn() {
    return roamingTransmissionOn;
  }

  public void setRoamingTransmissionOn(OffsetDateTime roamingTransmissionOn) {
    this.roamingTransmissionOn = roamingTransmissionOn;
  }

  public RoamingInfoDTO roamingSessionId(String roamingSessionId) {
    this.roamingSessionId = roamingSessionId;
    return this;
  }

   /**
   * Get roamingSessionId
   * @return roamingSessionId
  **/
  @ApiModelProperty(value = "")
  public String getRoamingSessionId() {
    return roamingSessionId;
  }

  public void setRoamingSessionId(String roamingSessionId) {
    this.roamingSessionId = roamingSessionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoamingInfoDTO roamingInfoDTO = (RoamingInfoDTO) o;
    return Objects.equals(this.roamingPlatform, roamingInfoDTO.roamingPlatform) &&
        Objects.equals(this.roamingPartnerId, roamingInfoDTO.roamingPartnerId) &&
        Objects.equals(this.roamingTransmissionOn, roamingInfoDTO.roamingTransmissionOn) &&
        Objects.equals(this.roamingSessionId, roamingInfoDTO.roamingSessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roamingPlatform, roamingPartnerId, roamingTransmissionOn, roamingSessionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoamingInfoDTO {\n");
    
    sb.append("    roamingPlatform: ").append(toIndentedString(roamingPlatform)).append("\n");
    sb.append("    roamingPartnerId: ").append(toIndentedString(roamingPartnerId)).append("\n");
    sb.append("    roamingTransmissionOn: ").append(toIndentedString(roamingTransmissionOn)).append("\n");
    sb.append("    roamingSessionId: ").append(toIndentedString(roamingSessionId)).append("\n");
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

