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
 * PermissionNodeListDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T18:44:40.010+01:00")
public class PermissionNodeListDTO {
  @SerializedName("code")
  private String code = null;

  @SerializedName("module")
  private String module = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("groups")
  private Boolean groups = null;

  @SerializedName("versionedData")
  private VersionedData versionedData = null;

  public PermissionNodeListDTO code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public PermissionNodeListDTO module(String module) {
    this.module = module;
    return this;
  }

   /**
   * Get module
   * @return module
  **/
  @ApiModelProperty(value = "")
  public String getModule() {
    return module;
  }

  public void setModule(String module) {
    this.module = module;
  }

  public PermissionNodeListDTO description(String description) {
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

  public PermissionNodeListDTO groups(Boolean groups) {
    this.groups = groups;
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @ApiModelProperty(value = "")
  public Boolean isGroups() {
    return groups;
  }

  public void setGroups(Boolean groups) {
    this.groups = groups;
  }

  public PermissionNodeListDTO versionedData(VersionedData versionedData) {
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
    PermissionNodeListDTO permissionNodeListDTO = (PermissionNodeListDTO) o;
    return Objects.equals(this.code, permissionNodeListDTO.code) &&
        Objects.equals(this.module, permissionNodeListDTO.module) &&
        Objects.equals(this.description, permissionNodeListDTO.description) &&
        Objects.equals(this.groups, permissionNodeListDTO.groups) &&
        Objects.equals(this.versionedData, permissionNodeListDTO.versionedData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, module, description, groups, versionedData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionNodeListDTO {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
