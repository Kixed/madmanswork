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
import io.swagger.client.model.SampledValueDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * TransactionDatumDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T19:06:01.588+01:00")
public class TransactionDatumDTO {
  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

  @SerializedName("sampledValue")
  private List<SampledValueDTO> sampledValue = new ArrayList<SampledValueDTO>();

  public TransactionDatumDTO timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public TransactionDatumDTO sampledValue(List<SampledValueDTO> sampledValue) {
    this.sampledValue = sampledValue;
    return this;
  }

  public TransactionDatumDTO addSampledValueItem(SampledValueDTO sampledValueItem) {
    this.sampledValue.add(sampledValueItem);
    return this;
  }

   /**
   * Get sampledValue
   * @return sampledValue
  **/
  @ApiModelProperty(required = true, value = "")
  public List<SampledValueDTO> getSampledValue() {
    return sampledValue;
  }

  public void setSampledValue(List<SampledValueDTO> sampledValue) {
    this.sampledValue = sampledValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionDatumDTO transactionDatumDTO = (TransactionDatumDTO) o;
    return Objects.equals(this.timestamp, transactionDatumDTO.timestamp) &&
        Objects.equals(this.sampledValue, transactionDatumDTO.sampledValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, sampledValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionDatumDTO {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    sampledValue: ").append(toIndentedString(sampledValue)).append("\n");
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

