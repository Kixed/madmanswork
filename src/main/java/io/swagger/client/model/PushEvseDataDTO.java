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
import io.swagger.client.model.OperatorEvseDataDTO;
import java.io.IOException;

/**
 * PushEvseDataDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T18:37:18.317+01:00")
public class PushEvseDataDTO {
  /**
   * Gets or Sets actionType
   */
  @JsonAdapter(ActionTypeEnum.Adapter.class)
  public enum ActionTypeEnum {
    FULLLOAD("FULLLOAD"),
    
    UPDATE("UPDATE"),
    
    INSERT("INSERT"),
    
    DELETE("DELETE");

    private String value;

    ActionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionTypeEnum fromValue(String text) {
      for (ActionTypeEnum b : ActionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ActionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ActionTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("actionType")
  private ActionTypeEnum actionType = null;

  @SerializedName("operatorEvseData")
  private OperatorEvseDataDTO operatorEvseData = null;

  public PushEvseDataDTO actionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
    return this;
  }

   /**
   * Get actionType
   * @return actionType
  **/
  @ApiModelProperty(required = true, value = "")
  public ActionTypeEnum getActionType() {
    return actionType;
  }

  public void setActionType(ActionTypeEnum actionType) {
    this.actionType = actionType;
  }

  public PushEvseDataDTO operatorEvseData(OperatorEvseDataDTO operatorEvseData) {
    this.operatorEvseData = operatorEvseData;
    return this;
  }

   /**
   * Get operatorEvseData
   * @return operatorEvseData
  **/
  @ApiModelProperty(required = true, value = "")
  public OperatorEvseDataDTO getOperatorEvseData() {
    return operatorEvseData;
  }

  public void setOperatorEvseData(OperatorEvseDataDTO operatorEvseData) {
    this.operatorEvseData = operatorEvseData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushEvseDataDTO pushEvseDataDTO = (PushEvseDataDTO) o;
    return Objects.equals(this.actionType, pushEvseDataDTO.actionType) &&
        Objects.equals(this.operatorEvseData, pushEvseDataDTO.operatorEvseData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, operatorEvseData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushEvseDataDTO {\n");
    
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    operatorEvseData: ").append(toIndentedString(operatorEvseData)).append("\n");
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

