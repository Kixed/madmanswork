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

/**
 * All messages received from or sent to charging stations inherit from this type.
 */
@ApiModel(description = "All messages received from or sent to charging stations inherit from this type.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T19:06:01.588+01:00")

public class AbstractMessageDTO {
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

  @SerializedName("uniqueMessageId")
  private String uniqueMessageId = null;

  @SerializedName("externalChargingStationId")
  private String externalChargingStationId = null;

  @SerializedName("csoId")
  private Long csoId = null;

  public AbstractMessageDTO() {
  }
  public AbstractMessageDTO protocol(ProtocolEnum protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @ApiModelProperty(required = true, value = "")
  public ProtocolEnum getProtocol() {
    return protocol;
  }

  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }

  public AbstractMessageDTO uniqueMessageId(String uniqueMessageId) {
    this.uniqueMessageId = uniqueMessageId;
    return this;
  }

   /**
   * Get uniqueMessageId
   * @return uniqueMessageId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUniqueMessageId() {
    return uniqueMessageId;
  }

  public void setUniqueMessageId(String uniqueMessageId) {
    this.uniqueMessageId = uniqueMessageId;
  }

  public AbstractMessageDTO externalChargingStationId(String externalChargingStationId) {
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

  public AbstractMessageDTO csoId(Long csoId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractMessageDTO abstractMessageDTO = (AbstractMessageDTO) o;
    return Objects.equals(this.protocol, abstractMessageDTO.protocol) &&
        Objects.equals(this.uniqueMessageId, abstractMessageDTO.uniqueMessageId) &&
        Objects.equals(this.externalChargingStationId, abstractMessageDTO.externalChargingStationId) &&
        Objects.equals(this.csoId, abstractMessageDTO.csoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(protocol, uniqueMessageId, externalChargingStationId, csoId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractMessageDTO {\n");
    
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    uniqueMessageId: ").append(toIndentedString(uniqueMessageId)).append("\n");
    sb.append("    externalChargingStationId: ").append(toIndentedString(externalChargingStationId)).append("\n");
    sb.append("    csoId: ").append(toIndentedString(csoId)).append("\n");
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

