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
import io.swagger.client.model.AbstractRoleCoreDTO;
import io.swagger.client.model.TenantDTO;
import java.io.IOException;

/**
 * PermissionRoleSaveDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T18:44:40.010+01:00")
public class PermissionRoleSaveDTO {
  @SerializedName("coreData")
  private AbstractRoleCoreDTO coreData = null;

  @SerializedName("tenant")
  private TenantDTO tenant = null;

  public PermissionRoleSaveDTO coreData(AbstractRoleCoreDTO coreData) {
    this.coreData = coreData;
    return this;
  }

   /**
   * Get coreData
   * @return coreData
  **/
  @ApiModelProperty(required = true, value = "")
  public AbstractRoleCoreDTO getCoreData() {
    return coreData;
  }

  public void setCoreData(AbstractRoleCoreDTO coreData) {
    this.coreData = coreData;
  }

  public PermissionRoleSaveDTO tenant(TenantDTO tenant) {
    this.tenant = tenant;
    return this;
  }

   /**
   * Get tenant
   * @return tenant
  **/
  @ApiModelProperty(required = true, value = "")
  public TenantDTO getTenant() {
    return tenant;
  }

  public void setTenant(TenantDTO tenant) {
    this.tenant = tenant;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionRoleSaveDTO permissionRoleSaveDTO = (PermissionRoleSaveDTO) o;
    return Objects.equals(this.coreData, permissionRoleSaveDTO.coreData) &&
        Objects.equals(this.tenant, permissionRoleSaveDTO.tenant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coreData, tenant);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionRoleSaveDTO {\n");
    
    sb.append("    coreData: ").append(toIndentedString(coreData)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
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

