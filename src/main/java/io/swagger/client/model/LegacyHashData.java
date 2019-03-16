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
 * LegacyHashData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T18:37:18.317+01:00")
public class LegacyHashData {
  /**
   * Gets or Sets function
   */
  @JsonAdapter(FunctionEnum.Adapter.class)
  public enum FunctionEnum {
    MD5("MD5"),
    
    SHA_1("SHA_1");

    private String value;

    FunctionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FunctionEnum fromValue(String text) {
      for (FunctionEnum b : FunctionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FunctionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FunctionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FunctionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FunctionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Function")
  private FunctionEnum function = null;

  @SerializedName("Salt")
  private String salt = null;

  @SerializedName("Value")
  private String value = null;

  public LegacyHashData function(FunctionEnum function) {
    this.function = function;
    return this;
  }

   /**
   * Get function
   * @return function
  **/
  @ApiModelProperty(required = true, value = "")
  public FunctionEnum getFunction() {
    return function;
  }

  public void setFunction(FunctionEnum function) {
    this.function = function;
  }

  public LegacyHashData salt(String salt) {
    this.salt = salt;
    return this;
  }

   /**
   * Get salt
   * @return salt
  **/
  @ApiModelProperty(value = "")
  public String getSalt() {
    return salt;
  }

  public void setSalt(String salt) {
    this.salt = salt;
  }

  public LegacyHashData value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegacyHashData legacyHashData = (LegacyHashData) o;
    return Objects.equals(this.function, legacyHashData.function) &&
        Objects.equals(this.salt, legacyHashData.salt) &&
        Objects.equals(this.value, legacyHashData.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(function, salt, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegacyHashData {\n");
    
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    salt: ").append(toIndentedString(salt)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

