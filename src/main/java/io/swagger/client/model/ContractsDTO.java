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
import io.swagger.client.model.AbstractContractDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ContractsDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-12T18:44:40.010+01:00")
public class ContractsDTO {
  @SerializedName("contracts")
  private List<AbstractContractDTO> contracts = new ArrayList<AbstractContractDTO>();

  public ContractsDTO contracts(List<AbstractContractDTO> contracts) {
    this.contracts = contracts;
    return this;
  }

  public ContractsDTO addContractsItem(AbstractContractDTO contractsItem) {
    this.contracts.add(contractsItem);
    return this;
  }

   /**
   * Get contracts
   * @return contracts
  **/
  @ApiModelProperty(required = true, value = "")
  public List<AbstractContractDTO> getContracts() {
    return contracts;
  }

  public void setContracts(List<AbstractContractDTO> contracts) {
    this.contracts = contracts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractsDTO contractsDTO = (ContractsDTO) o;
    return Objects.equals(this.contracts, contractsDTO.contracts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contracts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractsDTO {\n");
    
    sb.append("    contracts: ").append(toIndentedString(contracts)).append("\n");
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
