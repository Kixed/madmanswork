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
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * AuditDataListDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T18:44:40.010+01:00")
public class AuditDataListDTO {
  @SerializedName("entityId")
  private String entityId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("changedOn")
  private OffsetDateTime changedOn = null;

  @SerializedName("changedBy")
  private String changedBy = null;

  @SerializedName("oldValue")
  private Object oldValue = null;

  @SerializedName("newValue")
  private Object newValue = null;

  public AuditDataListDTO entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * Get entityId
   * @return entityId
  **/
  @ApiModelProperty(value = "")
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public AuditDataListDTO name(String name) {
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

  public AuditDataListDTO changedOn(OffsetDateTime changedOn) {
    this.changedOn = changedOn;
    return this;
  }

   /**
   * Get changedOn
   * @return changedOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getChangedOn() {
    return changedOn;
  }

  public void setChangedOn(OffsetDateTime changedOn) {
    this.changedOn = changedOn;
  }

  public AuditDataListDTO changedBy(String changedBy) {
    this.changedBy = changedBy;
    return this;
  }

   /**
   * Get changedBy
   * @return changedBy
  **/
  @ApiModelProperty(value = "")
  public String getChangedBy() {
    return changedBy;
  }

  public void setChangedBy(String changedBy) {
    this.changedBy = changedBy;
  }

  public AuditDataListDTO oldValue(Object oldValue) {
    this.oldValue = oldValue;
    return this;
  }

   /**
   * Get oldValue
   * @return oldValue
  **/
  @ApiModelProperty(value = "")
  public Object getOldValue() {
    return oldValue;
  }

  public void setOldValue(Object oldValue) {
    this.oldValue = oldValue;
  }

  public AuditDataListDTO newValue(Object newValue) {
    this.newValue = newValue;
    return this;
  }

   /**
   * Get newValue
   * @return newValue
  **/
  @ApiModelProperty(value = "")
  public Object getNewValue() {
    return newValue;
  }

  public void setNewValue(Object newValue) {
    this.newValue = newValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditDataListDTO auditDataListDTO = (AuditDataListDTO) o;
    return Objects.equals(this.entityId, auditDataListDTO.entityId) &&
        Objects.equals(this.name, auditDataListDTO.name) &&
        Objects.equals(this.changedOn, auditDataListDTO.changedOn) &&
        Objects.equals(this.changedBy, auditDataListDTO.changedBy) &&
        Objects.equals(this.oldValue, auditDataListDTO.oldValue) &&
        Objects.equals(this.newValue, auditDataListDTO.newValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, name, changedOn, changedBy, oldValue, newValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditDataListDTO {\n");
    
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    changedOn: ").append(toIndentedString(changedOn)).append("\n");
    sb.append("    changedBy: ").append(toIndentedString(changedBy)).append("\n");
    sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
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

