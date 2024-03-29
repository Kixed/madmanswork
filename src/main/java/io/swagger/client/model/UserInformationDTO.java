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
import org.threeten.bp.OffsetDateTime;

/**
 * UserInformationDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T18:44:40.010+01:00")
public class UserInformationDTO {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("lastLogin")
  private OffsetDateTime lastLogin = null;

  @SerializedName("registeredOn")
  private OffsetDateTime registeredOn = null;

  @SerializedName("versionedData")
  private VersionedData versionedData = null;

  public UserInformationDTO active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public UserInformationDTO lastLogin(OffsetDateTime lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }

   /**
   * Get lastLogin
   * @return lastLogin
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(OffsetDateTime lastLogin) {
    this.lastLogin = lastLogin;
  }

  public UserInformationDTO registeredOn(OffsetDateTime registeredOn) {
    this.registeredOn = registeredOn;
    return this;
  }

   /**
   * Get registeredOn
   * @return registeredOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getRegisteredOn() {
    return registeredOn;
  }

  public void setRegisteredOn(OffsetDateTime registeredOn) {
    this.registeredOn = registeredOn;
  }

  public UserInformationDTO versionedData(VersionedData versionedData) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInformationDTO userInformationDTO = (UserInformationDTO) o;
    return Objects.equals(this.active, userInformationDTO.active) &&
        Objects.equals(this.lastLogin, userInformationDTO.lastLogin) &&
        Objects.equals(this.registeredOn, userInformationDTO.registeredOn) &&
        Objects.equals(this.versionedData, userInformationDTO.versionedData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, lastLogin, registeredOn, versionedData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInformationDTO {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    registeredOn: ").append(toIndentedString(registeredOn)).append("\n");
    sb.append("    versionedData: ").append(toIndentedString(versionedData)).append("\n");
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

