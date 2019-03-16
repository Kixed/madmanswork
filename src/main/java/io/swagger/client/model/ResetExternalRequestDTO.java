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
 * Reset request
 */
@ApiModel(description = "Reset request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T19:06:01.588+01:00")
public class ResetExternalRequestDTO {
  @SerializedName("externalChargingStationId")
  private String externalChargingStationId = null;

  /**
   * Type of reset to perform
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    HARD("HARD"),
    
    SOFT("SOFT");

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

  public ResetExternalRequestDTO externalChargingStationId(String externalChargingStationId) {
    this.externalChargingStationId = externalChargingStationId;
    return this;
  }

   /**
   * External charging station ID
   * @return externalChargingStationId
  **/
  @ApiModelProperty(required = true, value = "External charging station ID")
  public String getExternalChargingStationId() {
    return externalChargingStationId;
  }

  public void setExternalChargingStationId(String externalChargingStationId) {
    this.externalChargingStationId = externalChargingStationId;
  }

  public ResetExternalRequestDTO type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of reset to perform
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of reset to perform")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResetExternalRequestDTO resetExternalRequestDTO = (ResetExternalRequestDTO) o;
    return Objects.equals(this.externalChargingStationId, resetExternalRequestDTO.externalChargingStationId) &&
        Objects.equals(this.type, resetExternalRequestDTO.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalChargingStationId, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetExternalRequestDTO {\n");
    
    sb.append("    externalChargingStationId: ").append(toIndentedString(externalChargingStationId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

