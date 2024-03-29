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
import io.swagger.client.model.ChargingStationMessagePropertiesDTO;
import io.swagger.client.model.VersionedData;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * ChargingStationMessageDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T19:06:01.588+01:00")
public class ChargingStationMessageDTO {
  @SerializedName("versionedData")
  private VersionedData versionedData = null;

  @SerializedName("externalChargingStationId")
  private String externalChargingStationId = null;

  @SerializedName("uniqueMessageId")
  private String uniqueMessageId = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Gets or Sets direction
   */
  @JsonAdapter(DirectionEnum.Adapter.class)
  public enum DirectionEnum {
    INBOUND("INBOUND"),
    
    OUTBOUND("OUTBOUND");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DirectionEnum fromValue(String text) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DirectionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("direction")
  private DirectionEnum direction = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    REQUEST("REQUEST"),
    
    RESPONSE("RESPONSE"),
    
    ERROR("ERROR");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("standardRaw")
  private AbstractMessageDTO standardRaw = null;

  @SerializedName("createdOn")
  private OffsetDateTime createdOn = null;

  @SerializedName("properties")
  private ChargingStationMessagePropertiesDTO properties = null;

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

  @SerializedName("csoId")
  private Long csoId = null;

  public ChargingStationMessageDTO versionedData(VersionedData versionedData) {
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

  public ChargingStationMessageDTO externalChargingStationId(String externalChargingStationId) {
    this.externalChargingStationId = externalChargingStationId;
    return this;
  }

   /**
   * Get externalChargingStationId
   * @return externalChargingStationId
  **/
  @ApiModelProperty(value = "")
  public String getExternalChargingStationId() {
    return externalChargingStationId;
  }

  public void setExternalChargingStationId(String externalChargingStationId) {
    this.externalChargingStationId = externalChargingStationId;
  }

  public ChargingStationMessageDTO uniqueMessageId(String uniqueMessageId) {
    this.uniqueMessageId = uniqueMessageId;
    return this;
  }

   /**
   * Get uniqueMessageId
   * @return uniqueMessageId
  **/
  @ApiModelProperty(value = "")
  public String getUniqueMessageId() {
    return uniqueMessageId;
  }

  public void setUniqueMessageId(String uniqueMessageId) {
    this.uniqueMessageId = uniqueMessageId;
  }

  public ChargingStationMessageDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ChargingStationMessageDTO direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @ApiModelProperty(value = "")
  public DirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  public ChargingStationMessageDTO type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ChargingStationMessageDTO standardRaw(AbstractMessageDTO standardRaw) {
    this.standardRaw = standardRaw;
    return this;
  }

   /**
   * Get standardRaw
   * @return standardRaw
  **/
  @ApiModelProperty(value = "")
  public AbstractMessageDTO getStandardRaw() {
    return standardRaw;
  }

  public void setStandardRaw(AbstractMessageDTO standardRaw) {
    this.standardRaw = standardRaw;
  }

  public ChargingStationMessageDTO createdOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public ChargingStationMessageDTO properties(ChargingStationMessagePropertiesDTO properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")
  public ChargingStationMessagePropertiesDTO getProperties() {
    return properties;
  }

  public void setProperties(ChargingStationMessagePropertiesDTO properties) {
    this.properties = properties;
  }

  public ChargingStationMessageDTO protocol(ProtocolEnum protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @ApiModelProperty(value = "")
  public ProtocolEnum getProtocol() {
    return protocol;
  }

  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }

  public ChargingStationMessageDTO csoId(Long csoId) {
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
    ChargingStationMessageDTO chargingStationMessageDTO = (ChargingStationMessageDTO) o;
    return Objects.equals(this.versionedData, chargingStationMessageDTO.versionedData) &&
        Objects.equals(this.externalChargingStationId, chargingStationMessageDTO.externalChargingStationId) &&
        Objects.equals(this.uniqueMessageId, chargingStationMessageDTO.uniqueMessageId) &&
        Objects.equals(this.name, chargingStationMessageDTO.name) &&
        Objects.equals(this.direction, chargingStationMessageDTO.direction) &&
        Objects.equals(this.type, chargingStationMessageDTO.type) &&
        Objects.equals(this.standardRaw, chargingStationMessageDTO.standardRaw) &&
        Objects.equals(this.createdOn, chargingStationMessageDTO.createdOn) &&
        Objects.equals(this.properties, chargingStationMessageDTO.properties) &&
        Objects.equals(this.protocol, chargingStationMessageDTO.protocol) &&
        Objects.equals(this.csoId, chargingStationMessageDTO.csoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionedData, externalChargingStationId, uniqueMessageId, name, direction, type, standardRaw, createdOn, properties, protocol, csoId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargingStationMessageDTO {\n");
    
    sb.append("    versionedData: ").append(toIndentedString(versionedData)).append("\n");
    sb.append("    externalChargingStationId: ").append(toIndentedString(externalChargingStationId)).append("\n");
    sb.append("    uniqueMessageId: ").append(toIndentedString(uniqueMessageId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    standardRaw: ").append(toIndentedString(standardRaw)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

