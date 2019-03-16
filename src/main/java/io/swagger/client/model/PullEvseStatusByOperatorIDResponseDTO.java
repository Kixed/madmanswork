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
import io.swagger.client.model.EvseStatusesDTO;
import io.swagger.client.model.StatusCodeDTO;
import java.io.IOException;

/**
 * PullEvseStatusByOperatorIDResponseDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T18:37:18.317+01:00")
public class PullEvseStatusByOperatorIDResponseDTO {
  @SerializedName("evseStatuses")
  private EvseStatusesDTO evseStatuses = null;

  @SerializedName("statusCodeDTO")
  private StatusCodeDTO statusCodeDTO = null;

  public PullEvseStatusByOperatorIDResponseDTO evseStatuses(EvseStatusesDTO evseStatuses) {
    this.evseStatuses = evseStatuses;
    return this;
  }

   /**
   * Get evseStatuses
   * @return evseStatuses
  **/
  @ApiModelProperty(required = true, value = "")
  public EvseStatusesDTO getEvseStatuses() {
    return evseStatuses;
  }

  public void setEvseStatuses(EvseStatusesDTO evseStatuses) {
    this.evseStatuses = evseStatuses;
  }

  public PullEvseStatusByOperatorIDResponseDTO statusCodeDTO(StatusCodeDTO statusCodeDTO) {
    this.statusCodeDTO = statusCodeDTO;
    return this;
  }

   /**
   * Get statusCodeDTO
   * @return statusCodeDTO
  **/
  @ApiModelProperty(value = "")
  public StatusCodeDTO getStatusCodeDTO() {
    return statusCodeDTO;
  }

  public void setStatusCodeDTO(StatusCodeDTO statusCodeDTO) {
    this.statusCodeDTO = statusCodeDTO;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PullEvseStatusByOperatorIDResponseDTO pullEvseStatusByOperatorIDResponseDTO = (PullEvseStatusByOperatorIDResponseDTO) o;
    return Objects.equals(this.evseStatuses, pullEvseStatusByOperatorIDResponseDTO.evseStatuses) &&
        Objects.equals(this.statusCodeDTO, pullEvseStatusByOperatorIDResponseDTO.statusCodeDTO);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evseStatuses, statusCodeDTO);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PullEvseStatusByOperatorIDResponseDTO {\n");
    
    sb.append("    evseStatuses: ").append(toIndentedString(evseStatuses)).append("\n");
    sb.append("    statusCodeDTO: ").append(toIndentedString(statusCodeDTO)).append("\n");
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

