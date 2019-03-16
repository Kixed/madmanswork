/*
 * Business Partner REST API
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
import io.swagger.client.model.VersionedData;
import java.io.IOException;

/**
 * PersonSimpleDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T18:44:40.010+01:00")
public class PersonSimpleDTO {
  @SerializedName("firstname")
  private String firstname = null;

  @SerializedName("lastname")
  private String lastname = null;

  /**
   * Gets or Sets gender
   */
  @JsonAdapter(GenderEnum.Adapter.class)
  public enum GenderEnum {
    M("M"),
    
    W("W");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GenderEnum fromValue(String text) {
      for (GenderEnum b : GenderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<GenderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GenderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GenderEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return GenderEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("gender")
  private GenderEnum gender = null;

  @SerializedName("versionedData")
  private VersionedData versionedData = null;

  @SerializedName("userId")
  private Long userId = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("mobile")
  private String mobile = null;

  public PersonSimpleDTO firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

   /**
   * Get firstname
   * @return firstname
  **/
  @ApiModelProperty(required = true, value = "")
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public PersonSimpleDTO lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

   /**
   * Get lastname
   * @return lastname
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public PersonSimpleDTO gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(required = true, value = "")
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public PersonSimpleDTO versionedData(VersionedData versionedData) {
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

  public PersonSimpleDTO userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public PersonSimpleDTO email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(required = true, value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PersonSimpleDTO mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

   /**
   * Get mobile
   * @return mobile
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonSimpleDTO personSimpleDTO = (PersonSimpleDTO) o;
    return Objects.equals(this.firstname, personSimpleDTO.firstname) &&
        Objects.equals(this.lastname, personSimpleDTO.lastname) &&
        Objects.equals(this.gender, personSimpleDTO.gender) &&
        Objects.equals(this.versionedData, personSimpleDTO.versionedData) &&
        Objects.equals(this.userId, personSimpleDTO.userId) &&
        Objects.equals(this.email, personSimpleDTO.email) &&
        Objects.equals(this.mobile, personSimpleDTO.mobile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstname, lastname, gender, versionedData, userId, email, mobile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonSimpleDTO {\n");
    
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    versionedData: ").append(toIndentedString(versionedData)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
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

