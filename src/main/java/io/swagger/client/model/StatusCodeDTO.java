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
 * StatusCodeDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T18:37:18.317+01:00")
public class StatusCodeDTO {
  @SerializedName("additionalInfo")
  private String additionalInfo = null;

  /**
   * Gets or Sets code
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    _000("CODE_000"),
    
    _001("CODE_001"),
    
    _002("CODE_002"),
    
    _009("CODE_009"),
    
    _017("CODE_017"),
    
    _018("CODE_018"),
    
    _019("CODE_019"),
    
    _021("CODE_021"),
    
    _022("CODE_022"),
    
    _101("CODE_101"),
    
    _102("CODE_102"),
    
    _103("CODE_103"),
    
    _105("CODE_105"),
    
    _106("CODE_106"),
    
    _110("CODE_110"),
    
    _120("CODE_120"),
    
    _121("CODE_121"),
    
    _122("CODE_122"),
    
    _200("CODE_200"),
    
    _210("CODE_210"),
    
    _300("CODE_300"),
    
    _310("CODE_310"),
    
    _320("CODE_320"),
    
    _400("CODE_400"),
    
    _501("CODE_501"),
    
    _510("CODE_510"),
    
    _601("CODE_601"),
    
    _602("CODE_602"),
    
    _603("CODE_603"),
    
    _604("CODE_604"),
    
    _700("CODE_700");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodeEnum fromValue(String text) {
      for (CodeEnum b : CodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CodeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("code")
  private CodeEnum code = null;

  @SerializedName("description")
  private String description = null;

  public StatusCodeDTO additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * Get additionalInfo
   * @return additionalInfo
  **/
  @ApiModelProperty(value = "")
  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public StatusCodeDTO code(CodeEnum code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(required = true, value = "")
  public CodeEnum getCode() {
    return code;
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public StatusCodeDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusCodeDTO statusCodeDTO = (StatusCodeDTO) o;
    return Objects.equals(this.additionalInfo, statusCodeDTO.additionalInfo) &&
        Objects.equals(this.code, statusCodeDTO.code) &&
        Objects.equals(this.description, statusCodeDTO.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, code, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusCodeDTO {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

