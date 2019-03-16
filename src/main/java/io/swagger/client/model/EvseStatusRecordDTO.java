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
import java.io.IOException;

/**
 * EvseStatusRecordDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T18:37:18.317+01:00")
public class EvseStatusRecordDTO {
  @SerializedName("evseID")
  private String evseID = null;

  /**
   * Gets or Sets evseStatus
   */
  @JsonAdapter(EvseStatusEnum.Adapter.class)
  public enum EvseStatusEnum {
    AVAILABLE("AVAILABLE"),
    
    PREPARING("PREPARING"),
    
    CHARGING("CHARGING"),
    
    SUSPENDED_EVSE("SUSPENDED_EVSE"),
    
    SUSPENDED_EV("SUSPENDED_EV"),
    
    FINISHING("FINISHING"),
    
    OCCUPIED("OCCUPIED"),
    
    RESERVED("RESERVED"),
    
    UNAVAILABLE("UNAVAILABLE"),
    
    OFFLINE("OFFLINE"),
    
    FAULTED("FAULTED");

    private String value;

    EvseStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EvseStatusEnum fromValue(String text) {
      for (EvseStatusEnum b : EvseStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EvseStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EvseStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EvseStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EvseStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("evseStatus")
  private EvseStatusEnum evseStatus = null;

  public EvseStatusRecordDTO evseID(String evseID) {
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

  public EvseStatusRecordDTO evseStatus(EvseStatusEnum evseStatus) {
    this.evseStatus = evseStatus;
    return this;
  }

   /**
   * Get evseStatus
   * @return evseStatus
  **/
  @ApiModelProperty(required = true, value = "")
  public EvseStatusEnum getEvseStatus() {
    return evseStatus;
  }

  public void setEvseStatus(EvseStatusEnum evseStatus) {
    this.evseStatus = evseStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvseStatusRecordDTO evseStatusRecordDTO = (EvseStatusRecordDTO) o;
    return Objects.equals(this.evseID, evseStatusRecordDTO.evseID) &&
        Objects.equals(this.evseStatus, evseStatusRecordDTO.evseStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evseID, evseStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvseStatusRecordDTO {\n");
    
    sb.append("    evseID: ").append(toIndentedString(evseID)).append("\n");
    sb.append("    evseStatus: ").append(toIndentedString(evseStatus)).append("\n");
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

