/*
 * CS Management EMP REST API
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
import io.swagger.client.model.RemoteChargingStationListDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SearchResultDTORemoteChargingStationListDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T19:09:13.919+01:00")
public class SearchResultDTORemoteChargingStationListDTO {
  @SerializedName("totalCount")
  private Long totalCount = null;

  @SerializedName("results")
  private List<RemoteChargingStationListDTO> results = null;

  public SearchResultDTORemoteChargingStationListDTO totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @ApiModelProperty(value = "")
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }

  public SearchResultDTORemoteChargingStationListDTO results(List<RemoteChargingStationListDTO> results) {
    this.results = results;
    return this;
  }

  public SearchResultDTORemoteChargingStationListDTO addResultsItem(RemoteChargingStationListDTO resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<RemoteChargingStationListDTO>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(value = "")
  public List<RemoteChargingStationListDTO> getResults() {
    return results;
  }

  public void setResults(List<RemoteChargingStationListDTO> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResultDTORemoteChargingStationListDTO searchResultDTORemoteChargingStationListDTO = (SearchResultDTORemoteChargingStationListDTO) o;
    return Objects.equals(this.totalCount, searchResultDTORemoteChargingStationListDTO.totalCount) &&
        Objects.equals(this.results, searchResultDTORemoteChargingStationListDTO.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResultDTORemoteChargingStationListDTO {\n");
    
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

