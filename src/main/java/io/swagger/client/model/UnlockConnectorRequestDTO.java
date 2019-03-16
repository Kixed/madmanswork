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
import io.swagger.client.model.AbstractMessageDTO;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * UnlockConnectorRequestDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T19:06:01.588+01:00")
public class UnlockConnectorRequestDTO extends AbstractMessageDTO {
  @SerializedName("remoteAddress")
  private String remoteAddress = null;

  @SerializedName("centralSystemRequestedAt")
  private OffsetDateTime centralSystemRequestedAt = null;

  @SerializedName("externalConnectorId")
  private Integer externalConnectorId = null;

  public UnlockConnectorRequestDTO remoteAddress(String remoteAddress) {
    this.remoteAddress = remoteAddress;
    return this;
  }

   /**
   * Get remoteAddress
   * @return remoteAddress
  **/
  @ApiModelProperty(value = "")
  public String getRemoteAddress() {
    return remoteAddress;
  }

  public void setRemoteAddress(String remoteAddress) {
    this.remoteAddress = remoteAddress;
  }

  public UnlockConnectorRequestDTO centralSystemRequestedAt(OffsetDateTime centralSystemRequestedAt) {
    this.centralSystemRequestedAt = centralSystemRequestedAt;
    return this;
  }

   /**
   * Get centralSystemRequestedAt
   * @return centralSystemRequestedAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCentralSystemRequestedAt() {
    return centralSystemRequestedAt;
  }

  public void setCentralSystemRequestedAt(OffsetDateTime centralSystemRequestedAt) {
    this.centralSystemRequestedAt = centralSystemRequestedAt;
  }

  public UnlockConnectorRequestDTO externalConnectorId(Integer externalConnectorId) {
    this.externalConnectorId = externalConnectorId;
    return this;
  }

   /**
   * Get externalConnectorId
   * @return externalConnectorId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getExternalConnectorId() {
    return externalConnectorId;
  }

  public void setExternalConnectorId(Integer externalConnectorId) {
    this.externalConnectorId = externalConnectorId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnlockConnectorRequestDTO unlockConnectorRequestDTO = (UnlockConnectorRequestDTO) o;
    return Objects.equals(this.remoteAddress, unlockConnectorRequestDTO.remoteAddress) &&
        Objects.equals(this.centralSystemRequestedAt, unlockConnectorRequestDTO.centralSystemRequestedAt) &&
        Objects.equals(this.externalConnectorId, unlockConnectorRequestDTO.externalConnectorId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remoteAddress, centralSystemRequestedAt, externalConnectorId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnlockConnectorRequestDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    remoteAddress: ").append(toIndentedString(remoteAddress)).append("\n");
    sb.append("    centralSystemRequestedAt: ").append(toIndentedString(centralSystemRequestedAt)).append("\n");
    sb.append("    externalConnectorId: ").append(toIndentedString(externalConnectorId)).append("\n");
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
